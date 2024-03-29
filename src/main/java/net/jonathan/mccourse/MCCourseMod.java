package net.jonathan.mccourse;

import com.mojang.logging.LogUtils;
import net.jonathan.mccourse.block.ModBlocks;
import net.jonathan.mccourse.block.entity.ModBlockEntities;
import net.jonathan.mccourse.effect.ModEffects;
import net.jonathan.mccourse.enchantment.ModEnchantments;
import net.jonathan.mccourse.entity.ModEntities;
import net.jonathan.mccourse.entity.client.CreatureRenderer;
import net.jonathan.mccourse.entity.client.MagicProjectileRenderer;
import net.jonathan.mccourse.entity.client.ModBoatRenderer;
import net.jonathan.mccourse.entity.client.RhinoRenderer;
import net.jonathan.mccourse.fluid.ModFluidTypes;
import net.jonathan.mccourse.fluid.ModFluids;
import net.jonathan.mccourse.item.ModCreativeModeTabs;
import net.jonathan.mccourse.item.ModItemProperties;
import net.jonathan.mccourse.item.ModItems;
import net.jonathan.mccourse.loot.ModLootModifiers;
import net.jonathan.mccourse.painting.ModPaintings;
import net.jonathan.mccourse.particle.ModParticles;
import net.jonathan.mccourse.potion.BetterBrewingRecipe;
import net.jonathan.mccourse.potion.ModPotions;
import net.jonathan.mccourse.recipe.KaupenFurnaceRecipe;
import net.jonathan.mccourse.recipe.ModRecipes;
import net.jonathan.mccourse.screen.GemEmpoweringStationScreen;
import net.jonathan.mccourse.screen.KaupenFurnaceScreen;
import net.jonathan.mccourse.screen.ModMenuTypes;
import net.jonathan.mccourse.sound.ModSounds;
import net.jonathan.mccourse.util.ModWoodTypes;
import net.jonathan.mccourse.villager.ModVillagers;
import net.jonathan.mccourse.worldgen.biome.ModTerraBlenderAPI;
import net.jonathan.mccourse.worldgen.biome.surface.ModSurfaceRules;
import net.jonathan.mccourse.worldgen.tree.ModFoliagePlacerTypes;
import net.jonathan.mccourse.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

import java.awt.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.MOD_ID)
public class MCCourseMod {
    public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MCCourseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEnchantments.register(modEventBus);
        ModSounds.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModPaintings.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);

        ModVillagers.register(modEventBus);
        ModParticles.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);
        ModEntities.register(modEventBus);

        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);

        ModTerraBlenderAPI.registerRegions();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.KOHLRABI.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.KOHLRABI_SEEDS.get(), 0.20f);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SNAPDRAGON.getId(), ModBlocks.POTTED_SNAPDRAGON);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION.get()));




            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.FIRE_RESISTANCE, Items.AMETHYST_SHARD, ModPotions.DAMAGE_RESISTANCE_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.LONG_FIRE_RESISTANCE, Items.AMETHYST_SHARD, ModPotions.DAMAGE_RESISTANCE_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.LONG_INVISIBILITY, Items.NETHERITE_INGOT, ModPotions.DAMAGE_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.INVISIBILITY, Items.NETHERITE_INGOT, ModPotions.DAMAGE_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.SWIFTNESS, Items.TOTEM_OF_UNDYING ,ModPotions.SPEED_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.STRONG_SWIFTNESS, Items.TOTEM_OF_UNDYING ,ModPotions.SPEED_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.LONG_SWIFTNESS, Items.TOTEM_OF_UNDYING ,ModPotions.SPEED_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.REGENERATION, Items.COOKED_BEEF, ModPotions.SATURATION_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.HEALING, Items.ENCHANTED_GOLDEN_APPLE, ModPotions.HEALTH_BOOST_POTION.get()));



            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRules.makeRules());
        });
    }
    // disable shield
    // higher knockback
    // faster attack
    //

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ALEXANDRITE);
            event.accept(ModItems.RAW_ALEXANDRITE);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ALEXANDRITE_BLOCK);
            event.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                Sheets.addWoodType(ModWoodTypes.WALNUT);

                ModItemProperties.addCustomItemProperties();

                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SOAP_WATER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SOAP_WATER.get(), RenderType.translucent());

                MenuScreens.register(ModMenuTypes.GEM_EMPOWERING_MENU.get(), GemEmpoweringStationScreen::new);
                MenuScreens.register(ModMenuTypes.KAUPEN_FURNACE_MENU.get(), KaupenFurnaceScreen::new);

                EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
                EntityRenderers.register(ModEntities.CREATURE.get(), CreatureRenderer::new);
                EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);
                EntityRenderers.register(ModEntities.MAGIC_PROJECTILE.get(), MagicProjectileRenderer::new);

                EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
                EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));
            });
        }
    }
}
package net.jonathan.mccourse.item;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.KOHLRABI.get());
                        output.accept(ModItems.PEAT_BRICK.get());

                        output.accept(ModItems.ALEXANDRITE_SWORD.get());
                        output.accept(ModItems.ALEXANDRITE_PICKAXE.get());
                        output.accept(ModItems.ALEXANDRITE_SHOVEL.get());
                        output.accept(ModItems.ALEXANDRITE_AXE.get());
                        output.accept(ModItems.ALEXANDRITE_HOE.get());
                        output.accept(ModItems.ALEXANDRITE_PAXEL.get());
                        output.accept(ModItems.ALEXANDRITE_HAMMER.get());

                        output.accept(ModItems.ALEXANDRITE_HELMET.get());
                        output.accept(ModItems.ALEXANDRITE_CHESTPLATE.get());
                        output.accept(ModItems.ALEXANDRITE_LEGGING.get());
                        output.accept(ModItems.ALEXANDRITE_BOOTS.get());

                        output.accept(ModItems.ALEXANDRITE_HORSE_ARMOR.get());
                        output.accept(ModItems.DATA_TABLET.get());
                        output.accept(ModItems.KOHLRABI_SEEDS.get());
                        output.accept(ModItems.BAR_BRAWL_RECORD.get());

                        output.accept(ModItems.RADIATION_STAFF.get());
                        output.accept(ModItems.ALEXANDRITE_BOW.get());
                        output.accept(ModItems.ALEXANDRITE_SHIELD.get());
                        output.accept(ModItems.SOAP_WATER_BUCKET.get());

                        output.accept(ModItems.WALNUT_SIGN.get());
                        output.accept(ModItems.WALNUT_HANGING_SIGN.get());
                        output.accept(ModItems.RHINO_SPAWN_EGG.get());

                        output.accept(ModItems.DICE.get());
                        output.accept(ModItems.WALNUT_BOAT.get());
                        output.accept(ModItems.WALNUT_CHEST_BOAT.get());

                        output.accept(ModItems.CATTAIL_SEEDS.get());
                        output.accept(ModItems.CATTAIL.get());


                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());
                        output.accept(ModItems.CREATURE_SPAWN_EGG.get() );
                        output.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());

                        output.accept(ModBlocks.ALEXANDRITE_STAIRS.get());
                        output.accept(ModBlocks.ALEXANDRITE_SLAB.get());
                        output.accept(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ALEXANDRITE_BUTTON.get());
                        output.accept(ModBlocks.ALEXANDRITE_FENCE.get());
                        output.accept(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
                        output.accept(ModBlocks.ALEXANDRITE_WALL.get());
                        output.accept(ModBlocks.ALEXANDRITE_DOOR.get());
                        output.accept(ModBlocks.ALEXANDRITE_TRAPDOOR.get());

                        output.accept(ModBlocks.ALEXANDRITE_LAMP.get());
                        output.accept(ModBlocks.SNAPDRAGON.get());
                        output.accept(ModBlocks.GEM_EMPOWERING_STATION.get());

                        output.accept(ModBlocks.WALNUT_LOG.get());
                        output.accept(ModBlocks.WALNUT_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_WALNUT_LOG.get());
                        output.accept(ModBlocks.STRIPPED_WALNUT_WOOD.get());
                        output.accept(ModBlocks.WALNUT_PLANKS.get());
                        output.accept(ModBlocks.WALNUT_SAPLING.get());
                        output.accept(ModBlocks.WALNUT_LEAVES.get());

                        output.accept(ModBlocks.COLORED_LEAVES.get());
                        output.accept(ModBlocks.KAUPEN_PORTAL.get());

                        output.accept(ModItems.WOODEN_GEM.get());
                        output.accept(ModItems.BASIC_GEM.get());
                        output.accept(ModItems.STONE_GEM.get());
                        output.accept(ModItems.COAL_GEM.get());
                        output.accept(ModItems.EMERALD_GEM.get());
                        output.accept(ModItems.LAPIS_GEM.get());
                        output.accept(ModItems.DIAMOND_GEM.get());
                        output.accept(ModItems.QUARTZ_GEM.get());
                        output.accept(ModItems.AMETHYST_GEM.get());
                        output.accept(ModItems.IRON_GEM.get());
                        output.accept(ModItems.COPPER_GEM.get());
                        output.accept(ModItems.GOLD_GEM.get());
                        output.accept(ModItems.NETHERITE_GEM.get());
                        output.accept(ModItems.BONE_GEM.get());
                        output.accept(ModItems.FEATHER_GEM.get());
                        output.accept(ModItems.HONEYCOMB_GEM.get());
                        output.accept(ModItems.PRISMARINE_GEM.get());
                        output.accept(ModItems.SHULKER_GEM.get());
                        output.accept(ModItems.ENDER_GEM.get());
                        output.accept(ModItems.NETHER_STAR_GEM.get());
                        output.accept(ModItems.BLAZE_GEM.get());
                        output.accept(ModItems.FIRE_CHARGE_GEM.get());
                        output.accept(ModItems.ALEXANDRITE_GEM.get());


                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_BLOCK_1.get());
                        output.accept(ModBlocks.RUBY_BLOCK_2.get());
                        output.accept(ModBlocks.RUBY_BLOCK_3.get());

                        output.accept(ModBlocks.WAXED_RUBY_BLOCK.get());
                        output.accept(ModBlocks.WAXED_RUBY_BLOCK_1.get());
                        output.accept(ModBlocks.WAXED_RUBY_BLOCK_2.get());
                        output.accept(ModBlocks.WAXED_RUBY_BLOCK_3.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
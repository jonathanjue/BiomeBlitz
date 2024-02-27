package net.jonathan.mccourse.item;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlocks;
import net.jonathan.mccourse.entity.ModEntities;
import net.jonathan.mccourse.entity.custom.ModBoatEntity;
import net.jonathan.mccourse.fluid.ModFluids;
import net.jonathan.mccourse.item.custom.*;
import net.jonathan.mccourse.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_GEM = ITEMS.register("wooden_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STONE_GEM = ITEMS.register("stone_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COAL_GEM = ITEMS.register("coal_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_GEM = ITEMS.register("emerald_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_GEM = ITEMS.register("lapis_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GEM = ITEMS.register("diamond_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_GEM = ITEMS.register("quartz_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_GEM = ITEMS.register("iron_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_GEM = ITEMS.register("copper_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_GEM = ITEMS.register("gold_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GEM = ITEMS.register("netherite_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONE_GEM = ITEMS.register("bone_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FEATHER_GEM = ITEMS.register("feather_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HONEYCOMB_GEM = ITEMS.register("honeycomb_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_GEM = ITEMS.register("prismarine_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHULKER_GEM = ITEMS.register("shulker_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDER_GEM = ITEMS.register("ender_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_STAR_GEM = ITEMS.register("nether_star_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_GEM = ITEMS.register("blaze_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_CHARGE_GEM = ITEMS.register("fire_charge_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALEXANDRITE_GEM = ITEMS.register("alexandrite_gem",
            () -> new Item(new Item.Properties()));















    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
                    () -> new MetalDetectorItem(new Item.Properties().durability(512)));

            public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));
            public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
                    () -> new FuelItem(new Item.Properties(), 1000));
            public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
                    () -> new SlowingSwordItem(ModToolTiers.ALEXANDRITE, 14, -2.3f, new Item.Properties().durability(500000000)));
            public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
                    () -> new WeakPickaxeItem(ModToolTiers.ALEXANDRITE, 15, -3, new Item.Properties().durability(1000000000)));
            public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
                    () -> new GlowingShovelItem(ModToolTiers.ALEXANDRITE, 15, -2, new Item.Properties().durability(500000000)));
            public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe",
                    () -> new PoisonAxeItem(ModToolTiers.ALEXANDRITE, 10, -2.75f, new Item.Properties().durability(700000000)));
            public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe",
                    () -> new ConfusedScytheItem(ModToolTiers.ALEXANDRITE, 10, -2.7f, new Item.Properties().durability(1000000000)));
            public static final RegistryObject<Item> ALEXANDRITE_PAXEL = ITEMS.register("alexandrite_paxel",
                    () -> new PaxelItem(ModToolTiers.ALEXANDRITE, 25, -2.8f, new Item.Properties().durability(1000000000)));

            public static final RegistryObject<Item> ALEXANDRITE_HAMMER = ITEMS.register("alexandrite_hammer",
                    () -> new HammerItem(ModToolTiers.ALEXANDRITE, 15, -2.7f, new Item.Properties().durability(1000000000)));







    public static final RegistryObject<Item> ALEXANDRITE_HELMET = ITEMS.register("alexandrite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ALEXANDRITE, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(5)));
    public static final RegistryObject<Item> ALEXANDRITE_CHESTPLATE = ITEMS.register("alexandrite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ALEXANDRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(5)));
    public static final RegistryObject<Item> ALEXANDRITE_LEGGING = ITEMS.register("alexandrite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ALEXANDRITE, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(5)));
    public static final RegistryObject<Item> ALEXANDRITE_BOOTS = ITEMS.register("alexandrite_boots",
            () -> new ModArmorItem(ModArmorMaterials.ALEXANDRITE, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(5)));
    public static final RegistryObject<Item> ALEXANDRITE_HORSE_ARMOR = ITEMS.register("alexandrite_horse_armor",
            () -> new HorseArmorItem(12, new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/horse/armor/horse_armor_alexandrite.png"), new Item.Properties().stacksTo(1)));



    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> KOHLRABI_SEEDS = ITEMS.register("kohlrabi_seeds",
            () -> new ItemNameBlockItem(ModBlocks.KOHLRABI_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAR_BRAWL_RECORD = ITEMS.register("bar_brawl_record",
            () -> new RecordItem(4, ModSounds.BAR_BRAWL,  new Item.Properties().stacksTo(1), 2440));




    public static final RegistryObject<Item> RADIATION_STAFF = ITEMS.register("radiation_staff",
            () -> new RadiationStaffItem(new Item.Properties().durability(5024)));


    public static final RegistryObject<Item> ALEXANDRITE_STAFF = ITEMS.register("alexandrite_staff",
            () -> new Item(new Item.Properties().durability(5000)));

    public static final RegistryObject<Item> ALEXANDRITE_BOW = ITEMS.register("alexandrite_bow",
            () -> new BowItem(new Item.Properties().durability(250)));


    public static final RegistryObject<Item> ALEXANDRITE_SHIELD = ITEMS.register("alexandrite_shield",
            () -> new ShieldItem(new Item.Properties().durability(50000)));


    public static final RegistryObject<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SOAP_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));



    public static final RegistryObject<Item> WALNUT_SIGN = ITEMS.register("walnut_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WALNUT_SIGN.get(), ModBlocks.WALNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> WALNUT_HANGING_SIGN = ITEMS.register("walnut_hanging_sign",
            () -> new HangingSignItem(ModBlocks.WALNUT_HANGING_SIGN.get(), ModBlocks.WALNUT_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));


    public static final RegistryObject<Item> RHINO_SPAWN_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));

    public static final RegistryObject<Item> WALNUT_BOAT = ITEMS.register("walnut_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.WALNUT, new Item.Properties()));
    public static final RegistryObject<Item> WALNUT_CHEST_BOAT = ITEMS.register("walnut_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.WALNUT, new Item.Properties()));

    public static final RegistryObject<Item> CATTAIL = ITEMS.register("cattail",
            () -> new ModWaxingItem(new Item.Properties()));
    public static final RegistryObject<Item> CATTAIL_SEEDS = ITEMS.register("cattail_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CATTAIL_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
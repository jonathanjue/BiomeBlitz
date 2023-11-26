package net.jonathan.mccourse.item;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.item.custom.FuelItem;
import net.jonathan.mccourse.item.custom.HammerItem;
import net.jonathan.mccourse.item.custom.MetalDetectorItem;
import net.jonathan.mccourse.item.custom.PaxelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));



            public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
                    () -> new MetalDetectorItem(new Item.Properties()));
            public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
                    () -> new MetalDetectorItem(new Item.Properties().durability(512)));

            public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));
            public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
                    () -> new FuelItem(new Item.Properties(), 1000));
            public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
                    () -> new SwordItem(ModToolTiers.ALEXANDRITE, 32, -2.3f, new Item.Properties().durability(500000000)));
            public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.ALEXANDRITE, 15, -3, new Item.Properties().durability(1000000000)));
            public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
                    () -> new ShovelItem(ModToolTiers.ALEXANDRITE, 15, -2, new Item.Properties().durability(500000000)));
            public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe",
                    () -> new AxeItem(ModToolTiers.ALEXANDRITE, 10, -2.75f, new Item.Properties().durability(700000000)));
            public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe",
                    () -> new HoeItem(ModToolTiers.ALEXANDRITE, 10, -2.7f, new Item.Properties().durability(1000000000)));
            public static final RegistryObject<Item> ALEXANDRITE_PAXEL = ITEMS.register("alexandrite_paxel",
                    () -> new PaxelItem(ModToolTiers.ALEXANDRITE, 25, -3.9f, new Item.Properties().durability(1000000000)));

            public static final RegistryObject<Item> ALEXANDRITE_HAMMER = ITEMS.register("alexandrite_hammer",
                    () -> new HammerItem(ModToolTiers.ALEXANDRITE, 15, -2.7f, new Item.Properties().durability(1000000000)));









            public static final RegistryObject<Item> SUPER_POWERFULL_INGOT = ITEMS.register("super_powerfull_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> RAW_SUPER_POWERFULL = ITEMS.register("raw_super_powerfull",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> HALLOWEEN_PUMPKIN = ITEMS.register("halloween_pumpkin",
                    () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

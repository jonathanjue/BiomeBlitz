package net.jonathan.mccourse.item;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
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

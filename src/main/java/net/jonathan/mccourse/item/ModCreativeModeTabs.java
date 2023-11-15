package net.jonathan.mccourse.item;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
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
                        output.accept(ModItems.RAW_SUPER_POWERFULL.get());
                        output.accept(ModItems.SUPER_POWERFULL_INGOT.get());
                        output.accept(ModItems.KOHLRABI.get());

                        output.accept(ModBlock.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlock.SUPER_POWERFULL_BLOCK.get());
                        output.accept(ModBlock.ALEXNDRITE_ORE.get());
                        output.accept(ModBlock.RAW_ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlock.DEEPSLATE_ALEXANDRITE_ORE.get());
                        output.accept(ModBlock.END_STONE_ALEXANDRITE_ORE.get());
                        output.accept(ModBlock.NETHER_ALEXANDRITE_ORE.get());
                        output.accept(ModBlock.RAW_SUPER_POWERFULL_BLOCK.get());
                        output.accept(ModBlock.SOUND_BLOCK.get());


                        output.accept(ModItems.METAL_DETECTOR.get());




                    }).build());

            public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
            }

}

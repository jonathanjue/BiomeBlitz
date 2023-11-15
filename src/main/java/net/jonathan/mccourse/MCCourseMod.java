package net.jonathan.mccourse;

import com.mojang.logging.LogUtils;
import net.jonathan.mccourse.block.ModBlock;
import net.jonathan.mccourse.item.ModCreativeModeTabs;
import net.jonathan.mccourse.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.MOD_ID)
public class MCCourseMod {
    public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MCCourseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlock.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ALEXANDRITE);
            event.accept(ModItems.RAW_ALEXANDRITE);
            event.accept(ModItems.SUPER_POWERFULL_INGOT);
            event.accept(ModItems.RAW_SUPER_POWERFULL);
            event.accept(ModItems.HALLOWEEN_PUMPKIN);


        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(ModBlock.ALEXANDRITE_BLOCK);

            event.accept(ModBlock.END_STONE_ALEXANDRITE_ORE);

            event.accept(ModBlock.RAW_ALEXANDRITE_BLOCK);

            event.accept(ModBlock.DEEPSLATE_ALEXANDRITE_ORE);

            event.accept(ModBlock.ALEXNDRITE_ORE);

            event.accept(ModBlock.NETHER_ALEXANDRITE_ORE);

            event.accept(ModBlock.RAW_SUPER_POWERFULL_BLOCK);

            event.accept(ModBlock.SUPER_POWERFULL_BLOCK);








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

        }
    }
}
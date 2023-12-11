package net.jonathan.mccourse.potion;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.effect.ModEffects;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Potion> SLIMEY_POTION = POTIONS.register("slimey_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.SLIMEY_EFFECT.get(), 999999, 1)));


    public static final RegistryObject<Potion> HEALTH_BOOST_POTION = POTIONS.register("health_boost_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 10000, 5)));


    public static final RegistryObject<Potion> SATURATION_POTION = POTIONS.register("saturation_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.SATURATION, 999999, 245)));
    public static final RegistryObject<Potion> DAMAGE_RESISTANCE_POTION = POTIONS.register("damage_resistance_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9999999, 3)));
    public static final RegistryObject<Potion> SPEED_POTION = POTIONS.register("speed_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 99999999, 6)));
    public static final RegistryObject<Potion> DAMAGE_POTION = POTIONS.register("damage_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 9999999, 4)));



    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
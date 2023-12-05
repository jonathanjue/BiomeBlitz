package net.jonathan.mccourse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    // add this to the end ".build();" and ".alwaysEat()"

    //cool but not important
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(500).saturationMod(500f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 70000, 5), 1.0F)
            .effect(new MobEffectInstance(MobEffects.LUCK, 70000, 255), 1.0F)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 70000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 70000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 70000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 70000, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 70000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 70000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 70000, 255), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 70000, 255), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 70000, 50), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 7000000, 255), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 70000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 70000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 70000, 255), 1.0F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 70000, 255), 1.0F).alwaysEat().build();


}

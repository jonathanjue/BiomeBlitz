package net.jonathan.mccourse.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class GlowingShovelItem extends ShovelItem {
    public GlowingShovelItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 9999999, 3), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 9999999, 255), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 9999999, 255), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 9999999, 4), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 9999999, 10), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 9999999, 1), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 9999999, 5), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 9999999, 5), player);
//            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 9999999, 3), player);
//              livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 9999999, 3), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}

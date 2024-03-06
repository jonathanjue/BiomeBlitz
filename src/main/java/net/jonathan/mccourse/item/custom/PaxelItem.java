package net.jonathan.mccourse.item.custom;

import net.jonathan.mccourse.util.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.block.Block;

    public class PaxelItem extends DiggerItem implements Vanishable {

    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.PAXEL_MINEABLE, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 9999999, 7), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 9999999, 255), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 9999999, 255), player);
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 999999, 10));
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 999999, 255));
            player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 999999, 255));
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 9999999, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 9999999, 1));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 3));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 999999, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999999, 3));
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 999999, 5));
            player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 999999, 255));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 999999, 50));
            player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 999999, 255));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 999999, 10));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999999, 30));
            player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999, 255));
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 999999, 255));
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}

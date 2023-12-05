package net.jonathan.mccourse.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class LightningStrikerEnchantment extends Enchantment {
    protected LightningStrikerEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide()) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();


            if(pLevel == 1) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
            }

            if(pLevel == 2) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                        }

            if(pLevel == 3) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 4) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 5) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                               EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                               EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 6) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                                            EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 7) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 8) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                                         EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 9) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);
                                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player)null, position,
                        MobSpawnType.TRIGGERED, true, true);


                        }

            if(pLevel == 10) {
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);



            }

            if(pLevel == 11) {
                EntityType.CREEPER.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                        }

            if(pLevel == 12) {
                EntityType.CREEPER.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


            }

            if(pLevel == 14) {
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);

                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.TNT_MINECART.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);


                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.END_CRYSTAL.spawn(level, null, (Player) null, position,
                        MobSpawnType.TRIGGERED, true, true);
            }
        }

        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 14;
    }
}
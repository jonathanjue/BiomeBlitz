package net.jonathan.mccourse.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.entity.custom.CreatureEntity;
import net.jonathan.mccourse.entity.custom.RhinoEntity;
import net.jonathan.mccourse.entity.layers.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CreatureRenderer extends MobRenderer<CreatureEntity, CreatureModel<CreatureEntity>> {
    private static final ResourceLocation CREATURE_LOCATION = new ResourceLocation(MCCourseMod.MOD_ID,"textures/entity/creature.png");

    public CreatureRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CreatureModel<>(pContext.bakeLayer(ModModelLayers.CREATURE_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(CreatureEntity pEntity) {
        return CREATURE_LOCATION;
    }

    @Override
    public void render(CreatureEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
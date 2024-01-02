package net.jonathan.mccourse.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.entity.custom.RhinoEntity;
import net.jonathan.mccourse.entity.layers.ModModelLayers;
import net.jonathan.mccourse.entity.variant.RhinoVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class RhinoRenderer extends MobRenderer<RhinoEntity, RhinoModel<RhinoEntity>> {
    private static final Map<RhinoVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(RhinoVariant.class), map -> {
                map.put(RhinoVariant.DEFAULT,
                        new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/rhino.png"));
                map.put(RhinoVariant.WHITE,
                        new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/white_rhino.png"));

                map.put(RhinoVariant.BLACK,
                        new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/black_rhino.png"));

                map.put(RhinoVariant.RED,
                        new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/red_rhino.png"));
            });

    public RhinoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new RhinoModel<>(pContext.bakeLayer(ModModelLayers.RHINO_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(RhinoEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(RhinoEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.35f, 0.35f, 0.35f);
        }

        if (pEntity.getVariant().getId() == 1) {
            pMatrixStack.scale(1.5f, 1.5f, 1.5f);

        }

        if (pEntity.getVariant().getId() == 2) {
            pMatrixStack.scale(2.2f, 2.2f, 2.3f);

        }

        if (pEntity.getVariant().getId() == 3) {
            pMatrixStack.scale(3.3f, 3.4f, 3.6f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
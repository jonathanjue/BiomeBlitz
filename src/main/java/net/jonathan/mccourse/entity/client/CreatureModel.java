package net.jonathan.mccourse.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jonathan.mccourse.entity.animations.ModAnimationDefinitions;
import net.jonathan.mccourse.entity.custom.CreatureEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class CreatureModel<T extends CreatureEntity> extends HierarchicalModel<T> {
	private final ModelPart creature;
	private final ModelPart head;

	public CreatureModel(ModelPart root) {
		this.creature = root.getChild("creature");
		this.head = creature.getChild("Body").getChild("Neck").getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition creature = partdefinition.addOrReplaceChild("creature", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = creature.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -25.0F, -8.0F, 14.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Legs = Body.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Leg1 = Legs.addOrReplaceChild("Leg1", CubeListBuilder.create().texOffs(45, 25).addBox(4.0F, -15.0F, -13.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(57, 37).addBox(3.0F, -16.0F, -14.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition Leg2 = Legs.addOrReplaceChild("Leg2", CubeListBuilder.create().texOffs(44, 9).addBox(3.0F, -16.0F, 4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(4.0F, -15.0F, 5.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Leg3 = Legs.addOrReplaceChild("Leg3", CubeListBuilder.create().texOffs(33, 34).addBox(-7.0F, -15.0F, 5.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(57, 30).addBox(-8.0F, -16.0F, 4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Leg4 = Legs.addOrReplaceChild("Leg4", CubeListBuilder.create().texOffs(59, 4).addBox(-8.0F, -16.0F, -9.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(12, 37).addBox(-7.0F, -15.0F, -8.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Blisters = Legs.addOrReplaceChild("Blisters", CubeListBuilder.create().texOffs(6, 6).addBox(4.0F, -10.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 2).addBox(-8.0F, -12.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(38, 52).addBox(-2.0F, -34.0F, -6.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(57, 21).addBox(-2.0F, -32.0F, -5.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-2.0F, -30.0F, -4.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(44, 0).addBox(-2.0F, -39.0F, -8.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(20, 52).addBox(-2.0F, -37.0F, -7.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-2.0F, -44.0F, -9.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 43).addBox(-2.0F, -31.0F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Neck.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 52).addBox(-2.0F, -31.0F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Neck.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -29.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(18, 25).addBox(-2.0F, -37.0F, -6.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(1.0F, -36.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -33.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(-1.0F, -36.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -3.0F));

		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create().texOffs(0, 8).addBox(1.0F, -48.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 10).addBox(-1.0F, -48.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(CreatureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.RHINO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.RHINO_IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(CreatureEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		creature.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return creature;
	}
}
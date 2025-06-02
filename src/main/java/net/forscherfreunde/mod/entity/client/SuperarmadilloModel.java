// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.forscherfreunde.mod.entity.client;

import net.forscherfreunde.mod.entity.animation.ModAnimations;
import net.forscherfreunde.mod.entity.custom.SuperarmadilloEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class SuperarmadilloModel<T extends SuperarmadilloEntity> extends SinglePartEntityModel<T> {
	private final ModelPart head;
	private final ModelPart head_rotation;
	private final ModelPart left_ear_cube;
	private final ModelPart right_ear_cube;
	private final ModelPart body;
	private final ModelPart cube;
	private final ModelPart front_left_leg;
	private final ModelPart front_right_leg;
	private final ModelPart back_left_leg;
	private final ModelPart back_right_leg;
	private final ModelPart tail;
	public SuperarmadilloModel(ModelPart root) {
		this.head = root.getChild("head");
		this.head_rotation = head.getChild("head_rotation");
		this.left_ear_cube = root.getChild("left_ear_cube");
		this.right_ear_cube = root.getChild("right_ear_cube");
		this.body = root.getChild("body");
		this.cube = root.getChild("cube");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_right_leg = root.getChild("front_right_leg");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
		this.tail = root.getChild("tail");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.0F, -7.0F));

		ModelPartData head_rotation = head.addChild("head_rotation", ModelPartBuilder.create().uv(43, 15).cuboid(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData left_ear_cube = modelPartData.addChild("left_ear_cube", ModelPartBuilder.create().uv(47, 10).cuboid(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 18.0F, -7.6F, 0.1886F, 0.3864F, 0.0718F));

		ModelPartData right_ear_cube = modelPartData.addChild("right_ear_cube", ModelPartBuilder.create().uv(43, 10).cuboid(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 18.0F, -7.6F, 0.1886F, -0.3864F, -0.0718F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 20).cuboid(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new Dilation(0.3F))
		.uv(0, 40).cuboid(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 4.0F));

		ModelPartData cube = modelPartData.addChild("cube", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData front_left_leg = modelPartData.addChild("front_left_leg", ModelPartBuilder.create().uv(42, 43).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 21.0F, -4.0F));

		ModelPartData front_right_leg = modelPartData.addChild("front_right_leg", ModelPartBuilder.create().uv(51, 43).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 21.0F, -4.0F));

		ModelPartData back_left_leg = modelPartData.addChild("back_left_leg", ModelPartBuilder.create().uv(42, 31).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 21.0F, 4.0F));

		ModelPartData back_right_leg = modelPartData.addChild("back_right_leg", ModelPartBuilder.create().uv(51, 31).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 21.0F, 4.0F));

		ModelPartData tail = modelPartData.addChild("tail", ModelPartBuilder.create().uv(44, 53).cuboid(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 18.0F, 5.0F, 0.5061F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		left_ear_cube.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		right_ear_cube.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		cube.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		front_left_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		front_right_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		back_left_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		back_right_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tail.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return head;
	}

	@Override
	public void setAngles(SuperarmadilloEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float headYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.body.resetTransform();
		this.cube.resetTransform();
		this.setHeadAngles(headYaw, headPitch);


		this.updateAnimation(entity.idleAnimationState, ModAnimations.SUPERARMADILLO_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
}
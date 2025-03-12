package net.forscherfreunde.mod.entity.client;

import net.forscherfreunde.mod.TestMod;
import net.forscherfreunde.mod.entity.custom.PorcupineEntity;
import net.forscherfreunde.mod.entity.custom.SuperarmadilloEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SuperarmadilloRenderer extends MobEntityRenderer<SuperarmadilloEntity, SuperarmadilloModel<SuperarmadilloEntity>> {

    private static final Identifier TEXTURE = new Identifier(TestMod.MOD_ID, "textures/entity/superarmadillo.png");
    public SuperarmadilloRenderer(EntityRendererFactory.Context context) {
        super(context, new SuperarmadilloModel<>(context.getPart(ModModelLayers.EntityModels.get("superarmadillo_model"))), 0.6f);
    }

    @Override
    public Identifier getTexture(SuperarmadilloEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SuperarmadilloEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {

        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}

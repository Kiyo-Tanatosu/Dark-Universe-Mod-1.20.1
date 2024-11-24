package com.kiyotanatosu.darkuniverse.entity.client;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.entity.custom.CorruptSkeletonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CorruptSkeletonRenderer extends MobRenderer<CorruptSkeletonEntity, CorruptSkeletonModel<CorruptSkeletonEntity>> {
    public CorruptSkeletonRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CorruptSkeletonModel<>(pContext.bakeLayer(ModModelLayers.CORRUPT_SKELETON_LAYER)), 0.33f);
    }

    @Override
    public ResourceLocation getTextureLocation(CorruptSkeletonEntity corruptSkeletonEntity) {
        return new ResourceLocation(DarkUniverse.MOD_ID, "textures/entity/corrupt_skeleton.png");
    }


    @Override
    public void render(CorruptSkeletonEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

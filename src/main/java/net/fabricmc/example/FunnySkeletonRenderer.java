package net.fabricmc.example;

import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.SkeletonEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.util.Identifier;

public class FunnySkeletonRenderer extends MobEntityRenderer<FunnySkeleton, FunnySkeletonModel>
{


    public FunnySkeletonRenderer(EntityRendererFactory.Context context) {
        super(context, new FunnySkeletonModel(context.getPart(EntityModelLayers.SKELETON)),0.5f);
    }

    @Override
    public Identifier getTexture(FunnySkeleton entity) {
       return new Identifier("dimensionmod", "textures/entities/funny_skeleton_texture.png");
    }
}

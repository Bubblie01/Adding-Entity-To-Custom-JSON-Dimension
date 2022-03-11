package io.github.bubblie.dimensionmod;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class FunnySkeletonRenderer extends MobEntityRenderer<FunnySkeleton, FunnySkeletonModel> {


    public FunnySkeletonRenderer(EntityRendererFactory.Context context) {
        super(context, new FunnySkeletonModel(context.getPart(EntityModelLayers.SKELETON)),0.5f);
    }

    @Override
    public Identifier getTexture(FunnySkeleton entity) {
       return new Identifier("dimensionmod", "textures/entities/funny_skeleton_texture.png");
    }
}

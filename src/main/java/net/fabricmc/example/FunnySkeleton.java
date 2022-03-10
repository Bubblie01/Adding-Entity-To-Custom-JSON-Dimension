package net.fabricmc.example;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class FunnySkeleton extends SkeletonEntity {

    public FunnySkeleton(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }
    public static final EntityType<FunnySkeleton> FUNNY_SKELETON = Registry.register(Registry.ENTITY_TYPE, new Identifier("dimensionmod", "funny_skeleton"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FunnySkeleton::new).dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        player.sendMessage(Text.of("Hello, I am a dummy entity!"), false);
        return super.interactMob(player, hand);
    }

    public static void registerFunnySkeleton() {
        FabricDefaultAttributeRegistry.register(FUNNY_SKELETON, FunnySkeleton.createHostileAttributes());
    }
}

package io.github.bubblie.dimensionmod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.*;

public class FunnySkeleton extends SkeletonEntity {


    public FunnySkeleton(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    //Where we register our mob.
    public static final EntityType<FunnySkeleton> FUNNY_SKELETON = Registry.register(Registry.ENTITY_TYPE, new Identifier("dimensionmod", "funny_skeleton"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FunnySkeleton::new).dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());


    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {

        if (!world.isClient) {
            //A test to see that it is getting the right json file.
            player.sendMessage(Text.of("Hello, I am a dummy entity! " + this.getEntityWorld().getRegistryKey().getValue().getPath()), false);
        }

        return super.interactMob(player, hand);
    }


    public static void registerFunnySkeleton() {
        //Some entity attributes.
        FabricDefaultAttributeRegistry.register(FUNNY_SKELETON, AbstractSkeletonEntity.createAbstractSkeletonAttributes());
    }

    @Override
    public boolean canSpawn(WorldView world) {
        //This is where we adjust the spawning so that it specifically spawns in our dimension.
        String path = this.world.getRegistryKey().getValue().getPath();
        if(path.equals(Main.FUNNY_DIMENSION_NAME))
        {
            return super.canSpawn(world);
        }
        return false;
    }


    @Override
    public void onSpawnPacket(EntitySpawnS2CPacket packet) {

        super.onSpawnPacket(packet);
    }
}

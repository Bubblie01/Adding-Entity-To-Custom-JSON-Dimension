package net.fabricmc.example.mixin;

import net.fabricmc.example.FunnySkeleton;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class BiomeEntityMixin {

    @Inject(at = @At("TAIL"), method = "addMonsters")
    private static void addFunnySkeleton(SpawnSettings.Builder builder, int zombieWeight, int zombieVillagerWeight, int skeletonWeight, boolean drowned, CallbackInfo ci) {
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(FunnySkeleton.FUNNY_SKELETON, skeletonWeight, 4, 4));
    }
}

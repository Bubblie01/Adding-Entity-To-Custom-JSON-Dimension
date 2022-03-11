package io.github.bubblie.dimensionmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;

public class Main implements ModInitializer {

	//You can also use Identifiers.
	public static final String FUNNY_DIMENSION_NAME = "funny_dimension";
	public void onInitialize() {
		//Fabric might tell you attributes weren't registered, but they are.
		FunnySkeleton.registerFunnySkeleton();
		//BiomeModifications.addSpawn(BiomeSelectors.categories(Biome.Category.MESA), SpawnGroup.MONSTER, FunnySkeleton.FUNNY_SKELETON, 100, 4, 4);


	}
}

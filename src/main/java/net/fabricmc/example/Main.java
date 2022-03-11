package net.fabricmc.example;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	//You can also use Identifiers.
	public static final String FUNNY_DIMENSION_NAME = "funny_dimension";
	public void onInitialize() {
		//Fabric might tell you attributes weren't registered, but they are.
		FunnySkeleton.registerFunnySkeleton();

	}
}

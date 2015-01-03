package com.megagamers.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class MWorld {
	public static void mainRegistry(){
		initializeWorldGen();
	}
	public static void initializeWorldGen(){
		registerWorldGen(new WorldGen(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
		
	}

}

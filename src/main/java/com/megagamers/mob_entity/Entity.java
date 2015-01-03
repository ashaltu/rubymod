package com.megagamers.mob_entity;

import net.minecraft.entity.EntityList;

import com.megagamers.Main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entity {
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity(EntityRubyCow.class, "RubyCow", 0x8C1919, 0xFF0000);
		//createEntity(EntityRubySlime.class, "RubySlime", 0xFF0000, 0x24C412);
		//createEntity(EntityRubyZombie.class, "RubyZombie", 0xAA0000, 0xFFFFFF);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 32, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}
	private static void createEgg(int randomId, int solidColour, int spotColour){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}

package com.megagamers.Main;

import com.megagamers.handler.RubyGuiHandler;
import com.megagamers.lib.RefStrings;
import com.megagamers.tile_entity.TileEntityRubyChest;
import com.megagamers.tile_entity.TileEntityRubyFurnace;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {
	public void registerRenderInfo(){
	}
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new RubyGuiHandler());
	}
	public void registerTileEntities(){
	GameRegistry.registerTileEntity(TileEntityRubyFurnace.class, RefStrings.MODID+ "TileEntityRubyFurnace");	
	GameRegistry.registerTileEntity(TileEntityRubyChest.class, RefStrings.MODID);
	}
}

package com.megagamers.handler;

import com.megagamers.gui.GuiRubyFurnace;
import com.megagamers.inventory.ContainerRubyFurnace;
import com.megagamers.tile_entity.TileEntityRubyFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class RubyGuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityRubyFurnace tileEntityFurnace = (TileEntityRubyFurnace) world.getTileEntity(x, y, z);
			return new ContainerRubyFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityRubyFurnace tileEntityTestContainer = (TileEntityRubyFurnace) world.getTileEntity(x, y, z);
			return new GuiRubyFurnace(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}

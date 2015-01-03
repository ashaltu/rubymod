package com.megagamers.Main;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.megagamers.blocks.MBlocks;
import com.megagamers.item_entity.EntityRubyArrow;
import com.megagamers.lib.RefStrings;
import com.megagamers.mob_entity.EntityRubyCow;
import com.megagamers.render.ItemRendererRubyChest;
//import com.megagamers.mob_entity.EntityRubySlime;
//import com.megagamers.mob_entity.EntityRubyZombie;
import com.megagamers.render.RenderRubyArrow;
import com.megagamers.render.RenderRubyCow;
//import com.megagamers.render.RenderRubySlime;
//import com.megagamers.render.RenderRubyZombie;


import com.megagamers.render.RubyChestRenderer;
import com.megagamers.tile_entity.TileEntityRubyChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo(){
	//	RenderingRegistry.registerEntityRenderingHandler(EntityRubyZombie.class, new RenderRubyZombie());
		RenderingRegistry.registerEntityRenderingHandler(EntityRubyCow.class, new RenderRubyCow(new ModelCow(), 0));
	//	RenderingRegistry.registerEntityRenderingHandler(EntityRubySlime.class, new RenderRubySlime(new ModelSlime(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityRubyArrow.class, new RenderRubyArrow());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRubyChest.class, new RubyChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MBlocks.rubyChest), new ItemRendererRubyChest());
	}

}

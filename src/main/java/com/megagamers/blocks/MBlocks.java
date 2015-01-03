package com.megagamers.blocks;

import com.megagamers.Main.MainRegistry;
import com.megagamers.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {
	public static void mainRegistry(){
		
		initializeBlock();
		registerItem();	
	}

	public static Block RubyOre;
	public static Block RubyBlock;
	public static Block HardenedRubyBlock;
	public static Block rubyFurnace;
	public static Block rubyFurnaceActive;
	public static Block rubyChest;
	public static Block rubyLampOn;
	public static Block rubyLampOff;
	public static Block rubyLampOnPowered;
	public static Block rubyLampOffPowered;
	
	
	public static void initializeBlock(){
	
	RubyOre = new RubyOre(Material.rock).setBlockName("RubyOre").setCreativeTab(MainRegistry.rubymod).setHardness(1.5F).setBlockTextureName(RefStrings.MODID + ":rubyore");
	RubyBlock = new RubyBlock(Material.iron).setBlockName("RubyBlock").setCreativeTab(MainRegistry.rubymod).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":rubyblock");
	HardenedRubyBlock = new HardenedRubyBlock(Material.iron).setBlockName("HardenedRubyBlock").setCreativeTab(MainRegistry.rubymod).setHardness(5.0F).setBlockTextureName(RefStrings.MODID+ ":hardenedrubyblock");
	
	rubyFurnace = new RubyFurnace(false, Material.iron).setBlockName("RubyFurnace").setHardness(3.0F).setCreativeTab(MainRegistry.rubymod);
	rubyFurnaceActive = new RubyFurnace(true, Material.iron).setHardness(3.0F).setBlockName("RubyFurnaceActive").setLightLevel(0.875F);
	
	rubyLampOn = new RubyLamp(true).setBlockName("RubyLampOn").setHardness(0.3F);
	rubyLampOff = new RubyLamp(false).setBlockName("RubyLampOff").setHardness(0.3F).setCreativeTab(MainRegistry.rubymod);
	rubyLampOnPowered = new RubyLampPowered(true).setBlockName("RubyLampOnPowered").setHardness(0.3F);
	rubyLampOffPowered = new RubyLampPowered(false).setBlockName("RubyLampOffPowered").setHardness(0.3F).setCreativeTab(MainRegistry.rubymod);
	
	rubyChest = new RubyChest(0).setBlockName("RubyChest").setHardness(2.5F).setCreativeTab(MainRegistry.rubymod);
	
	}


	public static void registerItem(){
		GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
		GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
		GameRegistry.registerBlock(HardenedRubyBlock, HardenedRubyBlock.getUnlocalizedName());
		GameRegistry.registerBlock(rubyFurnace, rubyFurnace.getUnlocalizedName());
		GameRegistry.registerBlock(rubyFurnaceActive, rubyFurnaceActive.getUnlocalizedName());
		GameRegistry.registerBlock(rubyChest, "rubyChest");
		GameRegistry.registerBlock(rubyLampOff, "rubyLampOff");
		GameRegistry.registerBlock(rubyLampOn, "rubyLampOn");
		GameRegistry.registerBlock(rubyLampOffPowered, "rubyLampOffPowered");
		GameRegistry.registerBlock(rubyLampOnPowered, "rubyLampOnPowered");

	}
}

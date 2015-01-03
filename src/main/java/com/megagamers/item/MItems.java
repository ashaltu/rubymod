package com.megagamers.item;


import com.megagamers.Main.MainRegistry;
import com.megagamers.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {
	public static void mainRegistry(){
		initializeItem();
		registerItem();	
	}
	//Item
	public static Item ruby;
	public static Item hardenedruby;
	public static Item ultimateruby;
	public static Item rubystick;
	public static Item rubystring;

	
	public static void initializeItem(){	
		ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID + ":ruby");
		hardenedruby = new Item().setUnlocalizedName("hardenedruby").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":hardenedruby");
		ultimateruby = new Item().setUnlocalizedName("ultimateruby").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":ultimateruby");
		rubystick = new Item().setUnlocalizedName("rubystick").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubystick");
		rubystring = new Item().setUnlocalizedName("rubystring").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubystring");
	}
	public static void registerItem(){
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName());
		GameRegistry.registerItem(hardenedruby, hardenedruby.getUnlocalizedName());
		GameRegistry.registerItem(ultimateruby, ultimateruby.getUnlocalizedName());
		GameRegistry.registerItem(rubystick, rubystick.getUnlocalizedName());
		GameRegistry.registerItem(rubystring, rubystring.getUnlocalizedName());

	}
	
	
}

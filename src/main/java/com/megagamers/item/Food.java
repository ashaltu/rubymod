package com.megagamers.item;

import com.megagamers.Main.MainRegistry;
import com.megagamers.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.potion.Potion;

public class Food {
	public static void mainRegistry(){
		initializeFood();
		registerFood();
	}
	//Food
	public static Item rubyapple;
	public static Item enchantedrubyapple;
	
	
	public static void initializeFood(){
		//rubyapple = new RubyApple(6, 1.2F, false).setAlwaysEdible().setCreativeTab(MainRegistry.rubymod).setUnlocalizedName("rubyapple").setTextureName(RefStrings.MODID+ ":rubyapple");
		enchantedrubyapple = new ItemAppleRuby(4, 1.2F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 5, 1, 1.0F).setCreativeTab(MainRegistry.rubymod).setUnlocalizedName("enchantedrubyapple").setTextureName(RefStrings.MODID+ ":rubyapple");
	}
	public static void registerFood(){
		//GameRegistry.registerItem(rubyapple, rubyapple.getUnlocalizedName());
		GameRegistry.registerItem(enchantedrubyapple, enchantedrubyapple.getUnlocalizedName());
	}
}

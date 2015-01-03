package com.megagamers.item;

import com.megagamers.Main.MainRegistry;
import com.megagamers.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
	//ToolMaterials
	public static ToolMaterial URuby;
	public static ToolMaterial URubySword;
	public static ToolMaterial Ruby;
	
	//Tools
	public static Item UltimateRubySword;
	public static Item UltimateRubyPickaxe;
	public static Item UltimateRubyAxe;
	public static Item UltimateRubyHoe;
	public static Item UltimateRubyShovel;
	
	public static Item RubyPickaxe;
	public static Item RubyAxe;
	public static Item RubyShovel;
	public static Item RubyHoe;
	public static Item RubySword;
	
	//Bowstuff
	public static Item RubyBow;
	public static Item RubyArrow;
	
	//ArmorMaterial
	public static ArmorMaterial RubyArmor;
	public static ArmorMaterial UltimateRubyArmor;
	
	//Armor
	public static Item RubyHelmet;
	public static Item RubyChestplate;
	public static Item RubyLeggings;
	public static Item RubyBoots;
	
	public static Item UltimateRubyHelmet;
	public static Item UltimateRubyChestplate;
	public static Item UltimateRubyLeggings;
	public static Item UltimateRubyBoots;
	public static int UltimateRubyHelmetID;
	public static int UltimateRubyChestplateID;
	public static int UltimateRubyLeggingsID;
	public static int UltimateRubyBootsID;
	
	public static void mainRegistry(){
	registerMaterials();
	defineItems();
	registerItem();
	
	}
	public static void defineItems(){
		UltimateRubyHelmet= new UltimateRubyArmor(UltimateRubyArmor, 0).setUnlocalizedName("UltimateRubyHelmet").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urubyhelmet");
		UltimateRubyChestplate = new UltimateRubyArmor(UltimateRubyArmor, 1).setUnlocalizedName("UltimateRubyChestplate").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urubychestplate");
		UltimateRubyLeggings = new UltimateRubyArmor(UltimateRubyArmor, 2).setUnlocalizedName("UltimateRubyLeggings").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urubyleggings");
		UltimateRubyBoots = new UltimateRubyArmor(UltimateRubyArmor, 3).setUnlocalizedName("UltimateRubyBoots").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urubyboots");
		
		UltimateRubySword = new UltimateRubySword(URubySword).setUnlocalizedName("UltimateRubySword").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":ursword");
		UltimateRubyAxe = new UltimateRubyAxe(URuby).setUnlocalizedName("UltimateRubyAxe").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":uraxe");
		UltimateRubyPickaxe = new UltimateRubyPickaxe(URuby).setUnlocalizedName("UltimateRubyPickaxe").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urpickaxe");
		UltimateRubyHoe = new UltimateRubyHoe(URuby).setUnlocalizedName("UltimateRubyHoe").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urhoe");
		UltimateRubyShovel = new UltimateRubyShovel(URuby).setUnlocalizedName("UltimateRubyShovel").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":urshovel");
		
		RubyHelmet = new RubyArmor(RubyArmor, 0).setUnlocalizedName("RubyHelmet").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubyhelmet");
		RubyChestplate = new RubyArmor(RubyArmor, 1).setUnlocalizedName("RubyChestplate").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubychestplate");
		RubyLeggings = new RubyArmor(RubyArmor, 2).setUnlocalizedName("RubyLeggings").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubyleggings");
		RubyBoots = new RubyArmor(RubyArmor, 3).setUnlocalizedName("RubyBoots").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubyboots");

		RubyPickaxe = new RubyPickaxe(Ruby).setUnlocalizedName("RubyPickaxe").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubypickaxe");
		RubyAxe = new RubyAxe(Ruby).setUnlocalizedName("RubyAxe").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubyaxe");
		RubyShovel = new RubyShovel(Ruby).setUnlocalizedName("RubyShovel").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubyshovel");
		RubyHoe = new RubyHoe(Ruby).setUnlocalizedName("RubyHoe").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubyhoe");
		RubySword = new RubySword(Ruby).setUnlocalizedName("RubySword").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID+ ":rubysword");

		RubyBow = new RubyBow().setUnlocalizedName("RubyBow");
		RubyArrow = new RubyArrow().setUnlocalizedName("RubyArrow").setCreativeTab(MainRegistry.rubymod).setTextureName(RefStrings.MODID + ":rubyarrow");
	}
	
	public static void registerMaterials(){
	//ToolMaterials
		URuby =  EnumHelper.addToolMaterial("URuby", 7, 2500, 20.0F, 22.0F, 50);
		URubySword = EnumHelper.addToolMaterial("URubySword", 5, 5000, 50.0F, 96.0F, 100);
		Ruby = EnumHelper.addToolMaterial("Ruby", 1, 100, 5.0F, 2.0F, 10);
	//ArmorMaterials
		RubyArmor = EnumHelper.addArmorMaterial("RubyArmor", 10, new int[]{2, 4, 3, 1}, 10);
		UltimateRubyArmor = EnumHelper.addArmorMaterial("UltimateRubyArmor", 625, new int[]{6,10,9,6}, 30);
		
	}
	public static void registerItem(){
		GameRegistry.registerItem(UltimateRubyHelmet, "UltimateRubyHelmet");
		GameRegistry.registerItem(UltimateRubyChestplate, "UltimateRubyChestplate");
		GameRegistry.registerItem(UltimateRubyLeggings, "UltimateRubyLeggings");
		GameRegistry.registerItem(UltimateRubyBoots, "UltimateRubyBoots");
		
		GameRegistry.registerItem(UltimateRubySword, UltimateRubySword.getUnlocalizedName());
		GameRegistry.registerItem(UltimateRubyAxe, UltimateRubyAxe.getUnlocalizedName());
		GameRegistry.registerItem(UltimateRubyPickaxe, UltimateRubyPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(UltimateRubyHoe, UltimateRubyHoe.getUnlocalizedName());
		GameRegistry.registerItem(UltimateRubyShovel, UltimateRubyShovel.getUnlocalizedName());
		
		GameRegistry.registerItem(RubyHelmet,"RubyHelmet");
		GameRegistry.registerItem(RubyChestplate,"RubyChestplate");
		GameRegistry.registerItem(RubyLeggings,"RubyLeggings");
		GameRegistry.registerItem(RubyBoots,"RubyBoots");
		
		GameRegistry.registerItem(RubyPickaxe, RubyPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(RubyAxe, RubyAxe.getUnlocalizedName());
		GameRegistry.registerItem(RubyShovel, RubyShovel.getUnlocalizedName());
		GameRegistry.registerItem(RubyHoe, RubyHoe.getUnlocalizedName());
		GameRegistry.registerItem(RubySword, RubySword.getUnlocalizedName());
		
		GameRegistry.registerItem(RubyBow, RubyBow.getUnlocalizedName());
		GameRegistry.registerItem(RubyArrow, RubyArrow.getUnlocalizedName());
		

	}
}

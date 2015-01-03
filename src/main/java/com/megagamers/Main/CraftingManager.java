	package com.megagamers.Main;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.megagamers.blocks.MBlocks;
import com.megagamers.item.Food;
import com.megagamers.item.MItems;
import com.megagamers.item.Tools;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped	
		//GameRegistry.addRecipe(new ItemStack(Food.rubyapple, 1), new Object[]{"XXX","XAX","XXX",'X',MItems.ruby,'A',Items.apple});
		GameRegistry.addRecipe(new ItemStack(Food.enchantedrubyapple, 1, 0), new Object[]{"XXX","XAX","XXX",'X',MItems.ruby,'A',Items.apple});
		GameRegistry.addRecipe(new ItemStack(Food.enchantedrubyapple, 1, 1), new Object[]{"XXX","XAX","XXX",'X',MBlocks.RubyBlock,'A',Items.apple});
		
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.HardenedRubyBlock, 9), new Object[]{MItems.ultimateruby});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.hardenedruby, 9), new Object[]{MBlocks.HardenedRubyBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.RubyBlock, 9), new Object[]{MItems.hardenedruby});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ruby, 9), new Object[]{MBlocks.RubyBlock});
		
		GameRegistry.addRecipe(new ItemStack(MBlocks.rubyFurnace, 1), new Object[]{"XXX","X X","XXX",'X',MItems.hardenedruby});
		GameRegistry.addRecipe(new ItemStack(MBlocks.rubyChest, 1), new Object[]{"XXX","XCX","XXX",'X',MItems.ruby,'C',Blocks.chest});
		GameRegistry.addRecipe(new ItemStack(MBlocks.RubyBlock, 1), new Object[]{"XXX","XXX","XXX",'X',MItems.ruby});
		GameRegistry.addRecipe(new ItemStack(MItems.hardenedruby, 1), new Object[]{"XXX","XXX","XXX",'X',MBlocks.RubyBlock});
		GameRegistry.addRecipe(new ItemStack(MBlocks.HardenedRubyBlock, 1), new Object[]{"XXX","XXX","XXX",'X',MItems.hardenedruby});
		
		GameRegistry.addRecipe(new ItemStack(MItems.ultimateruby, 1), new Object[]{"XXX","XXX","XXX",'X',MBlocks.HardenedRubyBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.rubystick, 4), new Object[]{MItems.ultimateruby, MItems.ultimateruby});
		GameRegistry.addRecipe(new ItemStack(MItems.rubystring, 3), new Object[]{"   ","XRX"," X ",'X',Items.string,'R',MItems.ultimateruby});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyArrow,2), new Object[]{" H ", " X ", " F ",'H',MItems.hardenedruby,'X',MItems.rubystick,'F',Items.feather});
		
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubySword, 1), new Object[]{" X ","XXX"," S ",'X',MItems.ultimateruby,'S', MItems.rubystick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubyAxe, 1), new Object[]{"XX ","XS "," S ",'X',MItems.ultimateruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubyAxe, 1), new Object[]{" XX"," SX"," S ",'X',MItems.ultimateruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubyHoe, 1), new Object[]{"XX "," S "," S ",'X',MItems.ultimateruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubyHoe, 1), new Object[]{" XX"," S "," S ",'X',MItems.ultimateruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubyPickaxe, 1), new Object[]{"XXX"," S "," S ",'X',MItems.ultimateruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.UltimateRubyShovel, 1), new Object[]{" X "," S "," S ",'X',MItems.ultimateruby,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(Tools.RubyHelmet, 1), new Object[]{"XXX","X X", "   ",'X',MItems.ruby});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyChestplate, 1), new Object[]{"X X","XXX","XXX",'X',MItems.ruby});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyLeggings, 1), new Object[]{"XXX","X X","X X",'X',MItems.ruby});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyBoots, 1), new Object[]{"   ","X X","X X",'X',MItems.ruby});
		
		ItemStack helmet = new ItemStack(Tools.UltimateRubyHelmet);
		helmet.addEnchantment(Enchantment.protection, 10);
		helmet.addEnchantment(Enchantment.fireProtection, 10);
		helmet.addEnchantment(Enchantment.blastProtection, 10);
		helmet.addEnchantment(Enchantment.projectileProtection, 10);
		helmet.addEnchantment(Enchantment.respiration, 10);
		helmet.addEnchantment(Enchantment.aquaAffinity, 10);
		helmet.addEnchantment(Enchantment.thorns, 10);
		helmet.addEnchantment(Enchantment.unbreaking, 10);	
		GameRegistry.addRecipe(helmet , new Object[]{"XXX","X X","   ",'X',MItems.ultimateruby});
		
		ItemStack chestplate = new ItemStack(Tools.UltimateRubyChestplate);
		chestplate.addEnchantment(Enchantment.featherFalling, 10);
		chestplate.addEnchantment(Enchantment.protection, 10);
		chestplate.addEnchantment(Enchantment.fireProtection, 10);
		chestplate.addEnchantment(Enchantment.blastProtection, 10);
		chestplate.addEnchantment(Enchantment.projectileProtection, 10);
		chestplate.addEnchantment(Enchantment.thorns, 10);
		chestplate.addEnchantment(Enchantment.unbreaking, 10);
		GameRegistry.addRecipe(chestplate, new Object[]{"X X","XXX","XXX",'X',MItems.ultimateruby});
		
		ItemStack leggings = new ItemStack(Tools.UltimateRubyLeggings);
		leggings.addEnchantment(Enchantment.featherFalling, 10);
		leggings.addEnchantment(Enchantment.protection, 10);
		leggings.addEnchantment(Enchantment.fireProtection, 10);
		leggings.addEnchantment(Enchantment.blastProtection, 10);
		leggings.addEnchantment(Enchantment.projectileProtection, 10);
		leggings.addEnchantment(Enchantment.thorns, 10);
		leggings.addEnchantment(Enchantment.unbreaking, 10);
		GameRegistry.addRecipe(leggings, new Object[]{"XXX","X X","X X",'X',MItems.ultimateruby});
		
		ItemStack boots = new ItemStack(Tools.UltimateRubyBoots);
		boots.addEnchantment(Enchantment.protection, 10);
		boots.addEnchantment(Enchantment.fireProtection, 10);
		boots.addEnchantment(Enchantment.blastProtection, 10);
		boots.addEnchantment(Enchantment.projectileProtection, 10);
		boots.addEnchantment(Enchantment.thorns, 10);
		boots.addEnchantment(Enchantment.unbreaking, 10);
		boots.addEnchantment(Enchantment.featherFalling, 10);
		GameRegistry.addRecipe(boots , new Object[]{"   ","X X","X X",'X',MItems.ultimateruby});
		
		GameRegistry.addRecipe(new ItemStack(Tools.RubyPickaxe, 1), new Object[]{"XXX"," S "," S ",'X',MItems.ruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyAxe, 1), new Object[]{" XX"," SX"," S ",'X',MItems.ruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyAxe, 1), new Object[]{"XX ","XS "," S ",'X',MItems.ruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyShovel, 1), new Object[]{" X "," S "," S ",'X',MItems.ruby, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyHoe, 1), new Object[]{"XX "," S "," S ",'X',MItems.ruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.RubyHoe, 1), new Object[]{" XX"," S "," S ",'X',MItems.ruby,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Tools.RubySword, 1), new Object[]{" X "," X "," S ",'X',MItems.ruby,'S',Items.stick});
		
		ItemStack bow = new ItemStack(Tools.RubyBow);
		bow.addEnchantment(Enchantment.unbreaking, 10);
		bow.addEnchantment(Enchantment.power, 10);
		bow.addEnchantment(Enchantment.punch, 10);
		bow.addEnchantment(Enchantment.infinity, 1);
		bow.addEnchantment(Enchantment.flame, 1);
		GameRegistry.addRecipe(bow , new Object[]{" XS","X S"," XS",'X',MItems.rubystick,'S',MItems.rubystring});
		//Shapeless
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocks.RubyOre, new ItemStack(MItems.ruby), 20.0f);

	}
}

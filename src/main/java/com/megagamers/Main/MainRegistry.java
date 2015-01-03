package com.megagamers.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;

import com.megagamers.achievements.Achievements;
import com.megagamers.blocks.MBlocks;
import com.megagamers.item.Food;
import com.megagamers.item.MItems;
import com.megagamers.item.Tools;
import com.megagamers.item.UltimateRubySword;
import com.megagamers.item_entity.EntityRubyArrow;
import com.megagamers.lib.RefStrings;
import com.megagamers.mob_entity.Entity;
import com.megagamers.world.MWorld;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid =RefStrings.MODID , name = RefStrings.NAME, version = RefStrings.VERSION)

public class MainRegistry {
	@SidedProxy (clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE )
	public static ServerProxy proxy;
	@Instance(RefStrings.MODID)
	public static MainRegistry modInstance;	
	public static CreativeTabs rubymod = new CreativeTabs("rubymod"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return MItems.ultimateruby;
			}
		};
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		Food.mainRegistry();
		Tools.mainRegistry();
		MItems.mainRegistry();
		MBlocks.mainRegistry();
		CraftingManager.mainRegistry();
		MWorld.mainRegistry();
		Entity.mainRegistry();
		proxy.registerRenderInfo();
		proxy.registerTileEntities();	
	
	}
	@EventHandler
	public static void load(FMLInitializationEvent event) {
		Achievements.mainRegsitry();
			
		EntityRegistry.registerGlobalEntityID(EntityRubyArrow.class, "RubyArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityRubyArrow.class, "RubyArrow", 1, RefStrings.MODID, 128, 1, true);
		proxy.registerNetworkStuff();
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
	}
}

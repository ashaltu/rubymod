package com.megagamers.achievements;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

import com.megagamers.achievements.RubyOnCraftPickEvent;
import com.megagamers.achievements.RubyOnCraftHoeEvent;
import com.megagamers.achievements.RubyOnCraftShovelEvent;
import com.megagamers.achievements.RubyOnCraftSwordEvent;
import com.megagamers.achievements.RubyOnCraftBowEvent;
import com.megagamers.achievements.RubyOnCraftAxeEvent;
import com.megagamers.achievements.RubyOnMineEvent;
import com.megagamers.item.MItems;
import com.megagamers.item.Tools;

import cpw.mods.fml.common.FMLCommonHandler;

public class Achievements {
	//Achievements
	public static Achievement achievementRuby;
	public static Achievement achievementRubyPick;
	public static Achievement achievementRubyAxe;
	public static Achievement achievementRubyHoe;
	public static Achievement achievementRubyShovel;
	public static Achievement achievementRubySword;
	public static Achievement achievementRubyBow;
	
	public static void mainRegsitry(){
		achievementRuby = new Achievement("achievement.mineRuby", "mineRuby", 0, 0, new ItemStack(MItems.ruby), (Achievement)null).initIndependentStat().registerStat();
    	achievementRubyPick = new Achievement("achievement.craftPick", "craftPick", 2, 0, Tools.RubyPickaxe, achievementRuby).registerStat();
    	achievementRubyAxe = new Achievement("achievement.craftAxe", "craftAxe", 2, 1, Tools.RubyAxe, achievementRuby).registerStat();
    	achievementRubyHoe = new Achievement("achievement.craftHoe", "craftHoe", 2, -1, Tools.RubyHoe, achievementRuby).registerStat();
    	achievementRubyShovel = new Achievement("achievement.craftShovel", "craftShovel", 2, 2, Tools.RubyShovel, achievementRuby).registerStat();
    	achievementRubySword = new Achievement("achievement.craftSword", "craftSword", 2, -2, Tools.RubySword, achievementRuby).registerStat();
    	achievementRubyBow = new Achievement("achievement.craftBow", "craftBow", -2, 0, Tools.RubyBow, achievementRuby).registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage("Ruby Achievements", new Achievement[]{achievementRuby, achievementRubyPick,achievementRubyHoe,achievementRubyShovel,achievementRubyAxe,achievementRubySword,achievementRubyBow}));
	
	FMLCommonHandler.instance().bus().register(new RubyOnMineEvent());
	FMLCommonHandler.instance().bus().register(new RubyOnCraftPickEvent());
	FMLCommonHandler.instance().bus().register(new RubyOnCraftHoeEvent());
	FMLCommonHandler.instance().bus().register(new RubyOnCraftShovelEvent());
	FMLCommonHandler.instance().bus().register(new RubyOnCraftAxeEvent());
	FMLCommonHandler.instance().bus().register(new RubyOnCraftSwordEvent());
	FMLCommonHandler.instance().bus().register(new RubyOnCraftBowEvent());
	}
}

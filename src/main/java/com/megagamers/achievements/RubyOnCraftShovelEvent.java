package com.megagamers.achievements;

import com.megagamers.item.Tools;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class RubyOnCraftShovelEvent {
	@SubscribeEvent
	public void whenICraftAPick(PlayerEvent.ItemCraftedEvent e){
		if(e.crafting.getItem().equals(Tools.RubyShovel)){
			e.player.addStat(Achievements.achievementRubyShovel, 1);
		}
	}
}

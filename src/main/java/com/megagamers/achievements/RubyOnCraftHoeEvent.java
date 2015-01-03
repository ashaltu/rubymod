package com.megagamers.achievements;

import com.megagamers.item.Tools;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class RubyOnCraftHoeEvent {
	@SubscribeEvent
	public void whenICraftAPick(PlayerEvent.ItemCraftedEvent e){
		if(e.crafting.getItem().equals(Tools.RubyHoe)){
			e.player.addStat(Achievements.achievementRubyHoe, 1);
		}
	}
}

package com.megagamers.achievements;

import net.minecraft.item.ItemStack;

import com.megagamers.item.MItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class RubyOnMineEvent {

	@SubscribeEvent
	public void whenIGetARuby(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(MItems.ruby))){
			e.player.addStat(Achievements.achievementRuby, 1);
		}
	}
}

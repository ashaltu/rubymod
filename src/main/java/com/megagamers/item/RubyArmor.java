package com.megagamers.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RubyArmor extends ItemArmor{

	public RubyArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_2_);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity,int slot,String Type){
		if(stack.getItem() == Tools.RubyHelmet || stack.getItem() == Tools.RubyChestplate || stack.getItem() == Tools.RubyBoots){
			return "rubymod:textures/models/armor/rubylayer1.png";
		}
		if(stack.getItem() == Tools.RubyLeggings){
			return "rubymod:textures/models/armor/rubylayer2.png";
		}
		else return null;	
		
	}

}
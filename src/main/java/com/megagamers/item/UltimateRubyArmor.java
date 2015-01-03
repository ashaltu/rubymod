package com.megagamers.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionAbsoption;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealth;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraft.world.World;

public class UltimateRubyArmor extends ItemArmor{

	public UltimateRubyArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_2_);
	}
	public boolean hasEffect(ItemStack a, ItemStack enchanted)
	{
	return true;
	} 
	public String getArmorTexture(ItemStack stack, Entity entity,int slot,String Type){
		if(stack.getItem() == Tools.UltimateRubyHelmet || stack.getItem() == Tools.UltimateRubyChestplate || stack.getItem() == Tools.UltimateRubyBoots){
			return "rubymod:textures/models/armor/urubylayer1.png";
		}
		if(stack.getItem() == Tools.UltimateRubyLeggings){
			return "rubymod:textures/models/armor/urubylayer2.png";
		}
		else return null;
	}
	  /**
     * Called to tick armor in the armor slot. Override to do something
     *
     * @param world
     * @param player
     * @param itemStack
     */
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
    	if(player.getCurrentArmor(3) != null){
    		ItemStack helmet = player.getCurrentArmor(3);
    		if(helmet.getItem() == Tools.UltimateRubyHelmet){
    			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 280));
    		}
    	}
    	
    	if(player.getCurrentArmor(2) !=null){
    		ItemStack chestplate = player.getCurrentArmor(2);
    		if(chestplate.getItem() == Tools.UltimateRubyChestplate){
    			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 00, 4));
    		}
    	}
    	
    	if(player.getCurrentArmor(1) !=null){
    		ItemStack leggings = player.getCurrentArmor(1);
    		if(leggings.getItem() == Tools.UltimateRubyLeggings){
    			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 00, 1));
    		}
    	}
    	if(player.getCurrentArmor(0) !=null){
    		ItemStack boots = player.getCurrentArmor(0);
    		if(boots.getItem() == Tools.UltimateRubyBoots){
    			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 00, 3));

    		}
    	}
    	if(player.getCurrentArmor(3) !=null && player.getCurrentArmor(2) !=null && player.getCurrentArmor(1) !=null && player.getCurrentArmor(0) !=null){	
    		ItemStack helmet = player.getCurrentArmor(3);
    		ItemStack chestplate = player.getCurrentArmor(2);
    		ItemStack leggings = player.getCurrentArmor(1);
    		ItemStack boots = player.getCurrentArmor(0);

    		if(helmet.getItem() == Tools.UltimateRubyHelmet && chestplate.getItem() == Tools.UltimateRubyChestplate && leggings.getItem() == Tools.UltimateRubyLeggings && boots.getItem() == Tools.UltimateRubyBoots){
    			player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 00));
    			player.capabilities.allowFlying = true;
    		}else if(helmet.getItem() == Tools.UltimateRubyHelmet && chestplate.getItem() == Tools.UltimateRubyChestplate && leggings.getItem() == Tools.UltimateRubyLeggings){
                player.capabilities.allowFlying = false;
                player.capabilities.isFlying = false;
            }else if(helmet.getItem() == Tools.UltimateRubyHelmet && chestplate.getItem() == Tools.UltimateRubyChestplate){
                player.capabilities.allowFlying = false;
                player.capabilities.isFlying = false;
            }else if(helmet.getItem() == Tools.UltimateRubyHelmet){
                player.capabilities.allowFlying = false;
                player.capabilities.isFlying = false;
            }else{
            	player.capabilities.allowFlying = false;
            	player.capabilities.isFlying = false;
            }
    		
    	}
    	
    	
    }

}
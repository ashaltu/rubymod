package com.megagamers.blocks;

import java.util.Random;

import com.megagamers.item.MItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RubyOre extends Block {

	protected RubyOre(Material material) {
		super(material);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand,int fortune){
		return MItems.ruby;
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(3);
	}
}

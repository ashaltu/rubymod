//Schematic to java Structure by jajo_11 | inspired by "MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL"

package com.megagamers.structures;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Well extends WorldGenerator
{
	protected Block[] GetValidSpawnBlocks()
	{
		return new Block[]
		{
			Blocks.grass,
			Blocks.stone,
		};
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int z)
	{
		int distanceToAir = 0;
		Block checkBlock = world.getBlock(x, y, z);

		while (checkBlock != Blocks.air)
		{
			distanceToAir++;
			checkBlock = world.getBlock(x, y + distanceToAir, z);
		}

		if (distanceToAir > 1)
		{
			return false;
		}

		y += distanceToAir - 1;

		Block block = world.getBlock(x, y, z);
		Block blockAbove = world.getBlock(x, y + 1, z);
		Block blockBelow = world.getBlock(x, y - 1, z);

		for (Block i : GetValidSpawnBlocks())
		{
			if (blockAbove != Blocks.air)
			{
				return false;
			}
			if (block == i)
			{
				return true;
			}
			else if (block == Blocks.snow_layer && blockBelow == i){
				return true;
			}
			else if (block.getMaterial() == Material.plants && blockBelow == i)
			{
				return true;
			}
		}
		return false;
	}

	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		if(!LocationIsValidSpawn(world, x, y, z) || !LocationIsValidSpawn(world, x + 2, y, z) || !LocationIsValidSpawn(world, x + 2, y, z + 2) || !LocationIsValidSpawn(world, x, y, z + 2))
		{
			return false;
		}

		world.setBlock(x + 0, y + 0, z + 0, Blocks.gold_block, 0, 3);
		world.setBlock(x + 1, y + 0, z + 0, Blocks.gold_block, 0, 3);
		world.setBlock(x + 2, y + 0, z + 0, Blocks.gold_block, 0, 3);
		world.setBlock(x + 0, y + 0, z + 1, Blocks.gold_block, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, Blocks.water, 0, 3);
		world.setBlock(x + 2, y + 0, z + 1, Blocks.gold_block, 0, 3);
		world.setBlock(x + 0, y + 0, z + 2, Blocks.gold_block, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, Blocks.gold_block, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.gold_block, 0, 3);
		world.setBlock(x + 0, y + 1, z + 0, Blocks.fence, 0, 3);
		world.setBlock(x + 1, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 0, Blocks.fence, 0, 3);
		world.setBlock(x + 0, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 2, Blocks.fence, 0, 3);
		world.setBlock(x + 1, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, Blocks.fence, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.fence, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.fence, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.fence, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.fence, 0, 3);
		world.setBlock(x + 0, y + 3, z + 0, Blocks.stone_stairs, 2, 3);
		world.setBlock(x + 1, y + 3, z + 0, Blocks.stone_stairs, 2, 3);
		world.setBlock(x + 2, y + 3, z + 0, Blocks.stone_stairs, 1, 3);
		world.setBlock(x + 0, y + 3, z + 1, Blocks.stone_stairs, 0, 3);
		world.setBlock(x + 1, y + 3, z + 1, Blocks.cobblestone, 0, 3);
		world.setBlock(x + 2, y + 3, z + 1, Blocks.stone_stairs, 1, 3);
		world.setBlock(x + 0, y + 3, z + 2, Blocks.stone_stairs, 3, 3);
		world.setBlock(x + 1, y + 3, z + 2, Blocks.stone_stairs, 3, 3);
		world.setBlock(x + 2, y + 3, z + 2, Blocks.stone_stairs, 3, 3);
		return true;

	}
}
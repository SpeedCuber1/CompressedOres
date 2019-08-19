package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BlockCompOre extends Block
{
    private boolean redstone;
    public BlockCompOre(Material mat, float hardness, float resistance, String uName,boolean isRedstone)
    {
        super(Block.Properties.create(mat).hardnessAndResistance(hardness,resistance));
        setRegistryName(ModInfo.MOD_ID,uName);
        redstone = isRedstone;
    }
    @Override
    public boolean canProvidePower(BlockState state)
    {
        return redstone;
    }
    @Override
    public int getWeakPower(BlockState state, IBlockReader reader, BlockPos pos, Direction side)
    {
        return 15;
    }
}

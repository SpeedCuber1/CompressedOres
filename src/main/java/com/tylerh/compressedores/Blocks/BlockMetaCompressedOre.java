package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BlockMetaCompressedOre extends Block
{
    private static int id;
    private static boolean redstone;
    public BlockMetaCompressedOre(Material mat, float hardness, float resistance,String uName,boolean isRedstone,int meta)
    {
        super(Block.Properties.create(mat).hardnessAndResistance(hardness,resistance));
        id = meta;
        redstone = isRedstone;
        setRegistryName(ModInfo.MOD_ID,uName + "." + getLevel());
    }
    private String getLevel()
    {
        return EnumLevel.byMetadata(id).getString();
    }
    @Override
    public boolean canProvidePower(BlockState state)
    {
        return redstone;
    }
    @Override
    public int getWeakPower(BlockState state, IBlockReader reader, BlockPos pos, Direction side)
    {
        if(redstone)
        {
            return 15;
        }
        else
        {
            return 0;
        }
    }
}

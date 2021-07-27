package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class BlockMetaCompressedOre extends Block
{
    private static int id;
    private static boolean redstone;
    public BlockMetaCompressedOre(Material mat, float hardness, float resistance, String uName, boolean isRedstone, int meta)
    {
        super(BlockBehaviour.Properties.of(mat).strength(hardness).explosionResistance(resistance));
        id = meta;
        redstone = isRedstone;
        setRegistryName(ModInfo.MOD_ID,uName + "." + getLevel());
    }
    private String getLevel()
    {
        return EnumLevel.byMetadata(id).getString();
    }

    @Override
    public boolean shouldCheckWeakPower(BlockState state, LevelReader world, BlockPos pos, Direction side)
    {
        return redstone;
    }

    @Override
    public boolean getWeakChanges(BlockState state, LevelReader world, BlockPos pos)
    {
        if(redstone)
        {
            return super.getWeakChanges(state,world,pos);
        }
        else
        {
            return false;
        }
    }
}

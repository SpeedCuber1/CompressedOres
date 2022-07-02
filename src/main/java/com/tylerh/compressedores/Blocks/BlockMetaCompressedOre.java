package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BlockMetaCompressedOre extends Block
{
    public BlockMetaCompressedOre(Material mat, float hardness, float resistance)
    {
        super(BlockBehaviour.Properties.of(mat).strength(hardness).explosionResistance(resistance).requiresCorrectToolForDrops());
    }
}

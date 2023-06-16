package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;


public class BlockMetaCompressedOre extends Block
{
    public BlockMetaCompressedOre(MapColor map, float hardness, float resistance)
    {
        super(BlockBehaviour.Properties.of().mapColor(map).strength(hardness).explosionResistance(resistance).requiresCorrectToolForDrops());
    }
}

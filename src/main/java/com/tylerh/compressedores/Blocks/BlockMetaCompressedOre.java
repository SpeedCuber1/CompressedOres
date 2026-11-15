package com.tylerh.compressedores.Blocks;
import net.minecraft.world.level.block.Block;


public class BlockMetaCompressedOre extends Block
{
    public BlockMetaCompressedOre(Properties properties)
    {
        super(properties.requiresCorrectToolForDrops());
    }
}

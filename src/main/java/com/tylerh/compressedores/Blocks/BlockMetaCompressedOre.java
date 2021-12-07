package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BlockMetaCompressedOre extends Block
{
    private static int id;
    private static boolean redstone;
    public BlockMetaCompressedOre(Material mat, float hardness, float resistance, String uName, boolean isRedstone, int meta)
    {
        super(BlockBehaviour.Properties.of(mat).strength(hardness).explosionResistance(resistance).requiresCorrectToolForDrops());
        id = meta;
        redstone = isRedstone;
        setRegistryName(ModInfo.MOD_ID,uName + "." + getLevel());
    }
    private String getLevel()
    {
        return EnumLevel.byMetadata(id).getString();
    }
}

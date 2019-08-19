package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.BlockList;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupCompOres extends ItemGroup
{
    public ItemGroupCompOres()
    {
        super(ModInfo.MOD_ID);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(Blocks.GOLD_BLOCK);
    }
}

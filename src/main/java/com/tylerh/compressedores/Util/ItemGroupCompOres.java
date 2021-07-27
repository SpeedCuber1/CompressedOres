package com.tylerh.compressedores.Util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ItemGroupCompOres extends CreativeModeTab
{
    public ItemGroupCompOres()
    {
        super(ModInfo.MOD_ID);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Blocks.GOLD_BLOCK);
    }
}

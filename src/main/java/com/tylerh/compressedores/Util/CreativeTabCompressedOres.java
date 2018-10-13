package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by tyler on 5/5/15.
 */
public class CreativeTabCompressedOres
{
    public static final CreativeTabs COMPRESSED_ORES_TAB = new CreativeTabs(ModInfo.MOD_ID)
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Item.getItemFromBlock(Blocks.GOLD_BLOCK));
        }
        @Override
        public String getTranslationKey()
        {
            return ModInfo.MOD_NAME;
        }
    };
}

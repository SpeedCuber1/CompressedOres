package com.tylerh.compressedores.Util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * Created by tyler on 5/5/15.
 */
public class CreativeTabCompressedOres
{
    public static final CreativeTabs COMPRESSED_ORES_TAB = new CreativeTabs(ModInfo.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.gold_block);
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Compressed Ores";
        }

    };
}

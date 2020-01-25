package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.InitBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by tyler on 5/5/15.
 */
public class CreativeTabCompressedOres
{
    public static final CreativeTabs COMPRESSED_ORES_TAB = new CreativeTabs(ModInfo.MOD_ID)
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(InitBlocks.blockGold,1,0);
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return ModInfo.MOD_NAME;
        }
    };
}

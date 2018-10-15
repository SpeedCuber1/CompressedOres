package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
            return new ItemStack(ModBlocks.blockMetaGold,1,0);
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return ModInfo.MOD_NAME;
        }
    };
}

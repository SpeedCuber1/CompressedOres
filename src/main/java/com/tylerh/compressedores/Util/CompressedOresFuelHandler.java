package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

/**
 * Created by Tyler on 4/25/2016.
 */
public class CompressedOresFuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.blockMetaCoal))
        {
            return (fuel.getMetadata() + 1) * 9 * 16000;
        }
        return 0;
    }
}

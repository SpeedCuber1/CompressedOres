package com.tylerh.compressedores.Items;

import com.tylerh.compressedores.Blocks.BlockMetaGold;
import com.tylerh.compressedores.ModInfo;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockMetaGold extends ItemBlock
{
    public ItemBlockMetaGold(Block block)
    {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        EnumLevel level = EnumLevel.byMetadata(stack.getMetadata());
        return super.getUnlocalizedName() + "." + level.toString();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add(ModInfo.matCosts[stack.getMetadata()] + " Blocks of Gold");
    }
}

package com.tylerh.compressedores.Items;

import com.sun.jna.platform.win32.WinUser;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by IpodT on 4/30/2016.
 */
public class ItemBlockMetaCompressedOre extends ItemBlock
{
    public ItemBlockMetaCompressedOre(Block block)
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
        return super.getUnlocalizedName() + "." + level.toString().toLowerCase();
    }
    @Override
    public void addInformation(ItemStack stack, World world, List<String> list, ITooltipFlag flag)
    {
        for(int i = 0; i < ModInfo.appendNames.length;i++)
        {
            if(stack.getDisplayName().endsWith(ModInfo.appendNames[i]))
            {
                list.add(ModInfo.matCosts[stack.getMetadata()] + " Blocks of " + ModInfo.appendNames[i]);
                break;
            }
        }
        for(int i = 0; i < ModInfo.extraNames.length; i++)
        {
            if(stack.getDisplayName().endsWith(ModInfo.extraNames[i]))
            {
                list.add(ModInfo.matCosts[stack.getMetadata()] + " " + ModInfo.extraNames[i]);
                break;
            }
        }
    }
}

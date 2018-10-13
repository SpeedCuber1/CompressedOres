package com.tylerh.compressedores.Items;

import com.tylerh.compressedores.Util.CreativeTabCompressedOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by IpodT on 4/30/2016.
 */
public class ItemBlockMetaCompressedOre extends ItemBlock
{
    public ItemBlockMetaCompressedOre(Block block)
    {
        super(block);

    }
    @Override
    public String getTranslationKey(ItemStack stack)
    {
        EnumLevel level = EnumLevel.byMetadata(stack.getItem().getMetadata(stack));
        return super.getTranslationKey() + "." + level.toString();
    }
    @Override
    public void fillItemGroup(CreativeTabs group, NonNullList<ItemStack> items)
    {
        if(this.isInGroup(group))
        {
            this.block.fillItemGroup(group,items);
        }
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag flag)
    {
        for(int i = 0; i < ModInfo.appendNames.length;i++)
        {
            if(stack.getTextComponent().getFormattedText().contains(ModInfo.appendNames[i]))
            {
                tooltip.add(ModInfo.matCosts[stack.getItem().getMetadata(stack)] + " Blocks of " + ModInfo.appendNames[i]);
                break;
            }
        }
        for(int i = 0; i < ModInfo.extraNames.length;i++)
        {
            if(stack.getTextComponent().getFormattedText().contains(ModInfo.extraNames[i]))
            {
                tooltip.add(ModInfo.matCosts[stack.getItem().getMetadata(stack)] + " " + ModInfo.extraNames[i]);
                break;
            }
        }
    }
}

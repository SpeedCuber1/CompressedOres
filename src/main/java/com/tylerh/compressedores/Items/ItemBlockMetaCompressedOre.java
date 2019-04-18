package com.tylerh.compressedores.Items;

import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.ForgeEventFactory;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockMetaCompressedOre extends ItemBlock
{
    private int meta;
    public ItemBlockMetaCompressedOre(Block block, ItemGroup group,int meta)
    {
        super(block,new Item.Properties().group(group).addToolType(ToolType.PICKAXE,2));
        this.meta = meta;
        getBurnTime(new ItemStack(block));
        setRegistryName(block.getRegistryName());
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        boolean append = true;
        for(int i = 0; i < ModInfo.appendNames.length; i++)
        {
            if(stack.getDisplayName().getFormattedText().endsWith(ModInfo.appendNames[i]))
            {
                list.add(new TextComponentTranslation(ModInfo.matCosts[this.meta] + " Blocks of " + ModInfo.appendNames[i]));
                break;
            }
        }
        for(int i = 0; i < ModInfo.extraNames.length;i++)
        {
            if(stack.getDisplayName().getFormattedText().endsWith(ModInfo.extraNames[i]))
            {
                list.add(new TextComponentTranslation(ModInfo.matCosts[this.meta] + " " + ModInfo.extraNames[i]));
                break;
            }
        }
    }
    @Override
    public int getBurnTime(ItemStack stack)
    {
        if(stack.getItem().getDisplayName(stack).getFormattedText().endsWith("Coal"))
        {
            return ForgeEventFactory.getItemBurnTime(stack,16000 * 9 * (meta + 1));
        }
        else
        {
            return 0;
        }
    }
}

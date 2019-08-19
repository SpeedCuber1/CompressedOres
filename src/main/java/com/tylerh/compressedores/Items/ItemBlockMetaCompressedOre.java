package com.tylerh.compressedores.Items;

import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockMetaCompressedOre extends BlockItem
{
    private int meta;
    public ItemBlockMetaCompressedOre(Block block, ItemGroup group,int meta)
    {
        super(block,new Item.Properties().group(group).addToolType(ToolType.PICKAXE,2));
        this.meta = meta;
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
                list.add(new TranslationTextComponent(ModInfo.matCosts[this.meta] + " Blocks of " + ModInfo.appendNames[i]));
                break;
            }
        }
        for(int i = 0; i < ModInfo.extraNames.length;i++)
        {
            if(stack.getDisplayName().getFormattedText().endsWith(ModInfo.extraNames[i]))
            {
                list.add(new TranslationTextComponent(ModInfo.matCosts[this.meta] + " " + ModInfo.extraNames[i]));
                break;
            }
        }
    }
}

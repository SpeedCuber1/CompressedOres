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
import net.minecraftforge.event.ForgeEventFactory;

import javax.annotation.Nullable;
import java.util.List;

public class BlockItemCompOre extends BlockItem
{
    private int id;
    public BlockItemCompOre(Block block, ItemGroup group,int meta)
    {
        super(block, new Item.Properties().addToolType(ToolType.PICKAXE,2).group(group));
        setRegistryName(block.getRegistryName());
        id = meta;
        getBurnTime(new ItemStack(block));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        for(int i = 0; i < ModInfo.levels.length;i++)
        {
            for(int j = 0; j < ModInfo.appendNames.length;j++)
            {
                if(stack.getDisplayName().getFormattedText().startsWith(ModInfo.levels[i]) && stack.getDisplayName().getFormattedText().endsWith(ModInfo.appendNames[j]))
                {
                    list.add(new TranslationTextComponent(ModInfo.matCosts[i] + " Blocks of " + ModInfo.appendNames[j]));
                    break;
                }
            }
            for(int j = 0; j < ModInfo.extraNames.length; j++)
            {
                if(stack.getDisplayName().getFormattedText().startsWith(ModInfo.levels[i]) && stack.getDisplayName().getFormattedText().endsWith(ModInfo.extraNames[j]))
                {
                    list.add(new TranslationTextComponent(ModInfo.matCosts[i] + " " + ModInfo.extraNames[j]));
                    break;
                }
            }
        }
    }
    @Override
    public int getBurnTime(ItemStack stack)
    {
        if(stack.getItem().getDisplayName(stack).getFormattedText().endsWith("Coal"))
        {
            return ForgeEventFactory.getItemBurnTime(stack,16000 * 9 * (id+1));
        }
        else
        {
            return 0;
        }
    }
}

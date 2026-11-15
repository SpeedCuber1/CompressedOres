package com.tylerh.compressedores.Items;

import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.FuelValues;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;

public class ItemBlockMetaCompressedOre extends BlockItem
{
    private int meta;
    public ItemBlockMetaCompressedOre(Block block, Properties properties,int meta)
    {
        super(block,properties);
        this.meta = meta;
    }
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag)
    {
        for(int i = 0; i < ModInfo.appendNames.length; i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.appendNames[i]))
            {
                builder.accept(Component.translatable(ModInfo.matCosts[this.meta] + " Blocks of " + ModInfo.appendNames[i]));
                break;
            }
        }
        for(int i = 0; i < ModInfo.extraNames.length;i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.extraNames[i]))
            {
                builder.accept(Component.translatable(ModInfo.matCosts[this.meta] + " " + ModInfo.extraNames[i]));
                break;
            }
        }
    }

    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType, FuelValues fuelValues)
    {
        if(stack.getItem().equals(ModInfo.coalBlocks[meta].asItem()))
        {
            return (meta + 1) * 9 * 16000;
        }
        else
        {
            return 0;
        }
    }
}

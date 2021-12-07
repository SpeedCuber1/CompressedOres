package com.tylerh.compressedores.Items;

import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class ItemBlockMetaCompressedOre extends BlockItem
{
    private int meta;
    public ItemBlockMetaCompressedOre(Block block, CreativeModeTab group, int meta)
    {
        super(block,new Item.Properties().tab(group).stacksTo(64));
        this.meta = meta;
        setRegistryName(Objects.requireNonNull(block.getRegistryName()));
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag flag)
    {
        for(int i = 0; i < ModInfo.appendNames.length; i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.appendNames[i]))
            {
                list.add(new TranslatableComponent(ModInfo.matCosts[this.meta] + " Blocks of " + ModInfo.appendNames[i]));
                break;
            }
        }
        for(int i = 0; i < ModInfo.extraNames.length;i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.extraNames[i]))
            {
                list.add(new TranslatableComponent(ModInfo.matCosts[this.meta] + " " + ModInfo.extraNames[i]));
                break;
            }
        }
    }

    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType)
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

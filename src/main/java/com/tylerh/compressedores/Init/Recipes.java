package com.tylerh.compressedores.Init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tyler on 11/6/2015.
 */
public class Recipes
{
    public static void init()
    {
        if(ModBlocks.registerGold)
        {
           //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.gold_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaGold, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaGold, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaGold, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaGold, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaGold, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaGold, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaGold, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaGold, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaGold, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaGold, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaGold, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaGold, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaGold, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaGold, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGold, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaGold, 1, 7));
        }
    }
}

package com.tylerh.compressedores.Init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        if(ModBlocks.registerIron)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.iron_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaIron, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaIron, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaIron, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaIron, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaIron, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaIron, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaIron, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.iron_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaIron, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaIron, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaIron, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaIron, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaIron, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaIron, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaIron, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaIron, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaIron, 1, 7));
        }
        if(ModBlocks.registerDiamond)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.diamond_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaDiamond, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaDiamond, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaDiamond, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaDiamond, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaDiamond, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaDiamond, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaDiamond, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaDiamond, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaDiamond, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaDiamond, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaDiamond, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaDiamond, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaDiamond, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaDiamond, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiamond, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaDiamond, 1, 7));
        }
        if(ModBlocks.registerEmerald)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.emerald_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaEmerald, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaEmerald, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaEmerald, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaEmerald, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaEmerald, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaEmerald, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaEmerald, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.emerald_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaEmerald, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaEmerald, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaEmerald, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaEmerald, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaEmerald, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaEmerald, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaEmerald, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaEmerald, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaEmerald, 1, 7));
        }
        if(ModBlocks.registerRedstone)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.redstone_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaRedstone, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaRedstone, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaRedstone, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaRedstone, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaRedstone, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaRedstone, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaRedstone, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.redstone_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaRedstone, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaRedstone, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaRedstone, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaRedstone, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaRedstone, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaRedstone, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaRedstone, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaRedstone, 1, 7));
        }
        if(ModBlocks.registerLapis)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.lapis_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaLapis, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaLapis, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaLapis, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaLapis, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaLapis, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaLapis, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaLapis, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.lapis_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaLapis, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaLapis, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaLapis, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaLapis, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaLapis, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaLapis, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaLapis, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaLapis, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaLapis, 1, 7));
        }/*
        if(ModBlocks.registerQuartz)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.quartz_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaQuartz, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaQuartz, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaQuartz, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaQuartz, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaQuartz, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaQuartz, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaQuartz, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.quartz_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaQuartz, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaQuartz, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaQuartz, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaQuartz, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaQuartz, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaQuartz, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaQuartz, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaQuartz, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaQuartz, 1, 7));
        }*/
        if(ModBlocks.registerCoal)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(Blocks.coal_block));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaCoal, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaCoal, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaCoal, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaCoal, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaCoal, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaCoal, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaCoal, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(Blocks.coal_block, 9), "G", 'G', new ItemStack(ModBlocks.blockMetaCoal, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaCoal, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaCoal, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaCoal, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaCoal, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaCoal, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaCoal, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCoal, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaCoal, 1, 7));
        }
        if(ModBlocks.registerAndesite)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaAndesite, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaAndesite, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaAndesite, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaAndesite, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaAndesite, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaAndesite, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaAndesite, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 5), "G", 'G', new ItemStack(ModBlocks.blockMetaAndesite, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaAndesite, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaAndesite, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaAndesite, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaAndesite, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaAndesite, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaAndesite, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaAndesite, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaAndesite, 1, 7));
        }
        if(ModBlocks.registerDiorite)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaDiorite, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaDiorite, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaDiorite, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaDiorite, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaDiorite, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaDiorite, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaDiorite, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 3), "G", 'G', new ItemStack(ModBlocks.blockMetaDiorite, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaDiorite, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaDiorite, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaDiorite, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaDiorite, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaDiorite, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaDiorite, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaDiorite, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaDiorite, 1, 7));
        }
        if(ModBlocks.registerGranite)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaGranite, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaGranite, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaGranite, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaGranite, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaGranite, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaGranite, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaGranite, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 1), "G", 'G', new ItemStack(ModBlocks.blockMetaGranite, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaGranite, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaGranite, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaGranite, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaGranite, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaGranite, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaGranite, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaGranite, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaGranite, 1, 7));
        }
        if(ModBlocks.registerCobblestone)
        {
            //Compressing
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 0), "ggg", "ggg", "ggg", 'g', new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 1), "ddd", "ddd", "ddd", 'd', new ItemStack(ModBlocks.blockMetaCobble, 9, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 2), "ttt", "ttt", "ttt", 't', new ItemStack(ModBlocks.blockMetaCobble, 9, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 3), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaCobble, 9, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 4), "qqq", "qqq", "qqq", 'q', new ItemStack(ModBlocks.blockMetaCobble, 9, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 5), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaCobble, 9, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 6), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.blockMetaCobble, 9, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 1, 7), "ooo", "ooo", "ooo", 'o', new ItemStack(ModBlocks.blockMetaCobble, 9, 6));

            //Decompressing
            GameRegistry.addRecipe(new ItemStack(GameData.getBlockRegistry().getRaw("minecraft:stone"), 9, 0), "G", 'G', new ItemStack(ModBlocks.blockMetaCobble, 1, 0));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 0), "D", 'D', new ItemStack(ModBlocks.blockMetaCobble, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 1), "T", 'T', new ItemStack(ModBlocks.blockMetaCobble, 1, 2));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 2), "Q", 'Q', new ItemStack(ModBlocks.blockMetaCobble, 1, 3));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 3), "Q", 'Q', new ItemStack(ModBlocks.blockMetaCobble, 1, 4));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 4), "S", 'S', new ItemStack(ModBlocks.blockMetaCobble, 1, 5));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 5), "S", 'S', new ItemStack(ModBlocks.blockMetaCobble, 1, 6));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMetaCobble, 9, 6), "O", 'O', new ItemStack(ModBlocks.blockMetaCobble, 1, 7));
        }
    }
}

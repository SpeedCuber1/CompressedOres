package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.BlockMetaCompressedOre;
import com.tylerh.compressedores.Items.ItemBlockMetaCompressedOre;
import com.tylerh.compressedores.Util.CompOresConfig;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class InitBlocks
{
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ModInfo.MOD_ID);
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModInfo.MOD_ID);
    private static Identifier idName;
    public static void registerBlocks()
    {
        if(CompOresConfig.registerAmethyst)
        {
            BlockList.blockAmethystCompressed = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 0);
            BlockList.blockAmethystDouble = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 1);
            BlockList.blockAmethystTriple = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 2);
            BlockList.blockAmethystQuadruple = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 3);
            BlockList.blockAmethystQuintuple = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 4);
            BlockList.blockAmethystSextuple = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 5);
            BlockList.blockAmethystSeptuple = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 6);
            BlockList.blockAmethystOctuple = registerBlock("blockamethyst", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.NONE)), 7);;  
        }
        if(CompOresConfig.registerAndesite)
        {
            BlockList.blockAndesiteCompressed = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockAndesiteDouble = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockAndesiteTriple = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockAndesiteQuadruple = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockAndesiteQuintuple = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockAndesiteSextuple = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockAndesiteSeptuple = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockAndesiteOctuple = registerBlock("blockandesite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerBasalt)
        {
            BlockList.blockBasaltCompressed = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockBasaltDouble = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockBasaltTriple = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockBasaltQuadruple = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockBasaltQuintuple = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockBasaltSextuple = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockBasaltSeptuple = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockBasaltOctuple = registerBlock("blockbasalt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerBlackstone)
        {
            BlockList.blockBlackstoneCompressed = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockBlackstoneDouble = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockBlackstoneTriple = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockBlackstoneQuadruple = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockBlackstoneQuintuple = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockBlackstoneSextuple = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockBlackstoneSeptuple = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockBlackstoneOctuple = registerBlock("blockblackstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerCalcite)
        {
            BlockList.blockCalciteCompressed = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockCalciteDouble = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockCalciteTriple = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockCalciteQuadruple = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockCalciteQuintuple = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockCalciteSextuple = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockCalciteSeptuple = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockCalciteOctuple = registerBlock("blockcalcite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerClay)
        {
            BlockList.blockClayCompressed = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockClayDouble = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockClayTriple = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockClayQuadruple = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockClayQuintuple = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockClaySextuple = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockClaySeptuple = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockClayOctuple = registerBlock("blockclay", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerCoal)
        {
            BlockList.blockCoalCompressed = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockCoalDouble = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockCoalTriple = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockCoalQuadruple = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockCoalQuintuple = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockCoalSextuple = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockCoalSeptuple = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockCoalOctuple = registerBlock("blockcoal", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerCobble)
        {
            BlockList.blockCobbleCompressed = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockCobbleDouble = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockCobbleTriple = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockCobbleQuadruple = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockCobbleQuintuple = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockCobbleSextuple = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockCobbleSeptuple = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockCobbleOctuple = registerBlock("blockcobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerDeepslate)
        {
            BlockList.blockDeepslateCobbleCompressed = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockDeepslateCobbleDouble = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockDeepslateCobbleTriple = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockDeepslateCobbleQuadruple = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockDeepslateCobbleQuintuple = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockDeepslateCobbleSextuple = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockDeepslateCobbleSeptuple = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockDeepslateCobbleOctuple = registerBlock("blockdeepslatecobble", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerDiamond)
        {
            BlockList.blockDiamondCompressed = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockDiamondDouble = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockDiamondTriple = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockDiamondQuadruple = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockDiamondQuintuple = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockDiamondSextuple = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockDiamondSeptuple = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockDiamondOctuple = registerBlock("blockdiamond", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerDiorite)
        {
            BlockList.blockDioriteCompressed = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockDioriteDouble = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockDioriteTriple = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockDioriteQuadruple = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockDioriteQuintuple = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockDioriteSextuple = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockDioriteSeptuple = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockDioriteOctuple = registerBlock("blockdiorite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerDirt)
        {
            BlockList.blockDirtCompressed = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockDirtDouble = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockDirtTriple = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockDirtQuadruple = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockDirtQuintuple = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockDirtSextuple = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockDirtSeptuple = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockDirtOctuple = registerBlock("blockdirt", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerEmerald)
        {
            BlockList.blockEmeraldCompressed = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockEmeraldDouble = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockEmeraldTriple = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockEmeraldQuadruple = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockEmeraldQuintuple = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockEmeraldSextuple = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockEmeraldSeptuple = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockEmeraldOctuple = registerBlock("blockemerald", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerEndStone)
        {
            BlockList.blockEndStoneCompressed = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockEndStoneDouble = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockEndStoneTriple = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockEndStoneQuadruple = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockEndStoneQuintuple = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockEndStoneSextuple = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockEndStoneSeptuple = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockEndStoneOctuple = registerBlock("blockendstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerGold)
        {
            BlockList.blockGoldCompressed = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 0);
            BlockList.blockGoldDouble = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 1);
            BlockList.blockGoldTriple = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 2);
            BlockList.blockGoldQuadruple = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 3);
            BlockList.blockGoldQuintuple = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 4);
            BlockList.blockGoldSextuple = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 5);
            BlockList.blockGoldSeptuple = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 6);
            BlockList.blockGoldOctuple = registerBlock("blockgold", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 7);
             
        }
        if(CompOresConfig.registerGranite)
        {
            BlockList.blockGraniteCompressed = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockGraniteDouble = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockGraniteTriple = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockGraniteQuadruple = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockGraniteQuintuple = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockGraniteSextuple = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockGraniteSeptuple = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockGraniteOctuple = registerBlock("blockgranite", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerGravel)
        {
            BlockList.blockGravelCompressed = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockGravelDouble = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockGravelTriple = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockGravelQuadruple = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockGravelQuintuple = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockGravelSextuple = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockGravelSeptuple = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockGravelOctuple = registerBlock("blockgravel", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerIron)
        {
            BlockList.blockIronCompressed = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 0);
            BlockList.blockIronDouble = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 1);
            BlockList.blockIronTriple = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 2);
            BlockList.blockIronQuadruple = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 3);
            BlockList.blockIronQuintuple = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 4);
            BlockList.blockIronSextuple = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 5);
            BlockList.blockIronSeptuple = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 6);
            BlockList.blockIronOctuple = registerBlock("blockiron", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F)), 7);
             
        }
        if(CompOresConfig.registerLapis)
        {
            BlockList.blockLapisCompressed = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockLapisDouble = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockLapisTriple = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockLapisQuadruple = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockLapisQuintuple = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockLapisSextuple = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockLapisSeptuple = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockLapisOctuple = registerBlock("blocklapis", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerNetherrack)
        {
            BlockList.blockNetherrackCompressed = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockNetherrackDouble = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockNetherrackTriple = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockNetherrackQuadruple = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockNetherrackQuintuple = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockNetherrackSextuple = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockNetherrackSeptuple = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockNetherrackOctuple = registerBlock("blocknetherrack", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
            
        }
        if(CompOresConfig.registerQuartz)
        {
            BlockList.blockQuartzCompressed = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockQuartzDouble = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockQuartzTriple = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockQuartzQuadruple = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockQuartzQuintuple = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockQuartzSextuple = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockQuartzSeptuple = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockQuartzOctuple = registerBlock("blockquartz", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
            
        }
        if(CompOresConfig.registerRedstone)
        {
            BlockList.blockRedstoneCompressed = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockRedstoneDouble = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockRedstoneTriple = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockRedstoneQuadruple = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockRedstoneQuintuple = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockRedstoneSextuple = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockRedstoneSeptuple = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockRedstoneOctuple = registerBlock("blockredstone", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
            
        }
        if(CompOresConfig.registerSand)
        {
            BlockList.blockSandCompressed = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockSandDouble = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockSandTriple = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockSandQuadruple = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockSandQuintuple = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockSandSextuple = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockSandSeptuple = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockSandOctuple = registerBlock("blocksand", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
        if(CompOresConfig.registerTuff)
        {
            BlockList.blockTuffCompressed = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 0);
            BlockList.blockTuffDouble = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 1);
            BlockList.blockTuffTriple = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 2);
            BlockList.blockTuffQuadruple = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 3);
            BlockList.blockTuffQuintuple = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 4);
            BlockList.blockTuffSextuple = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 5);
            BlockList.blockTuffSeptuple = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 6);
            BlockList.blockTuffOctuple = registerBlock("blocktuff", properties -> new BlockMetaCompressedOre(properties.strength(3.0F).explosionResistance(5.0F).mapColor(MapColor.STONE)), 7);
             
        }
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block,int meta)
    {
        String uName = name + "." + EnumLevel.byMetadata(meta).getString();
        InitBlocks.ITEMS.registerItem(uName,properties -> new ItemBlockMetaCompressedOre(block.get(),properties.useBlockDescriptionPrefix().stacksTo(64),meta));
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties,T> function,int meta)
    {
        String uName = name + "." + EnumLevel.byMetadata(meta).getString();
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(uName,function);
        registerBlockItem(name,toReturn,meta);
        return toReturn;
    }
}

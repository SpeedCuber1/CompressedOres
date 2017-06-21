package com.tylerh.compressedores.Init;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    /*public static void init()
    {
        if(ModBlocks.registerGold)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockGold"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockGoldCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockGoldDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockGoldTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockGoldQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockGoldQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockGoldSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockGoldSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GOLD_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockGoldCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,0),new Object[]{"D",Character.valueOf('D'),"blockGoldDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,1),new Object[]{"T",Character.valueOf('T'),"blockGoldTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockGoldQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockGoldQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,4),new Object[]{"S",Character.valueOf('S'),"blockGoldSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,5),new Object[]{"S",Character.valueOf('S'),"blockGoldSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGold,9,6),new Object[]{"O",Character.valueOf('O'),"blockGoldOctuple"}));

        }
        if(ModBlocks.registerIron)
        {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockIronCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockIronDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockIronTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockIronQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockIronQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockIronSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockIronSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.IRON_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockIronCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,0),new Object[]{"D",Character.valueOf('D'),"blockIronDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,1),new Object[]{"T",Character.valueOf('T'),"blockIronTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockIronQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockIronQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,4),new Object[]{"S",Character.valueOf('S'),"blockIronSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,5),new Object[]{"S",Character.valueOf('S'),"blockIronSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaIron,9,6),new Object[]{"O",Character.valueOf('O'),"blockIronOctuple"}));

        }
        if(ModBlocks.registerDiamond)
        {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockDiamond"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockDiamondCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockDiamondDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockDiamondTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockDiamondQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockDiamondQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockDiamondSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockDiamondSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.DIAMOND_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockDiamondCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,0),new Object[]{"D",Character.valueOf('D'),"blockDiamondDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,1),new Object[]{"T",Character.valueOf('T'),"blockDiamondTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockDiamondQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockDiamondQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,4),new Object[]{"S",Character.valueOf('S'),"blockDiamondSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,5),new Object[]{"S",Character.valueOf('S'),"blockDiamondSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiamond,9,6),new Object[]{"O",Character.valueOf('O'),"blockDiamondOctuple"}));

        }
        if(ModBlocks.registerEmerald)
        {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockEmerald"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockEmeraldCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockEmeraldDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockEmeraldTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockEmeraldQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockEmeraldQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockEmeraldSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockEmeraldSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.EMERALD_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockEmeraldCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,0),new Object[]{"D",Character.valueOf('D'),"blockEmeraldDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,1),new Object[]{"T",Character.valueOf('T'),"blockEmeraldTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockEmeraldQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockEmeraldQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,4),new Object[]{"S",Character.valueOf('S'),"blockEmeraldSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,5),new Object[]{"S",Character.valueOf('S'),"blockEmeraldSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaEmerald,9,6),new Object[]{"O",Character.valueOf('O'),"blockEmeraldOctuple"}));

        }
        if(ModBlocks.registerRedstone) {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 0), new Object[]{"ggg", "ggg", "ggg", Character.valueOf('g'), "blockRedstone"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 1), new Object[]{"ddd", "ddd", "ddd", Character.valueOf('d'), "blockRedstoneCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 2), new Object[]{"ttt", "ttt", "ttt", Character.valueOf('t'), "blockRedstoneDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 3), new Object[]{"qqq", "qqq", "qqq", Character.valueOf('q'), "blockRedstoneTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 4), new Object[]{"qqq", "qqq", "qqq", Character.valueOf('q'), "blockRedstoneQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 5), new Object[]{"sss", "sss", "sss", Character.valueOf('s'), "blockRedstoneQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 6), new Object[]{"sss", "sss", "sss", Character.valueOf('s'), "blockRedstoneSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 1, 7), new Object[]{"ooo", "ooo", "ooo", Character.valueOf('o'), "blockRedstoneSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.REDSTONE_BLOCK, 9), new Object[]{"G", Character.valueOf('G'), "blockRedstoneCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 0), new Object[]{"D", Character.valueOf('D'), "blockRedstoneDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 1), new Object[]{"T", Character.valueOf('T'), "blockRedstoneTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 2), new Object[]{"Q", Character.valueOf('Q'), "blockRedstoneQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 3), new Object[]{"Q", Character.valueOf('Q'), "blockRedstoneQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 4), new Object[]{"S", Character.valueOf('S'), "blockRedstoneSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 5), new Object[]{"S", Character.valueOf('S'), "blockRedstoneSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaRedstone, 9, 6), new Object[]{"O", Character.valueOf('O'), "blockRedstoneOctuple"}));
        }
        if(ModBlocks.registerLapis)
        {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockLapis"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockLapisCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockLapisDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockLapisTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockLapisQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockLapisQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockLapisSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockLapisSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.LAPIS_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockLapisCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,0),new Object[]{"D",Character.valueOf('D'),"blockLapisDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,1),new Object[]{"T",Character.valueOf('T'),"blockLapisTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockLapisQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockLapisQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,4),new Object[]{"S",Character.valueOf('S'),"blockLapisSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,5),new Object[]{"S",Character.valueOf('S'),"blockLapisSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaLapis,9,6),new Object[]{"O",Character.valueOf('O'),"blockLapisOctuple"}));

        }
        if(ModBlocks.registerQuartz)
        {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockQuartz"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockQuartzCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockQuartzDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockQuartzTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockQuartzQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockQuartzQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockQuartzSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockQuartzSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.QUARTZ_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockQuartzCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,0),new Object[]{"D",Character.valueOf('D'),"blockQuartzDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,1),new Object[]{"T",Character.valueOf('T'),"blockQuartzTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockQuartzQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockQuartzQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,4),new Object[]{"S",Character.valueOf('S'),"blockQuartzSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,5),new Object[]{"S",Character.valueOf('S'),"blockQuartzSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaQuartz,9,6),new Object[]{"O",Character.valueOf('O'),"blockQuartzOctuple"}));

        }
        if(ModBlocks.registerCoal)
        {

            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),"blockCoal"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockCoalCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockCoalDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockCoalTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockCoalQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockCoalQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockCoalSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockCoalSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COAL_BLOCK,9),new Object[]{"G",Character.valueOf('G'),"blockCoalCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,0),new Object[]{"D",Character.valueOf('D'),"blockCoalDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,1),new Object[]{"T",Character.valueOf('T'),"blockCoalTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockCoalQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockCoalQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,4),new Object[]{"S",Character.valueOf('S'),"blockCoalSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,5),new Object[]{"S",Character.valueOf('S'),"blockCoalSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCoal,9,6),new Object[]{"O",Character.valueOf('O'),"blockCoalOctuple"}));

        }
        if(ModBlocks.registerAndesite)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.STONE,9,5)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockAndesiteCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockAndesiteDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockAndesiteTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockAndesiteQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockAndesiteQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockAndesiteSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockAndesiteSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.STONE,9,5),new Object[]{"G",Character.valueOf('G'),"blockAndesiteCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,0),new Object[]{"D",Character.valueOf('D'),"blockAndesiteDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,1),new Object[]{"T",Character.valueOf('T'),"blockAndesiteTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockAndesiteQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockAndesiteQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,4),new Object[]{"S",Character.valueOf('S'),"blockAndesiteSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,5),new Object[]{"S",Character.valueOf('S'),"blockAndesiteSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaAndesite,9,6),new Object[]{"O",Character.valueOf('O'),"blockAndesiteOctuple"}));
        }
        if(ModBlocks.registerDiorite)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.STONE,9,3)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockDioriteCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockDioriteDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockDioriteTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockDioriteQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockDioriteQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockDioriteSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockDioriteSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.STONE,9,3),new Object[]{"G",Character.valueOf('G'),"blockDioriteCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,0),new Object[]{"D",Character.valueOf('D'),"blockDioriteDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,1),new Object[]{"T",Character.valueOf('T'),"blockDioriteTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockDioriteQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockDioriteQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,4),new Object[]{"S",Character.valueOf('S'),"blockDioriteSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,5),new Object[]{"S",Character.valueOf('S'),"blockDioriteSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDiorite,9,6),new Object[]{"O",Character.valueOf('O'),"blockDioriteOctuple"}));
        }
        if(ModBlocks.registerGranite)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.STONE,9,1)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockGraniteCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockGraniteDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockGraniteTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockGraniteQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockGraniteQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockGraniteSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockGraniteSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.STONE,9,1),new Object[]{"G",Character.valueOf('G'),"blockGraniteCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,0),new Object[]{"D",Character.valueOf('D'),"blockGraniteDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,1),new Object[]{"T",Character.valueOf('T'),"blockGraniteTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockGraniteQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockGraniteQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,4),new Object[]{"S",Character.valueOf('S'),"blockGraniteSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,5),new Object[]{"S",Character.valueOf('S'),"blockGraniteSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGranite,9,6),new Object[]{"O",Character.valueOf('O'),"blockGraniteOctuple"}));
        }
        if(ModBlocks.registerCobblestone)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.COBBLESTONE,9,0)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockCobbleCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockCobbleDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockCobbleTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockCobbleQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockCobbleQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockCobbleSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockCobbleSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,9,0),new Object[]{"G",Character.valueOf('G'),"blockCobbleCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,0),new Object[]{"D",Character.valueOf('D'),"blockCobbleDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,1),new Object[]{"T",Character.valueOf('T'),"blockCobbleTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockCobbleQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockCobbleQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,4),new Object[]{"S",Character.valueOf('S'),"blockCobbleSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,5),new Object[]{"S",Character.valueOf('S'),"blockCobbleSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaCobble,9,6),new Object[]{"O",Character.valueOf('O'),"blockCobbleOctuple"}));
        }
        if(ModBlocks.registerDirt)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.DIRT,9,0)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockDirtCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockDirtDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockDirtTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockDirtQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockDirtQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockDirtSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockDirtSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.DIRT,9,0),new Object[]{"G",Character.valueOf('G'),"blockDirtCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,0),new Object[]{"D",Character.valueOf('D'),"blockDirtDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,1),new Object[]{"T",Character.valueOf('T'),"blockDirtTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockDirtQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockDirtQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,4),new Object[]{"S",Character.valueOf('S'),"blockDirtSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,5),new Object[]{"S",Character.valueOf('S'),"blockDirtSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaDirt,9,6),new Object[]{"O",Character.valueOf('O'),"blockDirtOctuple"}));
        }
        if(ModBlocks.registerSand)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.SAND,9,0)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockSandCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockSandDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockSandTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockSandQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockSandQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockSandSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockSandSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAND,9,0),new Object[]{"G",Character.valueOf('G'),"blockSandCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,0),new Object[]{"D",Character.valueOf('D'),"blockSandDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,1),new Object[]{"T",Character.valueOf('T'),"blockSandTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockSandQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockSandQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,4),new Object[]{"S",Character.valueOf('S'),"blockSandSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,5),new Object[]{"S",Character.valueOf('S'),"blockSandSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaSand,9,6),new Object[]{"O",Character.valueOf('O'),"blockSandOctuple"}));
        }
        if(ModBlocks.registerGravel)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.GRAVEL,9,0)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockGravelCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockGravelDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockGravelTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockGravelQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockGravelQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockGravelSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockGravelSeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GRAVEL,9,0),new Object[]{"G",Character.valueOf('G'),"blockGravelCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,0),new Object[]{"D",Character.valueOf('D'),"blockGravelDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,1),new Object[]{"T",Character.valueOf('T'),"blockGravelTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockGravelQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockGravelQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,4),new Object[]{"S",Character.valueOf('S'),"blockGravelSextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,5),new Object[]{"S",Character.valueOf('S'),"blockGravelSeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaGravel,9,6),new Object[]{"O",Character.valueOf('O'),"blockGravelOctuple"}));
        }
        if(ModBlocks.registerClay)
        {
            //Compressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,0),new Object[]{"ggg","ggg","ggg",Character.valueOf('g'),new ItemStack(Blocks.CLAY,9,0)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,1),new Object[]{"ddd","ddd","ddd",Character.valueOf('d'),"blockClayCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,2),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"blockClayDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,3),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockClayTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,4),new Object[]{"qqq","qqq","qqq",Character.valueOf('q'),"blockClayQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,5),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockClayQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,6),new Object[]{"sss","sss","sss",Character.valueOf('s'),"blockClaySextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,1,7),new Object[]{"ooo","ooo","ooo",Character.valueOf('o'),"blockClaySeptuple"}));

            //Decompressing
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.CLAY,9,0),new Object[]{"G",Character.valueOf('G'),"blockClayCompressed"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,0),new Object[]{"D",Character.valueOf('D'),"blockClayDouble"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,1),new Object[]{"T",Character.valueOf('T'),"blockClayTriple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,2),new Object[]{"Q",Character.valueOf('Q'),"blockClayQuadruple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,3),new Object[]{"Q",Character.valueOf('Q'),"blockClayQuintuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,4),new Object[]{"S",Character.valueOf('S'),"blockClaySextuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,5),new Object[]{"S",Character.valueOf('S'),"blockClaySeptuple"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMetaClay,9,6),new Object[]{"O",Character.valueOf('O'),"blockClayOctuple"}));
        }
    }*/
}

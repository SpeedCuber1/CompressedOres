package com.tylerh.compressedores.Data.Recipes;

import com.tylerh.compressedores.Init.BlockList;
import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class CompOreRecipe extends RecipeProvider
{
    public CompOreRecipe(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        for(EnumCriterionCompOres ores : EnumCriterionCompOres.values())
        {
            for (EnumLevel levels : EnumLevel.values())
            {
                if (levels.getMetadata() == 0)
                {
                    switch (ores.getString())
                    {
                        case "andesite":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.ANDESITE)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.ANDESITE,9)
                                    .addIngredient(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "clay":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.clayBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.CLAY)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.CLAY,9)
                                    .addIngredient(ModInfo.clayBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "coal":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.coalBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.COAL_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.COAL_BLOCK,9)
                                    .addIngredient(ModInfo.coalBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "cobble":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.COBBLESTONE)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.COBBLESTONE,9)
                                    .addIngredient(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "diamond":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.DIAMOND_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.DIAMOND_BLOCK,9)
                                    .addIngredient(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "diorite":
                        {
                            //Compressed
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.DIORITE)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.DIORITE,9)
                                    .addIngredient(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "dirt":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.DIRT)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.DIRT,9)
                                    .addIngredient(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "emerald":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.EMERALD_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.EMERALD_BLOCK,9)
                                    .addIngredient(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "gold":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.goldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.GOLD_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.GOLD_BLOCK,9)
                                    .addIngredient(ModInfo.goldBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "granite":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.GRANITE)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.GRANITE,9)
                                    .addIngredient(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "gravel":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.GRAVEL)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.GRAVEL,9)
                                    .addIngredient(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "iron":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.ironBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.IRON_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.IRON_BLOCK,9)
                                    .addIngredient(ModInfo.ironBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "lapis":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.LAPIS_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.LAPIS_BLOCK,9)
                                    .addIngredient(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "quartz":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.QUARTZ_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.QUARTZ_BLOCK,9)
                                    .addIngredient(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "redstone":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.REDSTONE_BLOCK)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.REDSTONE_BLOCK,9)
                                    .addIngredient(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                        case "sand":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.sandBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.SAND)
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(Blocks.SAND,9)
                                    .addIngredient(ModInfo.sandBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                            break;
                        }
                    }
                }
                else
                {
                    switch (ores.getString())
                    {
                        case "andesite":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.andesiteBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.andesiteBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "clay":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.clayBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.clayBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.clayBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.clayBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "coal":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.coalBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.coalBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.coalBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.coalBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "cobble":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.cobbleBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.cobbleBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "diamond":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.diamondBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.diamondBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "diorite":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.dioriteBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.dioriteBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "dirt":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.dirtBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.dirtBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "emerald":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.emeraldBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.emeraldBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "gold":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.goldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.goldBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.goldBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.goldBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "granite":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.graniteBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.graniteBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "gravel":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.gravelBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.gravelBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "iron":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.ironBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.ironBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.ironBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.ironBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "lapis":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.lapisBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.lapisBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "quartz":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.quartzBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.quartzBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "redstone":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.redstoneBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.redstoneBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                        case "sand":
                        {
                            //Compressing
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.sandBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.sandBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".up",hasItem(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapelessRecipe(ModInfo.sandBlocks[levels.getMetadata() - 1],9)
                                    .addIngredient(ModInfo.sandBlocks[levels.getMetadata()])
                                    .addCriterion(ores.getString() + "." + levels.getString() + ".down",hasItem(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores", ores.getString()) + "." + levels.getString() + ".down");
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override
    public String getName()
    {
        return "Compressed Ores Recipes";
    }
}

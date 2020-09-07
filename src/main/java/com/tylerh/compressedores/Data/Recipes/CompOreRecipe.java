package com.tylerh.compressedores.Data.Recipes;

import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
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
                    switch (ores.getName())
                    {
                        case "andesite":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.ANDESITE)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "clay":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.clayBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.CLAY)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "coal":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.coalBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.COAL_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "cobble":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.COBBLESTONE)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "diamond":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.DIAMOND_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "diorite":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.DIORITE)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "dirt":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.DIRT)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "emerald":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.EMERALD_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "gold":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.goldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.GOLD_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "granite":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.GRANITE)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "gravel":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.GRAVEL)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "iron":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.ironBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.IRON_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "lapis":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.LAPIS_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "quartz":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.QUARTZ_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "redstone":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.REDSTONE_BLOCK)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "sand":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.sandBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',Blocks.SAND)
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                    }
                }
                else
                {
                    switch (ores.getName())
                    {
                        case "andesite":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.andesiteBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "clay":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.clayBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.clayBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "coal":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.coalBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.coalBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "cobble":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.cobbleBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "diamond":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.diamondBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "diorite":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.dioriteBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "dirt":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.dirtBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "emerald":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.emeraldBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "gold":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.goldBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.goldBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "granite":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.graniteBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "gravel":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.gravelBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "iron":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.ironBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.ironBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "lapis":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.lapisBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "quartz":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.quartzBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "redstone":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.redstoneBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
                            break;
                        }
                        case "sand":
                        {
                            ShapedRecipeBuilder.shapedRecipe(ModInfo.sandBlocks[levels.getMetadata()])
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .patternLine("iii")
                                    .key('i',ModInfo.sandBlocks[levels.getMetadata() - 1])
                                    .addCriterion(ores.getName() + "." + levels.getName() + ".up",hasItem(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .build(consumer,new ResourceLocation("compressedores",ores.getName() + "." + levels.getName() + ".up"));
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

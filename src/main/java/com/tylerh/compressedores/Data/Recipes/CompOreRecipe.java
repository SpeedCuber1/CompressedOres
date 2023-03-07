package com.tylerh.compressedores.Data.Recipes;

import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;


public class CompOreRecipe extends RecipeProvider implements IConditionBuilder
{
    public CompOreRecipe(PackOutput output)
    {
        super(output);
    }
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        for(EnumCriterionCompOres ores : EnumCriterionCompOres.values())
        {
            for (EnumLevel levels : EnumLevel.values())
            {
                if (levels.getMetadata() == 0)
                {
                    switch (ores.getString())
                    {
                        case "andesite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.ANDESITE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.ANDESITE, 9)
                                    .requires(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "basalt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.basaltBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.BASALT)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up",has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.BASALT,9)
                                    .requires(ModInfo.basaltBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down",has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "blackstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.BLACKSTONE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up",has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.BLACKSTONE,9)
                                    .requires(ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down",has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "calcite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.calciteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.CALCITE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.CALCITE, 9)
                                    .requires(ModInfo.calciteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "clay" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.clayBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.CLAY)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.CLAY, 9)
                                    .requires(ModInfo.clayBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "coal" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.coalBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COAL_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.COAL_BLOCK, 9)
                                    .requires(ModInfo.coalBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "cobble" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COBBLESTONE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.COBBLESTONE, 9)
                                    .requires(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "deepslate" -> {
                           //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COBBLED_DEEPSLATE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.COBBLED_DEEPSLATE, 9)
                                    .requires(ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "diamond" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.diamondBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIAMOND_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.DIAMOND_BLOCK, 9)
                                    .requires(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "diorite" -> {
                            //Compressed
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIORITE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.DIORITE, 9)
                                    .requires(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "dirt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dirtBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIRT)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.DIRT, 9)
                                    .requires(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "emerald" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.EMERALD_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.EMERALD_BLOCK, 9)
                                    .requires(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "gold" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.goldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GOLD_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.GOLD_BLOCK, 9)
                                    .requires(ModInfo.goldBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "granite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.graniteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GRANITE)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.GRANITE, 9)
                                    .requires(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "gravel" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.gravelBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GRAVEL)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.GRAVEL, 9)
                                    .requires(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "iron" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.ironBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.IRON_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.IRON_BLOCK, 9)
                                    .requires(ModInfo.ironBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "lapis" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.lapisBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.LAPIS_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.LAPIS_BLOCK, 9)
                                    .requires(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "netherrack" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.NETHERRACK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.NETHERRACK, 9)
                                    .requires(ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "quartz" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.quartzBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.QUARTZ_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.QUARTZ_BLOCK, 9)
                                    .requires(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "redstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.REDSTONE_BLOCK)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.REDSTONE_BLOCK, 9)
                                    .requires(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "sand" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.sandBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.SAND)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.SAND, 9)
                                    .requires(ModInfo.sandBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "tuff" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.tuffBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.TUFF)
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.TUFF, 9)
                                    .requires(ModInfo.tuffBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                    }
                }
                else
                {
                    switch (ores.getString())
                    {
                        case "andesite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.andesiteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.andesiteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "basalt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.basaltBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.basaltBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.basaltBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.basaltBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down",has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "blackstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.blackstoneBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.blackstoneBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down",has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "calcite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.calciteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.calciteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.calciteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.calciteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "clay" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.clayBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.clayBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.clayBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.clayBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "coal" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.coalBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.coalBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.coalBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.coalBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "cobble" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.cobbleBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.cobbleBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "deepslate" -> {
                           //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.deepslateCobbleBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up",has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.deepslateCobbleBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down",has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "diamond" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.diamondBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.diamondBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.diamondBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "diorite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.dioriteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.dioriteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "dirt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dirtBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.dirtBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.dirtBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "emerald" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.emeraldBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.emeraldBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "gold" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.goldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.goldBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.goldBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.goldBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "granite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.graniteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.graniteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.graniteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "gravel" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.gravelBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.gravelBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.gravelBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "iron" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.ironBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.ironBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.ironBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.ironBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "lapis" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.lapisBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.lapisBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.lapisBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "netherrack" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.netherrackBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.netherrackBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "quartz" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.quartzBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.quartzBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.quartzBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "redstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.redstoneBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.redstoneBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "sand" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.sandBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.sandBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.sandBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.sandBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down", has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores", ores.getString() + "." + levels.getString() + ".down"));
                        }
                        case "tuff" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.tuffBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.tuffBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".up", has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer, new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".up"));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.tuffBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.tuffBlocks[levels.getMetadata()])
                                    .unlockedBy(ores.getString() + "." + levels.getString() + ".down",has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer,new ResourceLocation("compressedores",ores.getString() + "." + levels.getString() + ".down"));
                        }
                    }
                }
            }
        }
    }
}

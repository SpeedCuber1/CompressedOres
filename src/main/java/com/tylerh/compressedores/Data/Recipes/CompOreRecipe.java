package com.tylerh.compressedores.Data.Recipes;

import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;


public class CompOreRecipe extends RecipeProvider implements IConditionBuilder
{
    public CompOreRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> provider)
    {
        super(output,provider);
    }
    
    protected void buildRecipes(RecipeOutput consumer)
    {
        for(EnumCriterionCompOres ores : EnumCriterionCompOres.values())
        {
            for (EnumLevel levels : EnumLevel.values())
            {
                String upName = ores.getString() + "." + levels.getString() + ".up";
                String downName = ores.getString() + "." + levels.getString() + ".down";
                if (levels.getMetadata() == 0)
                {
                    switch (ores.getString())
                    {
                        case "amethyst" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.amethystBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.AMETHYST_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.amethystBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.AMETHYST_BLOCK, 9)
                                    .requires(ModInfo.amethystBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.amethystBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "andesite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.ANDESITE)
                                    .unlockedBy(upName, has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.ANDESITE, 9)
                                    .requires(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "basalt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.basaltBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.BASALT)
                                    .unlockedBy(upName,has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.BASALT,9)
                                    .requires(ModInfo.basaltBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "blackstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.BLACKSTONE)
                                    .unlockedBy(upName,has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.BLACKSTONE,9)
                                    .requires(ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "calcite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.calciteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.CALCITE)
                                    .unlockedBy(upName, has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.CALCITE, 9)
                                    .requires(ModInfo.calciteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "clay" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.clayBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.CLAY)
                                    .unlockedBy(upName, has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.CLAY, 9)
                                    .requires(ModInfo.clayBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "coal" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.coalBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COAL_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.COAL_BLOCK, 9)
                                    .requires(ModInfo.coalBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "cobble" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COBBLESTONE)
                                    .unlockedBy(upName, has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.COBBLESTONE, 9)
                                    .requires(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "deepslate" -> {
                           //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COBBLED_DEEPSLATE)
                                    .unlockedBy(upName, has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.COBBLED_DEEPSLATE, 9)
                                    .requires(ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "diamond" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.diamondBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIAMOND_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.DIAMOND_BLOCK, 9)
                                    .requires(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "diorite" -> {
                            //Compressed
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIORITE)
                                    .unlockedBy(upName, has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.DIORITE, 9)
                                    .requires(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "dirt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dirtBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIRT)
                                    .unlockedBy(upName, has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.DIRT, 9)
                                    .requires(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "emerald" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.EMERALD_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.EMERALD_BLOCK, 9)
                                    .requires(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "end_stone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.endStoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.END_STONE)
                                    .unlockedBy(upName,has(ModInfo.endStoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.END_STONE,9)
                                    .requires(ModInfo.endStoneBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.endStoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "gold" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.goldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GOLD_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.GOLD_BLOCK, 9)
                                    .requires(ModInfo.goldBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "granite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.graniteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GRANITE)
                                    .unlockedBy(upName, has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.GRANITE, 9)
                                    .requires(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "gravel" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.gravelBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GRAVEL)
                                    .unlockedBy(upName, has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.GRAVEL, 9)
                                    .requires(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "iron" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.ironBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.IRON_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.IRON_BLOCK, 9)
                                    .requires(ModInfo.ironBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "lapis" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.lapisBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.LAPIS_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.LAPIS_BLOCK, 9)
                                    .requires(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "netherrack" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.NETHERRACK)
                                    .unlockedBy(upName, has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.NETHERRACK, 9)
                                    .requires(ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "quartz" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.quartzBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.QUARTZ_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.QUARTZ_BLOCK, 9)
                                    .requires(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "redstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.REDSTONE_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.REDSTONE_BLOCK, 9)
                                    .requires(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "sand" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.sandBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.SAND)
                                    .unlockedBy(upName, has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.SAND, 9)
                                    .requires(ModInfo.sandBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "tuff" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.tuffBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.TUFF)
                                    .unlockedBy(upName, has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Blocks.TUFF, 9)
                                    .requires(ModInfo.tuffBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                    }
                }
                else
                {
                    switch (ores.getString())
                    {
                        case "amethyst" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.amethystBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.amethystBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.amethystBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.amethystBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.amethystBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.amethystBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "andesite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.andesiteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.andesiteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.andesiteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.andesiteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "basalt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.basaltBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.basaltBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.basaltBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.basaltBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.basaltBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "blackstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.blackstoneBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.blackstoneBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.blackstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.blackstoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "calcite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.calciteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.calciteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.calciteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.calciteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.calciteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "clay" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.clayBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.clayBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.clayBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.clayBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.clayBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "coal" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.coalBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.coalBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.coalBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.coalBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.coalBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "cobble" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.cobbleBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.cobbleBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.cobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.cobbleBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "deepslate" -> {
                           //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.deepslateCobbleBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName,has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.deepslateCobbleBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.deepslateCobbleBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "diamond" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.diamondBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.diamondBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.diamondBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.diamondBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.diamondBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "diorite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.dioriteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.dioriteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.dioriteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dioriteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "dirt" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dirtBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.dirtBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.dirtBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.dirtBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dirtBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "emerald" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.emeraldBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.emeraldBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.emeraldBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.emeraldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "end_stone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.endStoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.endStoneBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName,has(ModInfo.endStoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModInfo.endStoneBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.endStoneBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.endStoneBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "gold" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.goldBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.goldBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.goldBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.goldBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.goldBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "granite" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.graniteBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.graniteBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.graniteBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.graniteBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.graniteBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "gravel" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.gravelBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.gravelBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.gravelBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.gravelBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.gravelBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "iron" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.ironBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.ironBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.ironBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.ironBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.ironBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "lapis" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.lapisBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.lapisBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.lapisBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.lapisBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.lapisBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "netherrack" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.netherrackBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.netherrackBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.netherrackBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.netherrackBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "quartz" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.quartzBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.quartzBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.quartzBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.quartzBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.quartzBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "redstone" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.redstoneBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.redstoneBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.redstoneBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.redstoneBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "sand" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.sandBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.sandBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.sandBlocks[levels.getMetadata() - 1], 9)
                                    .requires(ModInfo.sandBlocks[levels.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.sandBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                        case "tuff" -> {
                            //Compressing
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.tuffBlocks[levels.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.tuffBlocks[levels.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer, ResourceLocation.fromNamespaceAndPath("compressedores", upName));
                            //Decompressing
                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModInfo.tuffBlocks[levels.getMetadata() - 1],9)
                                    .requires(ModInfo.tuffBlocks[levels.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.tuffBlocks[levels.getMetadata()]))
                                    .save(consumer,ResourceLocation.fromNamespaceAndPath("compressedores", downName));
                        }
                    }
                }
            }
        }
    }
}

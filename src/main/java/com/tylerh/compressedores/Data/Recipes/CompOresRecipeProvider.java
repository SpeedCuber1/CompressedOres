package com.tylerh.compressedores.Data.Recipes;

import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class CompOresRecipeProvider extends RecipeProvider
{
    public CompOresRecipeProvider(HolderLookup.Provider registries, RecipeOutput output)
    {
        super(registries, output);
    }

    @Override
    protected void buildRecipes()
    {
        for(EnumCriterionCompOres ores : EnumCriterionCompOres.values())
        {
            for(EnumLevel level : EnumLevel.values())
            {
                final String upName = ores.getString() + "." + level.getString() + ".up";
                final String downName = ores.getString() + "." + level.getString() + ".down";
                if (level.getMetadata() == 0)
                {
                    switch (ores.getString())
                    {
                        case "amethyst" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.amethystBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.AMETHYST_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.amethystBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.AMETHYST_BLOCK, 9)
                                    .requires(ModInfo.amethystBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.amethystBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "andesite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.andesiteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.ANDESITE)
                                    .unlockedBy(upName, has(ModInfo.andesiteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.ANDESITE, 9)
                                    .requires(ModInfo.andesiteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.andesiteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "basalt" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.basaltBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.BASALT)
                                    .unlockedBy(upName,has(ModInfo.basaltBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.BASALT,9)
                                    .requires(ModInfo.basaltBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.basaltBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "blackstone" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.blackstoneBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.BLACKSTONE)
                                    .unlockedBy(upName,has(ModInfo.blackstoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.BLACKSTONE,9)
                                    .requires(ModInfo.blackstoneBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.blackstoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "calcite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.calciteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.CALCITE)
                                    .unlockedBy(upName, has(ModInfo.calciteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.CALCITE, 9)
                                    .requires(ModInfo.calciteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.calciteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "clay" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.clayBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.CLAY)
                                    .unlockedBy(upName, has(ModInfo.clayBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.CLAY, 9)
                                    .requires(ModInfo.clayBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.clayBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "coal" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.coalBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COAL_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.coalBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.COAL_BLOCK, 9)
                                    .requires(ModInfo.coalBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.coalBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "cobble" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.cobbleBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COBBLESTONE)
                                    .unlockedBy(upName, has(ModInfo.cobbleBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.COBBLESTONE, 9)
                                    .requires(ModInfo.cobbleBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.cobbleBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "deepslate" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.deepslateCobbleBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.COBBLED_DEEPSLATE)
                                    .unlockedBy(upName, has(ModInfo.deepslateCobbleBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.COBBLED_DEEPSLATE, 9)
                                    .requires(ModInfo.deepslateCobbleBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.deepslateCobbleBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "diamond" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.diamondBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIAMOND_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.diamondBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.DIAMOND_BLOCK, 9)
                                    .requires(ModInfo.diamondBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.diamondBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "diorite" -> {
                            //Compressed
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dioriteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIORITE)
                                    .unlockedBy(upName, has(ModInfo.dioriteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.DIORITE, 9)
                                    .requires(ModInfo.dioriteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dioriteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "dirt" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dirtBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.DIRT)
                                    .unlockedBy(upName, has(ModInfo.dirtBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.DIRT, 9)
                                    .requires(ModInfo.dirtBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dirtBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "emerald" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.emeraldBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.EMERALD_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.emeraldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.EMERALD_BLOCK, 9)
                                    .requires(ModInfo.emeraldBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.emeraldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "end_stone" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.endStoneBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.END_STONE)
                                    .unlockedBy(upName,has(ModInfo.endStoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.END_STONE,9)
                                    .requires(ModInfo.endStoneBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.endStoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "gold" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.goldBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GOLD_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.goldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.GOLD_BLOCK, 9)
                                    .requires(ModInfo.goldBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.goldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "granite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.graniteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GRANITE)
                                    .unlockedBy(upName, has(ModInfo.graniteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.GRANITE, 9)
                                    .requires(ModInfo.graniteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.graniteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "gravel" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.gravelBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.GRAVEL)
                                    .unlockedBy(upName, has(ModInfo.gravelBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.GRAVEL, 9)
                                    .requires(ModInfo.gravelBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.gravelBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "iron" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.ironBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.IRON_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.ironBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.IRON_BLOCK, 9)
                                    .requires(ModInfo.ironBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.ironBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "lapis" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.lapisBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.LAPIS_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.lapisBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.LAPIS_BLOCK, 9)
                                    .requires(ModInfo.lapisBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.lapisBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "netherrack" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.netherrackBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.NETHERRACK)
                                    .unlockedBy(upName, has(ModInfo.netherrackBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.NETHERRACK, 9)
                                    .requires(ModInfo.netherrackBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.netherrackBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "quartz" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.quartzBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.QUARTZ_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.quartzBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.QUARTZ_BLOCK, 9)
                                    .requires(ModInfo.quartzBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.quartzBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "redstone" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.redstoneBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.REDSTONE_BLOCK)
                                    .unlockedBy(upName, has(ModInfo.redstoneBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.REDSTONE_BLOCK, 9)
                                    .requires(ModInfo.redstoneBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.redstoneBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "sand" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.sandBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', Blocks.SAND)
                                    .unlockedBy(upName, has(ModInfo.sandBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.SAND, 9)
                                    .requires(ModInfo.sandBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.sandBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "tuff" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.tuffBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',Blocks.TUFF)
                                    .unlockedBy(upName, has(ModInfo.tuffBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,Blocks.TUFF, 9)
                                    .requires(ModInfo.tuffBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.tuffBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                    }
                }
                else
                {
                    switch (ores.getString())
                    {
                        case "amethyst" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.amethystBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.amethystBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.amethystBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.amethystBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.amethystBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.amethystBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "andesite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.andesiteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.andesiteBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.andesiteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.andesiteBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.andesiteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.andesiteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "basalt" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.basaltBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.basaltBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.basaltBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.basaltBlocks[level.getMetadata() - 1],9)
                                    .requires(ModInfo.basaltBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.basaltBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "blackstone" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.blackstoneBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.blackstoneBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.blackstoneBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.blackstoneBlocks[level.getMetadata() - 1],9)
                                    .requires(ModInfo.blackstoneBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.blackstoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "calcite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.calciteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.calciteBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.calciteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.calciteBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.calciteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.calciteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "clay" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.clayBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.clayBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.clayBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.clayBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.clayBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.clayBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "coal" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.coalBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.coalBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.coalBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.coalBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.coalBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.coalBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "cobble" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.cobbleBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.cobbleBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.cobbleBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.cobbleBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.cobbleBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.cobbleBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "deepslate" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.deepslateCobbleBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.deepslateCobbleBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName,has(ModInfo.deepslateCobbleBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.deepslateCobbleBlocks[level.getMetadata() - 1],9)
                                    .requires(ModInfo.deepslateCobbleBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.deepslateCobbleBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "diamond" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.diamondBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.diamondBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.diamondBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.diamondBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.diamondBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.diamondBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "diorite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dioriteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.dioriteBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.dioriteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.dioriteBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.dioriteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dioriteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "dirt" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.dirtBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.dirtBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.dirtBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.dirtBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.dirtBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.dirtBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "emerald" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.emeraldBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.emeraldBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.emeraldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.emeraldBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.emeraldBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.emeraldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "end_stone" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.endStoneBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.endStoneBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName,has(ModInfo.endStoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC, ModInfo.endStoneBlocks[level.getMetadata() - 1],9)
                                    .requires(ModInfo.endStoneBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.endStoneBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "gold" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.goldBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.goldBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.goldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.goldBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.goldBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.goldBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "granite" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.graniteBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.graniteBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.graniteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.graniteBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.graniteBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.graniteBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "gravel" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.gravelBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.gravelBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.gravelBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.gravelBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.gravelBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.gravelBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "iron" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.ironBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.ironBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.ironBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.ironBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.ironBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.ironBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "lapis" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.lapisBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.lapisBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.lapisBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.lapisBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.lapisBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.lapisBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "netherrack" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.netherrackBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.netherrackBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.netherrackBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.netherrackBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.netherrackBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.netherrackBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "quartz" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.quartzBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.quartzBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.quartzBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.quartzBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.quartzBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.quartzBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "redstone" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.redstoneBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.redstoneBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.redstoneBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.redstoneBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.redstoneBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.redstoneBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "sand" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.sandBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i', ModInfo.sandBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.sandBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.sandBlocks[level.getMetadata() - 1], 9)
                                    .requires(ModInfo.sandBlocks[level.getMetadata()])
                                    .unlockedBy(downName, has(ModInfo.sandBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                        case "tuff" -> {
                            //Compressing
                            shaped(RecipeCategory.BUILDING_BLOCKS,ModInfo.tuffBlocks[level.getMetadata()])
                                    .pattern("iii")
                                    .pattern("iii")
                                    .pattern("iii")
                                    .define('i',ModInfo.tuffBlocks[level.getMetadata() - 1])
                                    .unlockedBy(upName, has(ModInfo.tuffBlocks[level.getMetadata()]))
                                    .save(output, Identifier.fromNamespaceAndPath("compressedores", upName).toString());
                            //Decompressing
                            shapeless(RecipeCategory.MISC,ModInfo.tuffBlocks[level.getMetadata() - 1],9)
                                    .requires(ModInfo.tuffBlocks[level.getMetadata()])
                                    .unlockedBy(downName,has(ModInfo.tuffBlocks[level.getMetadata()]))
                                    .save(output,Identifier.fromNamespaceAndPath("compressedores", downName).toString());
                        }
                    }
                }
            }
        }
    }
    public static class Runner extends RecipeProvider.Runner
    {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries)
        {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output)
        {
            return new CompOresRecipeProvider(registries,output);
        }

        @Override
        public String getName()
        {
            return "Compressed Ores Recipes";
        }
    }
}

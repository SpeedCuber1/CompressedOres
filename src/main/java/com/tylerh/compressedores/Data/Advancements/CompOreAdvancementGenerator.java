package com.tylerh.compressedores.Data.Advancements;

import com.google.common.collect.Sets;
import com.tylerh.compressedores.Init.BlockList;
import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CompOreAdvancementGenerator implements DataProvider
{
    private final PackOutput packOutput;
    public CompOreAdvancementGenerator(PackOutput output)
    {
        packOutput = output;
    }
    @Override
    public CompletableFuture<?> run(CachedOutput output)
    {
        Path path = this.packOutput.getOutputFolder();
        Set<ResourceLocation> set = Sets.newHashSet();
        var futures = new ArrayList<CompletableFuture<?>>();
        Consumer<Advancement> consumer = (advancement) ->
        {
            if (!set.add(advancement.getId())) {
                throw new IllegalStateException("Duplicate advancement " + advancement.getId());
            } else {
                Path path1 = createPath(path, advancement);

                futures.add(DataProvider.saveStable(output, advancement.deconstruct().serializeToJson(), path1));
            }
        };
        generateAdvancements(consumer);

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }
    private void generateAdvancements(Consumer<Advancement> consumer)
    {
        var root = Advancement.Builder.advancement()
                .display(Blocks.GOLD_BLOCK,Component.translatable("compressedores.root"),Component.translatable("compressedores.root.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND), FrameType.TASK,false,false,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion("Amethyst Shard",InventoryChangeTrigger.TriggerInstance.hasItems(Items.AMETHYST_SHARD))
                .addCriterion("Amethyst Block",InventoryChangeTrigger.TriggerInstance.hasItems(Items.AMETHYST_BLOCK))
                .addCriterion("Clay", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CLAY_BALL))
                .addCriterion("Coal", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COAL))
                .addCriterion("Diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .addCriterion("Emerald",InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .addCriterion("Gold",InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GOLD_ORE))
                .addCriterion("Iron",InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.IRON_ORE))
                .addCriterion("Lapis", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LAPIS_LAZULI))
                .addCriterion("Quartz", InventoryChangeTrigger.TriggerInstance.hasItems(Items.QUARTZ))
                .addCriterion("Redstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.REDSTONE))
                .save(consumer,"compressedores:root");
        var craftCompressed = Advancement.Builder.advancement()
                .display(BlockList.blockGoldCompressed.get(),Component.translatable("compressedores.craftcompressed"),Component.translatable("compressedores.craftcompressed.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystCompressed.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteCompressed.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltCompressed.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneCompressed.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteCompressed.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClayCompressed.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalCompressed.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleCompressed.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleCompressed.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondCompressed.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteCompressed.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtCompressed.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldCompressed.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldCompressed.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteCompressed.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelCompressed.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronCompressed.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisCompressed.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackCompressed.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzCompressed.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneCompressed.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandCompressed.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffCompressed.get()))
                .parent(root)
                .save(consumer,"compressedores:craftcompressed");
        var craftDouble = Advancement.Builder.advancement()
                .display(BlockList.blockGoldDouble.get(),Component.translatable("compressedores.craftdouble"),Component.translatable("compressedores.craftdouble.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystDouble.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteDouble.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltDouble.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneDouble.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteDouble.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClayDouble.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalDouble.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleDouble.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleDouble.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondDouble.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteDouble.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtDouble.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldDouble.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldDouble.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteDouble.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelDouble.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronDouble.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisDouble.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackDouble.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzDouble.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneDouble.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandDouble.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffDouble.get()))
                .parent(craftCompressed)
                .save(consumer,"compressedores:craftdouble");
        var craftTriple = Advancement.Builder.advancement()
                .display(BlockList.blockGoldTriple.get(),Component.translatable("compressedores.crafttriple"),Component.translatable("compressedores.crafttriple.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystTriple.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteTriple.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltTriple.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneTriple.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteTriple.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClayTriple.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalTriple.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleTriple.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleTriple.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondTriple.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteTriple.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtTriple.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldTriple.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldTriple.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteTriple.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelTriple.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronTriple.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisTriple.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackTriple.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzTriple.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneTriple.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandTriple.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffTriple.get()))
                .parent(craftDouble)
                .save(consumer,"compressedores:crafttriple");
        var craftQuadruple = Advancement.Builder.advancement()
                .display(BlockList.blockGoldQuadruple.get(),Component.translatable("compressedores.craftquadruple"),Component.translatable("compressedores.craftquadruple.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClayQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandQuadruple.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffQuadruple.get()))
                .parent(craftTriple)
                .save(consumer,"compressedores:craftquadruple");
        var craftQuintuple = Advancement.Builder.advancement()
                .display(BlockList.blockGoldQuintuple.get(),Component.translatable("compressedores.craftquintuple"),Component.translatable("compressedores.craftquintuple.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.CHALLENGE,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClayQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandQuintuple.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffQuintuple.get()))
                .parent(craftQuadruple)
                .save(consumer,"compressedores:craftquintuple");
        var craftSextuple = Advancement.Builder.advancement()
                .display(BlockList.blockGoldSextuple.get(),Component.translatable("compressedores.craftsextuple"),Component.translatable("compressedores.craftsextuple.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.CHALLENGE,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystSextuple.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteSextuple.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltSextuple.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneSextuple.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteSextuple.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClaySextuple.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalSextuple.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleSextuple.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleSextuple.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondSextuple.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteSextuple.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtSextuple.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldSextuple.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldSextuple.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteSextuple.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelSextuple.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronSextuple.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisSextuple.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackSextuple.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzSextuple.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneSextuple.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandSextuple.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffSextuple.get()))
                .parent(craftQuintuple)
                .save(consumer,"compressedores:craftsextuple");
        var craftSeptuple = Advancement.Builder.advancement()
                .display(BlockList.blockGoldSeptuple.get(),Component.translatable("compressedores.craftseptuple"),Component.translatable("compressedores.craftseptuple.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.CHALLENGE,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClaySeptuple.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandSeptuple.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffSeptuple.get()))
                .parent(craftSextuple)
                .save(consumer,"compressedores:craftseptuple");
        var craftOctuple = Advancement.Builder.advancement()
                .display(BlockList.blockGoldOctuple.get(),Component.translatable("compressedores.craftoctuple"),Component.translatable("compressedores.craftoctuple.desc"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.GOAL,true,true,false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(EnumCriterionCompOres.AMETHYST.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAmethystOctuple.get()))
                .addCriterion(EnumCriterionCompOres.ANDESITE.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockAndesiteOctuple.get()))
                .addCriterion(EnumCriterionCompOres.BASALT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBasaltOctuple.get()))
                .addCriterion(EnumCriterionCompOres.BLACKSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockBlackstoneOctuple.get()))
                .addCriterion(EnumCriterionCompOres.CALCITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCalciteOctuple.get()))
                .addCriterion(EnumCriterionCompOres.CLAY.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockClayOctuple.get()))
                .addCriterion(EnumCriterionCompOres.COAL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCoalOctuple.get()))
                .addCriterion(EnumCriterionCompOres.COBBLE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockCobbleOctuple.get()))
                .addCriterion(EnumCriterionCompOres.DEEPSLATE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDeepslateCobbleOctuple.get()))
                .addCriterion(EnumCriterionCompOres.DIAMOND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDiamondOctuple.get()))
                .addCriterion(EnumCriterionCompOres.DIORITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDioriteOctuple.get()))
                .addCriterion(EnumCriterionCompOres.DIRT.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockDirtOctuple.get()))
                .addCriterion(EnumCriterionCompOres.EMERALD.getString(),InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockEmeraldOctuple.get()))
                .addCriterion(EnumCriterionCompOres.GOLD.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGoldOctuple.get()))
                .addCriterion(EnumCriterionCompOres.GRANITE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGraniteOctuple.get()))
                .addCriterion(EnumCriterionCompOres.GRAVEL.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockGravelOctuple.get()))
                .addCriterion(EnumCriterionCompOres.IRON.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockIronOctuple.get()))
                .addCriterion(EnumCriterionCompOres.LAPIS.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockLapisOctuple.get()))
                .addCriterion(EnumCriterionCompOres.NETHERRACK.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockNetherrackOctuple.get()))
                .addCriterion(EnumCriterionCompOres.QUARTZ.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockQuartzOctuple.get()))
                .addCriterion(EnumCriterionCompOres.REDSTONE.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockRedstoneOctuple.get()))
                .addCriterion(EnumCriterionCompOres.SAND.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockSandOctuple.get()))
                .addCriterion(EnumCriterionCompOres.TUFF.getString(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockList.blockTuffOctuple.get()))
                .parent(craftSeptuple)
                .save(consumer,"compressedores:craftoctuple");
    }
    private static Path createPath(Path basePath,Advancement advancement)
    {
        return basePath.resolve("data/" + advancement.getId().getNamespace()+ "/advancements/" + advancement.getId().getPath() + ".json");
    }
    @Override
    public String getName()
    {
        return "Compressed Ores Advancements";
    }
}

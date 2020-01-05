package com.tylerh.compressedores.Data;

import com.tylerh.compressedores.Init.BlockList;
import com.tylerh.compressedores.Util.EnumCriterionCompOres;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.function.Consumer;

public class CompOresAdvancement implements Consumer<Consumer<Advancement>>
{

    @Override
    public void accept(Consumer<Advancement> advancementConsumer)
    {
        Advancement root = Advancement.Builder.builder().withDisplay(Blocks.GOLD_BLOCK,new TranslationTextComponent("Compressed Ores"),new TranslationTextComponent("Start Learning the Art of Compression"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,false,false,true).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion(EnumCriterionCompOres.byMetadata(1).getName(),InventoryChangeTrigger.Instance.forItems(Blocks.CLAY)).withCriterion(EnumCriterionCompOres.byMetadata(2).getName(),InventoryChangeTrigger.Instance.forItems(Blocks.COAL_BLOCK)).withCriterion(EnumCriterionCompOres.byMetadata(4).getName(),InventoryChangeTrigger.Instance.forItems(Blocks.DIAMOND_BLOCK)).withCriterion("emerald",InventoryChangeTrigger.Instance.forItems(Blocks.EMERALD_BLOCK)).withCriterion("gold",InventoryChangeTrigger.Instance.forItems(Blocks.GOLD_BLOCK)).withCriterion("iron",InventoryChangeTrigger.Instance.forItems(Blocks.IRON_BLOCK)).withCriterion("lapis",InventoryChangeTrigger.Instance.forItems(Blocks.LAPIS_BLOCK)).withCriterion("quartz",InventoryChangeTrigger.Instance.forItems(Blocks.QUARTZ_BLOCK)).withCriterion("redstone",InventoryChangeTrigger.Instance.forItems(Blocks.REDSTONE_BLOCK)).register(advancementConsumer,"compressedores:root");
        Advancement craftCompressed = Advancement.Builder.builder().withDisplay(BlockList.blockGoldCompressed,new TranslationTextComponent("Small Step of the Journey"),new TranslationTextComponent("Craft a Compressed Block"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion(EnumCriterionCompOres.byMetadata(0).getName(),InventoryChangeTrigger.Instance.forItems(BlockList.blockAndesiteCompressed)).withCriterion(EnumCriterionCompOres.byMetadata(1).getName(),InventoryChangeTrigger.Instance.forItems(BlockList.blockClayCompressed)).withParent(root).register(advancementConsumer,"compressedores:craftcompressed");
    }
}

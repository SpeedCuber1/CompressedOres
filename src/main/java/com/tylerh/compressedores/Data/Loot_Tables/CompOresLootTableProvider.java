package com.tylerh.compressedores.Data.Loot_Tables;

import com.tylerh.compressedores.Init.InitBlocks;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class CompOresLootTableProvider extends BlockLootSubProvider
{
    public CompOresLootTableProvider(HolderLookup.Provider registries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(),registries);
    }

    @Override
    protected void generate()
    {
        for(EnumLevel level : EnumLevel.values())
        {
            dropSelf(ModInfo.amethystBlocks[level.getMetadata()]);
            dropSelf(ModInfo.andesiteBlocks[level.getMetadata()]);
            dropSelf(ModInfo.basaltBlocks[level.getMetadata()]);
            dropSelf(ModInfo.blackstoneBlocks[level.getMetadata()]);
            dropSelf(ModInfo.calciteBlocks[level.getMetadata()]);
            dropSelf(ModInfo.clayBlocks[level.getMetadata()]);
            dropSelf(ModInfo.coalBlocks[level.getMetadata()]);
            dropSelf(ModInfo.cobbleBlocks[level.getMetadata()]);
            dropSelf(ModInfo.deepslateCobbleBlocks[level.getMetadata()]);
            dropSelf(ModInfo.diamondBlocks[level.getMetadata()]);
            dropSelf(ModInfo.dioriteBlocks[level.getMetadata()]);
            dropSelf(ModInfo.dirtBlocks[level.getMetadata()]);
            dropSelf(ModInfo.emeraldBlocks[level.getMetadata()]);
            dropSelf(ModInfo.endStoneBlocks[level.getMetadata()]);
            dropSelf(ModInfo.goldBlocks[level.getMetadata()]);
            dropSelf(ModInfo.graniteBlocks[level.getMetadata()]);
            dropSelf(ModInfo.gravelBlocks[level.getMetadata()]);
            dropSelf(ModInfo.ironBlocks[level.getMetadata()]);
            dropSelf(ModInfo.lapisBlocks[level.getMetadata()]);
            dropSelf(ModInfo.netherrackBlocks[level.getMetadata()]);
            dropSelf(ModInfo.quartzBlocks[level.getMetadata()]);
            dropSelf(ModInfo.redstoneBlocks[level.getMetadata()]);
            dropSelf(ModInfo.sandBlocks[level.getMetadata()]);
            dropSelf(ModInfo.tuffBlocks[level.getMetadata()]);
        }
    }
    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return InitBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

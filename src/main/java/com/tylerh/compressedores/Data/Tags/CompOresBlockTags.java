package com.tylerh.compressedores.Data.Tags;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class CompOresBlockTags extends BlockTagsProvider
{
    public CompOresBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(output, lookupProvider, ModInfo.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries)
    {
        for(EnumLevel level : EnumLevel.values())
        {
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.amethystBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.andesiteBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.basaltBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.blackstoneBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.calciteBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.clayBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.coalBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.cobbleBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.deepslateCobbleBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.diamondBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.dioriteBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.dirtBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.emeraldBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.endStoneBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.goldBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.graniteBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.gravelBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.ironBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.lapisBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.netherrackBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.quartzBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.redstoneBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.sandBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.tuffBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.amethystBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.andesiteBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.basaltBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.blackstoneBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.calciteBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.clayBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.coalBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.cobbleBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.deepslateCobbleBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.diamondBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.dioriteBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.dirtBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.emeraldBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.endStoneBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.goldBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.graniteBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.gravelBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.ironBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.lapisBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.netherrackBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.quartzBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.redstoneBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.sandBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.tuffBlocks[level.getMetadata()]);
        }
    }
}

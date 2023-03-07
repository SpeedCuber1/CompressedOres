package com.tylerh.compressedores.Data.Tags;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.concurrent.CompletableFuture;

public class CompOreBlockTag extends TagsProvider<Block>
{
    public CompOreBlockTag(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper existingFileHelper)
    {
        super(output, ForgeRegistries.Keys.BLOCKS, provider, ModInfo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        for(EnumLevel level : EnumLevel.values())
        {
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.andesiteBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.basaltBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.blackstoneBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.calciteBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.clayBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.coalBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.cobbleBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.deepslateCobbleBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.diamondBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.dioriteBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.dirtBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.emeraldBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.goldBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.graniteBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.gravelBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.ironBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.lapisBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.netherrackBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.quartzBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.redstoneBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.sandBlocks[level.getMetadata()]).get());
            tag(BlockTags.NEEDS_IRON_TOOL).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.tuffBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.andesiteBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.basaltBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.blackstoneBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.calciteBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.clayBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.coalBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.cobbleBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.deepslateCobbleBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.diamondBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.dioriteBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.dirtBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.emeraldBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.goldBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.graniteBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.gravelBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.ironBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.lapisBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.netherrackBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.quartzBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.redstoneBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.sandBlocks[level.getMetadata()]).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ForgeRegistries.BLOCKS.getResourceKey(ModInfo.tuffBlocks[level.getMetadata()]).get());
        }
    }
}

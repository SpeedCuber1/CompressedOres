package com.tylerh.compressedores.Data.Tags;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CompOreBlockTag extends BlockTagsProvider
{
    public CompOreBlockTag(DataGenerator gen, ExistingFileHelper existingFileHelper)
    {
        super(gen, ModInfo.MOD_ID,existingFileHelper);
    }
    @Override
    public void addTags()
    {
        for(EnumLevel level : EnumLevel.values())
        {
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
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.goldBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.graniteBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.gravelBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.ironBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.lapisBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.quartzBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.redstoneBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.sandBlocks[level.getMetadata()]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.tuffBlocks[level.getMetadata()]);
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
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.goldBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.graniteBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.gravelBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.ironBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.lapisBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.quartzBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.redstoneBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.sandBlocks[level.getMetadata()]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.tuffBlocks[level.getMetadata()]);
        }
    }
}

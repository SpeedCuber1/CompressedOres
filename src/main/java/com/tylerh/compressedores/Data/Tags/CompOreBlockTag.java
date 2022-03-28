package com.tylerh.compressedores.Data.Tags;

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
        for(int i = 0; i < 8; i++)
        {
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.andesiteBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.clayBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.coalBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.cobbleBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.deepslateCobbleBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.diamondBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.dioriteBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.dirtBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.emeraldBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.goldBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.graniteBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.gravelBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.ironBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.lapisBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.quartzBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.redstoneBlocks[i]);
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModInfo.sandBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.andesiteBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.clayBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.coalBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.cobbleBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.deepslateCobbleBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.diamondBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.dioriteBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.dirtBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.emeraldBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.goldBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.graniteBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.gravelBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.ironBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.lapisBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.quartzBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.redstoneBlocks[i]);
            tag(BlockTags.NEEDS_IRON_TOOL).add(ModInfo.sandBlocks[i]);
        }
    }
}

package com.tylerh.compressedores.Data.Loot_Tables;

import com.tylerh.compressedores.Init.InitBlocks;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class CompOreLootTable extends BlockLootSubProvider
{
    public CompOreLootTable()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        for(EnumLevel levels : EnumLevel.values())
        {
            dropSelf(ModInfo.amethystBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.andesiteBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.basaltBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.blackstoneBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.calciteBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.clayBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.coalBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.cobbleBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.deepslateCobbleBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.diamondBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.dioriteBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.dirtBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.emeraldBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.goldBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.graniteBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.gravelBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.ironBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.lapisBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.netherrackBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.quartzBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.redstoneBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.sandBlocks[levels.getMetadata()]);
            dropSelf(ModInfo.tuffBlocks[levels.getMetadata()]);
        }
    }
    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return InitBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

package com.tylerh.compressedores.Data.Models;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class CompOresModelProvider extends ModelProvider
{
    public CompOresModelProvider(PackOutput output)
    {
        super(output, ModInfo.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels)
    {
        for(EnumLevel level : EnumLevel.values())
        {
            blockModels.createTrivialCube(ModInfo.amethystBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.andesiteBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.basaltBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.blackstoneBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.calciteBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.clayBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.coalBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.cobbleBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.deepslateCobbleBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.diamondBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.dioriteBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.dirtBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.emeraldBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.endStoneBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.goldBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.graniteBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.gravelBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.ironBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.lapisBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.netherrackBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.quartzBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.redstoneBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.sandBlocks[level.getMetadata()]);
            blockModels.createTrivialCube(ModInfo.tuffBlocks[level.getMetadata()]);
        }
    }
}

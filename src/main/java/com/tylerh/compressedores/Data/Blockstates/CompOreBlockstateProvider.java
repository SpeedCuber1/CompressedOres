package com.tylerh.compressedores.Data.Blockstates;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CompOreBlockstateProvider extends BlockStateProvider
{
    public CompOreBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, ModInfo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(EnumLevel level : EnumLevel.values())
        {
            simpleBlockWithItem(ModInfo.andesiteBlocks[level.getMetadata()],cubeAll(ModInfo.andesiteBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.basaltBlocks[level.getMetadata()],cubeAll(ModInfo.basaltBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.blackstoneBlocks[level.getMetadata()],cubeAll(ModInfo.blackstoneBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.calciteBlocks[level.getMetadata()],cubeAll(ModInfo.calciteBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.clayBlocks[level.getMetadata()],cubeAll(ModInfo.clayBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.coalBlocks[level.getMetadata()],cubeAll(ModInfo.coalBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.cobbleBlocks[level.getMetadata()],cubeAll(ModInfo.cobbleBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.deepslateCobbleBlocks[level.getMetadata()],cubeAll(ModInfo.deepslateCobbleBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.diamondBlocks[level.getMetadata()],cubeAll(ModInfo.diamondBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.dioriteBlocks[level.getMetadata()],cubeAll(ModInfo.dioriteBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.dirtBlocks[level.getMetadata()],cubeAll(ModInfo.dirtBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.emeraldBlocks[level.getMetadata()],cubeAll(ModInfo.emeraldBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.goldBlocks[level.getMetadata()],cubeAll(ModInfo.goldBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.graniteBlocks[level.getMetadata()],cubeAll(ModInfo.graniteBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.gravelBlocks[level.getMetadata()],cubeAll(ModInfo.gravelBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.ironBlocks[level.getMetadata()],cubeAll(ModInfo.ironBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.lapisBlocks[level.getMetadata()],cubeAll(ModInfo.lapisBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.netherrackBlocks[level.getMetadata()],cubeAll(ModInfo.netherrackBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.quartzBlocks[level.getMetadata()],cubeAll(ModInfo.quartzBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.redstoneBlocks[level.getMetadata()],cubeAll(ModInfo.redstoneBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.sandBlocks[level.getMetadata()],cubeAll(ModInfo.sandBlocks[level.getMetadata()]));
            simpleBlockWithItem(ModInfo.tuffBlocks[level.getMetadata()],cubeAll(ModInfo.tuffBlocks[level.getMetadata()]));
        }
    }
}

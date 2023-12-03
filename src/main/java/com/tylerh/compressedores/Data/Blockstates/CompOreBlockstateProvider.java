package com.tylerh.compressedores.Data.Blockstates;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CompOreBlockstateProvider extends BlockStateProvider
{
    public CompOreBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper)
    {
        super(gen, ModInfo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(EnumLevel level : EnumLevel.values())
        {
            blockWithItem(ModInfo.amethystBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.andesiteBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.basaltBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.blackstoneBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.calciteBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.clayBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.coalBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.cobbleBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.deepslateCobbleBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.diamondBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.dioriteBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.dirtBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.emeraldBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.endStoneBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.goldBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.graniteBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.gravelBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.ironBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.lapisBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.netherrackBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.quartzBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.redstoneBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.sandBlocks[level.getMetadata()]);
            blockWithItem(ModInfo.tuffBlocks[level.getMetadata()]);
        }
    }
    private void blockWithItem(Block block)
    {
        simpleBlock(block);
        simpleBlockItem(block,cubeAll(block));
    }
}

package com.tylerh.compressedores.Data.Loot_Tables;

import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider
{
    public LootTables(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void addTables()
    {
        for(EnumLevel level : EnumLevel.values())
        {
            lootTables.put(ModInfo.andesiteBlocks[level.getMetadata()],createStandardTable("blockandesite." + level.getString(),ModInfo.andesiteBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.basaltBlocks[level.getMetadata()],createStandardTable("blockbasalt." + level.getString(),ModInfo.basaltBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.blackstoneBlocks[level.getMetadata()],createStandardTable("blockblackstone." + level.getString(),ModInfo.blackstoneBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.calciteBlocks[level.getMetadata()],createStandardTable("blockcalcite." + level.getString(),ModInfo.calciteBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.clayBlocks[level.getMetadata()],createStandardTable("blockclay." + level.getString(),ModInfo.clayBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.coalBlocks[level.getMetadata()],createStandardTable("blockcoal." + level.getString(),ModInfo.coalBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.cobbleBlocks[level.getMetadata()],createStandardTable("blockcobble." + level.getString(),ModInfo.cobbleBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.deepslateCobbleBlocks[level.getMetadata()],createStandardTable("blockdeepslatecobble." + level.getString(),ModInfo.deepslateCobbleBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.diamondBlocks[level.getMetadata()],createStandardTable("blockdiamond." + level.getString(),ModInfo.diamondBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.dioriteBlocks[level.getMetadata()],createStandardTable("blockdiorite." + level.getString(),ModInfo.dioriteBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.dirtBlocks[level.getMetadata()],createStandardTable("blockdirt." + level.getString(),ModInfo.dirtBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.emeraldBlocks[level.getMetadata()],createStandardTable("blockemerald." + level.getString(),ModInfo.emeraldBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.goldBlocks[level.getMetadata()],createStandardTable("blockgold." + level.getString(),ModInfo.goldBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.graniteBlocks[level.getMetadata()],createStandardTable("blockgranite." + level.getString(),ModInfo.graniteBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.gravelBlocks[level.getMetadata()],createStandardTable("blockgravel." + level.getString(),ModInfo.gravelBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.ironBlocks[level.getMetadata()],createStandardTable("blockiron." + level.getString(),ModInfo.ironBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.lapisBlocks[level.getMetadata()],createStandardTable("blocklapis." + level.getString(),ModInfo.lapisBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.netherrackBlocks[level.getMetadata()],createStandardTable("blocknetherrack." + level.getString(),ModInfo.netherrackBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.quartzBlocks[level.getMetadata()],createStandardTable("blockquartz." + level.getString(),ModInfo.quartzBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.redstoneBlocks[level.getMetadata()],createStandardTable("blockredstone." + level.getString(),ModInfo.redstoneBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.sandBlocks[level.getMetadata()],createStandardTable("blocksand." + level.getString(),ModInfo.sandBlocks[level.getMetadata()]));
            lootTables.put(ModInfo.tuffBlocks[level.getMetadata()],createStandardTable("blocktuff." + level.getString(),ModInfo.tuffBlocks[level.getMetadata()]));
        }
    }
}

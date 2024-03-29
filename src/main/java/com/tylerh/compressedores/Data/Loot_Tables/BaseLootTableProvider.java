package com.tylerh.compressedores.Data.Loot_Tables;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseLootTableProvider extends LootTableProvider
{
    private static final Logger LOGGER = LogManager.getLogger();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;

    public BaseLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
        this.generator = dataGeneratorIn;
    }

    protected abstract void addTables();

    protected LootTable.Builder createStandardTable(String name,Block block)
    {
        return LootTable.lootTable().withPool(LootPool.lootPool().name(name)
                .setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(block)));
    }
    @Override
    public void run(CachedOutput cache)
    {
        addTables();

        Map<ResourceLocation,LootTable> tables = new HashMap<>();
        for (Map.Entry<Block,LootTable.Builder> entry : lootTables.entrySet())
        {
            tables.put(entry.getKey().getLootTable(), entry.getValue().setParamSet(LootContextParamSets.BLOCK).build());
        }
        writeTables(cache, tables);
    }

    private void writeTables(CachedOutput cache, Map<ResourceLocation, LootTable> tables)
    {
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key,lootTable) ->
        {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try
            {
                DataProvider.saveStable(cache, LootTables.serialize(lootTable),path);
            }
            catch (IOException e)
            {
                LOGGER.error("Couldn't write loot table {}",path,e);
            }
        });
    }
    @Override
    public String getName()
    {
        return "Compressed Ores Loot Tables";
    }
}
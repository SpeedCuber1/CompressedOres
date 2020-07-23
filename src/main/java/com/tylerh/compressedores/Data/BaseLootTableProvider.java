package com.tylerh.compressedores.Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.functions.CopyName;
import net.minecraft.world.storage.loot.functions.CopyNbt;
import net.minecraft.world.storage.loot.functions.SetContents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseLootTableProvider extends LootTableProvider
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final DataGenerator generator;
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    public BaseLootTableProvider(DataGenerator generator)
    {
        super(generator);
        this.generator = generator;
    }
    protected abstract void addTables();
    protected LootTable.Builder createStandardTable(String name,Block block)
    {
        LootPool.Builder builder = LootPool.builder()
                .name(name)
                .rolls(ConstantRange.of(1))
                .addEntry(ItemLootEntry.builder(block))
                .acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY))
                .acceptFunction(CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY)
                .replaceOperation("inv","BlockEntityTag.inv")
                .replaceOperation("energy","BlockEntityTag.energy"))
                .acceptFunction(SetContents.func_215920_b()
                .func_216075_a(DynamicLootEntry.func_216162_a(new ResourceLocation("minecraft","contents"))));
        return LootTable.builder().addLootPool(builder);
    }
}

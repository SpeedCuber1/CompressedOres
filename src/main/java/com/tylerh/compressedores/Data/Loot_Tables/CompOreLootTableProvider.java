package com.tylerh.compressedores.Data.Loot_Tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CompOreLootTableProvider
{
    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> provider)
    {
        return new LootTableProvider(output,Set.of(),List.of(new LootTableProvider.SubProviderEntry(CompOreLootTable::new,LootContextParamSets.BLOCK)),provider);
    }
}

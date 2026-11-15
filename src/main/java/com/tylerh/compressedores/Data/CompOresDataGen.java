package com.tylerh.compressedores.Data;

import com.tylerh.compressedores.Data.Advancements.CompOresAdvancementProvider;
import com.tylerh.compressedores.Data.Loot_Tables.CompOresLootTableProvider;
import com.tylerh.compressedores.Data.Models.CompOresModelProvider;
import com.tylerh.compressedores.Data.Recipes.CompOresRecipeProvider;
import com.tylerh.compressedores.Data.Tags.CompOresBlockTags;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = ModInfo.MOD_ID)
public class CompOresDataGen
{
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event)
    {
        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var provider = event.getLookupProvider();
        generator.addProvider(true,new CompOresModelProvider(output));
        generator.addProvider(true,new CompOresBlockTags(output,provider));
        generator.addProvider(true,new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(CompOresLootTableProvider::new, LootContextParamSets.BLOCK)),provider));
        generator.addProvider(true,new CompOresRecipeProvider.Runner(output,provider));
        generator.addProvider(true,new CompOresAdvancementProvider(output,provider));
    }
}

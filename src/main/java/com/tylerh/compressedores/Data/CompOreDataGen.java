package com.tylerh.compressedores.Data;

import com.tylerh.compressedores.Data.Advancements.CompOreAdvancementProvider;
import com.tylerh.compressedores.Data.Loot_Tables.CompOreLootTableProvider;
import com.tylerh.compressedores.Data.Recipes.CompOreRecipe;
import com.tylerh.compressedores.Data.Blockstates.CompOreBlockstateProvider;
import com.tylerh.compressedores.Data.Tags.CompOreBlockTag;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CompOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        generator.addProvider(true, CompOreLootTableProvider.create(packOutput,lookupProvider));
        generator.addProvider(true,new CompOreAdvancementProvider(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new CompOreRecipe(packOutput,lookupProvider));
        generator.addProvider(true,new CompOreBlockTag(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new CompOreBlockstateProvider(packOutput,existingFileHelper));
    }
}

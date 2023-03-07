package com.tylerh.compressedores.Data;

import com.tylerh.compressedores.Data.Advancements.BaseAdvancementProvider;
import com.tylerh.compressedores.Data.Loot_Tables.CompOreLootTableProvider;
import com.tylerh.compressedores.Data.Recipes.CompOreRecipe;
import com.tylerh.compressedores.Data.Blockstates.CompOreBlockstateProvider;
import com.tylerh.compressedores.Data.Tags.CompOreBlockTag;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        generator.addProvider(true, CompOreLootTableProvider.create(packOutput));
        generator.addProvider(true,new BaseAdvancementProvider(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new CompOreRecipe(packOutput));
        generator.addProvider(true,new CompOreBlockTag(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new CompOreBlockstateProvider(packOutput,existingFileHelper));
    }
}

package com.tylerh.compressedores.Data;

import com.tylerh.compressedores.Data.Advancements.BaseAdvancementProvider;
import com.tylerh.compressedores.Data.Loot_Tables.LootTables;
import com.tylerh.compressedores.Data.Recipes.CompOreRecipe;
import com.tylerh.compressedores.Data.Tags.CompOreBlockTag;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(true,new LootTables(generator));
        generator.addProvider(true,new BaseAdvancementProvider(generator));
        generator.addProvider(true,new CompOreRecipe(generator));
        generator.addProvider(true,new CompOreBlockTag(generator,event.getExistingFileHelper()));
    }
}

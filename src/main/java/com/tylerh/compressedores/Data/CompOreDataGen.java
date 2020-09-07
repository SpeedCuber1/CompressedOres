package com.tylerh.compressedores.Data;

import com.tylerh.compressedores.Data.Advancements.BaseAdvancementProvider;
import com.tylerh.compressedores.Data.Loot_Tables.LootTables;
import com.tylerh.compressedores.Data.Recipes.CompOreRecipe;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new LootTables(generator));
        generator.addProvider(new BaseAdvancementProvider(generator));
        generator.addProvider(new CompOreRecipe(generator));
    }
}

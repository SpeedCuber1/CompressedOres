package com.tylerh.compressedores;

import com.tylerh.compressedores.Init.InitBlocks;
import com.tylerh.compressedores.Util.*;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(ModInfo.MOD_ID)
public class CompressedOres
{
    public CompressedOres(IEventBus bus, ModContainer container)
    {
        container.registerConfig(ModConfig.Type.STARTUP,CompOresConfig.SPEC,"compressedores-common.toml");
        CompOresConfig.initConfig();
        bus.addListener(this::onCommonSetup);
        CompOreCreativeTab.CREATIVE_TABS.register(bus);
        InitBlocks.BLOCKS.register(bus);
        InitBlocks.ITEMS.register(bus);
        InitBlocks.registerBlocks();
        bus.addListener(this::addCreative);
    }
    private void onCommonSetup(final FMLCommonSetupEvent event)
    {
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTab() == CompOreCreativeTab.COMPORES.get())
        {
            for(EnumCriterionCompOres ores : EnumCriterionCompOres.values())
            {
                for(EnumLevel level : EnumLevel.values())
                {
                    switch (ores.getString())
                    {
                        case "amethyst" -> {
                            event.accept(new ItemStack(ModInfo.amethystBlocks[level.getMetadata()]));
                        }
                        case "andesite" -> {
                            event.accept(new ItemStack(ModInfo.andesiteBlocks[level.getMetadata()]));
                        }
                        case "basalt" -> {
                            event.accept(new ItemStack(ModInfo.basaltBlocks[level.getMetadata()]));
                        }
                        case "blackstone" -> {
                            event.accept(new ItemStack(ModInfo.blackstoneBlocks[level.getMetadata()]));
                        }
                        case "calcite" -> {
                            event.accept(new ItemStack(ModInfo.calciteBlocks[level.getMetadata()]));
                        }
                        case "clay" -> {
                            event.accept(new ItemStack(ModInfo.clayBlocks[level.getMetadata()]));
                        }
                        case "coal" -> {
                            event.accept(new ItemStack(ModInfo.coalBlocks[level.getMetadata()]));
                        }
                        case "cobble" -> {
                            event.accept(new ItemStack(ModInfo.cobbleBlocks[level.getMetadata()]));
                        }
                        case "deepslate" -> {
                            event.accept(new ItemStack(ModInfo.deepslateCobbleBlocks[level.getMetadata()]));
                        }
                        case "diamond" -> {
                            event.accept(new ItemStack(ModInfo.diamondBlocks[level.getMetadata()]));
                        }
                        case "diorite" -> {
                            event.accept(new ItemStack(ModInfo.dioriteBlocks[level.getMetadata()]));
                        }
                        case "dirt" -> {
                            event.accept(new ItemStack(ModInfo.dirtBlocks[level.getMetadata()]));
                        }
                        case "emerald" -> {
                            event.accept(new ItemStack(ModInfo.emeraldBlocks[level.getMetadata()]));
                        }
                        case "end_stone" -> {
                            event.accept(new ItemStack(ModInfo.endStoneBlocks[level.getMetadata()]));
                        }
                        case "gold" -> {
                            event.accept(new ItemStack(ModInfo.goldBlocks[level.getMetadata()]));
                        }
                        case "granite" -> {
                            event.accept(new ItemStack(ModInfo.graniteBlocks[level.getMetadata()]));
                        }
                        case "gravel" -> {
                            event.accept(new ItemStack(ModInfo.gravelBlocks[level.getMetadata()]));
                        }
                        case "iron" -> {
                            event.accept(new ItemStack(ModInfo.ironBlocks[level.getMetadata()]));
                        }
                        case "lapis" -> {
                            event.accept(new ItemStack(ModInfo.lapisBlocks[level.getMetadata()]));
                        }
                        case "netherrack" -> {
                            event.accept(new ItemStack(ModInfo.netherrackBlocks[level.getMetadata()]));
                        }
                        case "quartz" -> {
                            event.accept(new ItemStack(ModInfo.quartzBlocks[level.getMetadata()]));
                        }
                        case "redstone" -> {
                            event.accept(new ItemStack(ModInfo.redstoneBlocks[level.getMetadata()]));
                        }
                        case "sand" -> {
                            event.accept(new ItemStack(ModInfo.sandBlocks[level.getMetadata()]));
                        }
                        case "tuff" -> {
                            event.accept(new ItemStack(ModInfo.tuffBlocks[level.getMetadata()]));
                        }
                    }
                }
            }
        }
    }
}

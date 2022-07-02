package com.tylerh.compressedores;

import com.tylerh.compressedores.Init.InitBlocks;
import com.tylerh.compressedores.Util.ConfigHandler;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(ModInfo.MOD_ID)
public class CompressedOres
{
    public CompressedOres()
    {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientRegistries);
        bus.register(this);
        InitBlocks.BLOCKS.register(bus);
        InitBlocks.ITEMS.register(bus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,ConfigHandler.spec);
        ConfigHandler.loadConfig(ConfigHandler.spec, FMLPaths.CONFIGDIR.get().resolve("compressedores-common.toml"));
        MinecraftForge.EVENT_BUS.register(this);
        InitBlocks.registerBlocks();
    }
    private void setup(FMLCommonSetupEvent event)
    {

    }
    private void clientRegistries(FMLClientSetupEvent event)
    {

    }
}
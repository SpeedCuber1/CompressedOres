package com.tylerh.compressedores;

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
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,ConfigHandler.spec);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        ConfigHandler.loadConfig(ConfigHandler.spec, FMLPaths.CONFIGDIR.get().resolve("compressedores-common.toml"));
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(FMLCommonSetupEvent event)
    {

    }
    private void clientRegistries(FMLClientSetupEvent event)
    {

    }
}
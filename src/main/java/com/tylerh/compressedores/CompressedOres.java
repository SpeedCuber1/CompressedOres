package com.tylerh.compressedores;

import com.tylerh.compressedores.Init.InitBlocks;
import com.tylerh.compressedores.Util.CompOreCreativeTab;
import com.tylerh.compressedores.Util.ConfigHandler;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
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
        bus.addListener(this::addCreative);
        InitBlocks.registerBlocks();
    }
    private void setup(FMLCommonSetupEvent event)
    {

    }
    private void clientRegistries(FMLClientSetupEvent event)
    {

    }
    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CompOreCreativeTab.COMPORES)
        {
            for(EnumLevel level : EnumLevel.values())
            {
                event.accept(new ItemStack(ModInfo.andesiteBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.basaltBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.blackstoneBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.calciteBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.clayBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.coalBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.cobbleBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.deepslateCobbleBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.diamondBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.dioriteBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.dirtBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.emeraldBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.goldBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.graniteBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.gravelBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.ironBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.lapisBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.netherrackBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.quartzBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.redstoneBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.sandBlocks[level.getMetadata()]));
                event.accept(new ItemStack(ModInfo.tuffBlocks[level.getMetadata()]));
            }
        }
    }
}
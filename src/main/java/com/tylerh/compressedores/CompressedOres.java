package com.tylerh.compressedores;

import com.tylerh.compressedores.Proxy.CommonProxy;
import com.tylerh.compressedores.Util.LogHelper;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION,guiFactory = ModInfo.GUI_FACTORY)
public class CompressedOres
{
    @Mod.Instance(ModInfo.MOD_ID)
    public static CompressedOres instance;
    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
    private static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        LogHelper.info("Compressed Ores has finished Pre-Initialization");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        LogHelper.info("Compressed Ores has finished Initialization");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
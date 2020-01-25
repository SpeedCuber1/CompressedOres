package com.tylerh.compressedores.Util;
import com.tylerh.compressedores.Init.InitBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Loader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConfigHandler
{
    private static Configuration config = null;
    public static void preInit()
    {
        File configFile = new File(Loader.instance().getConfigDir(),"CompressedOres.cfg");
        config = new Configuration(configFile);
        syncFromFile();
    }
    public static void clientPreInit()
    {
        MinecraftForge.EVENT_BUS.register(new CompressedOresEventHandler());
    }
    public static Configuration getConfig()
    {
        return config;
    }
    public static void syncFromFile()
    {
        syncConfig(true,true);
    }
    public static void syncFromGui()
    {
        syncConfig(false,true);
    }
    public static void syncFromFields()
    {
        syncConfig(false,false);
    }
    private static void syncConfig(boolean loadConfig, boolean readFields)
    {
        if(loadConfig)
        {
            config.load();
        }
        Property propAndesite = config.get(ModInfo.GUI_CATEGORY,"Andesite",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propClay = config.get(ModInfo.GUI_CATEGORY,"Clay",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propCoal = config.get(ModInfo.GUI_CATEGORY,"Coal",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propCobble = config.get(ModInfo.GUI_CATEGORY,"Cobblestone",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propDiamond = config.get(ModInfo.GUI_CATEGORY,"Diamond",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propDiorite = config.get(ModInfo.GUI_CATEGORY,"Diorite",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propDirt = config.get(ModInfo.GUI_CATEGORY,"Dirt",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propEmerald = config.get(ModInfo.GUI_CATEGORY,"Emerald",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propGold = config.get(ModInfo.GUI_CATEGORY,"Gold",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propGranite = config.get(ModInfo.GUI_CATEGORY,"Granite",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propGravel = config.get(ModInfo.GUI_CATEGORY,"Gravel",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propIron = config.get(ModInfo.GUI_CATEGORY,"Iron",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propLapis = config.get(ModInfo.GUI_CATEGORY,"Lapis",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propQuartz = config.get(ModInfo.GUI_CATEGORY,"Quartz",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propRedstone = config.get(ModInfo.GUI_CATEGORY,"Redstone",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);
        Property propSand = config.get(ModInfo.GUI_CATEGORY,"Sand",ModInfo.GUI_DEFAULT).setRequiresMcRestart(true);


        List<String> propOrder = new ArrayList<String>();
        propOrder.add(propAndesite.getName());
        propOrder.add(propClay.getName());
        propOrder.add(propCoal.getName());
        propOrder.add(propCobble.getName());
        propOrder.add(propDiamond.getName());
        propOrder.add(propDiorite.getName());
        propOrder.add(propDirt.getName());
        propOrder.add(propEmerald.getName());
        propOrder.add(propGold.getName());
        propOrder.add(propGranite.getName());
        propOrder.add(propGravel.getName());
        propOrder.add(propIron.getName());
        propOrder.add(propLapis.getName());
        propOrder.add(propQuartz.getName());
        propOrder.add(propRedstone.getName());
        propOrder.add(propSand.getName());
        config.setCategoryPropertyOrder(ModInfo.GUI_CATEGORY,propOrder);

        if(readFields)
        {
            InitBlocks.registerAndesite = propAndesite.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerClay = propClay.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerCoal = propCoal.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerCobblestone = propCobble.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerDiamond = propDiamond.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerDiorite = propDiorite.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerDirt = propDirt.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerEmerald = propEmerald.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerGold = propGold.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerGranite = propGranite.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerGravel = propGravel.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerIron = propIron.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerLapis = propLapis.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerQuartz = propQuartz.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerRedstone = propRedstone.getBoolean(ModInfo.GUI_DEFAULT);
            InitBlocks.registerSand = propSand.getBoolean(ModInfo.GUI_DEFAULT);

        }
        propAndesite.set(InitBlocks.registerAndesite);
        propClay.set(InitBlocks.registerClay);
        propCoal.set(InitBlocks.registerCoal);
        propCobble.set(InitBlocks.registerCobblestone);
        propDiamond.set(InitBlocks.registerDiamond);
        propDiorite.set(InitBlocks.registerDiorite);
        propDirt.set(InitBlocks.registerDirt);
        propEmerald.set(InitBlocks.registerEmerald);
        propGold.set(InitBlocks.registerGold);
        propGranite.set(InitBlocks.registerGranite);
        propGravel.set(InitBlocks.registerGravel);
        propIron.set(InitBlocks.registerIron);
        propLapis.set(InitBlocks.registerLapis);
        propQuartz.set(InitBlocks.registerQuartz);
        propRedstone.set(InitBlocks.registerRedstone);
        propSand.set(InitBlocks.registerSand);
        if(config.hasChanged())
        {
            config.save();
        }
    }
}

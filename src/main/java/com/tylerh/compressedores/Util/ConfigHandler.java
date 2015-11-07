package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;

    public static void init(File file)
    {
        if(config == null)
        {
            config = new Configuration(file);
            loadConfig();
        }
    }

    public static void loadConfig()
    {
        try
        {
            config.load();

            ModBlocks.registerGold = config.get("blocks","Gold", true).getBoolean(true);
            ModBlocks.registerIron = config.get("blocks", "Iron", true).getBoolean(true);
            ModBlocks.registerDiamond = config.get("blocks", "Diamond", true).getBoolean(true);
            ModBlocks.registerEmerald = config.get("blocks", "Emerald", true).getBoolean(true);
            ModBlocks.registerRedstone = config.get("blocks", "Redstone", true).getBoolean(true);
            ModBlocks.registerLapis = config.get("blocks", "Lapis", true).getBoolean(true);
            ModBlocks.registerQuartz = config.get("blocks", "Quartz", true).getBoolean(true);
            ModBlocks.registerCoal = config.get("blocks", "Coal", true).getBoolean(true);
            ModBlocks.registerAndesite = config.get("blocks", "Andesite", true).getBoolean(true);
            ModBlocks.registerDiorite = config.get("blocks", "Diorite", true).getBoolean(true);
            ModBlocks.registerGranite = config.get("blocks", "Granite", true).getBoolean(true);
            ModBlocks.registerCobblestone = config.get("blocks", "Cobblestone", true, "Determine whether or not to allow compressing of resources").getBoolean(true);
        }
        catch(Exception e)
        {

        }
        finally
        {

            if (config.hasChanged())
            {
                config.save();
            }
        }
    }
}

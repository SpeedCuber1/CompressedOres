package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Tyler on 11/6/2015.
 */
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
        }
        catch(Exception e)
        {

        }
        finally
        {
            if(config.hasChanged())
            {
                config.save();
            }
        }
    }
}

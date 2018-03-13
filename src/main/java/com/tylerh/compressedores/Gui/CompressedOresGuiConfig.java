package com.tylerh.compressedores.Gui;

import com.tylerh.compressedores.Util.ConfigHandler;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;


public class CompressedOresGuiConfig extends GuiConfig
{
    public CompressedOresGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,properties, ModInfo.MOD_ID,ModInfo.GUI_FACTORY,false,true,"Compressed Ores");
    }
    static Configuration configs = ConfigHandler.getConfig();
    static ConfigElement cat_blocks = new ConfigElement(configs.getCategory(ModInfo.GUI_CATEGORY));
    static List<IConfigElement> properties = cat_blocks.getChildElements();
}
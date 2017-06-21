package com.tylerh.compressedores.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

/**
 * Created by User on 1/7/2017.
 */
public class CompressedOresGuiFactory implements IModGuiFactory
{

    @Override
    public void initialize(Minecraft minecraftInstance)
    {

    }

    @Override
    public boolean hasConfigGui()
    {
        return false;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen)
    {
        return null;
    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass()
    {
        return CompressedOresGuiConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
    {
        return null;
    }
}

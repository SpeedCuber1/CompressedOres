package com.tylerh.compressedores.Proxy;

import com.tylerh.compressedores.Init.Recipes;
import com.tylerh.compressedores.Util.CompressedOresFuelHandler;
import com.tylerh.compressedores.Util.ConfigHandler;
import com.tylerh.compressedores.Init.InitBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tyler on 11/6/2015.
 */
public abstract class CommonProxy
{
    public void preInit()
    {
        ConfigHandler.preInit();
        InitBlocks.preInitCommon();
    }
    public void init()
    {
        GameRegistry.registerFuelHandler(new CompressedOresFuelHandler());
        Recipes.init();
    }
    public void postInit()
    {
    }

    abstract boolean playerIsInCreativeMode(EntityPlayer player);
}
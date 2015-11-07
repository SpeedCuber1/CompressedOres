package com.tylerh.compressedores.Proxy;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Tyler on 11/6/2015.
 */
public abstract class CommonProxy
{
    public void preInit()
    {
        ModBlocks.preInitCommon();
    }
    public void init()
    {
    }
    public void postInit()
    {
    }

    abstract boolean playerIsInCreativeMode(EntityPlayer player);
}
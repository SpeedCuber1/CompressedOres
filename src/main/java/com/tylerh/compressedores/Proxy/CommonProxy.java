package com.tylerh.compressedores.Proxy;

import com.tylerh.compressedores.Init.ModBlocks;
import com.tylerh.compressedores.Util.EventListener;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

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
        MinecraftForge.EVENT_BUS.register(new EventListener());
    }

    abstract boolean playerIsInCreativeMode(EntityPlayer player);
}
package com.tylerh.compressedores.Proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * Created by Tyler on 11/6/2015.
 */
public class ServerProxy extends CommonProxy
{
    public void preInit()
    {
        super.preInit();
    }
    public void init()
    {
        super.init();
    }
    public void postInit()
    {
        super.postInit();
    }

    @Override
    public boolean playerIsInCreativeMode(EntityPlayer player)
    {
        if(player instanceof EntityPlayerMP)
        {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
            return entityPlayerMP.isCreative();
        }
        return false;
    }
}

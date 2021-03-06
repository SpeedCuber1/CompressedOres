package com.tylerh.compressedores.Proxy;

import com.tylerh.compressedores.Init.InitBlocks;
import com.tylerh.compressedores.Util.ConfigHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * Created by Tyler on 11/6/2015.
 */
public class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        super.preInit();
        ConfigHandler.clientPreInit();
        InitBlocks.preInitClient();
    }
    public void init()
    {
        super.init();
        InitBlocks.initClient();
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
        }
        else if (player instanceof EntityPlayerSP)
        {
            return Minecraft.getMinecraft().playerController.isInCreativeMode();
        }
        return false;
    }
}

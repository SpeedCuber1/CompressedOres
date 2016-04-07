package com.tylerh.compressedores.Util;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

/**
 * Created by Tyler on 4/7/2016.
 */
public class EventListener
{
    @SubscribeEvent
    public void crafting(PlayerEvent.ItemCraftedEvent event)
    {
        for(int i = 0; i < ModInfo.tempBlocks.length; i++)
        {
            if(event.crafting.getItem() == Item.getItemFromBlock(ModInfo.tempBlocks[i]))
            {
                activateAchievement(event.crafting.getItemDamage(),event);
                break;
            }
        }
    }

    public void activateAchievement(int meta, PlayerEvent.ItemCraftedEvent event)
    {
        switch (meta)
        {
            case 0:
            {
                event.player.addStat(ModInfo.craftCompressed,1);
                break;
            }
            case 1:
            {
                event.player.addStat(ModInfo.craftDouble,1);
                break;
            }
            case 2:
            {
                event.player.addStat(ModInfo.craftTriple, 1);
                break;
            }
            case 3:
            {
                event.player.addStat(ModInfo.craftQuadruple,1);
                break;
            }
            case 4:
            {
                event.player.addStat(ModInfo.craftQuintuple,1);
                break;
            }
            case 5:
            {
                event.player.addStat(ModInfo.craftSextuple,1);
                break;
            }
            case 6:
            {
                event.player.addStat(ModInfo.craftSeptuple,1);
                break;
            }
            case 7:
            {
                event.player.addStat(ModInfo.craftOctuple, 1);
                break;
            }
        }
    }
}

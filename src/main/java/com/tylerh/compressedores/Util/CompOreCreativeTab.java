package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.BlockList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CompOreCreativeTab
{
    public static CreativeModeTab COMPORES;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        COMPORES = event.registerCreativeModeTab(new ResourceLocation(ModInfo.MOD_ID,"Compress Ores Tab"),
                builder -> builder.icon(() -> new ItemStack(BlockList.blockGoldCompressed.get())).title(Component.translatable("Compressed Ores")).build());
    }
}

package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.BlockList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompOreCreativeTab
{
    public static CreativeModeTab COMPORES;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        COMPORES = event.registerCreativeModeTab(new ResourceLocation(ModInfo.MOD_ID,"compressed_ores_tab"),
                builder -> builder.icon(() -> new ItemStack(BlockList.blockGoldCompressed.get())).title(Component.translatable("Compressed Ores")).build());
    }
}

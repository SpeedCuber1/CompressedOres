package com.tylerh.compressedores.Util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CompOreCreativeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,ModInfo.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COMPORES = CREATIVE_TABS.register("compressedores",() -> CreativeModeTab.builder()
            .title(Component.translatable("itemgroup.compressedores"))
            .icon(() -> Blocks.GOLD_BLOCK.asItem().getDefaultInstance()).build());
}

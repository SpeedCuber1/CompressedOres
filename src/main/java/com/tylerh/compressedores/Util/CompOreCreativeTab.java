package com.tylerh.compressedores.Util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompOreCreativeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,ModInfo.MOD_ID);
    public static final RegistryObject<CreativeModeTab> COMPORES = CREATIVE_TAB.register("compressedores", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemgroup.compressedores"))
            .icon(() -> Blocks.GOLD_BLOCK.asItem().getDefaultInstance()).build());
}

package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.BlockMetaCompressedOre;
import com.tylerh.compressedores.Items.ItemBlockMetaCompressedOre;
import com.tylerh.compressedores.Util.ItemGroupCompOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks
{
    private static final ItemGroup COMPORES = new ItemGroupCompOres();
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        if(ConfigRegistryList.registerAndesite.get())
        {
            BlockList.blockAndesiteCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 0);
            BlockList.blockAndesiteDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 1);
            BlockList.blockAndesiteTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 2);
            BlockList.blockAndesiteQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 3);
            BlockList.blockAndesiteQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 4);
            BlockList.blockAndesiteSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 5);
            BlockList.blockAndesiteSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 6);
            BlockList.blockAndesiteOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockandesite", false, 7);
            blockRegistry(BlockList.blockAndesiteCompressed,event);
            blockRegistry(BlockList.blockAndesiteDouble,event);
            blockRegistry(BlockList.blockAndesiteTriple,event);
            blockRegistry(BlockList.blockAndesiteQuadruple,event);
            blockRegistry(BlockList.blockAndesiteQuintuple,event);
            blockRegistry(BlockList.blockAndesiteSextuple,event);
            blockRegistry(BlockList.blockAndesiteSeptuple,event);
            blockRegistry(BlockList.blockAndesiteOctuple,event);
        }
        if(ConfigRegistryList.registerClay.get())
        {
            BlockList.blockClayCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 0);
            BlockList.blockClayDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 1);
            BlockList.blockClayTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 2);
            BlockList.blockClayQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 3);
            BlockList.blockClayQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 4);
            BlockList.blockClaySextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 5);
            BlockList.blockClaySeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 6);
            BlockList.blockClayOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockclay", false, 7);
            blockRegistry(BlockList.blockClayCompressed,event);
            blockRegistry(BlockList.blockClayDouble,event);
            blockRegistry(BlockList.blockClayTriple,event);
            blockRegistry(BlockList.blockClayQuadruple,event);
            blockRegistry(BlockList.blockClayQuintuple,event);
            blockRegistry(BlockList.blockClaySextuple,event);
            blockRegistry(BlockList.blockClaySeptuple,event);
            blockRegistry(BlockList.blockClayOctuple,event);
        }
        if(ConfigRegistryList.registerCoal.get())
        {
            BlockList.blockCoalCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 0);
            BlockList.blockCoalDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 1);
            BlockList.blockCoalTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 2);
            BlockList.blockCoalQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 3);
            BlockList.blockCoalQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 4);
            BlockList.blockCoalSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 5);
            BlockList.blockCoalSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 6);
            BlockList.blockCoalOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcoal", false, 7);
            blockRegistry(BlockList.blockCoalCompressed,event);
            blockRegistry(BlockList.blockCoalDouble,event);
            blockRegistry(BlockList.blockCoalTriple,event);
            blockRegistry(BlockList.blockCoalQuadruple,event);
            blockRegistry(BlockList.blockCoalQuintuple,event);
            blockRegistry(BlockList.blockCoalSextuple,event);
            blockRegistry(BlockList.blockCoalSeptuple,event);
            blockRegistry(BlockList.blockCoalOctuple,event);
        }
        if(ConfigRegistryList.registerCobble.get())
        {
            BlockList.blockCobbleCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 0);
            BlockList.blockCobbleDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 1);
            BlockList.blockCobbleTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 2);
            BlockList.blockCobbleQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 3);
            BlockList.blockCobbleQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 4);
            BlockList.blockCobbleSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 5);
            BlockList.blockCobbleSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 6);
            BlockList.blockCobbleOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockcobble", false, 7);
            blockRegistry(BlockList.blockCobbleCompressed,event);
            blockRegistry(BlockList.blockCobbleDouble,event);
            blockRegistry(BlockList.blockCobbleTriple,event);
            blockRegistry(BlockList.blockCobbleQuadruple,event);
            blockRegistry(BlockList.blockCobbleQuintuple,event);
            blockRegistry(BlockList.blockCobbleSextuple,event);
            blockRegistry(BlockList.blockCobbleSeptuple,event);
            blockRegistry(BlockList.blockCobbleOctuple,event);
        }
        if(ConfigRegistryList.registerDiamond.get())
        {
            BlockList.blockDiamondCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 0);
            BlockList.blockDiamondDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 1);
            BlockList.blockDiamondTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 2);
            BlockList.blockDiamondQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 3);
            BlockList.blockDiamondQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 4);
            BlockList.blockDiamondSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 5);
            BlockList.blockDiamondSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 6);
            BlockList.blockDiamondOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiamond", false, 7);
            blockRegistry(BlockList.blockDiamondCompressed,event);
            blockRegistry(BlockList.blockDiamondDouble,event);
            blockRegistry(BlockList.blockDiamondTriple,event);
            blockRegistry(BlockList.blockDiamondQuadruple,event);
            blockRegistry(BlockList.blockDiamondQuintuple,event);
            blockRegistry(BlockList.blockDiamondSextuple,event);
            blockRegistry(BlockList.blockDiamondSeptuple,event);
            blockRegistry(BlockList.blockDiamondOctuple,event);
        }
        if(ConfigRegistryList.registerDiorite.get())
        {
            BlockList.blockDioriteCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 0);
            BlockList.blockDioriteDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 1);
            BlockList.blockDioriteTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 2);
            BlockList.blockDioriteQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 3);
            BlockList.blockDioriteQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 4);
            BlockList.blockDioriteSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 5);
            BlockList.blockDioriteSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 6);
            BlockList.blockDioriteOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdiorite", false, 7);
            blockRegistry(BlockList.blockDioriteCompressed,event);
            blockRegistry(BlockList.blockDioriteDouble,event);
            blockRegistry(BlockList.blockDioriteTriple,event);
            blockRegistry(BlockList.blockDioriteQuadruple,event);
            blockRegistry(BlockList.blockDioriteQuintuple,event);
            blockRegistry(BlockList.blockDioriteSextuple,event);
            blockRegistry(BlockList.blockDioriteSeptuple,event);
            blockRegistry(BlockList.blockDioriteOctuple,event);
        }
        if(ConfigRegistryList.registerDirt.get())
        {
            BlockList.blockDirtCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 0);
            BlockList.blockDirtDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 1);
            BlockList.blockDirtTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 2);
            BlockList.blockDirtQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 3);
            BlockList.blockDirtQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 4);
            BlockList.blockDirtSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 5);
            BlockList.blockDirtSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 6);
            BlockList.blockDirtOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockdirt", false, 7);
            blockRegistry(BlockList.blockDirtCompressed,event);
            blockRegistry(BlockList.blockDirtDouble,event);
            blockRegistry(BlockList.blockDirtTriple,event);
            blockRegistry(BlockList.blockDirtQuadruple,event);
            blockRegistry(BlockList.blockDirtQuintuple,event);
            blockRegistry(BlockList.blockDirtSextuple,event);
            blockRegistry(BlockList.blockDirtSeptuple,event);
            blockRegistry(BlockList.blockDirtOctuple,event);
        }
        if(ConfigRegistryList.registerEmerald.get())
        {
            BlockList.blockEmeraldCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 0);
            BlockList.blockEmeraldDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 1);
            BlockList.blockEmeraldTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 2);
            BlockList.blockEmeraldQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 3);
            BlockList.blockEmeraldQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 4);
            BlockList.blockEmeraldSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 5);
            BlockList.blockEmeraldSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 6);
            BlockList.blockEmeraldOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockemerald", false, 7);
            blockRegistry(BlockList.blockEmeraldCompressed,event);
            blockRegistry(BlockList.blockEmeraldDouble,event);
            blockRegistry(BlockList.blockEmeraldTriple,event);
            blockRegistry(BlockList.blockEmeraldQuadruple,event);
            blockRegistry(BlockList.blockEmeraldQuintuple,event);
            blockRegistry(BlockList.blockEmeraldSextuple,event);
            blockRegistry(BlockList.blockEmeraldSeptuple,event);
            blockRegistry(BlockList.blockEmeraldOctuple,event);
        }
        if(ConfigRegistryList.registerGold.get())
        {
            BlockList.blockGoldCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 0);
            BlockList.blockGoldDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 1);
            BlockList.blockGoldTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 2);
            BlockList.blockGoldQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 3);
            BlockList.blockGoldQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 4);
            BlockList.blockGoldSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 5);
            BlockList.blockGoldSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 6);
            BlockList.blockGoldOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgold", false, 7);
            blockRegistry(BlockList.blockGoldCompressed,event);
            blockRegistry(BlockList.blockGoldDouble,event);
            blockRegistry(BlockList.blockGoldTriple,event);
            blockRegistry(BlockList.blockGoldQuadruple,event);
            blockRegistry(BlockList.blockGoldQuintuple,event);
            blockRegistry(BlockList.blockGoldSextuple,event);
            blockRegistry(BlockList.blockGoldSeptuple,event);
            blockRegistry(BlockList.blockGoldOctuple,event);
        }
        if(ConfigRegistryList.registerGranite.get())
        {
            BlockList.blockGraniteCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 0);
            BlockList.blockGraniteDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 1);
            BlockList.blockGraniteTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 2);
            BlockList.blockGraniteQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 3);
            BlockList.blockGraniteQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 4);
            BlockList.blockGraniteSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 5);
            BlockList.blockGraniteSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 6);
            BlockList.blockGraniteOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgranite", false, 7);
            blockRegistry(BlockList.blockGraniteCompressed,event);
            blockRegistry(BlockList.blockGraniteDouble,event);
            blockRegistry(BlockList.blockGraniteTriple,event);
            blockRegistry(BlockList.blockGraniteQuadruple,event);
            blockRegistry(BlockList.blockGraniteQuintuple,event);
            blockRegistry(BlockList.blockGraniteSextuple,event);
            blockRegistry(BlockList.blockGraniteSeptuple,event);
            blockRegistry(BlockList.blockGraniteOctuple,event);
        }
        if(ConfigRegistryList.registerGravel.get())
        {
            BlockList.blockGravelCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 0);
            BlockList.blockGravelDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 1);
            BlockList.blockGravelTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 2);
            BlockList.blockGravelQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 3);
            BlockList.blockGravelQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 4);
            BlockList.blockGravelSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 5);
            BlockList.blockGravelSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 6);
            BlockList.blockGravelOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockgravel", false, 7);
            blockRegistry(BlockList.blockGravelCompressed,event);
            blockRegistry(BlockList.blockGravelDouble,event);
            blockRegistry(BlockList.blockGravelTriple,event);
            blockRegistry(BlockList.blockGravelQuadruple,event);
            blockRegistry(BlockList.blockGravelQuintuple,event);
            blockRegistry(BlockList.blockGravelSextuple,event);
            blockRegistry(BlockList.blockGravelSeptuple,event);
            blockRegistry(BlockList.blockGravelOctuple,event);
        }
        if(ConfigRegistryList.registerIron.get())
        {
            BlockList.blockIronCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 0);
            BlockList.blockIronDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 1);
            BlockList.blockIronTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 2);
            BlockList.blockIronQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 3);
            BlockList.blockIronQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 4);
            BlockList.blockIronSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 5);
            BlockList.blockIronSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 6);
            BlockList.blockIronOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockiron", false, 7);
            blockRegistry(BlockList.blockIronCompressed,event);
            blockRegistry(BlockList.blockIronDouble,event);
            blockRegistry(BlockList.blockIronTriple,event);
            blockRegistry(BlockList.blockIronQuadruple,event);
            blockRegistry(BlockList.blockIronQuintuple,event);
            blockRegistry(BlockList.blockIronSextuple,event);
            blockRegistry(BlockList.blockIronSeptuple,event);
            blockRegistry(BlockList.blockIronOctuple,event);
        }
        if(ConfigRegistryList.registerLapis.get())
        {
            BlockList.blockLapisCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 0);
            BlockList.blockLapisDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 1);
            BlockList.blockLapisTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 2);
            BlockList.blockLapisQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 3);
            BlockList.blockLapisQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 4);
            BlockList.blockLapisSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 5);
            BlockList.blockLapisSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 6);
            BlockList.blockLapisOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocklapis", false, 7);
            blockRegistry(BlockList.blockLapisCompressed,event);
            blockRegistry(BlockList.blockLapisDouble,event);
            blockRegistry(BlockList.blockLapisTriple,event);
            blockRegistry(BlockList.blockLapisQuadruple,event);
            blockRegistry(BlockList.blockLapisQuintuple,event);
            blockRegistry(BlockList.blockLapisSextuple,event);
            blockRegistry(BlockList.blockLapisSeptuple,event);
            blockRegistry(BlockList.blockLapisOctuple,event);
        }
        if(ConfigRegistryList.registerNetherrack.get())
        {
            BlockList.blockNetherrackCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 0);
            BlockList.blockNetherrackDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 1);
            BlockList.blockNetherrackTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 2);
            BlockList.blockNetherrackQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 3);
            BlockList.blockNetherrackQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 4);
            BlockList.blockNetherrackSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 5);
            BlockList.blockNetherrackSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 6);
            BlockList.blockNetherrackOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocknetherrack", false, 7);
            blockRegistry(BlockList.blockNetherrackCompressed,event);
            blockRegistry(BlockList.blockNetherrackDouble,event);
            blockRegistry(BlockList.blockNetherrackTriple,event);
            blockRegistry(BlockList.blockNetherrackQuadruple,event);
            blockRegistry(BlockList.blockNetherrackQuintuple,event);
            blockRegistry(BlockList.blockNetherrackSextuple,event);
            blockRegistry(BlockList.blockNetherrackSeptuple,event);
            blockRegistry(BlockList.blockNetherrackOctuple,event);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            BlockList.blockQuartzCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 0);
            BlockList.blockQuartzDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 1);
            BlockList.blockQuartzTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 2);
            BlockList.blockQuartzQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 3);
            BlockList.blockQuartzQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 4);
            BlockList.blockQuartzSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 5);
            BlockList.blockQuartzSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 6);
            BlockList.blockQuartzOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockquartz", false, 7);
            blockRegistry(BlockList.blockQuartzCompressed,event);
            blockRegistry(BlockList.blockQuartzDouble,event);
            blockRegistry(BlockList.blockQuartzTriple,event);
            blockRegistry(BlockList.blockQuartzQuadruple,event);
            blockRegistry(BlockList.blockQuartzQuintuple,event);
            blockRegistry(BlockList.blockQuartzSextuple,event);
            blockRegistry(BlockList.blockQuartzSeptuple,event);
            blockRegistry(BlockList.blockQuartzOctuple,event);
        }
        if(ConfigRegistryList.registerRedstone.get())
        {
            BlockList.blockRedstoneCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 0);
            BlockList.blockRedstoneDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 1);
            BlockList.blockRedstoneTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 2);
            BlockList.blockRedstoneQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 3);
            BlockList.blockRedstoneQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 4);
            BlockList.blockRedstoneSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 5);
            BlockList.blockRedstoneSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 6);
            BlockList.blockRedstoneOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blockredstone", true, 7);
            blockRegistry(BlockList.blockRedstoneCompressed,event);
            blockRegistry(BlockList.blockRedstoneDouble,event);
            blockRegistry(BlockList.blockRedstoneTriple,event);
            blockRegistry(BlockList.blockRedstoneQuadruple,event);
            blockRegistry(BlockList.blockRedstoneQuintuple,event);
            blockRegistry(BlockList.blockRedstoneSextuple,event);
            blockRegistry(BlockList.blockRedstoneSeptuple,event);
            blockRegistry(BlockList.blockRedstoneOctuple,event);
        }
        if(ConfigRegistryList.registerSand.get())
        {
            BlockList.blockSandCompressed = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 0);
            BlockList.blockSandDouble = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 1);
            BlockList.blockSandTriple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 2);
            BlockList.blockSandQuadruple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 3);
            BlockList.blockSandQuintuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 4);
            BlockList.blockSandSextuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 5);
            BlockList.blockSandSeptuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 6);
            BlockList.blockSandOctuple = new BlockMetaCompressedOre(Material.IRON, 3.0f, 5.0f, "blocksand", false, 7);
            blockRegistry(BlockList.blockSandCompressed,event);
            blockRegistry(BlockList.blockSandDouble,event);
            blockRegistry(BlockList.blockSandTriple,event);
            blockRegistry(BlockList.blockSandQuadruple,event);
            blockRegistry(BlockList.blockSandQuintuple,event);
            blockRegistry(BlockList.blockSandSextuple,event);
            blockRegistry(BlockList.blockSandSeptuple,event);
            blockRegistry(BlockList.blockSandOctuple,event);
        }
    }
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        if(ConfigRegistryList.registerAndesite.get())
        {
            ItemBlockList.itemBlockAndesiteCompressed = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteCompressed, COMPORES,0);
            ItemBlockList.itemBlockAndesiteDouble = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteDouble,COMPORES,1);
            ItemBlockList.itemBlockAndesiteTriple = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteTriple,COMPORES,2);
            ItemBlockList.itemBlockAndesiteQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteQuadruple,COMPORES,3);
            ItemBlockList.itemBlockAndesiteQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteQuintuple,COMPORES,4);
            ItemBlockList.itemBlockAndesiteSextuple = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteSextuple,COMPORES,5);
            ItemBlockList.itemBlockAndesiteSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteSeptuple,COMPORES,6);
            ItemBlockList.itemBlockAndesiteOctuple = new ItemBlockMetaCompressedOre(BlockList.blockAndesiteOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockAndesiteCompressed, event);
            itemRegistry(ItemBlockList.itemBlockAndesiteDouble,event);
            itemRegistry(ItemBlockList.itemBlockAndesiteTriple,event);
            itemRegistry(ItemBlockList.itemBlockAndesiteQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockAndesiteQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockAndesiteSextuple,event);
            itemRegistry(ItemBlockList.itemBlockAndesiteSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockAndesiteOctuple,event);
        }
        if(ConfigRegistryList.registerClay.get())
        {
            ItemBlockList.itemBlockClayCompressed = new ItemBlockMetaCompressedOre(BlockList.blockClayCompressed, COMPORES,0);
            ItemBlockList.itemBlockClayDouble = new ItemBlockMetaCompressedOre(BlockList.blockClayDouble,COMPORES,1);
            ItemBlockList.itemBlockClayTriple = new ItemBlockMetaCompressedOre(BlockList.blockClayTriple,COMPORES,2);
            ItemBlockList.itemBlockClayQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockClayQuadruple,COMPORES,3);
            ItemBlockList.itemBlockClayQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockClayQuintuple,COMPORES,4);
            ItemBlockList.itemBlockClaySextuple = new ItemBlockMetaCompressedOre(BlockList.blockClaySextuple,COMPORES,5);
            ItemBlockList.itemBlockClaySeptuple = new ItemBlockMetaCompressedOre(BlockList.blockClaySeptuple,COMPORES,6);
            ItemBlockList.itemBlockClayOctuple = new ItemBlockMetaCompressedOre(BlockList.blockClayOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockClayCompressed, event);
            itemRegistry(ItemBlockList.itemBlockClayDouble,event);
            itemRegistry(ItemBlockList.itemBlockClayTriple,event);
            itemRegistry(ItemBlockList.itemBlockClayQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockClayQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockClaySextuple,event);
            itemRegistry(ItemBlockList.itemBlockClaySeptuple,event);
            itemRegistry(ItemBlockList.itemBlockClayOctuple,event);
        }
        if(ConfigRegistryList.registerCoal.get())
        {
            ItemBlockList.itemBlockCoalCompressed = new ItemBlockMetaCompressedOre(BlockList.blockCoalCompressed, COMPORES,0);
            ItemBlockList.itemBlockCoalDouble = new ItemBlockMetaCompressedOre(BlockList.blockCoalDouble,COMPORES,1);
            ItemBlockList.itemBlockCoalTriple = new ItemBlockMetaCompressedOre(BlockList.blockCoalTriple,COMPORES,2);
            ItemBlockList.itemBlockCoalQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockCoalQuadruple,COMPORES,3);
            ItemBlockList.itemBlockCoalQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockCoalQuintuple,COMPORES,4);
            ItemBlockList.itemBlockCoalSextuple = new ItemBlockMetaCompressedOre(BlockList.blockCoalSextuple,COMPORES,5);
            ItemBlockList.itemBlockCoalSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockCoalSeptuple,COMPORES,6);
            ItemBlockList.itemBlockCoalOctuple = new ItemBlockMetaCompressedOre(BlockList.blockCoalOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockCoalCompressed, event);
            itemRegistry(ItemBlockList.itemBlockCoalDouble,event);
            itemRegistry(ItemBlockList.itemBlockCoalTriple,event);
            itemRegistry(ItemBlockList.itemBlockCoalQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockCoalQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockCoalSextuple,event);
            itemRegistry(ItemBlockList.itemBlockCoalSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockCoalOctuple,event);
        }
        if(ConfigRegistryList.registerCobble.get())
        {
            ItemBlockList.itemBlockCobbleCompressed = new ItemBlockMetaCompressedOre(BlockList.blockCobbleCompressed, COMPORES,0);
            ItemBlockList.itemBlockCobbleDouble = new ItemBlockMetaCompressedOre(BlockList.blockCobbleDouble,COMPORES,1);
            ItemBlockList.itemBlockCobbleTriple = new ItemBlockMetaCompressedOre(BlockList.blockCobbleTriple,COMPORES,2);
            ItemBlockList.itemBlockCobbleQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockCobbleQuadruple,COMPORES,3);
            ItemBlockList.itemBlockCobbleQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockCobbleQuintuple,COMPORES,4);
            ItemBlockList.itemBlockCobbleSextuple = new ItemBlockMetaCompressedOre(BlockList.blockCobbleSextuple,COMPORES,5);
            ItemBlockList.itemBlockCobbleSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockCobbleSeptuple,COMPORES,6);
            ItemBlockList.itemBlockCobbleOctuple = new ItemBlockMetaCompressedOre(BlockList.blockCobbleOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockCobbleCompressed, event);
            itemRegistry(ItemBlockList.itemBlockCobbleDouble,event);
            itemRegistry(ItemBlockList.itemBlockCobbleTriple,event);
            itemRegistry(ItemBlockList.itemBlockCobbleQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockCobbleQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockCobbleSextuple,event);
            itemRegistry(ItemBlockList.itemBlockCobbleSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockCobbleOctuple,event);
        }
        if(ConfigRegistryList.registerDiamond.get())
        {
            ItemBlockList.itemBlockDiamondCompressed = new ItemBlockMetaCompressedOre(BlockList.blockDiamondCompressed, COMPORES,0);
            ItemBlockList.itemBlockDiamondDouble = new ItemBlockMetaCompressedOre(BlockList.blockDiamondDouble,COMPORES,1);
            ItemBlockList.itemBlockDiamondTriple = new ItemBlockMetaCompressedOre(BlockList.blockDiamondTriple,COMPORES,2);
            ItemBlockList.itemBlockDiamondQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockDiamondQuadruple,COMPORES,3);
            ItemBlockList.itemBlockDiamondQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockDiamondQuintuple,COMPORES,4);
            ItemBlockList.itemBlockDiamondSextuple = new ItemBlockMetaCompressedOre(BlockList.blockDiamondSextuple,COMPORES,5);
            ItemBlockList.itemBlockDiamondSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockDiamondSeptuple,COMPORES,6);
            ItemBlockList.itemBlockDiamondOctuple = new ItemBlockMetaCompressedOre(BlockList.blockDiamondOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockDiamondCompressed, event);
            itemRegistry(ItemBlockList.itemBlockDiamondDouble,event);
            itemRegistry(ItemBlockList.itemBlockDiamondTriple,event);
            itemRegistry(ItemBlockList.itemBlockDiamondQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockDiamondQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockDiamondSextuple,event);
            itemRegistry(ItemBlockList.itemBlockDiamondSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockDiamondOctuple,event);
        }
        if(ConfigRegistryList.registerDiorite.get())
        {
            ItemBlockList.itemBlockDioriteCompressed = new ItemBlockMetaCompressedOre(BlockList.blockDioriteCompressed, COMPORES,0);
            ItemBlockList.itemBlockDioriteDouble = new ItemBlockMetaCompressedOre(BlockList.blockDioriteDouble,COMPORES,1);
            ItemBlockList.itemBlockDioriteTriple = new ItemBlockMetaCompressedOre(BlockList.blockDioriteTriple,COMPORES,2);
            ItemBlockList.itemBlockDioriteQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockDioriteQuadruple,COMPORES,3);
            ItemBlockList.itemBlockDioriteQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockDioriteQuintuple,COMPORES,4);
            ItemBlockList.itemBlockDioriteSextuple = new ItemBlockMetaCompressedOre(BlockList.blockDioriteSextuple,COMPORES,5);
            ItemBlockList.itemBlockDioriteSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockDioriteSeptuple,COMPORES,6);
            ItemBlockList.itemBlockDioriteOctuple = new ItemBlockMetaCompressedOre(BlockList.blockDioriteOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockDioriteCompressed, event);
            itemRegistry(ItemBlockList.itemBlockDioriteDouble,event);
            itemRegistry(ItemBlockList.itemBlockDioriteTriple,event);
            itemRegistry(ItemBlockList.itemBlockDioriteQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockDioriteQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockDioriteSextuple,event);
            itemRegistry(ItemBlockList.itemBlockDioriteSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockDioriteOctuple,event);
        }
        if(ConfigRegistryList.registerDirt.get())
        {
            ItemBlockList.itemBlockDirtCompressed = new ItemBlockMetaCompressedOre(BlockList.blockDirtCompressed, COMPORES,0);
            ItemBlockList.itemBlockDirtDouble = new ItemBlockMetaCompressedOre(BlockList.blockDirtDouble,COMPORES,1);
            ItemBlockList.itemBlockDirtTriple = new ItemBlockMetaCompressedOre(BlockList.blockDirtTriple,COMPORES,2);
            ItemBlockList.itemBlockDirtQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockDirtQuadruple,COMPORES,3);
            ItemBlockList.itemBlockDirtQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockDirtQuintuple,COMPORES,4);
            ItemBlockList.itemBlockDirtSextuple = new ItemBlockMetaCompressedOre(BlockList.blockDirtSextuple,COMPORES,5);
            ItemBlockList.itemBlockDirtSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockDirtSeptuple,COMPORES,6);
            ItemBlockList.itemBlockDirtOctuple = new ItemBlockMetaCompressedOre(BlockList.blockDirtOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockDirtCompressed, event);
            itemRegistry(ItemBlockList.itemBlockDirtDouble,event);
            itemRegistry(ItemBlockList.itemBlockDirtTriple,event);
            itemRegistry(ItemBlockList.itemBlockDirtQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockDirtQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockDirtSextuple,event);
            itemRegistry(ItemBlockList.itemBlockDirtSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockDirtOctuple,event);
        }
        if(ConfigRegistryList.registerEmerald.get())
        {
            ItemBlockList.itemBlockEmeraldCompressed = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldCompressed, COMPORES,0);
            ItemBlockList.itemBlockEmeraldDouble = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldDouble,COMPORES,1);
            ItemBlockList.itemBlockEmeraldTriple = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldTriple,COMPORES,2);
            ItemBlockList.itemBlockEmeraldQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldQuadruple,COMPORES,3);
            ItemBlockList.itemBlockEmeraldQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldQuintuple,COMPORES,4);
            ItemBlockList.itemBlockEmeraldSextuple = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldSextuple,COMPORES,5);
            ItemBlockList.itemBlockEmeraldSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldSeptuple,COMPORES,6);
            ItemBlockList.itemBlockEmeraldOctuple = new ItemBlockMetaCompressedOre(BlockList.blockEmeraldOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockEmeraldCompressed, event);
            itemRegistry(ItemBlockList.itemBlockEmeraldDouble,event);
            itemRegistry(ItemBlockList.itemBlockEmeraldTriple,event);
            itemRegistry(ItemBlockList.itemBlockEmeraldQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockEmeraldQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockEmeraldSextuple,event);
            itemRegistry(ItemBlockList.itemBlockEmeraldSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockEmeraldOctuple,event);
        }
        if(ConfigRegistryList.registerGold.get())
        {
            ItemBlockList.itemBlockGoldCompressed = new ItemBlockMetaCompressedOre(BlockList.blockGoldCompressed, COMPORES,0);
            ItemBlockList.itemBlockGoldDouble = new ItemBlockMetaCompressedOre(BlockList.blockGoldDouble,COMPORES,1);
            ItemBlockList.itemBlockGoldTriple = new ItemBlockMetaCompressedOre(BlockList.blockGoldTriple,COMPORES,2);
            ItemBlockList.itemBlockGoldQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockGoldQuadruple,COMPORES,3);
            ItemBlockList.itemBlockGoldQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockGoldQuintuple,COMPORES,4);
            ItemBlockList.itemBlockGoldSextuple = new ItemBlockMetaCompressedOre(BlockList.blockGoldSextuple,COMPORES,5);
            ItemBlockList.itemBlockGoldSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockGoldSeptuple,COMPORES,6);
            ItemBlockList.itemBlockGoldOctuple = new ItemBlockMetaCompressedOre(BlockList.blockGoldOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockGoldCompressed, event);
            itemRegistry(ItemBlockList.itemBlockGoldDouble,event);
            itemRegistry(ItemBlockList.itemBlockGoldTriple,event);
            itemRegistry(ItemBlockList.itemBlockGoldQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockGoldQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockGoldSextuple,event);
            itemRegistry(ItemBlockList.itemBlockGoldSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockGoldOctuple,event);
        }
        if(ConfigRegistryList.registerGranite.get())
        {
            ItemBlockList.itemBlockGraniteCompressed = new ItemBlockMetaCompressedOre(BlockList.blockGraniteCompressed, COMPORES,0);
            ItemBlockList.itemBlockGraniteDouble = new ItemBlockMetaCompressedOre(BlockList.blockGraniteDouble,COMPORES,1);
            ItemBlockList.itemBlockGraniteTriple = new ItemBlockMetaCompressedOre(BlockList.blockGraniteTriple,COMPORES,2);
            ItemBlockList.itemBlockGraniteQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockGraniteQuadruple,COMPORES,3);
            ItemBlockList.itemBlockGraniteQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockGraniteQuintuple,COMPORES,4);
            ItemBlockList.itemBlockGraniteSextuple = new ItemBlockMetaCompressedOre(BlockList.blockGraniteSextuple,COMPORES,5);
            ItemBlockList.itemBlockGraniteSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockGraniteSeptuple,COMPORES,6);
            ItemBlockList.itemBlockGraniteOctuple = new ItemBlockMetaCompressedOre(BlockList.blockGraniteOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockGraniteCompressed, event);
            itemRegistry(ItemBlockList.itemBlockGraniteDouble,event);
            itemRegistry(ItemBlockList.itemBlockGraniteTriple,event);
            itemRegistry(ItemBlockList.itemBlockGraniteQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockGraniteQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockGraniteSextuple,event);
            itemRegistry(ItemBlockList.itemBlockGraniteSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockGraniteOctuple,event);
        }
        if(ConfigRegistryList.registerGravel.get())
        {
            ItemBlockList.itemBlockGravelCompressed = new ItemBlockMetaCompressedOre(BlockList.blockGravelCompressed, COMPORES,0);
            ItemBlockList.itemBlockGravelDouble = new ItemBlockMetaCompressedOre(BlockList.blockGravelDouble,COMPORES,1);
            ItemBlockList.itemBlockGravelTriple = new ItemBlockMetaCompressedOre(BlockList.blockGravelTriple,COMPORES,2);
            ItemBlockList.itemBlockGravelQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockGravelQuadruple,COMPORES,3);
            ItemBlockList.itemBlockGravelQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockGravelQuintuple,COMPORES,4);
            ItemBlockList.itemBlockGravelSextuple = new ItemBlockMetaCompressedOre(BlockList.blockGravelSextuple,COMPORES,5);
            ItemBlockList.itemBlockGravelSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockGravelSeptuple,COMPORES,6);
            ItemBlockList.itemBlockGravelOctuple = new ItemBlockMetaCompressedOre(BlockList.blockGravelOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockGravelCompressed, event);
            itemRegistry(ItemBlockList.itemBlockGravelDouble,event);
            itemRegistry(ItemBlockList.itemBlockGravelTriple,event);
            itemRegistry(ItemBlockList.itemBlockGravelQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockGravelQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockGravelSextuple,event);
            itemRegistry(ItemBlockList.itemBlockGravelSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockGravelOctuple,event);
        }
        if(ConfigRegistryList.registerIron.get())
        {
            ItemBlockList.itemBlockIronCompressed = new ItemBlockMetaCompressedOre(BlockList.blockIronCompressed, COMPORES,0);
            ItemBlockList.itemBlockIronDouble = new ItemBlockMetaCompressedOre(BlockList.blockIronDouble,COMPORES,1);
            ItemBlockList.itemBlockIronTriple = new ItemBlockMetaCompressedOre(BlockList.blockIronTriple,COMPORES,2);
            ItemBlockList.itemBlockIronQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockIronQuadruple,COMPORES,3);
            ItemBlockList.itemBlockIronQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockIronQuintuple,COMPORES,4);
            ItemBlockList.itemBlockIronSextuple = new ItemBlockMetaCompressedOre(BlockList.blockIronSextuple,COMPORES,5);
            ItemBlockList.itemBlockIronSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockIronSeptuple,COMPORES,6);
            ItemBlockList.itemBlockIronOctuple = new ItemBlockMetaCompressedOre(BlockList.blockIronOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockIronCompressed, event);
            itemRegistry(ItemBlockList.itemBlockIronDouble,event);
            itemRegistry(ItemBlockList.itemBlockIronTriple,event);
            itemRegistry(ItemBlockList.itemBlockIronQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockIronQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockIronSextuple,event);
            itemRegistry(ItemBlockList.itemBlockIronSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockIronOctuple,event);
        }
        if(ConfigRegistryList.registerLapis.get())
        {
            ItemBlockList.itemBlockLapisCompressed = new ItemBlockMetaCompressedOre(BlockList.blockLapisCompressed, COMPORES,0);
            ItemBlockList.itemBlockLapisDouble = new ItemBlockMetaCompressedOre(BlockList.blockLapisDouble,COMPORES,1);
            ItemBlockList.itemBlockLapisTriple = new ItemBlockMetaCompressedOre(BlockList.blockLapisTriple,COMPORES,2);
            ItemBlockList.itemBlockLapisQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockLapisQuadruple,COMPORES,3);
            ItemBlockList.itemBlockLapisQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockLapisQuintuple,COMPORES,4);
            ItemBlockList.itemBlockLapisSextuple = new ItemBlockMetaCompressedOre(BlockList.blockLapisSextuple,COMPORES,5);
            ItemBlockList.itemBlockLapisSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockLapisSeptuple,COMPORES,6);
            ItemBlockList.itemBlockLapisOctuple = new ItemBlockMetaCompressedOre(BlockList.blockLapisOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockLapisCompressed, event);
            itemRegistry(ItemBlockList.itemBlockLapisDouble,event);
            itemRegistry(ItemBlockList.itemBlockLapisTriple,event);
            itemRegistry(ItemBlockList.itemBlockLapisQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockLapisQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockLapisSextuple,event);
            itemRegistry(ItemBlockList.itemBlockLapisSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockLapisOctuple,event);
        }
        if(ConfigRegistryList.registerNetherrack.get())
        {
            ItemBlockList.itemBlockNetherrackCompressed = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackCompressed, COMPORES,0);
            ItemBlockList.itemBlockNetherrackDouble = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackDouble,COMPORES,1);
            ItemBlockList.itemBlockNetherrackTriple = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackTriple,COMPORES,2);
            ItemBlockList.itemBlockNetherrackQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackQuadruple,COMPORES,3);
            ItemBlockList.itemBlockNetherrackQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackQuintuple,COMPORES,4);
            ItemBlockList.itemBlockNetherrackSextuple = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackSextuple,COMPORES,5);
            ItemBlockList.itemBlockNetherrackSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackSeptuple,COMPORES,6);
            ItemBlockList.itemBlockNetherrackOctuple = new ItemBlockMetaCompressedOre(BlockList.blockNetherrackOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockNetherrackCompressed, event);
            itemRegistry(ItemBlockList.itemBlockNetherrackDouble,event);
            itemRegistry(ItemBlockList.itemBlockNetherrackTriple,event);
            itemRegistry(ItemBlockList.itemBlockNetherrackQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockNetherrackQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockNetherrackSextuple,event);
            itemRegistry(ItemBlockList.itemBlockNetherrackSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockNetherrackOctuple,event);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            ItemBlockList.itemBlockQuartzCompressed = new ItemBlockMetaCompressedOre(BlockList.blockQuartzCompressed, COMPORES,0);
            ItemBlockList.itemBlockQuartzDouble = new ItemBlockMetaCompressedOre(BlockList.blockQuartzDouble,COMPORES,1);
            ItemBlockList.itemBlockQuartzTriple = new ItemBlockMetaCompressedOre(BlockList.blockQuartzTriple,COMPORES,2);
            ItemBlockList.itemBlockQuartzQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockQuartzQuadruple,COMPORES,3);
            ItemBlockList.itemBlockQuartzQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockQuartzQuintuple,COMPORES,4);
            ItemBlockList.itemBlockQuartzSextuple = new ItemBlockMetaCompressedOre(BlockList.blockQuartzSextuple,COMPORES,5);
            ItemBlockList.itemBlockQuartzSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockQuartzSeptuple,COMPORES,6);
            ItemBlockList.itemBlockQuartzOctuple = new ItemBlockMetaCompressedOre(BlockList.blockQuartzOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockQuartzCompressed, event);
            itemRegistry(ItemBlockList.itemBlockQuartzDouble,event);
            itemRegistry(ItemBlockList.itemBlockQuartzTriple,event);
            itemRegistry(ItemBlockList.itemBlockQuartzQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockQuartzQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockQuartzSextuple,event);
            itemRegistry(ItemBlockList.itemBlockQuartzSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockQuartzOctuple,event);
        }
        if(ConfigRegistryList.registerRedstone.get())
        {
            ItemBlockList.itemBlockRedstoneCompressed = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneCompressed, COMPORES,0);
            ItemBlockList.itemBlockRedstoneDouble = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneDouble,COMPORES,1);
            ItemBlockList.itemBlockRedstoneTriple = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneTriple,COMPORES,2);
            ItemBlockList.itemBlockRedstoneQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneQuadruple,COMPORES,3);
            ItemBlockList.itemBlockRedstoneQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneQuintuple,COMPORES,4);
            ItemBlockList.itemBlockRedstoneSextuple = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneSextuple,COMPORES,5);
            ItemBlockList.itemBlockRedstoneSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneSeptuple,COMPORES,6);
            ItemBlockList.itemBlockRedstoneOctuple = new ItemBlockMetaCompressedOre(BlockList.blockRedstoneOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockRedstoneCompressed, event);
            itemRegistry(ItemBlockList.itemBlockRedstoneDouble,event);
            itemRegistry(ItemBlockList.itemBlockRedstoneTriple,event);
            itemRegistry(ItemBlockList.itemBlockRedstoneQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockRedstoneQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockRedstoneSextuple,event);
            itemRegistry(ItemBlockList.itemBlockRedstoneSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockRedstoneOctuple,event);
        }
        if(ConfigRegistryList.registerSand.get())
        {
            ItemBlockList.itemBlockSandCompressed = new ItemBlockMetaCompressedOre(BlockList.blockSandCompressed, COMPORES,0);
            ItemBlockList.itemBlockSandDouble = new ItemBlockMetaCompressedOre(BlockList.blockSandDouble,COMPORES,1);
            ItemBlockList.itemBlockSandTriple = new ItemBlockMetaCompressedOre(BlockList.blockSandTriple,COMPORES,2);
            ItemBlockList.itemBlockSandQuadruple = new ItemBlockMetaCompressedOre(BlockList.blockSandQuadruple,COMPORES,3);
            ItemBlockList.itemBlockSandQuintuple = new ItemBlockMetaCompressedOre(BlockList.blockSandQuintuple,COMPORES,4);
            ItemBlockList.itemBlockSandSextuple = new ItemBlockMetaCompressedOre(BlockList.blockSandSextuple,COMPORES,5);
            ItemBlockList.itemBlockSandSeptuple = new ItemBlockMetaCompressedOre(BlockList.blockSandSeptuple,COMPORES,6);
            ItemBlockList.itemBlockSandOctuple = new ItemBlockMetaCompressedOre(BlockList.blockSandOctuple,COMPORES,7);
            itemRegistry(ItemBlockList.itemBlockSandCompressed, event);
            itemRegistry(ItemBlockList.itemBlockSandDouble,event);
            itemRegistry(ItemBlockList.itemBlockSandTriple,event);
            itemRegistry(ItemBlockList.itemBlockSandQuadruple,event);
            itemRegistry(ItemBlockList.itemBlockSandQuintuple,event);
            itemRegistry(ItemBlockList.itemBlockSandSextuple,event);
            itemRegistry(ItemBlockList.itemBlockSandSeptuple,event);
            itemRegistry(ItemBlockList.itemBlockSandOctuple,event);
        }
    }
    private static void blockRegistry(Block block,RegistryEvent.Register<Block> registryEvent)
    {
        registryEvent.getRegistry().register(block);
    }
    private static void itemRegistry(Item item,RegistryEvent.Register<Item> registryEvent)
    {
        registryEvent.getRegistry().register(item);
    }
}

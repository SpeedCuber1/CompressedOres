package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.BlockMetaCompressedOre;
import com.tylerh.compressedores.Items.ItemBlockMetaCompressedOre;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks
{
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,ModInfo.MOD_ID);

    public static void registerBlocks()
    {
        if(ConfigRegistryList.registerAndesite.get())
        {
            BlockList.blockAndesiteCompressed = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockAndesiteDouble = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockAndesiteTriple = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockAndesiteQuadruple = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockAndesiteQuintuple = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockAndesiteSextuple = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockAndesiteSeptuple = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockAndesiteOctuple = register("blockandesite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerBasalt.get())
        {
            BlockList.blockBasaltCompressed = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockBasaltDouble = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockBasaltTriple = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockBasaltQuadruple = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockBasaltQuintuple = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockBasaltSextuple = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockBasaltSeptuple = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockBasaltOctuple = register("blockbasalt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerBlackstone.get())
        {
            BlockList.blockBlackstoneCompressed = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockBlackstoneDouble = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockBlackstoneTriple = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockBlackstoneQuadruple = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockBlackstoneQuintuple = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockBlackstoneSextuple = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockBlackstoneSeptuple = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockBlackstoneOctuple = register("blockblackstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerCalcite.get())
        {
            BlockList.blockCalciteCompressed = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockCalciteDouble = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockCalciteTriple = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockCalciteQuadruple = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockCalciteQuintuple = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockCalciteSextuple = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockCalciteSeptuple = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockCalciteOctuple = register("blockcalcite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerClay.get())
        {
            BlockList.blockClayCompressed = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockClayDouble = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockClayTriple = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockClayQuadruple = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockClayQuintuple = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockClaySextuple = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockClaySeptuple = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockClayOctuple = register("blockclay", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerCoal.get())
        {
            BlockList.blockCoalCompressed = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockCoalDouble = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockCoalTriple = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockCoalQuadruple = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockCoalQuintuple = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockCoalSextuple = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockCoalSeptuple = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockCoalOctuple = register("blockcoal", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerCobble.get())
        {
            BlockList.blockCobbleCompressed = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockCobbleDouble = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockCobbleTriple = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockCobbleQuadruple = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockCobbleQuintuple = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockCobbleSextuple = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockCobbleSeptuple = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockCobbleOctuple = register("blockcobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerDeepslate.get())
        {
            BlockList.blockDeepslateCobbleCompressed = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockDeepslateCobbleDouble = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockDeepslateCobbleTriple = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockDeepslateCobbleQuadruple = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockDeepslateCobbleQuintuple = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockDeepslateCobbleSextuple = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockDeepslateCobbleSeptuple = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockDeepslateCobbleOctuple = register("blockdeepslatecobble", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerDiamond.get())
        {
            BlockList.blockDiamondCompressed = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockDiamondDouble = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockDiamondTriple = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockDiamondQuadruple = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockDiamondQuintuple = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockDiamondSextuple = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockDiamondSeptuple = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockDiamondOctuple = register("blockdiamond", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerDiorite.get())
        {
            BlockList.blockDioriteCompressed = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockDioriteDouble = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockDioriteTriple = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockDioriteQuadruple = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockDioriteQuintuple = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockDioriteSextuple = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockDioriteSeptuple = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockDioriteOctuple = register("blockdiorite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerDirt.get())
        {
            BlockList.blockDirtCompressed = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockDirtDouble = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockDirtTriple = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockDirtQuadruple = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockDirtQuintuple = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockDirtSextuple = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockDirtSeptuple = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockDirtOctuple = register("blockdirt", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerEmerald.get())
        {
            BlockList.blockEmeraldCompressed = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockEmeraldDouble = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockEmeraldTriple = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockEmeraldQuadruple = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockEmeraldQuintuple = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockEmeraldSextuple = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockEmeraldSeptuple = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockEmeraldOctuple = register("blockemerald", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerGold.get())
        {
            BlockList.blockGoldCompressed = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 0);
            BlockList.blockGoldDouble = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 1);
            BlockList.blockGoldTriple = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 2);
            BlockList.blockGoldQuadruple = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 3);
            BlockList.blockGoldQuintuple = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 4);
            BlockList.blockGoldSextuple = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 5);
            BlockList.blockGoldSeptuple = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 6);
            BlockList.blockGoldOctuple = register("blockgold", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerGranite.get())
        {
            BlockList.blockGraniteCompressed = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockGraniteDouble = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockGraniteTriple = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockGraniteQuadruple = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockGraniteQuintuple = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockGraniteSextuple = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockGraniteSeptuple = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockGraniteOctuple = register("blockgranite", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerGravel.get())
        {
            BlockList.blockGravelCompressed = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockGravelDouble = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockGravelTriple = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockGravelQuadruple = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockGravelQuintuple = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockGravelSextuple = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockGravelSeptuple = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockGravelOctuple = register("blockgravel", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerIron.get())
        {
            BlockList.blockIronCompressed = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 0);
            BlockList.blockIronDouble = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 1);
            BlockList.blockIronTriple = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 2);
            BlockList.blockIronQuadruple = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 3);
            BlockList.blockIronQuintuple = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 4);
            BlockList.blockIronSextuple = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 5);
            BlockList.blockIronSeptuple = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 6);
            BlockList.blockIronOctuple = register("blockiron", () -> new BlockMetaCompressedOre(Material.METAL,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerLapis.get())
        {
            BlockList.blockLapisCompressed = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockLapisDouble = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockLapisTriple = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockLapisQuadruple = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockLapisQuintuple = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockLapisSextuple = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockLapisSeptuple = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockLapisOctuple = register("blocklapis", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerNetherrack.get())
        {
            BlockList.blockNetherrackCompressed = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockNetherrackDouble = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockNetherrackTriple = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockNetherrackQuadruple = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockNetherrackQuintuple = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockNetherrackSextuple = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockNetherrackSeptuple = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockNetherrackOctuple = register("blocknetherrack", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            BlockList.blockQuartzCompressed = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockQuartzDouble = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockQuartzTriple = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockQuartzQuadruple = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockQuartzQuintuple = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockQuartzSextuple = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockQuartzSeptuple = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockQuartzOctuple = register("blockquartz", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerRedstone.get())
        {
            BlockList.blockRedstoneCompressed = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockRedstoneDouble = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockRedstoneTriple = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockRedstoneQuadruple = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockRedstoneQuintuple = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockRedstoneSextuple = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockRedstoneSeptuple = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockRedstoneOctuple = register("blockredstone", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerSand.get())
        {
            BlockList.blockSandCompressed = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockSandDouble = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockSandTriple = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockSandQuadruple = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockSandQuintuple = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockSandSextuple = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockSandSeptuple = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockSandOctuple = register("blocksand", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
        if(ConfigRegistryList.registerTuff.get())
        {
            BlockList.blockTuffCompressed = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 0);
            BlockList.blockTuffDouble = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 1);
            BlockList.blockTuffTriple = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 2);
            BlockList.blockTuffQuadruple = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 3);
            BlockList.blockTuffQuintuple = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 4);
            BlockList.blockTuffSextuple = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 5);
            BlockList.blockTuffSeptuple = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 6);
            BlockList.blockTuffOctuple = register("blocktuff", () -> new BlockMetaCompressedOre(Material.STONE,3.0F,5.0F), 7);
        }
    }
    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> supplier,int meta)
    {
        String uName = name + "." + EnumLevel.byMetadata(meta).getString();
        RegistryObject<T> block = BLOCKS.register(uName,supplier);
        ITEMS.register(uName,() -> new ItemBlockMetaCompressedOre(block.get(),meta));
        return block;
    }
}

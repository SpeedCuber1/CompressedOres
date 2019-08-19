package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.BlockCompOre;
import com.tylerh.compressedores.Items.BlockItemCompOre;
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
            BlockList.blockAndesiteCompressed = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesitecompressed",false);
            BlockList.blockAndesiteDouble = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesitedouble",false);
            BlockList.blockAndesiteTriple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesitetriple",false);
            BlockList.blockAndesiteQuadruple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesitequadruple",false);
            BlockList.blockAndesiteQuintuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesitequintuple",false);
            BlockList.blockAndesiteSextuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesitesextuple",false);
            BlockList.blockAndesiteSeptuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesiteseptuple",false);
            BlockList.blockAndesiteOctuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"andesiteoctuple",false);
            blockRegistry(BlockList.blockAndesiteCompressed,event);
            blockRegistry(BlockList.blockAndesiteDouble,event);
            blockRegistry(BlockList.blockAndesiteTriple,event);
            blockRegistry(BlockList.blockAndesiteQuadruple,event);
            blockRegistry(BlockList.blockAndesiteQuadruple,event);
            blockRegistry(BlockList.blockAndesiteQuintuple,event);
            blockRegistry(BlockList.blockAndesiteSextuple,event);
            blockRegistry(BlockList.blockAndesiteSeptuple,event);
            blockRegistry(BlockList.blockAndesiteOctuple,event);
        }
        if(ConfigRegistryList.registerClay.get())
        {
            BlockList.blockClayCompressed = new BlockCompOre(Material.ROCK,3.0f,5.0f,"claycompressed",false);
            BlockList.blockClayDouble = new BlockCompOre(Material.ROCK,3.0f,5.0f,"claydouble",false);
            BlockList.blockClayTriple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"claytriple",false);
            BlockList.blockClayQuadruple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"clayquadruple",false);
            BlockList.blockClayQuintuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"clayquintuple",false);
            BlockList.blockClaySextuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"claysextuple",false);
            BlockList.blockClaySeptuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"clayseptuple",false);
            BlockList.blockClayOctuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"clayoctuple",false);
            blockRegistry(BlockList.blockClayCompressed,event);
            blockRegistry(BlockList.blockClayDouble,event);
            blockRegistry(BlockList.blockClayTriple,event);
            blockRegistry(BlockList.blockClayQuadruple,event);
            blockRegistry(BlockList.blockClayQuadruple,event);
            blockRegistry(BlockList.blockClayQuintuple,event);
            blockRegistry(BlockList.blockClaySextuple,event);
            blockRegistry(BlockList.blockClaySeptuple,event);
            blockRegistry(BlockList.blockClayOctuple,event);
        }
        if(ConfigRegistryList.registerCoal.get())
        {
            BlockList.blockCoalCompressed = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coalcompressed",false);
            BlockList.blockCoalDouble = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coaldouble",false);
            BlockList.blockCoalTriple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coaltriple",false);
            BlockList.blockCoalQuadruple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coalquadruple",false);
            BlockList.blockCoalQuintuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coalquintuple",false);
            BlockList.blockCoalSextuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coalsextuple",false);
            BlockList.blockCoalSeptuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coalseptuple",false);
            BlockList.blockCoalOctuple = new BlockCompOre(Material.ROCK,3.0f,5.0f,"coaloctuple",false);
            blockRegistry(BlockList.blockCoalCompressed,event);
            blockRegistry(BlockList.blockCoalDouble,event);
            blockRegistry(BlockList.blockCoalTriple,event);
            blockRegistry(BlockList.blockCoalQuadruple,event);
            blockRegistry(BlockList.blockCoalQuadruple,event);
            blockRegistry(BlockList.blockCoalQuintuple,event);
            blockRegistry(BlockList.blockCoalSextuple,event);
            blockRegistry(BlockList.blockCoalSeptuple,event);
            blockRegistry(BlockList.blockCoalOctuple,event);
        }
    }
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        if(ConfigRegistryList.registerAndesite.get())
        {
            BlockItemList.itemBlockAndesiteCompressed = new BlockItemCompOre(BlockList.blockAndesiteCompressed,COMPORES,0);
            BlockItemList.itemBlockAndesiteDouble = new BlockItemCompOre(BlockList.blockAndesiteDouble,COMPORES,1);
            BlockItemList.itemBlockAndesiteTriple = new BlockItemCompOre(BlockList.blockAndesiteTriple,COMPORES,2);
            BlockItemList.itemBlockAndesiteQuadruple = new BlockItemCompOre(BlockList.blockAndesiteQuadruple,COMPORES,3);
            BlockItemList.itemBlockAndesiteQuintuple = new BlockItemCompOre(BlockList.blockAndesiteQuintuple,COMPORES,4);
            BlockItemList.itemBlockAndesiteSextuple = new BlockItemCompOre(BlockList.blockAndesiteSextuple,COMPORES,5);
            BlockItemList.itemBlockAndesiteSeptuple = new BlockItemCompOre(BlockList.blockAndesiteSeptuple,COMPORES,6);
            BlockItemList.itemBlockAndesiteOctuple = new BlockItemCompOre(BlockList.blockAndesiteOctuple,COMPORES,7);
            itemRegistry(BlockItemList.itemBlockAndesiteCompressed,event);
            itemRegistry(BlockItemList.itemBlockAndesiteDouble,event);
            itemRegistry(BlockItemList.itemBlockAndesiteTriple,event);
            itemRegistry(BlockItemList.itemBlockAndesiteQuadruple,event);
            itemRegistry(BlockItemList.itemBlockAndesiteQuintuple,event);
            itemRegistry(BlockItemList.itemBlockAndesiteSextuple,event);
            itemRegistry(BlockItemList.itemBlockAndesiteSeptuple,event);
            itemRegistry(BlockItemList.itemBlockAndesiteOctuple,event);
        }
        if(ConfigRegistryList.registerClay.get())
        {
            BlockItemList.itemBlockClayCompressed = new BlockItemCompOre(BlockList.blockClayCompressed,COMPORES,0);
            BlockItemList.itemBlockClayDouble = new BlockItemCompOre(BlockList.blockClayDouble,COMPORES,1);
            BlockItemList.itemBlockClayTriple = new BlockItemCompOre(BlockList.blockClayTriple,COMPORES,2);
            BlockItemList.itemBlockClayQuadruple = new BlockItemCompOre(BlockList.blockClayQuadruple,COMPORES,3);
            BlockItemList.itemBlockClayQuintuple = new BlockItemCompOre(BlockList.blockClayQuintuple,COMPORES,4);
            BlockItemList.itemBlockClaySextuple = new BlockItemCompOre(BlockList.blockClaySextuple,COMPORES,5);
            BlockItemList.itemBlockClaySeptuple = new BlockItemCompOre(BlockList.blockClaySeptuple,COMPORES,6);
            BlockItemList.itemBlockClayOctuple = new BlockItemCompOre(BlockList.blockClayOctuple,COMPORES,7);
            itemRegistry(BlockItemList.itemBlockClayCompressed,event);
            itemRegistry(BlockItemList.itemBlockClayDouble,event);
            itemRegistry(BlockItemList.itemBlockClayTriple,event);
            itemRegistry(BlockItemList.itemBlockClayQuadruple,event);
            itemRegistry(BlockItemList.itemBlockClayQuintuple,event);
            itemRegistry(BlockItemList.itemBlockClaySextuple,event);
            itemRegistry(BlockItemList.itemBlockClaySeptuple,event);
            itemRegistry(BlockItemList.itemBlockClayOctuple,event);
        }
        if(ConfigRegistryList.registerCoal.get())
        {
            BlockItemList.itemBlockCoalCompressed = new BlockItemCompOre(BlockList.blockCoalCompressed,COMPORES,0);
            BlockItemList.itemBlockCoalDouble = new BlockItemCompOre(BlockList.blockCoalDouble,COMPORES,1);
            BlockItemList.itemBlockCoalTriple = new BlockItemCompOre(BlockList.blockCoalTriple,COMPORES,2);
            BlockItemList.itemBlockCoalQuadruple = new BlockItemCompOre(BlockList.blockCoalQuadruple,COMPORES,3);
            BlockItemList.itemBlockCoalQuintuple = new BlockItemCompOre(BlockList.blockCoalQuintuple,COMPORES,4);
            BlockItemList.itemBlockCoalSextuple = new BlockItemCompOre(BlockList.blockCoalSextuple,COMPORES,5);
            BlockItemList.itemBlockCoalSeptuple = new BlockItemCompOre(BlockList.blockCoalSeptuple,COMPORES,6);
            BlockItemList.itemBlockCoalOctuple = new BlockItemCompOre(BlockList.blockCoalOctuple,COMPORES,7);
            itemRegistry(BlockItemList.itemBlockCoalCompressed,event);
            itemRegistry(BlockItemList.itemBlockCoalDouble,event);
            itemRegistry(BlockItemList.itemBlockCoalTriple,event);
            itemRegistry(BlockItemList.itemBlockCoalQuadruple,event);
            itemRegistry(BlockItemList.itemBlockCoalQuintuple,event);
            itemRegistry(BlockItemList.itemBlockCoalSextuple,event);
            itemRegistry(BlockItemList.itemBlockCoalSeptuple,event);
            itemRegistry(BlockItemList.itemBlockCoalOctuple,event);
        }
    }
    private static void blockRegistry(Block block,RegistryEvent.Register<Block> regEvent)
    {
        regEvent.getRegistry().register(block);
    }
    private static void itemRegistry(Item item,RegistryEvent.Register<Item> regEvent)
    {
        regEvent.getRegistry().register(item);
    }
}

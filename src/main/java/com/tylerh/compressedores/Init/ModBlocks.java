package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.*;
import com.tylerh.compressedores.Items.*;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks
{
    public static boolean registerAndesite;
    public static boolean registerClay;
    public static boolean registerCoal;
    public static boolean registerCobblestone;
    public static boolean registerDiamond;
    public static boolean registerDiorite;
    public static boolean registerDirt;
    public static boolean registerEmerald;
    public static boolean registerGold;
    public static boolean registerGranite;
    public static boolean registerGravel;
    public static boolean registerIron;
    public static boolean registerLapis;
    public static boolean registerQuartz;
    public static boolean registerRedstone;
    public static boolean registerSand;


    //Blocks
    public static Block blockAndesite;
    public static Block blockClay;
    public static Block blockCoal;
    public static Block blockCobble;
    public static Block blockDiamond;
    public static Block blockDiorite;
    public static Block blockDirt;
    public static Block blockEmerald;
    public static Block blockGold;
    public static Block blockGranite;
    public static Block blockGravel;
    public static Block blockIron;
    public static Block blockLapis;
    public static Block blockQuartz;
    public static Block blockRedstone;
    public static Block blockSand;

    //ItemBlocks
    private static ItemBlock itemBlockAndesite;
    private static ItemBlock itemBlockClay;
    private static ItemBlock itemBlockCoal;
    private static ItemBlock itemBlockCobble;
    private static ItemBlock itemBlockDiamond;
    private static ItemBlock itemBlockDiorite;
    private static ItemBlock itemBlockDirt;
    private static ItemBlock itemBlockEmerald;
    private static ItemBlock itemBlockGold;
    private static ItemBlock itemBlockGranite;
    private static ItemBlock itemBlockGravel;
    private static ItemBlock itemBlockIron;
    private static ItemBlock itemBlockLapis;
    private static ItemBlock itemBlockQuartz;
    private static ItemBlock itemBlockRedstone;
    private static ItemBlock itemBlockSand;

    public static void preInitCommon()
    {
        if(registerAndesite)
        {
            blockAndesite = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockandesite",false);
            itemBlockAndesite = new ItemBlockMetaCompressedOre(blockAndesite);
            createRegistry(blockAndesite,itemBlockAndesite,"blockandesite");
            ForgeRegistries.BLOCKS.register(blockAndesite);
            ForgeRegistries.ITEMS.register(itemBlockAndesite);
            initOreDict(blockAndesite,"blockAndesite");
        }
        if(registerClay)
        {
            blockClay = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockclay",false);
            itemBlockClay = new ItemBlockMetaCompressedOre(blockClay);
            createRegistry(blockClay,itemBlockClay,"blockclay");
            ForgeRegistries.BLOCKS.register(blockClay);
            ForgeRegistries.ITEMS.register(itemBlockClay);
            initOreDict(blockClay,"blockClay");
        }
        if(registerCoal)
        {
            blockCoal = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockcoal",false);
            itemBlockCoal = new ItemBlockMetaCompressedOre(blockCoal);
            createRegistry(blockCoal,itemBlockCoal,"blockcoal");
            ForgeRegistries.BLOCKS.register(blockCoal);
            ForgeRegistries.ITEMS.register(itemBlockCoal);
            initOreDict(blockCoal,"blockCoal");
        }
        if(registerCobblestone)
        {
            blockCobble = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockcobble",false);
            itemBlockCobble = new ItemBlockMetaCompressedOre(blockCobble);
            createRegistry(blockCobble,itemBlockCobble,"blockcobble");
            ForgeRegistries.BLOCKS.register(blockCobble);
            ForgeRegistries.ITEMS.register(itemBlockCobble);
            initOreDict(blockCobble,"blockCobble");
        }
        if(registerDiamond)
        {
            blockDiamond = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockdiamond",false);
            itemBlockDiamond = new ItemBlockMetaCompressedOre(blockDiamond);
            createRegistry(blockDiamond,itemBlockDiamond,"blockdiamond");
            ForgeRegistries.BLOCKS.register(blockDiamond);
            ForgeRegistries.ITEMS.register(itemBlockDiamond);
            initOreDict(blockDiamond,"blockDiamond");
        }
        if(registerDiorite)
        {
            blockDiorite = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockdiorite",false);
            itemBlockDiorite = new ItemBlockMetaCompressedOre(blockDiorite);
            createRegistry(blockDiorite,itemBlockDiorite,"blockdiorite");
            ForgeRegistries.BLOCKS.register(blockDiorite);
            ForgeRegistries.ITEMS.register(itemBlockDiorite);
            initOreDict(blockDiorite,"blockDiorite");
        }
        if(registerDirt)
        {
            blockDirt = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockdirt",false);
            itemBlockDirt = new ItemBlockMetaCompressedOre(blockDirt);
            createRegistry(blockDirt,itemBlockDirt,"blockdirt");
            ForgeRegistries.BLOCKS.register(blockDirt);
            ForgeRegistries.ITEMS.register(itemBlockDirt);
            initOreDict(blockDirt,"blockDirt");
        }
        if(registerEmerald)
        {
            blockEmerald = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockemerald",false);
            itemBlockEmerald = new ItemBlockMetaCompressedOre(blockEmerald);
            createRegistry(blockEmerald,itemBlockEmerald,"blockemerald");
            ForgeRegistries.BLOCKS.register(blockEmerald);
            ForgeRegistries.ITEMS.register(itemBlockEmerald);
            initOreDict(blockEmerald,"blockEmerald");
        }
        if(registerGold)
        {
            blockGold = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockgold",false);
            itemBlockGold = new ItemBlockMetaCompressedOre(blockGold);
            createRegistry(blockGold,itemBlockGold,"blockgold");
            ForgeRegistries.BLOCKS.register(blockGold);
            ForgeRegistries.ITEMS.register(itemBlockGold);
            initOreDict(blockGold,"blockGold");
        }
        if(registerGranite)
        {
            blockGranite = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockgranite",false);
            itemBlockGranite = new ItemBlockMetaCompressedOre(blockGranite);
            createRegistry(blockGranite,itemBlockGranite,"blockgranite");
            ForgeRegistries.BLOCKS.register(blockGranite);
            ForgeRegistries.ITEMS.register(itemBlockGranite);
            initOreDict(blockGranite,"blockGranite");
        }
        if(registerGravel)
        {
            blockGravel = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockgravel",false);
            itemBlockGravel = new ItemBlockMetaCompressedOre(blockGravel);
            createRegistry(blockGravel,itemBlockGravel,"blockgravel");
            ForgeRegistries.BLOCKS.register(blockGravel);
            ForgeRegistries.ITEMS.register(itemBlockGravel);
            initOreDict(blockGravel,"blockGravel");
        }
        if(registerIron)
        {
            blockIron = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockiron",false);
            itemBlockIron = new ItemBlockMetaCompressedOre(blockIron);
            createRegistry(blockIron,itemBlockIron,"blockiron");
            ForgeRegistries.BLOCKS.register(blockIron);
            ForgeRegistries.ITEMS.register(itemBlockIron);
            initOreDict(blockIron,"blockIron");
        }
        if(registerLapis)
        {
            blockLapis = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blocklapis",false);
            itemBlockLapis = new ItemBlockMetaCompressedOre(blockLapis);
            createRegistry(blockLapis,itemBlockLapis,"blocklapis");
            ForgeRegistries.BLOCKS.register(blockLapis);
            ForgeRegistries.ITEMS.register(itemBlockLapis);
            initOreDict(blockLapis,"blockLapis");
        }
        if(registerQuartz)
        {
            blockQuartz = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockquartz",false);
            itemBlockQuartz = new ItemBlockMetaCompressedOre(blockQuartz);
            createRegistry(blockQuartz,itemBlockQuartz,"blockquartz");
            ForgeRegistries.BLOCKS.register(blockQuartz);
            ForgeRegistries.ITEMS.register(itemBlockQuartz);
            initOreDict(blockQuartz,"blockQuartz");
        }
        if(registerRedstone)
        {
            blockRedstone = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blockredstone",true);
            itemBlockRedstone = new ItemBlockMetaCompressedOre(blockRedstone);
            createRegistry(blockRedstone,itemBlockRedstone,"blockredstone");
            ForgeRegistries.BLOCKS.register(blockRedstone);
            ForgeRegistries.ITEMS.register(itemBlockRedstone);
            initOreDict(blockRedstone,"blockRedstone");
        }
        if(registerSand)
        {
            blockSand = new BlockMetaCompressedOre(Material.ROCK,3.0f,5.0f,"blocksand",false);
            itemBlockSand = new ItemBlockMetaCompressedOre(blockSand);
            createRegistry(blockSand,itemBlockSand,"blocksand");
            ForgeRegistries.BLOCKS.register(blockSand);
            ForgeRegistries.ITEMS.register(itemBlockSand);
            initOreDict(blockSand,"blockSand");
        }
    }

    public static void preInitClient()
    {
        if(registerAndesite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockandesite");
            Item itemBlockAndesite = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockAndesite,location.toString(),"Assemble");
        }
        if(registerClay)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockclay");
            Item itemBlockClay = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockClay,location.toString(),"Assemble");
        }
        if(registerCoal)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockcoal");
            Item itemBlockCoal = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockCoal,location.toString(),"Assemble");
        }
        if(registerCobblestone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockcobble");
            Item itemBlockCobble = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockCobble,location.toString(),"Assemble");
        }
        if(registerDiamond)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockdiamond");
            Item itemBlockDiamond = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockDiamond,location.toString(),"Assemble");
        }
        if(registerDiorite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockdiorite");
            Item itemBlockDiorite = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockDiorite,location.toString(),"Assemble");
        }
        if(registerDirt)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockdirt");
            Item itemBlockDirt = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockDirt,location.toString(),"Assemble");
        }
        if(registerEmerald)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockemerald");
            Item itemBlockEmerald = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockEmerald,location.toString(),"Assemble");
        }
        if(registerGold)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockgold");
            Item itemBlockGold = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockGold,location.toString(),"Assemble");
        }
        if(registerGranite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockgranite");
            Item itemBlockGranite = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockGranite,location.toString(),"Assemble");
        }
        if(registerGravel)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockgravel");
            Item itemBlockGravel = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockGravel,location.toString(),"Assemble");
        }
        if(registerIron)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockiron");
            Item itemBlockIron = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockIron,location.toString(),"Assemble");
        }
        if(registerLapis)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blocklapis");
            Item itemBlockLapis = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockLapis,location.toString(),"Assemble");
        }
        if(registerQuartz)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockquartz");
            Item itemBlockQuartz = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockQuartz,location.toString(),"Assemble");
        }
        if(registerRedstone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockredstone");
            Item itemBlockRedstone = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockRedstone,location.toString(),"Assemble");
        }
        if(registerSand)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blocksand");
            Item itemBlockSand = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockSand,location.toString(),"Assemble");
        }
    }
    public static void initClient()
    {
        if(registerAndesite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockandesite");
            Item itemBlockAndesite = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockAndesite,location.toString(),"Bake");
        }
        if(registerClay)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockclay");
            Item itemBlockClay = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockClay,location.toString(),"Bake");
        }
        if(registerCoal)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockcoal");
            Item itemBlockCoal = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockCoal,location.toString(),"Bake");
        }
        if(registerCobblestone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockcobble");
            Item itemBlockCobble = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockCobble,location.toString(),"Bake");
        }
        if(registerDiamond)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockdiamond");
            Item itemBlockDiamond = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockDiamond,location.toString(),"Bake");
        }
        if(registerDiorite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockdiorite");
            Item itemBlockDiorite = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockDiorite,location.toString(),"Bake");
        }
        if(registerDirt)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockdirt");
            Item itemBlockDirt = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockDirt,location.toString(),"Bake");
        }
        if(registerEmerald)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockemerald");
            Item itemBlockEmerald = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockEmerald,location.toString(),"Bake");
        }
        if(registerGold)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockgold");
            Item itemBlockGold = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockGold,location.toString(),"Bake");
        }
        if(registerGranite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockgranite");
            Item itemBlockGranite = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockGranite,location.toString(),"Bake");
        }
        if(registerGravel)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockgravel");
            Item itemBlockGravel = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockGravel,location.toString(),"Bake");
        }
        if(registerIron)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockiron");
            Item itemBlockIron = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockIron,location.toString(),"Bake");
        }
        if(registerLapis)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blocklapis");
            Item itemBlockLapis = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockLapis,location.toString(),"Bake");
        }
        if(registerQuartz)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockquartz");
            Item itemBlockQuartz = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockQuartz,location.toString(),"Bake");
        }
        if(registerRedstone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockredstone");
            Item itemBlockRedstone = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockRedstone,location.toString(),"Bake");
        }
        if(registerSand)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blocksand");
            Item itemBlockSand = Item.REGISTRY.getObject(location);
            assembleModels(itemBlockSand,location.toString(),"Bake");
        }
    }
    private static void initOreDict(Block blockIn, String name)
    {
        for(int i = 0; i < 8; i++)
        {
            ItemStack stack = new ItemStack(blockIn,1,i);
            OreDictionary.registerOre(name + EnumLevel.byMetadata(i).getUnlocalizedName(),stack);
        }
    }
    private static void assembleModels(Item item , String resource, String mode)
    {
        ModelResourceLocation location;
        for(int i = 0; i < 8; i++)
        {
            location = new ModelResourceLocation(resource + "." + EnumLevel.byMetadata(i).getName(), "inventory");
            if(mode == "Assemble")
            {
                ModelBakery.registerItemVariants(item, location);
            }
            else if(mode == "Bake")
            {
                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,i,location);
            }
        }
    }
    private static void createRegistry(Block block, ItemBlock itemBlock, String name)
    {
        block.setRegistryName("compressedores",name);
        createRegistry(itemBlock,block.getRegistryName().toString());
    }
    private static void createRegistry(ItemBlock itemBlock, String name)
    {
        itemBlock.setRegistryName(name);
    }
}

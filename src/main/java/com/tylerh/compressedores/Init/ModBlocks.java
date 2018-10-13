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
    public static Block blockMetaAndesite;
    public static Block blockMetaClay;
    public static Block blockMetaCoal;
    public static Block blockMetaCobble;
    public static Block blockMetaDiamond;
    public static Block blockMetaDiorite;
    public static Block blockMetaDirt;
    public static Block blockMetaEmerald;
    public static Block blockMetaGold;
    public static Block blockMetaGranite;
    public static Block blockMetaGravel;
    public static Block blockMetaIron;
    public static Block blockMetaLapis;
    public static Block blockMetaQuartz;
    public static Block blockMetaRedstone;
    public static Block blockMetaSand;

    //ItemBlocks
    static ItemBlock itemBlockMetaAndesite;
    static ItemBlock itemBlockMetaClay;
    static ItemBlock itemBlockMetaCoal;
    static ItemBlock itemBlockMetaCobble;
    static ItemBlock itemBlockMetaDiamond;
    static ItemBlock itemBlockMetaDiorite;
    static ItemBlock itemBlockMetaDirt;
    static ItemBlock itemBlockMetaEmerald;
    static ItemBlock itemBlockMetaGold;
    static ItemBlock itemBlockMetaGranite;
    static ItemBlock itemBlockMetaGravel;
    static ItemBlock itemBlockMetaIron;
    static ItemBlock itemBlockMetaLapis;
    static ItemBlock itemBlockMetaQuartz;
    static ItemBlock itemBlockMetaRedstone;
    static ItemBlock itemBlockMetaSand;

    public static void preInitCommon()
    {
        if(registerGold)
        {
            blockMetaGold = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaGold",false);
            itemBlockMetaGold = new ItemBlockMetaCompressedOre(blockMetaGold);
            createRegistry(blockMetaGold,itemBlockMetaGold,"blockMetaGold");
            ForgeRegistries.BLOCKS.register(blockMetaGold);
            ForgeRegistries.ITEMS.register(itemBlockMetaGold);
            initOreDict(blockMetaGold,"blockGold");
        }
        if(registerIron)
        {
            blockMetaIron = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaIron",false);
            itemBlockMetaIron = new ItemBlockMetaCompressedOre(blockMetaIron);
            createRegistry(blockMetaIron,itemBlockMetaIron,"blockMetaIron");
            ForgeRegistries.BLOCKS.register(blockMetaIron);
            ForgeRegistries.ITEMS.register(itemBlockMetaIron);
            initOreDict(blockMetaIron,"blockIron");
        }
        if(registerDiamond)
        {
            blockMetaDiamond = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaDiamond",false);
            itemBlockMetaDiamond = new ItemBlockMetaCompressedOre(blockMetaDiamond);
            createRegistry(blockMetaDiamond,itemBlockMetaDiamond,"blockMetaDiamond");
            ForgeRegistries.BLOCKS.register(blockMetaDiamond);
            ForgeRegistries.ITEMS.register(itemBlockMetaDiamond);
            initOreDict(blockMetaDiamond,"blockDiamond");
        }
        if(registerEmerald)
        {
            blockMetaEmerald = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaEmerald",false);
            itemBlockMetaEmerald = new ItemBlockMetaCompressedOre(blockMetaEmerald);
            createRegistry(blockMetaEmerald,itemBlockMetaEmerald,"blockMetaEmerald");
            ForgeRegistries.BLOCKS.register(blockMetaEmerald);
            ForgeRegistries.ITEMS.register(itemBlockMetaEmerald);
            initOreDict(blockMetaEmerald,"blockEmerald");
        }
        if(registerRedstone)
        {
            blockMetaRedstone = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaRedstone",true);
            itemBlockMetaRedstone = new ItemBlockMetaCompressedOre(blockMetaRedstone);
            createRegistry(blockMetaRedstone,itemBlockMetaRedstone,"blockMetaRedstone");
            ForgeRegistries.BLOCKS.register(blockMetaRedstone);
            ForgeRegistries.ITEMS.register(itemBlockMetaRedstone);
            initOreDict(blockMetaRedstone,"blockRedstone");
        }
        if(registerLapis)
        {
            blockMetaLapis = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaLapis",false);
            itemBlockMetaLapis = new ItemBlockMetaCompressedOre(blockMetaLapis);
            createRegistry(blockMetaLapis,itemBlockMetaLapis,"blockMetaLapis");
            ForgeRegistries.BLOCKS.register(blockMetaLapis);
            ForgeRegistries.ITEMS.register(itemBlockMetaLapis);
            initOreDict(blockMetaLapis,"blockLapis");
        }
        if(registerCoal)
        {
            blockMetaCoal = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaCoal",false);
            itemBlockMetaCoal = new ItemBlockMetaCompressedOre(blockMetaCoal);
            createRegistry(blockMetaCoal,itemBlockMetaCoal,"blockMetaCoal");
            ForgeRegistries.BLOCKS.register(blockMetaCoal);
            ForgeRegistries.ITEMS.register(itemBlockMetaCoal);
            initOreDict(blockMetaCoal,"blockCoal");
        }
        if(registerAndesite)
        {
            blockMetaAndesite = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaAndesite",false);
            itemBlockMetaAndesite = new ItemBlockMetaCompressedOre(blockMetaAndesite);
            createRegistry(blockMetaAndesite,itemBlockMetaAndesite,"blockMetaAndesite");
            ForgeRegistries.BLOCKS.register(blockMetaAndesite);
            ForgeRegistries.ITEMS.register(itemBlockMetaAndesite);
            initOreDict(blockMetaAndesite,"blockAndesite");
        }
        if(registerDiorite)
        {
            blockMetaDiorite = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaDiorite",false);
            itemBlockMetaDiorite = new ItemBlockMetaCompressedOre(blockMetaDiorite);
            createRegistry(blockMetaDiorite,itemBlockMetaDiorite,"blockMetaDiorite");
            ForgeRegistries.BLOCKS.register(blockMetaDiorite);
            ForgeRegistries.ITEMS.register(itemBlockMetaDiorite);
            initOreDict(blockMetaDiorite,"blockDiorite");
        }
        if(registerGranite)
        {
            blockMetaGranite = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaGranite",false);
            itemBlockMetaGranite = new ItemBlockMetaCompressedOre(blockMetaGranite);
            createRegistry(blockMetaGranite,itemBlockMetaGranite,"blockMetaGranite");
            ForgeRegistries.BLOCKS.register(blockMetaGranite);
            ForgeRegistries.ITEMS.register(itemBlockMetaGranite);
            initOreDict(blockMetaGranite,"blockGranite");
        }
        if(registerCobblestone)
        {
            blockMetaCobble = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaCobble",false);
            itemBlockMetaCobble = new ItemBlockMetaCompressedOre(blockMetaCobble);
            createRegistry(blockMetaCobble,itemBlockMetaCobble,"blockMetaCobble");
            ForgeRegistries.BLOCKS.register(blockMetaCobble);
            ForgeRegistries.ITEMS.register(itemBlockMetaCobble);
            initOreDict(blockMetaCobble,"blockCobble");
        }
        if(registerQuartz)
        {
            blockMetaQuartz = new BlockMetaCompressedOre(Material.IRON,3.0f,5.0f,"blockMetaQuartz",false);
            itemBlockMetaQuartz = new ItemBlockMetaCompressedOre(blockMetaQuartz);
            createRegistry(blockMetaQuartz,itemBlockMetaQuartz,"blockMetaQuartz");
            ForgeRegistries.BLOCKS.register(blockMetaQuartz);
            ForgeRegistries.ITEMS.register(itemBlockMetaQuartz);
            initOreDict(blockMetaQuartz,"blockQuartz");
        }
        if(registerDirt)
        {
            blockMetaDirt = new BlockMetaCompressedOre(Material.GROUND,2.0f,5.0f,"blockMetaDirt",false);
            itemBlockMetaDirt = new ItemBlockMetaCompressedOre(blockMetaDirt);
            createRegistry(blockMetaDirt,itemBlockMetaDirt,"blockMetaDirt");
            ForgeRegistries.BLOCKS.register(blockMetaDirt);
            ForgeRegistries.ITEMS.register(itemBlockMetaDirt);
            initOreDict(blockMetaDirt,"blockDirt");
        }
        if(registerSand)
        {
            blockMetaSand = new BlockMetaCompressedOre(Material.SAND,2.0f,5.0f,"blockMetaSand",false);
            itemBlockMetaSand = new ItemBlockMetaCompressedOre(blockMetaSand);
            createRegistry(blockMetaSand,itemBlockMetaSand,"blockMetaSand");
            ForgeRegistries.BLOCKS.register(blockMetaSand);
            ForgeRegistries.ITEMS.register(itemBlockMetaSand);
            initOreDict(blockMetaSand,"blockSand");
        }
        if(registerGravel)
        {
            blockMetaGravel = new BlockMetaCompressedOre(Material.SAND,2.0f,5.0f,"blockMetaGravel",false);
            itemBlockMetaGravel = new ItemBlockMetaCompressedOre(blockMetaGravel);
            createRegistry(blockMetaGravel,itemBlockMetaGravel,"blockMetaGravel");
            ForgeRegistries.BLOCKS.register(blockMetaGravel);
            ForgeRegistries.ITEMS.register(itemBlockMetaGravel);
            initOreDict(blockMetaGravel,"blockGravel");
        }
        if(registerClay)
        {
            blockMetaClay = new BlockMetaCompressedOre(Material.CLAY,2.0f,5.0f,"blockMetaClay",false);
            itemBlockMetaClay = new ItemBlockMetaCompressedOre(blockMetaClay);
            createRegistry(blockMetaClay,itemBlockMetaClay,"blockMetaClay");
            ForgeRegistries.BLOCKS.register(blockMetaClay);
            ForgeRegistries.ITEMS.register(itemBlockMetaClay);
            initOreDict(blockMetaClay,"blockClay");
        }
    }

    public static void preInitClient()
    {
        if(registerGold)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGold");
            Item itemBlockMetaGold = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaGold,location.toString(),"Assemble");
        }
        if(registerIron)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaIron");
            Item itemBlockMetaIron = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaIron,location.toString(),"Assemble");
        }
        if(registerDiamond)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiamond");
            Item itemBlockMetaDiamond = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaDiamond,location.toString(),"Assemble");
        }
        if(registerEmerald)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaEmerald");
            Item itemBlockMetaEmerald = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaEmerald,location.toString(),"Assemble");
        }
        if(registerRedstone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaRedstone");
            Item itemBlockMetaRedstone = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaRedstone,location.toString(),"Assemble");
        }
        if(registerLapis)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaLapis");
            Item itemBlockMetaLapis = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaLapis,location.toString(),"Assemble");
        }
        if(registerCoal)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCoal");
            Item itemBlockMetaCoal = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaCoal,location.toString(),"Assemble");
        }
        if(registerAndesite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaAndesite");
            Item itemBlockMetaAndesite = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaAndesite,location.toString(),"Assemble");
        }
        if(registerDiorite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiorite");
            Item itemBlockMetaDiorite = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaDiorite,location.toString(),"Assemble");
        }
        if(registerGranite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGranite");
            Item itemBlockMetaGranite = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaGranite,location.toString(),"Assemble");
        }
        if(registerCobblestone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCobble");
            Item itemBlockMetaCobble = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaCobble,location.toString(),"Assemble");
        }
        if(registerQuartz)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaQuartz");
            Item itemBlockMetaQuartz = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaQuartz,location.toString(),"Assemble");
        }
        if(registerDirt)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDirt");
            Item itemBlockMetaDirt = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaDirt,location.toString(),"Assemble");
        }
        if(registerSand)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaSand");
            Item itemBlockMetaSand = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaSand,location.toString(),"Assemble");
        }
        if(registerGravel)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGravel");
            Item itemBlockMetaGravel = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaGravel,location.toString(),"Assemble");
        }
        if(registerClay)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaClay");
            Item itemBlockMetaClay = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaClay,location.toString(),"Assemble");
        }
    }
    public static void initClient()
    {
        if(registerGold)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGold");
            Item itemBlockMetaGold = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaGold,location.toString(),"Bake");
        }
        if(registerIron)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaIron");
            Item itemBlockMetaIron = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaIron,location.toString(),"Bake");
        }
        if(registerDiamond)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiamond");
            Item itemBlockMetaDiamond = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaDiamond,location.toString(),"Bake");
        }
        if(registerEmerald)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaEmerald");
            Item itemBlockMetaEmerald = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaEmerald,location.toString(),"Bake");
        }
        if(registerRedstone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaRedstone");
            Item itemBlockMetaRedstone = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaRedstone,location.toString(),"Bake");
        }
        if(registerLapis)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaLapis");
            Item itemBlockMetaLapis = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaLapis,location.toString(),"Bake");
        }
        if(registerCoal)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCoal");
            Item itemBlockMetaCoal = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaCoal,location.toString(),"Bake");
        }
        if(registerAndesite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaAndesite");
            Item itemBlockMetaAndesite = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaAndesite,location.toString(),"Bake");
        }
        if(registerDiorite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiorite");
            Item itemBlockMetaDiorite = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaDiorite,location.toString(),"Bake");
        }
        if(registerGranite)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGranite");
            Item itemBlockMetaGranite = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaGranite,location.toString(),"Bake");
        }
        if(registerCobblestone)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCobble");
            Item itemBlockMetaCobble = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaCobble,location.toString(),"Bake");
        }
        if(registerQuartz)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaQuartz");
            Item itemBlockMetaQuartz = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaQuartz,location.toString(),"Bake");
        }
        if(registerDirt)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDirt");
            Item itemBlockMetaDirt = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaDirt,location.toString(),"Bake");
        }

        if(registerSand)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaSand");
            Item itemBlockMetaSand = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaSand,location.toString(),"Bake");
        }
        if(registerGravel)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGravel");
            Item itemBlockMetaGravel = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaGravel,location.toString(),"Bake");
        }
        if(registerClay)
        {
            ResourceLocation location = new ResourceLocation("compressedores:blockMetaClay");
            Item itemBlockMetaClay = Item.REGISTRY.get(location);
            assembleModels(itemBlockMetaClay,location.toString(),"Bake");
        }
    }
    public static void initOreDict(Block blockIn, String name)
    {
        for(int i = 0; i < 8; i++)
        {
            ItemStack stack = new ItemStack(blockIn,1,i);
            OreDictionary.registerOre(name + EnumLevel.byMetadata(i).getUnlocalizedName(),stack);
        }
    }
    public static void assembleModels(Item item , String resource, String mode)
    {
        ModelResourceLocation location;
        for(int i = 0; i < 8; i++)
        {
            location = new ModelResourceLocation(resource + "." + EnumLevel.byMetadata(i).getUnlocalizedName(), "inventory");
            if(mode == "Assemble")
            {
                ModelBakery.registerItemVariants(item, location);
            }
            else if(mode == "Bake")
            {
                Minecraft.getInstance().getItemRenderer().getItemModelMesher().func_178086_a(item,i,location);
            }
        }
    }
    public static void createRegistry(Block block, ItemBlock itemBlock, String name)
    {
        block.setRegistryName("compressedores",name);
        createRegistry(itemBlock,block.getRegistryName().toString());
    }
    public static void createRegistry(ItemBlock itemBlock, String name)
    {
        itemBlock.setRegistryName(name);
    }
}

package com.tylerh.compressedores.Init;import com.tylerh.compressedores.Blocks.*;import com.tylerh.compressedores.Items.*;import com.tylerh.compressedores.Util.EnumLevel;import net.minecraft.block.Block;import net.minecraft.block.material.Material;import net.minecraft.client.Minecraft;import net.minecraft.client.resources.model.ModelBakery;import net.minecraft.client.resources.model.ModelResourceLocation;import net.minecraft.item.Item;import net.minecraft.item.ItemStack;import net.minecraft.util.ResourceLocation;import net.minecraftforge.fml.common.registry.GameRegistry;import net.minecraftforge.oredict.OreDictionary;public class ModBlocks{    public static boolean registerGold;    public static boolean registerIron;    public static boolean registerDiamond;    public static boolean registerEmerald;    public static boolean registerRedstone;    public static boolean registerLapis;    public static boolean registerQuartz;    public static boolean registerCoal;    public static boolean registerAndesite;    public static boolean registerDiorite;    public static boolean registerGranite;    public static boolean registerCobblestone;    //Blocks    public static Block blockMetaGold;    public static Block blockMetaIron;    public static Block blockMetaDiamond;    public static Block blockMetaEmerald;    public static Block blockMetaRedstone;    public static Block blockMetaLapis;    public static Block blockMetaCoal;    public static Block blockMetaAndesite;    public static Block blockMetaDiorite;    public static Block blockMetaGranite;    public static Block blockMetaCobble;    public static Block blockMetaQuartz;    public static void preInitCommon()    {        if(registerGold)        {            blockMetaGold = new BlockMetaCompressedOre(Material.iron,3.0f,5.0f,"blockMetaGold",false);            GameRegistry.registerBlock(blockMetaGold,ItemBlockMetaCompressedOre.class,"blockMetaGold");            initOreDict(blockMetaGold,"blockGold");        }        if(registerIron)        {            blockMetaIron = new BlockMetaCompressedOre(Material.iron,3.0f,5.0f,"blockMetaIron",false);            GameRegistry.registerBlock(blockMetaIron,ItemBlockMetaCompressedOre.class,"blockMetaIron");            initOreDict(blockMetaIron,"blockIron");        }        if(registerDiamond)        {            blockMetaDiamond = new BlockMetaCompressedOre(Material.iron,3.0f,5.0f,"blockMetaDiamond",false);            GameRegistry.registerBlock(blockMetaDiamond,ItemBlockMetaCompressedOre.class,"blockMetaDiamond");            initOreDict(blockMetaDiamond,"blockDiamond");        }        if(registerEmerald)        {            blockMetaEmerald = new BlockMetaCompressedOre(Material.iron,3.0f,5.0f,"blockMetaEmerald",false);            GameRegistry.registerBlock(blockMetaEmerald,ItemBlockMetaCompressedOre.class,"blockMetaEmerald");            initOreDict(blockMetaEmerald,"blockEmerald");        }        if(registerRedstone)        {            blockMetaRedstone = new BlockMetaCompressedOre(Material.iron,3.0f,5.0f,"blockMetaRedstone",true);            GameRegistry.registerBlock(blockMetaRedstone,ItemBlockMetaCompressedOre.class,"blockMetaRedstone");            initOreDict(blockMetaRedstone,"blockRedstone");        }        if(registerLapis)        {            blockMetaLapis = new BlockMetaCompressedOre(Material.iron,3.0f,5.0f,"blockMetaLapis",false);            GameRegistry.registerBlock(blockMetaLapis,ItemBlockMetaCompressedOre.class,"blockMetaLapis");            initOreDict(blockMetaLapis,"blockLapis");        }        if(registerCoal)        {            blockMetaCoal = new BlockMetaCompressedOre(Material.rock,3.0f,5.0f,"blockMetaCoal",false);            GameRegistry.registerBlock(blockMetaCoal,ItemBlockMetaCompressedOre.class,"blockMetaCoal");            initOreDict(blockMetaCoal,"blockCoal");        }        if(registerAndesite)        {            blockMetaAndesite = new BlockMetaCompressedOre(Material.rock,3.0f,5.0f,"blockMetaAndesite",false);            GameRegistry.registerBlock(blockMetaAndesite,ItemBlockMetaCompressedOre.class,"blockMetaAndesite");            initOreDict(blockMetaAndesite,"blockAndesite");        }        if(registerDiorite)        {            blockMetaDiorite = new BlockMetaCompressedOre(Material.rock,3.0f,5.0f,"blockMetaDiorite",false);            GameRegistry.registerBlock(blockMetaDiorite,ItemBlockMetaCompressedOre.class,"blockMetaDiorite");            initOreDict(blockMetaDiorite,"blockDiorite");        }        if(registerGranite)        {            blockMetaGranite = new BlockMetaCompressedOre(Material.rock,3.0f,5.0f,"blockMetaGranite",false);            GameRegistry.registerBlock(blockMetaGranite,ItemBlockMetaCompressedOre.class,"blockMetaGranite");            initOreDict(blockMetaGranite,"blockGranite");        }        if(registerCobblestone)        {            blockMetaCobble = new BlockMetaCompressedOre(Material.rock,3.0f,5.0f,"blockMetaCobble",false);            GameRegistry.registerBlock(blockMetaCobble,ItemBlockMetaCompressedOre.class,"blockMetaCobble");            initOreDict(blockMetaCobble,"blockCobble");        }        if(registerQuartz)        {            blockMetaQuartz = new BlockMetaCompressedOre(Material.rock,3.0f,5.0f,"blockMetaQuartz",false);            GameRegistry.registerBlock(blockMetaQuartz,ItemBlockMetaCompressedOre.class,"blockMetaQuartz");            initOreDict(blockMetaQuartz,"blockQuartz");        }    }    public static void preInitClient()    {        if(registerGold)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGold");            Item itemBlockMetaGold = GameRegistry.findItem("compressedores","blockMetaGold");            getModels(itemBlockMetaGold,location.toString());        }        if(registerIron)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaIron");            Item itemBlockMetaIron = GameRegistry.findItem("compressedores","blockMetaIron");            getModels(itemBlockMetaIron,location.toString());        }        if(registerDiamond)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiamond");            Item itemBlockMetaDiamond = GameRegistry.findItem("compressedores","blockMetaDiamond");            getModels(itemBlockMetaDiamond,location.toString());        }        if(registerEmerald)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaEmerald");            Item itemBlockMetaEmerald = GameRegistry.findItem("compressedores","blockMetaEmerald");            getModels(itemBlockMetaEmerald,location.toString());        }        if(registerRedstone)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaRedstone");            Item itemBlockMetaRedstone = GameRegistry.findItem("compressedores","blockMetaRedstone");            getModels(itemBlockMetaRedstone,location.toString());        }        if(registerLapis)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaLapis");            Item itemBlockMetaLapis = GameRegistry.findItem("compressedores","blockMetaLapis");            getModels(itemBlockMetaLapis,location.toString());        }        if(registerCoal)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCoal");            Item itemBlockMetaCoal = GameRegistry.findItem("compressedores","blockMetaCoal");            getModels(itemBlockMetaCoal,location.toString());        }        if(registerAndesite)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaAndesite");            Item itemBlockMetaAndesite = GameRegistry.findItem("compressedores","blockMetaAndesite");            getModels(itemBlockMetaAndesite,location.toString());        }        if(registerDiorite)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiorite");            Item itemBlockMetaDiorite = GameRegistry.findItem("compressedores","blockMetaDiorite");            getModels(itemBlockMetaDiorite,location.toString());        }        if(registerGranite)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGranite");            Item itemBlockMetaGranite = GameRegistry.findItem("compressedores","blockMetaGranite");            getModels(itemBlockMetaGranite,location.toString());        }        if(registerCobblestone)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCobble");            Item itemBlockMetaCobble = GameRegistry.findItem("compressedores","blockMetaCobble");            getModels(itemBlockMetaCobble,location.toString());        }        if(registerQuartz)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaQuartz");            Item itemBlockMetaQuartz = GameRegistry.findItem("compressedores","blockMetaQuartz");            getModels(itemBlockMetaQuartz, location.toString());        }    }    public static void initClient()    {        if(registerGold)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGold");            Item itemBlockMetaGold = GameRegistry.findItem("compressedores","blockMetaGold");            bakeModels(itemBlockMetaGold,location.toString());        }        if(registerIron)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaIron");            Item itemBlockMetaIron = GameRegistry.findItem("compressedores","blockMetaIron");            bakeModels(itemBlockMetaIron,location.toString());        }        if(registerDiamond)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiamond");            Item itemBlockMetaDiamond = GameRegistry.findItem("compressedores","blockMetaDiamond");            bakeModels(itemBlockMetaDiamond,location.toString());        }        if(registerEmerald)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaEmerald");            Item itemBlockMetaEmerald = GameRegistry.findItem("compressedores","blockMetaEmerald");            bakeModels(itemBlockMetaEmerald,location.toString());        }        if(registerRedstone)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaRedstone");            Item itemBlockMetaRedstone = GameRegistry.findItem("compressedores","blockMetaRedstone");            bakeModels(itemBlockMetaRedstone,location.toString());        }        if(registerLapis)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaLapis");            Item itemBlockMetaLapis = GameRegistry.findItem("compressedores","blockMetaLapis");            bakeModels(itemBlockMetaLapis,location.toString());        }        if(registerCoal)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCoal");            Item itemBlockMetaCoal = GameRegistry.findItem("compressedores","blockMetaCoal");            bakeModels(itemBlockMetaCoal,location.toString());        }        if(registerAndesite)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaAndesite");            Item itemBlockMetaAndesite = GameRegistry.findItem("compressedores","blockMetaAndesite");            bakeModels(itemBlockMetaAndesite,location.toString());        }        if(registerDiorite)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaDiorite");            Item itemBlockMetaDiorite = GameRegistry.findItem("compressedores","blockMetaDiorite");            bakeModels(itemBlockMetaDiorite,location.toString());        }        if(registerGranite)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaGranite");            Item itemBlockMetaGranite = GameRegistry.findItem("compressedores","blockMetaGranite");            bakeModels(itemBlockMetaGranite,location.toString());        }        if(registerCobblestone)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaCobble");            Item itemBlockMetaCobble = GameRegistry.findItem("compressedores","blockMetaCobble");            bakeModels(itemBlockMetaCobble,location.toString());        }        if(registerQuartz)        {            ResourceLocation location = new ResourceLocation("compressedores:blockMetaQuartz");            Item itemBlockMetaQuartz = GameRegistry.findItem("compressedores","blockMetaQuartz");            bakeModels(itemBlockMetaQuartz,location.toString());        }    }    public static void initOreDict(Block blockIn, String name)    {        for(int i = 0; i < 8; i++)        {            ItemStack stack = new ItemStack(blockIn,1,i);            OreDictionary.registerOre(name + EnumLevel.byMetadata(i).getUnlocalizedName(),stack);        }    }    public static void getModels(Item item, String resource)    {        ModelResourceLocation location;        for (int i = 0; i < 8; i++)        {            location = new ModelResourceLocation(resource + "." + EnumLevel.byMetadata(i).getUnlocalizedName(),"inventory");            ModelBakery.registerItemVariants(item,location);        }    }    public static void bakeModels(Item item, String resource)    {        ModelResourceLocation location;        for(int i = 0; i < 8; i++)        {            location = new ModelResourceLocation(resource + "." + EnumLevel.byMetadata(i).getUnlocalizedName(),"inventory");            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,i,location);        }    }}
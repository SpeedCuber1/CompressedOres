package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.*;
import com.tylerh.compressedores.Items.*;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static boolean registerGold;
    public static boolean registerIron;
    public static boolean registerDiamond;
    public static boolean registerEmerald;
    public static boolean registerRedstone;
    public static boolean registerLapis;
    public static boolean registerQuartz;
    public static boolean registerCoal;
    public static boolean registerAndesite;
    public static boolean registerDiorite;
    public static boolean registerGranite;
    public static boolean registerCobblestone;

    public static BlockMetaGold blockMetaGold;
    public static BlockMetaIron blockMetaIron;
    public static BlockMetaDiamond blockMetaDiamond;
    public static BlockMetaEmerald blockMetaEmerald;
    public static BlockMetaRedstone blockMetaRedstone;
    public static BlockMetaLapis blockMetaLapis;
    public static BlockMetaCoal blockMetaCoal;
    public static BlockMetaAndesite blockMetaAndesite;
    public static BlockMetaDiorite blockMetaDiorite;
    public static BlockMetaGranite blockMetaGranite;
    public static BlockMetaCobble blockMetaCobble;


    public static void preInitCommon()
    {
        if(registerGold)
        {
            blockMetaGold = (BlockMetaGold)(new BlockMetaGold().setUnlocalizedName("blockMetaGold"));
            GameRegistry.registerBlock(blockMetaGold, ItemBlockMetaGold.class, "blockMetaGold");
        }
        if(registerIron)
        {
            blockMetaIron = (BlockMetaIron)(new BlockMetaIron().setUnlocalizedName("blockMetaIron"));
            GameRegistry.registerBlock(blockMetaIron, ItemBlockMetaIron.class, "blockMetaIron");
        }
        if(registerDiamond)
        {
            blockMetaDiamond = (BlockMetaDiamond)(new BlockMetaDiamond().setUnlocalizedName("blockMetaDiamond"));
            GameRegistry.registerBlock(blockMetaDiamond, ItemBlockMetaDiamond.class, "blockMetaDiamond");
        }
        if(registerEmerald)
        {
            blockMetaEmerald = (BlockMetaEmerald)(new BlockMetaEmerald().setUnlocalizedName("blockMetaEmerald"));
            GameRegistry.registerBlock(blockMetaEmerald, ItemBlockMetaEmerald.class, "blockMetaEmerald");
        }
        if(registerRedstone)
        {
            blockMetaRedstone = (BlockMetaRedstone)(new BlockMetaRedstone().setUnlocalizedName("blockMetaRedstone"));
            GameRegistry.registerBlock(blockMetaRedstone, ItemBlockMetaRedstone.class, "blockMetaRedstone");
        }
        if(registerLapis)
        {
            blockMetaLapis = (BlockMetaLapis)(new BlockMetaLapis().setUnlocalizedName("blockMetaLapis"));
            GameRegistry.registerBlock(blockMetaLapis, ItemBlockMetaLapis.class, "blockMetaLapis");
        }
        if(registerCoal)
        {
            blockMetaCoal = (BlockMetaCoal) (new BlockMetaCoal().setUnlocalizedName("blockMetaCoal"));
            GameRegistry.registerBlock(blockMetaCoal, ItemBlockMetaCoal.class, "blockMetaCoal");
        }
        if(registerAndesite)
        {
            blockMetaAndesite = (BlockMetaAndesite) (new BlockMetaAndesite().setUnlocalizedName("blockMetaAndesite"));
            GameRegistry.registerBlock(blockMetaAndesite, ItemBlockMetaAndesite.class, "blockMetaAndesite");
        }
        if(registerDiorite)
        {
            blockMetaDiorite = (BlockMetaDiorite) (new BlockMetaDiorite().setUnlocalizedName("blockMetaDiorite"));
            GameRegistry.registerBlock(blockMetaDiorite, ItemBlockMetaDiorite.class, "blockMetaDiorite");
        }
        if(registerGranite)
        {
            blockMetaGranite = (BlockMetaGranite) (new BlockMetaGranite().setUnlocalizedName("blockMetaGranite"));
            GameRegistry.registerBlock(blockMetaGranite, ItemBlockMetaGranite.class, "blockMetaGranite");
        }
        if(registerCobblestone)
        {
            blockMetaCobble = (BlockMetaCobble) (new BlockMetaCobble().setUnlocalizedName("blockMetaCobble"));
            GameRegistry.registerBlock(blockMetaCobble, ItemBlockMetaCobble.class, "blockMetaCobble");
        }
    }

    public static void preInitClient()
    {
        if(registerGold)
        {
            Item itemBlockMetaGold = GameRegistry.findItem("compressedores", "blockMetaGold");
            ModelBakery.addVariantName(itemBlockMetaGold, "compressedores:blockMetaGold.Compressed",
                    "compressedores:blockMetaGold.Double",
                    "compressedores:blockMetaGold.Triple",
                    "compressedores:blockMetaGold.Quadruple",
                    "compressedores:blockMetaGold.Quintuple",
                    "compressedores:blockMetaGold.Sextuple",
                    "compressedores:blockMetaGold.Septuple",
                    "compressedores:blockMetaGold.Octuple");
        }
        if(registerIron)
        {
            Item itemBlockMetaIron = GameRegistry.findItem("compressedores", "blockMetaIron");
            ModelBakery.addVariantName(itemBlockMetaIron, "compressedores:blockMetaIron.Compressed",
                    "compressedores:blockMetaIron.Double",
                    "compressedores:blockMetaIron.Triple",
                    "compressedores:blockMetaIron.Quadruple",
                    "compressedores:blockMetaIron.Quintuple",
                    "compressedores:blockMetaIron.Sextuple",
                    "compressedores:blockMetaIron.Septuple",
                    "compressedores:blockMetaIron.Octuple");
        }
        if(registerDiamond)
        {
            Item itemBlockMetaDiamond = GameRegistry.findItem("compressedores", "blockMetaDiamond");
            ModelBakery.addVariantName(itemBlockMetaDiamond, "compressedores:blockMetaDiamond.Compressed",
                    "compressedores:blockMetaDiamond.Double",
                    "compressedores:blockMetaDiamond.Triple",
                    "compressedores:blockMetaDiamond.Quadruple",
                    "compressedores:blockMetaDiamond.Quintuple",
                    "compressedores:blockMetaDiamond.Sextuple",
                    "compressedores:blockMetaDiamond.Septuple",
                    "compressedores:blockMetaDiamond.Octuple");
        }
        if(registerEmerald)
        {
            Item itemBlockMetaEmerald = GameRegistry.findItem("compressedores", "blockMetaEmerald");
            ModelBakery.addVariantName(itemBlockMetaEmerald, "compressedores:blockMetaEmerald.Compressed",
                    "compressedores:blockMetaEmerald.Double",
                    "compressedores:blockMetaEmerald.Triple",
                    "compressedores:blockMetaEmerald.Quadruple",
                    "compressedores:blockMetaEmerald.Quintuple",
                    "compressedores:blockMetaEmerald.Sextuple",
                    "compressedores:blockMetaEmerald.Septuple",
                    "compressedores:blockMetaEmerald.Octuple");
        }
        if(registerRedstone)
        {
            Item itemBlockMetaRedstone = GameRegistry.findItem("compressedores", "blockMetaRedstone");
            ModelBakery.addVariantName(itemBlockMetaRedstone, "compressedores:blockMetaRedstone.Compressed",
                    "compressedores:blockMetaRedstone.Double",
                    "compressedores:blockMetaRedstone.Triple",
                    "compressedores:blockMetaRedstone.Quadruple",
                    "compressedores:blockMetaRedstone.Quintuple",
                    "compressedores:blockMetaRedstone.Sextuple",
                    "compressedores:blockMetaRedstone.Septuple",
                    "compressedores:blockMetaRedstone.Octuple");
        }
        if(registerLapis)
        {
            Item itemBlockMetaLapis = GameRegistry.findItem("compressedores", "blockMetaLapis");
            ModelBakery.addVariantName(itemBlockMetaLapis, "compressedores:blockMetaLapis.Compressed",
                    "compressedores:blockMetaLapis.Double",
                    "compressedores:blockMetaLapis.Triple",
                    "compressedores:blockMetaLapis.Quadruple",
                    "compressedores:blockMetaLapis.Quintuple",
                    "compressedores:blockMetaLapis.Sextuple",
                    "compressedores:blockMetaLapis.Septuple",
                    "compressedores:blockMetaLapis.Octuple");
        }
        if(registerCoal)
        {
            Item itemBlockMetaCoal = GameRegistry.findItem("compressedores", "blockMetaCoal");
            ModelBakery.addVariantName(itemBlockMetaCoal, "compressedores:blockMetaCoal.Compressed",
                    "compressedores:blockMetaCoal.Double",
                    "compressedores:blockMetaCoal.Triple",
                    "compressedores:blockMetaCoal.Quadruple",
                    "compressedores:blockMetaCoal.Quintuple",
                    "compressedores:blockMetaCoal.Sextuple",
                    "compressedores:blockMetaCoal.Septuple",
                    "compressedores:blockMetaCoal.Octuple");
        }
        if(registerAndesite)
        {
            Item itemBlockMetaAndesite = GameRegistry.findItem("compressedores", "blockMetaAndesite");
            ModelBakery.addVariantName(itemBlockMetaAndesite, "compressedores:blockMetaAndesite.Compressed",
                    "compressedores:blockMetaAndesite.Double",
                    "compressedores:blockMetaAndesite.Triple",
                    "compressedores:blockMetaAndesite.Quadruple",
                    "compressedores:blockMetaAndesite.Quintuple",
                    "compressedores:blockMetaAndesite.Sextuple",
                    "compressedores:blockMetaAndesite.Septuple",
                    "compressedores:blockMetaAndesite.Octuple");
        }
        if(registerDiorite)
        {
            Item itemBlockMetaDiorite = GameRegistry.findItem("compressedores", "blockMetaDiorite");
            ModelBakery.addVariantName(itemBlockMetaDiorite, "compressedores:blockMetaDiorite.Compressed",
                    "compressedores:blockMetaDiorite.Double",
                    "compressedores:blockMetaDiorite.Triple",
                    "compressedores:blockMetaDiorite.Quadruple",
                    "compressedores:blockMetaDiorite.Quintuple",
                    "compressedores:blockMetaDiorite.Sextuple",
                    "compressedores:blockMetaDiorite.Septuple",
                    "compressedores:blockMetaDiorite.Octuple");
        }
        if(registerGranite)
        {
            Item itemBlockMetaGranite = GameRegistry.findItem("compressedores", "blockMetaGranite");
            ModelBakery.addVariantName(itemBlockMetaGranite, "compressedores:blockMetaGranite.Compressed",
                    "compressedores:blockMetaGranite.Double",
                    "compressedores:blockMetaGranite.Triple",
                    "compressedores:blockMetaGranite.Quadruple",
                    "compressedores:blockMetaGranite.Quintuple",
                    "compressedores:blockMetaGranite.Sextuple",
                    "compressedores:blockMetaGranite.Septuple",
                    "compressedores:blockMetaGranite.Octuple");
        }
        if(registerCobblestone)
        {
            Item itemBlockMetaCobble = GameRegistry.findItem("compressedores", "blockMetaCobble");
            ModelBakery.addVariantName(itemBlockMetaCobble, "compressedores:blockMetaCobble.Compressed",
                    "compressedores:blockMetaCobble.Double",
                    "compressedores:blockMetaCobble.Triple",
                    "compressedores:blockMetaCobble.Quadruple",
                    "compressedores:blockMetaCobble.Quintuple",
                    "compressedores:blockMetaCobble.Sextuple",
                    "compressedores:blockMetaCobble.Septuple",
                    "compressedores:blockMetaCobble.Octuple");
        }
    }
    public static void initClient()
    {
        if(registerGold)
        {
            Item itemBlockMetaGold = GameRegistry.findItem("compressedores", "blockMetaGold");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaGold.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerIron)
        {
            Item itemBlockMetaIron = GameRegistry.findItem("compressedores", "blockMetaIron");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaIron.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaIron.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaIron, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerDiamond)
        {
            Item itemBlockMetaDiamond = GameRegistry.findItem("compressedores", "blockMetaDiamond");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaDiamond.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiamond.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiamond, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerEmerald)
        {
            Item itemBlockMetaEmerald = GameRegistry.findItem("compressedores", "blockMetaEmerald");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaEmerald.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaEmerald.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaEmerald, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerRedstone)
        {
            Item itemBlockMetaRedstone = GameRegistry.findItem("compressedores", "blockMetaRedstone");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaRedstone.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaRedstone.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaRedstone, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerLapis)
        {
            Item itemBlockMetaLapis = GameRegistry.findItem("compressedores", "blockMetaLapis");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaLapis.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaLapis.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaLapis, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerCoal)
        {
            Item itemBlockMetaCoal = GameRegistry.findItem("compressedores", "blockMetaCoal");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaCoal.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCoal.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCoal, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerAndesite)
        {
            Item itemBlockMetaAndesite = GameRegistry.findItem("compressedores", "blockMetaAndesite");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaAndesite.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaAndesite.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaAndesite, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerDiorite)
        {
            Item itemBlockMetaDiorite = GameRegistry.findItem("compressedores", "blockMetaDiorite");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaDiorite.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaDiorite.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaDiorite, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerGranite)
        {
            Item itemBlockMetaGranite = GameRegistry.findItem("compressedores", "blockMetaGranite");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaGranite.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGranite.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGranite, EnumLevel.OCTUPLE.getMetadata(), location);
        }
        if(registerCobblestone)
        {
            Item itemBlockMetaCobble = GameRegistry.findItem("compressedores", "blockMetaCobble");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaCobble.Compressed", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.COMPRESSED.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.DOUBLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.TRIPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.QUADRUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.QUINTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.SEXTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.SEPTUPLE.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaCobble.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaCobble, EnumLevel.OCTUPLE.getMetadata(), location);
        }
    }
}

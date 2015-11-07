package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Blocks.BlockMetaGold;
import com.tylerh.compressedores.Items.ItemBlockMetaGold;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tyler on 11/6/2015.
 */
public class ModBlocks
{
    public static boolean registerGold;
    
    public static BlockMetaGold blockMetaGold;
    
    public static void preInitCommon()
    {
        if(registerGold)
        {
            blockMetaGold = (BlockMetaGold) new BlockMetaGold().setUnlocalizedName("blockMetaGold");
            GameRegistry.registerBlock(blockMetaGold, ItemBlockMetaGold.class, "blockMetaGold");
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
                    "compressedores:blockMetaGold.Seuptuple",
                    "compressedores:blcokMetaGold.Octuple");
        }
    }
    
    public static void initClient()
    {
        if(registerGold)
        {
            Item itemBlockMetaGold = GameRegistry.findItem("compressedores", "blockMetaGold");
            ModelResourceLocation location = new ModelResourceLocation("compressedores:blockMetaGold.Compressed","inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Compressed.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Double", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Double.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Triple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Triple.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Quadruple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Quadruple.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Quintuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Quintuple.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Sextuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Sextuple.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Septuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Septuple.getMetadata(), location);
            location = new ModelResourceLocation("compressedores:blockMetaGold.Octuple", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockMetaGold, EnumLevel.Octuple.getMetadata(), location);
        }
    }
}

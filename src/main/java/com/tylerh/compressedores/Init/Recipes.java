package com.tylerh.compressedores.Init;

import com.google.gson.JsonObject;
import com.tylerh.compressedores.Util.EnumLevel;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class Recipes
{
    public static void init()
    {
        String location;
        if(ModBlocks.registerGold)
        {
            location = ModInfo.MOD_ID + ":blockmetagold";
            //Compressing
            registerHelper(location,"Compress");
            //Decompressing
            registerHelper(location, "Decompress");

        }
        if(ModBlocks.registerIron)
        {
            location = ModInfo.MOD_ID + ":blockmetairon";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(ModBlocks.registerDiamond)
        {
            location = ModInfo.MOD_ID + ":blockmetadiamond";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(ModBlocks.registerEmerald)
        {
            location = ModInfo.MOD_ID + ":blockmetaemerald";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(ModBlocks.registerRedstone)
        {
            location = ModInfo.MOD_ID + ":blockmetaredstone";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
        }
        if(ModBlocks.registerLapis)
        {
            location = ModInfo.MOD_ID + ":blockmetalapis";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
        }
        if(ModBlocks.registerQuartz)
        {
            location = ModInfo.MOD_ID + ":blockmetaquartz";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
        }
        if(ModBlocks.registerCoal)
        {
            location = ModInfo.MOD_ID + ":blockmetacoal";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
        }
        if(ModBlocks.registerAndesite)
        {
            location = ModInfo.MOD_ID + ":blockmetaandesite";
            //Compressing
            registerHelper(location, "Compress");
        }
        if(ModBlocks.registerDiorite)
        {
        }
        if(ModBlocks.registerGranite)
        {
        }
        if(ModBlocks.registerCobblestone)
        {
        }
        if(ModBlocks.registerDirt)
        {
        }
        if(ModBlocks.registerSand)
        {
        }
        if(ModBlocks.registerGravel)
        {
        }
        if(ModBlocks.registerClay)
        {
        }
    }
    private static void registerHelper(String resource, String mode)
    {
        ResourceLocation resourceLocation;
        for(int i = 0; i < 8; i++)
        {
            if(mode == "Compress")
            {
                if (i == 0)
                {
                    resourceLocation = new ResourceLocation(resource + "." + EnumLevel.byMetadata(i).getName() + ".json");
                }
                else
                {
                    resourceLocation = new ResourceLocation(resource + "." + EnumLevel.byMetadata(i).getName() + "compressed.json");
                }
                CraftingHelper.register(resourceLocation, new IRecipeFactory()
                {
                    @Override
                    public IRecipe parse(JsonContext context, JsonObject json)
                    {
                        return CraftingHelper.getRecipe(json, context);
                    }
                });
            }
            else if(mode == "Decompress")
            {
                if (i == 0)
                {
                    resourceLocation = new ResourceLocation(resource + ".decompressed.json");
                }
                else
                {
                    resourceLocation = new ResourceLocation(resource + "." + EnumLevel.byMetadata(i).getName() + "decompressed.json");
                }
                CraftingHelper.register(resourceLocation, new IRecipeFactory()
                {
                    @Override
                    public IRecipe parse(JsonContext context, JsonObject json)
                    {
                        return CraftingHelper.getRecipe(json, context);
                    }
                });
            }
        }
    }
}

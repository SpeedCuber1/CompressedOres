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
        if(InitBlocks.registerGold)
        {
            location = ModInfo.MOD_ID + ":blockgold";
            //Compressing
            registerHelper(location,"Compress");
            //Decompressing
            registerHelper(location, "Decompress");

        }
        if(InitBlocks.registerIron)
        {
            location = ModInfo.MOD_ID + ":blockiron";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerDiamond)
        {
            location = ModInfo.MOD_ID + ":blockdiamond";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerEmerald)
        {
            location = ModInfo.MOD_ID + ":blockemerald";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerRedstone)
        {
            location = ModInfo.MOD_ID + ":blockredstone";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerLapis)
        {
            location = ModInfo.MOD_ID + ":blocklapis";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerQuartz)
        {
            location = ModInfo.MOD_ID + ":blockquartz";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerCoal)
        {
            location = ModInfo.MOD_ID + ":blockcoal";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerAndesite)
        {
            location = ModInfo.MOD_ID + ":blockandesite";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerDiorite)
        {
            location = ModInfo.MOD_ID + ":blockdiorite";
            //Compressing
            registerHelper(location, "Compress");
            //Decompress
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerGranite)
        {
            location = ModInfo.MOD_ID + ":blockgranite";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerCobblestone)
        {
            location = ModInfo.MOD_ID + ":blockcobble";
            //Compressing
            registerHelper(location, "Compress");
        }
        if(InitBlocks.registerDirt)
        {
            location = ModInfo.MOD_ID + ":blockdirt";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerSand)
        {
            location = ModInfo.MOD_ID + ":blocksand";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerGravel)
        {
            location = ModInfo.MOD_ID + ":blockgravel";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
        }
        if(InitBlocks.registerClay)
        {
            location = ModInfo.MOD_ID + ":blockclay";
            //Compressing
            registerHelper(location, "Compress");
            //Decompressing
            registerHelper(location, "Decompress");
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

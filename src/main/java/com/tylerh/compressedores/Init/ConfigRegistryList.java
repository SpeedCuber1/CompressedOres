package com.tylerh.compressedores.Init;

import com.tylerh.compressedores.Util.ModInfo;
import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigRegistryList
{
    public static ForgeConfigSpec.BooleanValue registerAmethyst;
    public static ForgeConfigSpec.BooleanValue registerAndesite;
    public static ForgeConfigSpec.BooleanValue registerBasalt;
    public static ForgeConfigSpec.BooleanValue registerBlackstone;
    public static ForgeConfigSpec.BooleanValue registerCalcite;
    public static ForgeConfigSpec.BooleanValue registerClay;
    public static ForgeConfigSpec.BooleanValue registerCoal;
    public static ForgeConfigSpec.BooleanValue registerCobble;
    public static ForgeConfigSpec.BooleanValue registerDeepslate;
    public static ForgeConfigSpec.BooleanValue registerDiamond;
    public static ForgeConfigSpec.BooleanValue registerDiorite;
    public static ForgeConfigSpec.BooleanValue registerDirt;
    public static ForgeConfigSpec.BooleanValue registerEmerald;
    public static ForgeConfigSpec.BooleanValue registerEndStone;
    public static ForgeConfigSpec.BooleanValue registerGold;
    public static ForgeConfigSpec.BooleanValue registerGranite;
    public static ForgeConfigSpec.BooleanValue registerGravel;
    public static ForgeConfigSpec.BooleanValue registerIron;
    public static ForgeConfigSpec.BooleanValue registerLapis;
    public static ForgeConfigSpec.BooleanValue registerNetherrack;
    public static ForgeConfigSpec.BooleanValue registerQuartz;
    public static ForgeConfigSpec.BooleanValue registerRedstone;
    public static ForgeConfigSpec.BooleanValue registerSand;
    public static ForgeConfigSpec.BooleanValue registerTuff;
    public static void initConfig(ForgeConfigSpec.Builder builder)
    {
        registerAmethyst = builder.comment("Enable/Disable Amethyst Compression").define("Amethyst",ModInfo.GUI_DEFAULT);
        registerAndesite = builder.comment("Enable/Disable Andesite Compression").define("Andesite",ModInfo.GUI_DEFAULT);
        registerBasalt = builder.comment("Enable/Disable Basalt Compression").define("Basalt",ModInfo.GUI_DEFAULT);
        registerBlackstone = builder.comment("Enable/Disable Blackstone Compression").define("Blackstone",ModInfo.GUI_DEFAULT);
        registerCalcite = builder.comment("Enable/Disable Calcite Compression").define("Calcite",ModInfo.GUI_DEFAULT);
        registerClay = builder.comment("Enable/Disable Clay Compression").define("Clay",ModInfo.GUI_DEFAULT);
        registerCoal = builder.comment("Enable/Disable Coal Compression").define("Coal",ModInfo.GUI_DEFAULT);
        registerCobble = builder.comment("Enable/Disable Cobblestone Compression").define("Cobblestone",ModInfo.GUI_DEFAULT);
        registerDeepslate = builder.comment("Enable/Disable Cobbled Deepslate Compression").define("Deepslate",ModInfo.GUI_DEFAULT);
        registerDiamond = builder.comment("Enable/Disable Diamond Compression").define("Diamond",ModInfo.GUI_DEFAULT);
        registerDiorite = builder.comment("Enable/Disable Diorite Compression").define("Diorite",ModInfo.GUI_DEFAULT);
        registerDirt = builder.comment("Enable/Disable Dirt Compression").define("Dirt",ModInfo.GUI_DEFAULT);
        registerEmerald = builder.comment("Enable/Disable Emerald Compression").define("Emerald",ModInfo.GUI_DEFAULT);
        registerEndStone = builder.comment("Enable/Disable End Stone Compression").define("End Stone",ModInfo.GUI_DEFAULT);
        registerGold = builder.comment("Enable/Disable Gold Compression").define("Gold", ModInfo.GUI_DEFAULT);
        registerGranite = builder.comment("Enable/Disable Granite Compression").define("Granite",ModInfo.GUI_DEFAULT);
        registerGravel = builder.comment("Enable/Disable Gravel Compression").define("Gravel",ModInfo.GUI_DEFAULT);
        registerIron = builder.comment("Enable/Disable Iron Compression").define("Iron",ModInfo.GUI_DEFAULT);
        registerLapis = builder.comment("Enable/Disable Lapis Compression").define("Lapis",ModInfo.GUI_DEFAULT);
        registerNetherrack = builder.comment("Enable/Disable Netherrack Compression").define("Netherrack",ModInfo.GUI_DEFAULT);
        registerQuartz = builder.comment("Enable/Disable Quartz Compression").define("Quartz",ModInfo.GUI_DEFAULT);
        registerRedstone = builder.comment("Enable/Disable Redstone Compression").define("Redstone",ModInfo.GUI_DEFAULT);
        registerSand = builder.comment("Enable/Disable Sand Compression").define("Sand",ModInfo.GUI_DEFAULT);
        registerTuff = builder.comment("Enable/Disble Tuff Compression").define("Tuff",ModInfo.GUI_DEFAULT);
    }
}

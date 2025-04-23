package com.tylerh.compressedores.Util;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CompOresConfig
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    private static final ModConfigSpec.BooleanValue amethyst = BUILDER.comment("Enable/Disable Amethyst Compression").define("Amethyst",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue andesite = BUILDER.comment("Enable/Disable Andesite Compression").define("Andesite",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue basalt = BUILDER.comment("Enable/Disable Basalt Compression").define("Basalt",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue blackstone = BUILDER.comment("Enable/Disable Blackstone Compression").define("Blackstone",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue calcite = BUILDER.comment("Enable/Disable Calcite Compression").define("Calcite",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue clay = BUILDER.comment("Enable/Disable Clay Compression").define("Clay",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue coal = BUILDER.comment("Enable/Disable Coal Compression").define("Coal",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue cobble = BUILDER.comment("Enable/Disable Cobblestone Compression").define("Cobblestone",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue deepslate = BUILDER.comment("Enable/Disable Cobbled Deepslate Compression").define("Deepslate",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue diamond = BUILDER.comment("Enable/Disable Diamond Compression").define("Diamond",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue diorite = BUILDER.comment("Enable/Disable Diorite Compression").define("Diorite",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue dirt = BUILDER.comment("Enable/Disable Dirt Compression").define("Dirt",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue emerald = BUILDER.comment("Enable/Disable Emerald Compression").define("Emerald",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue endstone = BUILDER.comment("Enable/Disable End Stone Compression").define("End Stone",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue gold = BUILDER.comment("Enable/Disable Gold Compression").define("Gold", ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue granite = BUILDER.comment("Enable/Disable Granite Compression").define("Granite",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue gravel = BUILDER.comment("Enable/Disable Gravel Compression").define("Gravel",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue iron = BUILDER.comment("Enable/Disable Iron Compression").define("Iron",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue lapis = BUILDER.comment("Enable/Disable Lapis Compression").define("Lapis",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue netherrack = BUILDER.comment("Enable/Disable Netherrack Compression").define("Netherrack",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue quartz = BUILDER.comment("Enable/Disable Quartz Compression").define("Quartz",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue redstone = BUILDER.comment("Enable/Disable Redstone Compression").define("Redstone",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue sand = BUILDER.comment("Enable/Disable Sand Compression").define("Sand",ModInfo.GUI_DEFAULT);
    private static final ModConfigSpec.BooleanValue tuff = BUILDER.comment("Enable/Disble Tuff Compression").define("Tuff",ModInfo.GUI_DEFAULT);
    public static final ModConfigSpec SPEC = BUILDER.build();
    public static boolean registerAmethyst;
    public static boolean registerAndesite;
    public static boolean registerBasalt;
    public static boolean registerBlackstone;
    public static boolean registerCalcite;
    public static boolean registerClay;
    public static boolean registerCoal;
    public static boolean registerCobble;
    public static boolean registerDeepslate;
    public static boolean registerDiamond;
    public static boolean registerDiorite;
    public static boolean registerDirt;
    public static boolean registerEmerald;
    public static boolean registerEndStone;
    public static boolean registerGold;
    public static boolean registerGranite;
    public static boolean registerGravel;
    public static boolean registerIron;
    public static boolean registerLapis;
    public static boolean registerNetherrack;
    public static boolean registerQuartz;
    public static boolean registerRedstone;
    public static boolean registerSand;
    public static boolean registerTuff;
    public static void initConfig()
    {
        registerAmethyst = amethyst.get();
        registerAndesite = andesite.get();
        registerBasalt = basalt.get();
        registerBlackstone = blackstone.get();
        registerCalcite = calcite.get();
        registerClay = clay.get();
        registerCoal = coal.get();
        registerCobble = cobble.get();
        registerDeepslate = deepslate.get();
        registerDiamond = diamond.get();
        registerDiorite = diorite.get();
        registerDirt = dirt.get();
        registerEmerald = emerald.get();
        registerEndStone = endstone.get();
        registerGold = gold.get();
        registerGranite = granite.get();
        registerGravel = gravel.get();
        registerIron = iron.get();
        registerLapis = lapis.get();
        registerNetherrack = netherrack.get();
        registerQuartz = quartz.get();
        registerRedstone = redstone.get();
        registerSand = sand.get();
        registerTuff = tuff.get();
    }
}

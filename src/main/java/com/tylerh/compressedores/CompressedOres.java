package com.tylerh.compressedores;

import com.tylerh.compressedores.Proxy.CommonProxy;
import com.tylerh.compressedores.Util.LogHelper;
import com.tylerh.compressedores.Util.ModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Random;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION,guiFactory = ModInfo.GUI_FACTORY)
public class CompressedOres
{
    Random rnd = new Random();
    @Mod.Instance(ModInfo.MOD_ID)
    public static CompressedOres instance;
    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
    private static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        LogHelper.info("Compressed Ores has finished Pre-Initialization");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        //loadAchievements();
        LogHelper.info("Compressed Ores has finished Initialization");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
    /*private void loadAchievements()
    {
        ModInfo.craftCompressed = new Achievement("achievement.craftCompressed","craftCompressed",2,3,ModInfo.tempBlocks[getRandom()],null).initIndependentStat().registerStat();
        ModInfo.craftDouble = new Achievement("achievement.craftDouble","craftDouble",4,1,ModInfo.tempBlocks[getRandom()],ModInfo.craftCompressed).registerStat();
        ModInfo.craftTriple = new Achievement("achievement.craftTriple","craftTriple",4,3,ModInfo.tempBlocks[getRandom()],ModInfo.craftDouble).registerStat();
        ModInfo.craftQuadruple = new Achievement("achievement.craftQuadruple","craftQuadruple",6,3,ModInfo.tempBlocks[getRandom()],ModInfo.craftTriple).registerStat();
        ModInfo.craftQuintuple = new Achievement("achievement.craftQuintuple","craftQuintuple",6,1,ModInfo.tempBlocks[getRandom()],ModInfo.craftQuadruple).registerStat();
        ModInfo.craftSextuple = new Achievement("achievement.craftSextuple","craftSextuple",8,1,ModInfo.tempBlocks[getRandom()],ModInfo.craftQuintuple).registerStat();
        ModInfo.craftSeptuple = new Achievement("achievement.craftSeptuple","craftSeptuple",8,3,ModInfo.tempBlocks[getRandom()],ModInfo.craftSextuple).registerStat();
        ModInfo.craftOctuple = new Achievement("achievement.craftOctuple","craftOctuple",10,3,ModInfo.tempBlocks[getRandom()],ModInfo.craftSeptuple).registerStat().setSpecial();
        ModInfo.compressedOresPage = new AchievementPage("Compressed Ores", ModInfo.craftCompressed, ModInfo.craftDouble, ModInfo.craftTriple, ModInfo.craftQuadruple, ModInfo.craftQuintuple, ModInfo.craftSextuple, ModInfo.craftSeptuple, ModInfo.craftOctuple);
        AchievementPage.registerAchievementPage(ModInfo.compressedOresPage);
    }*/
    private int getRandom()
    {
        return rnd.nextInt(16);
    }
}
package com.tylerh.compressedores.Util;

import com.tylerh.compressedores.Init.ModBlocks;
import net.minecraft.advancements.Advancement;
import net.minecraft.block.Block;

/**
 * Created by tyler on 5/4/15.
 */
public class ModInfo
{
    public static final String MOD_ID = "compressedores";
    public static final String MOD_NAME = "Compressed Ores";
    public static final String MOD_VERSION = "1.14";
    public static final String CLIENT_PROXY = "com.tylerh.compressedores.Proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.tylerh.compressedores.Proxy.ServerProxy";
    public static final String GUI_FACTORY = "com.tylerh.compressedores.Util.CompressedOresGuiFactory";
    public static final String GUI_CATEGORY = "blocks";
    public static final boolean GUI_DEFAULT = true;

    public static final String[] matCosts = {"9","81","729","6,561","59,049","531,441","4,782,969","43,046,721"};
    public static final String[] appendNames = {"Gold","Iron","Diamond","Emerald","Lapis","Quartz","Redstone","Coal","Clay"};

}

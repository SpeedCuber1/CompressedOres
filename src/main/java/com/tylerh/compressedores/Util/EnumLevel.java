package com.tylerh.compressedores.Util;

import net.minecraft.util.IStringSerializable;

/**
 * Created by stephen on 11/1/15.
 */
public enum EnumLevel implements IStringSerializable
{
    COMPRESSED(0,"compressed","compressed"),
    DOUBLE(1,"double","double"),
    TRIPLE(2,"triple","triple"),
    QUADRUPLE(3,"quadruple","quadruple"),
    QUINTUPLE(4,"quintuple","quintuple"),
    SEXTUPLE(5,"sextuple","sextuple"),
    SEPTUPLE(6,"septuple","septuple"),
    OCTUPLE(7,"octuple","octuple");

    private static final EnumLevel[] META_LOOKUP = new EnumLevel[values().length];
    private final int meta;
    private final String name;
    private final String unlocalizedName;

    private EnumLevel(int meta, String name, String unlocalizedName)
    {
        this.meta = meta;
        this.name = name;
        this.unlocalizedName = unlocalizedName;
    }
    public int getMetadata()
    {
        return this.meta;
    }
    public String getUnlocalizedName()
    {
        return this.unlocalizedName;
    }

    public static EnumLevel byMetadata(int meta)
    {
        if (meta < 0 || meta >= META_LOOKUP.length)
        {
            meta = 0;
        }
        return META_LOOKUP[meta];
    }
    public String toString()
    {
        return this.unlocalizedName;
    }
    public String getName()
    {
        return this.name;
    }
    static
    {
        for (EnumLevel level : values())
        {
            META_LOOKUP[level.getMetadata()] = level;
        }
    }
}
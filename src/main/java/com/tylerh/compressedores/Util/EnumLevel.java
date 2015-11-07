package com.tylerh.compressedores.Util;

import net.minecraft.util.IStringSerializable;

/**
 * Created by stephen on 11/1/15.
 */
public enum EnumLevel implements IStringSerializable
{
    COMPRESSED(0, "Compressed"),
    DOUBLE(1, "Double"),
    TRIPLE(2, "Triple"),
    QUADRUPLE(3, "Quadruple"),
    QUINTUPLE(4, "Quintuple"),
    SEXTUPLE(5, "Sextuple"),
    SEPTUPLE(6, "Septuple"),
    OCTUPLE(7, "Octuple");

    public int getMetadata()
    {
        return this.meta;
    }

    @Override
    public String toString()
    {
        return this.name;
    }

    public static EnumLevel byMetadata(int meta)
    {
        if(meta < 0 || meta >= META_LOOKUP.length)
        {
            meta = 0;
        }
        return META_LOOKUP[meta];
    }

    public String getName()
    {
        return this.name;
    }

    private final int meta;
    private final String name;
    private static final EnumLevel[] META_LOOKUP = new EnumLevel[values().length];

    EnumLevel(int i_meta, String i_name)
    {
        this.meta = i_meta;
        this.name = i_name;
    }
    static
    {
        for(EnumLevel level : values())
        {
            META_LOOKUP[level.getMetadata()] = level;
        }
    }
}
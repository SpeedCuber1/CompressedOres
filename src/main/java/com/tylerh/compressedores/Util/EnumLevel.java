package com.tylerh.compressedores.Util;

import net.minecraft.util.IStringSerializable;

/**
 * Created by Tyler on 11/6/2015.
 */
public enum EnumLevel implements IStringSerializable
{
    Compressed(0, "Compressed"),
    Double(1, "Double"),
    Triple(2, "Triple"),
    Quadruple(3, "Quadruple"),
    Quintuple(4, "Quintuple"),
    Sextuple(5, "Sextuple"),
    Septuple(6, "Septuple"),
    Octuple(7, "Octuple");

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

package com.tylerh.compressedores.Util;

import net.minecraft.util.IStringSerializable;

public enum EnumCriterionCompOres implements IStringSerializable
{
    ANDESITE(0,"andesite","Andesite"),
    CLAY(1,"clay","Clay"),
    COAL(2,"coal","Coal"),
    COBBLE(3,"cobble","Cobble"),
    DIAMOND(4,"diamond","Diamond"),
    DIORITE(5,"diorite","Diorite"),
    DIRT(6,"dirt","Dirt"),
    EMERALD(7,"emerald","Emerald"),
    GOLD(8,"gold","Gold"),
    GRANITE(9,"granite","Granite"),
    GRAVEL(10,"gravel","Gravel"),
    IRON(11,"iron","Iron"),
    LAPIS(12,"lapis","Lapis"),
    QUARTZ(13,"quartz","Quartz"),
    REDSTONE(14,"redstone","Redstone"),
    SAND(15,"sand","Sand")
    ;
    private static final EnumCriterionCompOres[] META_LOOKUP = new EnumCriterionCompOres[values().length];
    private final String name;
    private final int meta;
    private final String uName;
    EnumCriterionCompOres(int meta,String name,String uName)
    {
        this.name = name;
        this.uName = uName;
        this.meta = meta;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
    public String getUnlocalizedName()
    {
        return this.uName;
    }
    public int getMeta()
    {
        return this.meta;
    }
    public static EnumCriterionCompOres byMetadata(int meta)
    {
        if (meta < 0 || meta >= META_LOOKUP.length) {
            meta = 0;
        }
        return META_LOOKUP[meta];
    }
    static
    {
        for(EnumCriterionCompOres criterion : values())
        {
            META_LOOKUP[criterion.getMeta()] = criterion;
        }
    }
}

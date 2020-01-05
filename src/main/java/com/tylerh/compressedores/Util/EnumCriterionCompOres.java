package com.tylerh.compressedores.Util;

import net.minecraft.util.IStringSerializable;

public enum EnumCriterionCompOres implements IStringSerializable
{
    ANDESITE(0,"andesite"),
    CLAY(1,"clay"),
    COAL(2,"coal"),
    COBBLE(3,"cobble"),
    DIAMOND(4,"diamond"),
    DIORITE(5,"diorite"),
    DIRT(6,"dirt"),
    EMERALD(7,"emerald"),
    GOLD(8,"gold"),
    GRANITE(9,"granite"),
    GRAVEL(10,"gravel"),
    IRON(11,"iron"),
    LAPIS(12,"lapis"),
    QUARTZ(13,"quartz"),
    REDSTONE(14,"redstone"),
    SAND(15,"sand")
    ;
    private static final EnumCriterionCompOres[] META_LOOKUP = new EnumCriterionCompOres[values().length];
    private final String name;
    private final int meta;
    EnumCriterionCompOres(int meta,String name)
    {
        this.name = name;
        this.meta = meta;
    }
    @Override
    public String getName()
    {
        return this.name;
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

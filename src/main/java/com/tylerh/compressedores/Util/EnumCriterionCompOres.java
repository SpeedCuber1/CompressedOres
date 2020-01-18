package com.tylerh.compressedores.Util;

import net.minecraft.util.IStringSerializable;

public enum EnumCriterionCompOres implements IStringSerializable
{
    ANDESITE(0,"Andesite"),
    CLAY(1,"Clay"),
    COAL(2,"Coal"),
    COBBLE(3,"Cobble"),
    DIAMOND(4,"Diamond"),
    DIORITE(5,"Diorite"),
    DIRT(6,"Dirt"),
    EMERALD(7,"Emerald"),
    GOLD(8,"Gold"),
    GRANITE(9,"Granite"),
    GRAVEL(10,"Gravel"),
    IRON(11,"Iron"),
    LAPIS(12,"Lapis"),
    QUARTZ(13,"Quartz"),
    REDSTONE(14,"Redstone"),
    SAND(15,"Sand")
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

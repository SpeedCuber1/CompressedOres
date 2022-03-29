package com.tylerh.compressedores.Util;


public enum EnumCriterionCompOres implements IStringSerializable
{
    ANDESITE(0,"andesite"),
    CLAY(1,"clay"),
    COAL(2,"coal"),
    COBBLE(3,"cobble"),
    DEEPSLATE(4,"deepslate"),
    DIAMOND(5,"diamond"),
    DIORITE(6,"diorite"),
    DIRT(7,"dirt"),
    EMERALD(8,"emerald"),
    GOLD(9,"gold"),
    GRANITE(10,"granite"),
    GRAVEL(11,"gravel"),
    IRON(12,"iron"),
    LAPIS(13,"lapis"),
    NETHERRACK(14,"netherrack"),
    QUARTZ(15,"quartz"),
    REDSTONE(16,"redstone"),
    SAND(17,"sand"),
    TUFF(18,"tuff")
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
    public String getString()
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

package com.tylerh.compressedores.Util;


public enum EnumCriterionCompOres implements IStringSerializable
{
    ANDESITE(0,"andesite"),
    BASALT(1,"basalt"),
    BLACKSTONE(2,"blackstone"),
    CALCITE(3,"calcite"),
    CLAY(4,"clay"),
    COAL(5,"coal"),
    COBBLE(6,"cobble"),
    DEEPSLATE(7,"deepslate"),
    DIAMOND(8,"diamond"),
    DIORITE(9,"diorite"),
    DIRT(10,"dirt"),
    EMERALD(11,"emerald"),
    GOLD(12,"gold"),
    GRANITE(13,"granite"),
    GRAVEL(14,"gravel"),
    IRON(15,"iron"),
    LAPIS(16,"lapis"),
    NETHERRACK(17,"netherrack"),
    QUARTZ(18,"quartz"),
    REDSTONE(19,"redstone"),
    SAND(20,"sand"),
    TUFF(21,"tuff")
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

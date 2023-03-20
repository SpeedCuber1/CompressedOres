package com.tylerh.compressedores.Util;


public enum EnumCriterionCompOres implements IStringSerializable
{
    AMETHYST(0,"amethyst"),
    ANDESITE(1,"andesite"),
    BASALT(2,"basalt"),
    BLACKSTONE(3,"blackstone"),
    CALCITE(4,"calcite"),
    CLAY(5,"clay"),
    COAL(6,"coal"),
    COBBLE(7,"cobble"),
    DEEPSLATE(8,"deepslate"),
    DIAMOND(9,"diamond"),
    DIORITE(10,"diorite"),
    DIRT(11,"dirt"),
    EMERALD(12,"emerald"),
    GOLD(13,"gold"),
    GRANITE(14,"granite"),
    GRAVEL(15,"gravel"),
    IRON(16,"iron"),
    LAPIS(17,"lapis"),
    NETHERRACK(18,"netherrack"),
    QUARTZ(19,"quartz"),
    REDSTONE(20,"redstone"),
    SAND(21,"sand"),
    TUFF(22,"tuff")
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

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
    END_STONE(13,"end_stone"),
    GOLD(14,"gold"),
    GRANITE(15,"granite"),
    GRAVEL(16,"gravel"),
    IRON(17,"iron"),
    LAPIS(18,"lapis"),
    NETHERRACK(19,"netherrack"),
    QUARTZ(20,"quartz"),
    REDSTONE(21,"redstone"),
    SAND(22,"sand"),
    TUFF(23,"tuff")
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

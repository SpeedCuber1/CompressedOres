package com.tylerh.compressedores.Util;

public enum EnumLevel implements IStringSerializable
{
    COMPRESSED(0, "compressed"),
    DOUBLE(1, "double"),
    TRIPLE(2, "triple"),
    QUADRUPLE(3, "quadruple"),
    QUINTUPLE(4, "quintuple"),
    SEXTUPLE(5, "sextuple"),
    SEPTUPLE(6, "septuple"),
    OCTUPLE(7, "octuple");

    private static final EnumLevel[] META_LOOKUP = new EnumLevel[values().length];
    private final int meta;
    private final String name;

    EnumLevel(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
    }

    public int getMetadata() {
        return this.meta;
    }

    public static EnumLevel byMetadata(int meta) {
        if (meta < 0 || meta >= META_LOOKUP.length) {
            meta = 0;
        }
        return META_LOOKUP[meta];
    }
    @Override
    public String getString() {
        return this.name;
    }

    static {
        for (EnumLevel level : values()) {
            META_LOOKUP[level.getMetadata()] = level;
        }
    }
}

package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.CreativeTabCompressedOres;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class BlockMetaIron extends Block
{
    public BlockMetaIron()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabCompressedOres.COMPRESSED_ORES_TAB);
        this.setHardness(5f);
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.SOLID;
    }

    public static final PropertyEnum PROPERTYLEVEL = PropertyEnum.create("level", EnumLevel.class);

    @Override
    public int damageDropped(IBlockState state)
    {
        EnumLevel enumLevel = (EnumLevel)state.getValue(PROPERTYLEVEL);
        return enumLevel.getMetadata();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        EnumLevel[] allLevels = EnumLevel.values();
        for(EnumLevel level : allLevels)
        {
            list.add(new ItemStack(itemIn, 1, level.getMetadata()));
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        int levelbits = meta;
        EnumLevel level = EnumLevel.byMetadata(levelbits);
        return this.getDefaultState().withProperty(PROPERTYLEVEL, level);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        EnumLevel level = (EnumLevel)state.getValue(PROPERTYLEVEL);

        int levelbits = level.getMetadata();
        return levelbits;
    }

    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {PROPERTYLEVEL});
    }

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing levelPlaced, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        EnumLevel levels = EnumLevel.byMetadata(meta);
        return this.getDefaultState().withProperty(PROPERTYLEVEL, levels);
    }
}

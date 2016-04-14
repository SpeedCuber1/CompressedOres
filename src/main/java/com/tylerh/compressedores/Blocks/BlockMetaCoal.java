package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.CreativeTabCompressedOres;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class BlockMetaCoal extends Block
{
    public static final PropertyEnum PROPERTYLEVEL = PropertyEnum.create("level", EnumLevel.class);
    public BlockMetaCoal()
    {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabCompressedOres.COMPRESSED_ORES_TAB);
        this.setDefaultState(this.blockState.getBaseState().withProperty(PROPERTYLEVEL,EnumLevel.COMPRESSED));
        this.setHardness(5f);
        this.setUnlocalizedName("blockMetaCoal");
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }


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
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {PROPERTYLEVEL});
    }

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing levelPlaced, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        EnumLevel levels = EnumLevel.byMetadata(meta);
        return this.getDefaultState().withProperty(PROPERTYLEVEL, levels);
    }
}

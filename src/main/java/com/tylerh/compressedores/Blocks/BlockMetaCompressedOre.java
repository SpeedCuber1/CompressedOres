package com.tylerh.compressedores.Blocks;

import com.tylerh.compressedores.Util.CreativeTabCompressedOres;
import com.tylerh.compressedores.Util.EnumLevel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by IpodT on 4/30/2016.
 */
public class BlockMetaCompressedOre extends Block
{
    private boolean isRedstone;
    public BlockMetaCompressedOre(Material mat,float hardness, float resistance,String uName,boolean isRedstone)
    {
        super(mat);
        this.blockHardness = hardness;
        this.blockResistance = resistance;
        this.func_149647_a(CreativeTabCompressedOres.COMPRESSED_ORES_TAB);
        this.func_149663_c(uName);
        setHarvestLevel("pickaxe", 2);
        this.isRedstone = isRedstone;
    }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }

    private static final PropertyEnum PROPERTYLEVEL = PropertyEnum.create("level", EnumLevel.class);

    @SideOnly(Side.CLIENT)
    @Override
    public void fillItemGroup(CreativeTabs group,NonNullList<ItemStack> items)
    {
        EnumLevel[] allLevels = EnumLevel.values();
        for (EnumLevel level : allLevels)
        {
            items.add(new ItemStack(this,1,level.getMetadata()));
        }
    }
    @Override
    public int func_180651_a(IBlockState state)
    {
        EnumLevel enumLevel = (EnumLevel)state.get(PROPERTYLEVEL);
        return  enumLevel.getMetadata();
    }
    @Override
    public IBlockState func_176203_a(int meta)
    {
        int levelbits = meta;
        EnumLevel level = EnumLevel.byMetadata(levelbits);
        return this.getDefaultState().func_177226_a(PROPERTYLEVEL,level);
    }
    @Override
    public int func_176201_c(IBlockState state)
    {
        EnumLevel level = (EnumLevel)state.get(PROPERTYLEVEL);
        return level.getMetadata();
    }
    @Override
    protected BlockStateContainer func_180661_e()
    {
        return new BlockStateContainer(this,PROPERTYLEVEL);
    }

    @Override
    public IBlockState func_180642_a(World world, BlockPos pos, EnumFacing levelPlaced, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        EnumLevel levels = EnumLevel.byMetadata(meta);
        return this.getDefaultState().func_177226_a(PROPERTYLEVEL,levels);
    }
    @Override
    public boolean canProvidePower(IBlockState state)
    {
        if(isRedstone)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public int getWeakPower(IBlockState state, IBlockAccess access,BlockPos pos, EnumFacing side)
    {
        if(isRedstone)
        {
            return 15;
        }
        else
        {
            return 0;
        }
    }
}

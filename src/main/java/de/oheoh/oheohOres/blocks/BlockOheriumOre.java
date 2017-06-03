package de.oheoh.oheohOres.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by oheoh on 31.05.2017 19:24 Uhr for oheohOres.
 */
public class BlockOheriumOre extends BlockBase {
    public BlockOheriumOre(String name, Material mat, CreativeTabs tab, float hardness, float resistance, String tool, int harvest, Item drop, int meta, int quant) {
        super(name, mat, tab, hardness, resistance, tool, harvest);
        this.drop = drop;
        this.meta = meta;
        this.quant = quant;
    }

    private Item drop;
    private int meta;
    private int quant;

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.drop;
    }

    @Override
    public int quantityDropped(Random random) {
        return this.quant;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return this.meta;
    }
}

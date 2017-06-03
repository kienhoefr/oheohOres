package de.oheoh.oheohOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

/**
 * Created by oheoh on 02.06.2017 17:10 Uhr for oheohOres.
 */
public class ItemOheriumHoe extends ItemHoe {
    public ItemOheriumHoe(String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}

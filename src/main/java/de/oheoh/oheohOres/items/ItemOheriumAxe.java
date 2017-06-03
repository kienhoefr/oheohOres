package de.oheoh.oheohOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * Created by oheoh on 02.06.2017 17:08 Uhr for oheohOres.
 */
public class ItemOheriumAxe extends ItemAxe {
    public ItemOheriumAxe(String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat, mat.getDamageVsEntity(), mat.getEfficiencyOnProperMaterial());
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}

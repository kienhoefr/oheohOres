package de.oheoh.oheohOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by oheoh on 02.06.2017 17:08 Uhr for oheohOres.
 */
public class ItemOheriumSword extends ItemSword {
    public ItemOheriumSword(String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}

package de.oheoh.oheohOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by oheoh on 02.06.2017 17:08 Uhr for oheohOres.
 */
public class ItemOheriumPickaxe extends ItemPickaxe {
    public ItemOheriumPickaxe(String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}

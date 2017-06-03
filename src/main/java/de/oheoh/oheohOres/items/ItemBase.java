package de.oheoh.oheohOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by oheoh on 30.05.2017 19:22 Uhr for oheohOres.
 */
public class ItemBase extends Item {
    public ItemBase(String name, CreativeTabs tab) {
        this(name, tab, 64);
    }

    public ItemBase(String name, CreativeTabs tab, int stackSize) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(stackSize);
    }
}

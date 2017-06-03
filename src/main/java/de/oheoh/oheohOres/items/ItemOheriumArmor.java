package de.oheoh.oheohOres.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by oheoh on 03.06.2017 16:03 Uhr for oheohOres.
 */
public class ItemOheriumArmor extends ItemArmor {
    public ItemOheriumArmor(String name, CreativeTabs tab, ItemArmor.ArmorMaterial mat, int layerIndex, EntityEquipmentSlot slot) {
        super(mat, layerIndex, slot);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}

package de.oheoh.oheohOres.handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * File created by oheoh on 02.06.2017 17:50 Uhr for oheohOres.
 */
public class MaterialHandler {
    //Oherium Materials
    public static final Item.ToolMaterial OHERIUM = EnumHelper.addToolMaterial("oherium", 3, 5000, 10F, 5F, 25);
    public static final ItemArmor.ArmorMaterial OHERIUM_ARMOR = EnumHelper.addArmorMaterial("oheriumArmor", "oheohores:oherium", 5000, new int[]{5, 10, 8, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4F);
    public static final ItemArmor.ArmorMaterial OHERIUM_ENH = EnumHelper.addArmorMaterial("oheohEnh", "oheohores:oheriumenh", 7000, new int[]{7, 12, 10, 7}, 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6F);
}

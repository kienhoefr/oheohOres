package de.oheoh.oheohOres.init;

/***************************************************************************************************
 * Copyright (c) 2017 oheoh
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), the rights to use, copy, modify, merge, publish, distribute and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************************************/

import de.oheoh.oheohOres.handlers.CreativeTabsHandler;
import de.oheoh.oheohOres.handlers.MaterialHandler;
import de.oheoh.oheohOres.items.ItemOheriumArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

/**
 * File created by oheoh on 03.06.2017 16:32 Uhr for oheohOres.
 */
public class OoArmor {
    //Standard Oherium Armor
    public static Item oheriumHelmet = new ItemOheriumArmor("oherium_helmet", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 0, EntityEquipmentSlot.HEAD);
    public static Item oheriumChest = new ItemOheriumArmor("oherium_chestplate", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 0, EntityEquipmentSlot.CHEST);
    public static Item oheriumLegs = new ItemOheriumArmor("oherium_leggings", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 1, EntityEquipmentSlot.LEGS);
    public static Item oheriumBoots = new ItemOheriumArmor("oherium_boots", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 0, EntityEquipmentSlot.FEET);

    //Enhanced Oherium Armor
    public static Item oheriumHelmetEnhanced = new ItemOheriumArmor("oherium_helmet_enhanced", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ENH, 0, EntityEquipmentSlot.HEAD);
    public static Item oheriumChestEnhanced = new ItemOheriumArmor("oherium_chestplate_enhanced", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ENH, 0, EntityEquipmentSlot.CHEST);
    public static Item oheriumLegsEnhanced = new ItemOheriumArmor("oherium_leggings_enhanced", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ENH, 1, EntityEquipmentSlot.LEGS);
    public static Item oheriumBootsEnhanced = new ItemOheriumArmor("oherium_boots_enhanced", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ENH, 0, EntityEquipmentSlot.FEET);
}

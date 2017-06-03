package de.oheoh.oheohOres.init;

import de.oheoh.oheohOres.handlers.CreativeTabsHandler;
import de.oheoh.oheohOres.handlers.MaterialHandler;
import de.oheoh.oheohOres.items.ItemOheriumArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

/**
 * Created by oheoh on 03.06.2017 16:32 Uhr for oheohOres.
 */
public class OoArmor {
    public static Item oheriumHelmet = new ItemOheriumArmor("oherium_helmet", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 0, EntityEquipmentSlot.HEAD);
    public static Item oheriumChest = new ItemOheriumArmor("oherium_chestplate", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 0, EntityEquipmentSlot.CHEST);
    public static Item oheriumLegs = new ItemOheriumArmor("oherium_leggings", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 1, EntityEquipmentSlot.LEGS);
    public static Item oheriumBoots = new ItemOheriumArmor("oherium_boots", CreativeTabsHandler.oheohOresCombat, MaterialHandler.OHERIUM_ARMOR, 0, EntityEquipmentSlot.FEET);
}

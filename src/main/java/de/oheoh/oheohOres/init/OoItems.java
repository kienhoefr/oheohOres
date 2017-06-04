package de.oheoh.oheohOres.init;

import de.oheoh.oheohOres.handlers.CreativeTabsHandler;
import de.oheoh.oheohOres.handlers.MaterialHandler;
import de.oheoh.oheohOres.items.*;
import net.minecraft.item.Item;

/**
 * File created by oheoh on 30.05.2017 19:01 Uhr for oheohOres.
 */
public class OoItems {
    //Oherium Crafting components
    public static final Item oheriumIngot = new ItemOheriumIngot("oherium_ingot", CreativeTabsHandler.oheohOresItems);
    public static final Item oheriumDust = new ItemOheriumDust("oherium_dust", CreativeTabsHandler.oheohOresItems);
    public static final Item oheriumNugget = new ItemOheriumNugget("oherium_nugget", CreativeTabsHandler.oheohOresItems);
    public static final Item oheriumShard = new ItemOheriumShard("oherium_shard", CreativeTabsHandler.oheohOresItems);
    public static final Item oheriumComponent = new ItemOheriumComponent("oherium_component", CreativeTabsHandler.oheohOresItems);

    //Oherium tools
    public static final Item oheriumPickaxe = new ItemOheriumPickaxe("oherium_pickaxe", MaterialHandler.OHERIUM, CreativeTabsHandler.oheohOresTools);
    public static final Item oheriumAxe = new ItemOheriumAxe("oherium_axe", MaterialHandler.OHERIUM, CreativeTabsHandler.oheohOresTools);
    public static final Item oheriumShovel = new ItemOheriumShovel("oherium_shovel", MaterialHandler.OHERIUM, CreativeTabsHandler.oheohOresTools);
    public static final Item oheriumHoe = new ItemOheriumHoe("oherium_hoe", MaterialHandler.OHERIUM, CreativeTabsHandler.oheohOresTools);

    //Oherium weapons
    public static final Item oheriumSword = new ItemOheriumSword("oherium_sword", MaterialHandler.OHERIUM, CreativeTabsHandler.oheohOresCombat);
}

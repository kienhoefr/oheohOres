package de.oheoh.oheohOres.handlers;

import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.init.OoItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by oheoh on 01.06.2017 18:13 Uhr for oheohOres.
 */
public class CreativeTabsHandler {
    public static final CreativeTabs oheohOresBlocks = new CreativeTabs("oheohOresBlocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(OoBlocks.oheriumOre);
        }
    };

    public static final CreativeTabs oheohOresItems = new CreativeTabs("oheohOresItems") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(OoItems.oheriumDust);
        }
    };

    public static final CreativeTabs oheohOresTools = new CreativeTabs("oheohOresTools") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(OoItems.oheriumPickaxe);
        }
    };

    public static final CreativeTabs oheohOresCombat = new CreativeTabs("oheohOresCombat") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(OoItems.oheriumSword);
        }
    };
}

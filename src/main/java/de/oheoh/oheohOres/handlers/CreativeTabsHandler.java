package de.oheoh.oheohOres.handlers;

/***************************************************************************************************
 * Copyright (c) 2017 oheoh
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), the rights to use, copy, modify, merge, publish, distribute and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************************************/

import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.init.OoItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * File created by oheoh on 01.06.2017 18:13 Uhr for oheohOres.
 */
public class CreativeTabsHandler {
    //Oherium tabs
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

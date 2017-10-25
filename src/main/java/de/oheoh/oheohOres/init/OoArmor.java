package de.oheoh.oheohOres.init;

/***************************************************************************************************
 * Copyright (c) 2017 oheoh
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), the rights to use, copy, modify, merge, publish, distribute and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************************************/

import de.oheoh.oheohOres.items.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * File created by oheoh on 03.06.2017 16:32 Uhr for oheohOres.
 */
public class OoArmor {
    //Standard Oherium Armor

    @GameRegistry.ObjectHolder("oheohores:oherium_helmet")
    public static OheriumHelmet oheriumHelmet;

    @GameRegistry.ObjectHolder("oheohores:oherium_chestplate")
    public static OheriumChestplate oheriumChest;

    @GameRegistry.ObjectHolder("oheohores:oherium_leggings")
    public static OheriumLeggings oheriumLegs;

    @GameRegistry.ObjectHolder("oheohores:oherium_boots")
    public static OheriumBoots oheriumBoots;

    //Enhanced Oherium Armor

    @GameRegistry.ObjectHolder("oheohores:oherium_helmet_enhanced")
    public static OheriumHelmetEnhanced oheriumHelmetEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_chesplate_enhanced")
    public static OheriumChestplateEnhanced oheriumChestEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_leggings_enhanced")
    public static OheriumLeggingsEnhanced oheriumLegsEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_boots_enhanced")
    public static OheriumBootsEnhanced oheriumBootsEnhanced;
}

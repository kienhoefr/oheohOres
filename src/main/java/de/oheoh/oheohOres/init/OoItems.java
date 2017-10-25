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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * File created by oheoh on 30.05.2017 19:01 Uhr for oheohOres.
 */
public class OoItems {

    @GameRegistry.ObjectHolder("oheohores:oherium_dust")
    public static OheriumDust oheriumDust;

    @GameRegistry.ObjectHolder("oheohores:oherium_ingot")
    public static OheriumIngot oheriumIngot;

    @GameRegistry.ObjectHolder("oheohores:oherium_pickaxe")
    public static OheriumPickaxe oheriumPickaxe;

    @GameRegistry.ObjectHolder("oheohores:oherium_sword")
    public static OheriumSword oheriumSword;

    @GameRegistry.ObjectHolder("oheohores:oherium_axe")
    public static OheriumAxe oheriumAxe;

    @GameRegistry.ObjectHolder("oheohores:oherium_boots")
    public static OheriumBoots oheriumBoots;

    @GameRegistry.ObjectHolder("oheohores:oherium_boots_enhanced")
    public static OheriumBootsEnhanced oheriumBootsEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_chestplate")
    public static OheriumChestplate oheriumChestplate;

    @GameRegistry.ObjectHolder("oheohores:oherium_chestplate_enhanced")
    public static OheriumChestplateEnhanced oheriumChestplateEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_component")
    public static OheriumComponent oheriumComponent;

    @GameRegistry.ObjectHolder("oheohores:oherium_helmet")
    public static OheriumHelmet oheriumHelmet;

    @GameRegistry.ObjectHolder("oheohores:oherium_helmet_enhanced")
    public static OheriumHelmetEnhanced oheriumHelmetEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_hoe")
    public static OheriumHoe oheriumHoe;

    @GameRegistry.ObjectHolder("oheohores:oherium_leggings")
    public static OheriumLeggings oheriumLeggings;

    @GameRegistry.ObjectHolder("oheohores:oherium_leggings_enhanced")
    public static OheriumLeggingsEnhanced oheriumLeggingsEnhanced;

    @GameRegistry.ObjectHolder("oheohores:oherium_nugget")
    public static OheriumNugget oheriumNugget;

    @GameRegistry.ObjectHolder("oheohores:oherium_shard")
    public static OheriumShard oheriumShard;

    @GameRegistry.ObjectHolder("oheohores:oherium_shovel")
    public static OheriumShovel oheriumShovel;

    //Initialize Models for the Items
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        oheriumIngot.initModel();
        oheriumDust.initModel();
        oheriumAxe.initModel();
        oheriumBoots.initModel();
        oheriumBootsEnhanced.initModel();
        oheriumChestplate.initModel();
        oheriumChestplateEnhanced.initModel();
        oheriumComponent.initModel();
        oheriumHelmet.initModel();
        oheriumHelmetEnhanced.initModel();
        oheriumHoe.initModel();
        oheriumLeggings.initModel();
        oheriumLeggingsEnhanced.initModel();
        oheriumNugget.initModel();
        oheriumPickaxe.initModel();
        oheriumShard.initModel();
        oheriumShovel.initModel();
        oheriumSword.initModel();
/*        oherium.initModel();
        oherium.initModel();
        oherium.initModel();
        oherium.initModel();
        oherium.initModel();
        oherium.initModel();*/
    }
}

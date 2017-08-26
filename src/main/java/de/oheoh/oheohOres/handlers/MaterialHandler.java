package de.oheoh.oheohOres.handlers;

/***************************************************************************************************
 * Copyright (c) 2017 oheoh
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), the rights to use, copy, modify, merge, publish, distribute and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************************************/

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

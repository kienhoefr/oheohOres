package de.oheoh.oheohOres.handlers;

import de.oheoh.oheohOres.init.OoItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * File created by oheoh on 01.06.2017 18:19 Uhr for oheohOres.
 */
public class SmeltingHandler {
    public static void init() {
        //Oherium recipes
        GameRegistry.addSmelting(OoItems.oheriumDust, new ItemStack(OoItems.oheriumIngot), 1.5F);
    }
}

package de.oheoh.oheohOres.handlers;

import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.init.OoItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by oheoh on 01.06.2017 18:17 Uhr for oheohOres.
 */
public class CraftingHandler {
    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(OoBlocks.oheriumBlock), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumIngot, 9), new ItemStack(OoBlocks.oheriumBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumNugget, 9), new ItemStack(OoItems.oheriumIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumShard), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget));
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumComponent), " S ", "SIS", " S ", 'S', OoItems.oheriumShard, 'I', OoItems.oheriumIngot);
    }


}

package de.oheoh.oheohOres.handlers;

import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.init.OoItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Crafting Handler created by oheoh on 01.06.2017 18:17 Uhr for oheohOres.
 */
public class CraftingHandler {
    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(OoBlocks.oheriumBlock), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumIngot, 9), new ItemStack(OoBlocks.oheriumBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumNugget, 9), new ItemStack(OoItems.oheriumIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumIngot), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget));
        GameRegistry.addShapelessRecipe(new ItemStack(OoItems.oheriumShard), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget), new ItemStack(OoItems.oheriumNugget));
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumComponent), " S ", "SIS", " S ", 'S', OoItems.oheriumShard, 'I', OoItems.oheriumIngot);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumPickaxe), "CCC", " S ", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumSword), " C ", " C ", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumAxe), "CC ", "CS ", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumAxe), " CC", " SC", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumShovel), " C ", " S ", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumHoe), " CC", " S ", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(OoItems.oheriumHoe), "CC ", " S ", " S ", 'C', OoItems.oheriumComponent, 'S', Items.STICK);
    }


}

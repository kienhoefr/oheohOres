package de.oheoh.oheohOres.proxy;

import de.oheoh.oheohOres.handlers.CraftingHandler;
import de.oheoh.oheohOres.handlers.SmeltingHandler;
import de.oheoh.oheohOres.init.OoArmor;
import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.init.OoItems;
import de.oheoh.oheohOres.oheohOres;
import de.oheoh.oheohOres.world.WorldGenOre;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.oheoh.oheohOres.util.RegisterUtil.registerBlocks;
import static de.oheoh.oheohOres.util.RegisterUtil.registerItems;

/**
 * File created by oheoh on 30.05.2017 18:14 Uhr for oheohOres.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        //Blocks
        registerBlocks(event, OoBlocks.oheriumBlock);
        registerBlocks(event, OoBlocks.oheriumOre);

        //Crafting components
        registerItems(event, OoItems.oheriumIngot);
        registerItems(event, OoItems.oheriumDust);
        registerItems(event, OoItems.oheriumNugget);
        registerItems(event, OoItems.oheriumShard);
        registerItems(event, OoItems.oheriumComponent);

        //Tools
        registerItems(event, OoItems.oheriumAxe);
        registerItems(event, OoItems.oheriumHoe);
        registerItems(event, OoItems.oheriumPickaxe);
        registerItems(event, OoItems.oheriumShovel);
        registerItems(event, OoItems.oheriumSword);

        //Armor
        registerItems(event, OoArmor.oheriumHelmet);
        registerItems(event, OoArmor.oheriumChest);
        registerItems(event, OoArmor.oheriumLegs);
        registerItems(event, OoArmor.oheriumBoots);

        //Armor Enhanced
        registerItems(event, OoArmor.oheriumHelmetEnhanced);
        registerItems(event, OoArmor.oheriumChestEnhanced);
        registerItems(event, OoArmor.oheriumLegsEnhanced);
        registerItems(event, OoArmor.oheriumBootsEnhanced);

        //OreGen
        oheohOres.LOGGER.debug("Registering Ore Generator...");
        GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
        oheohOres.LOGGER.debug("\tRegistered!");
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
        oheohOres.LOGGER.debug("Registering crafting recipes...");
        CraftingHandler.init();
        oheohOres.LOGGER.debug("\tRegistered!");
        oheohOres.LOGGER.debug("Registering smelting recipes...");
        SmeltingHandler.init();
        oheohOres.LOGGER.debug("\tRegistered!");
    }

    public void serverStarting(FMLServerStartingEvent event) {
    }

    public void serverStopping(FMLServerStoppingEvent event) {
    }
}

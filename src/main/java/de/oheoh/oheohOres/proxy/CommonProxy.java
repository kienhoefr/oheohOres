package de.oheoh.oheohOres.proxy;

import de.oheoh.oheohOres.handlers.CraftingHandler;
import de.oheoh.oheohOres.handlers.SmeltingHandler;
import de.oheoh.oheohOres.init.OoArmor;
import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.init.OoItems;
import de.oheoh.oheohOres.oheohOres;
import net.minecraftforge.fml.common.event.*;

import static de.oheoh.oheohOres.util.RegisterUtil.registerBlocks;
import static de.oheoh.oheohOres.util.RegisterUtil.registerItems;

/**
 * Created by oheoh on 30.05.2017 18:14 Uhr for oheohOres.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        registerBlocks(event, OoBlocks.oheriumBlock);
        registerBlocks(event, OoBlocks.oheriumOre);
        registerItems(event, OoItems.oheriumIngot);
        registerItems(event, OoItems.oheriumDust);
        registerItems(event, OoItems.oheriumAxe);
        registerItems(event, OoItems.oheriumHoe);
        registerItems(event, OoItems.oheriumPickaxe);
        registerItems(event, OoItems.oheriumShovel);
        registerItems(event, OoItems.oheriumSword);
        registerItems(event, OoItems.oheriumNugget);
        registerItems(event, OoItems.oheriumShard);
        registerItems(event, OoItems.oheriumComponent);
        registerItems(event, OoArmor.oheriumHelmet);
        registerItems(event, OoArmor.oheriumChest);
        registerItems(event, OoArmor.oheriumLegs);
        registerItems(event, OoArmor.oheriumBoots);
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
        oheohOres.LOGGER.info("Registering crafting recipes...");
        CraftingHandler.init();
        oheohOres.LOGGER.info("\tRegistered!");
        oheohOres.LOGGER.info("Registering smelting recipes...");
        SmeltingHandler.init();
        oheohOres.LOGGER.info("\tRegistered!");
    }

    public void serverStarting(FMLServerStartingEvent event) {
    }

    public void serverStopping(FMLServerStoppingEvent event) {
    }
}

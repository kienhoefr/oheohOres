package de.oheoh.oheohOres.proxy;

/***************************************************************************************************
 * Copyright (c) 2017 oheoh
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), the rights to use, copy, modify, merge, publish, distribute and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************************************/


import de.oheoh.oheohOres.blocks.OheriumBlock;
import de.oheoh.oheohOres.blocks.OheriumOre;
import de.oheoh.oheohOres.handlers.SmeltingHandler;
import de.oheoh.oheohOres.init.OoBlocks;
import de.oheoh.oheohOres.items.*;
import de.oheoh.oheohOres.oheohOres;
import de.oheoh.oheohOres.world.WorldGenOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * File created by oheoh on 30.05.2017 18:14 Uhr for oheohOres.
 */
@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        //OreGen
        oheohOres.LOGGER.debug("Registering Ore Generator...");
        GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
        oheohOres.LOGGER.debug("\tRegistered!");
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
        oheohOres.LOGGER.debug("Registering smelting recipes...");
        SmeltingHandler.init();
        oheohOres.LOGGER.debug("\tRegistered!");
    }

    public void serverStarting(FMLServerStartingEvent event) {
    }

    public void serverStopping(FMLServerStoppingEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new OheriumBlock());
        event.getRegistry().register(new OheriumOre());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(OoBlocks.oheriumBlock).setRegistryName(OoBlocks.oheriumBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(OoBlocks.oheriumOre).setRegistryName(OoBlocks.oheriumOre.getRegistryName()));
        event.getRegistry().register(new OheriumDust());
        event.getRegistry().register(new OheriumIngot());
        event.getRegistry().register(new OheriumNugget());
        event.getRegistry().register(new OheriumShard());
        event.getRegistry().register(new OheriumComponent());
        event.getRegistry().register(new OheriumHelmet());
        event.getRegistry().register(new OheriumChestplate());
        event.getRegistry().register(new OheriumLeggings());
        event.getRegistry().register(new OheriumBoots());
        event.getRegistry().register(new OheriumHelmetEnhanced());
        event.getRegistry().register(new OheriumChestplateEnhanced());
        event.getRegistry().register(new OheriumLeggingsEnhanced());
        event.getRegistry().register(new OheriumBootsEnhanced());
        event.getRegistry().register(new OheriumSword());
        event.getRegistry().register(new OheriumPickaxe());
        event.getRegistry().register(new OheriumAxe());
        event.getRegistry().register(new OheriumShovel());
        event.getRegistry().register(new OheriumHoe());
    }
}

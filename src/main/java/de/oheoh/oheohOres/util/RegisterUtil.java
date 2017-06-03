package de.oheoh.oheohOres.util;

import de.oheoh.oheohOres.oheohOres;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by oheoh on 30.05.2017 18:21 Uhr for oheohOres.
 */
public class RegisterUtil {
    public static void registerAll(FMLPreInitializationEvent event) {

    }

    public static void registerBlocks(FMLPreInitializationEvent event, Block... blocks) {
        oheohOres.LOGGER.info("Registering blocks: ");
        for (Block block : blocks) {
            oheohOres.LOGGER.info("\tRegistering " + block.getUnlocalizedName().substring(5));
            final ItemBlock itemblock = new ItemBlock(block);
            if (event.getSide() == Side.CLIENT) {
                GameRegistry.register(block);
                GameRegistry.register(itemblock, block.getRegistryName());
                oheohOres.LOGGER.info("\t\tRegistered!");
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
                oheohOres.LOGGER.info("\t\tModel Registered!");
            }
        }
    }

    public static void registerItems(FMLPreInitializationEvent event, Item... items) {
        oheohOres.LOGGER.info("Registering Items: ");
        for (Item item : items) {
            oheohOres.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
            if (event.getSide() == Side.CLIENT) {
                GameRegistry.register(item);
                oheohOres.LOGGER.info("\t\tRegistered!");
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
                oheohOres.LOGGER.info("\t\tModel Registered!");
            }
        }
    }
}

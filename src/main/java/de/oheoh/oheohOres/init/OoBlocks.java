package de.oheoh.oheohOres.init;

import de.oheoh.oheohOres.blocks.BlockOheriumBlock;
import de.oheoh.oheohOres.blocks.BlockOheriumOre;
import de.oheoh.oheohOres.handlers.CreativeTabsHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by oheoh on 30.05.2017 19:01 Uhr for oheohOres.
 */
public class OoBlocks {
    public static final Block oheriumBlock = new BlockOheriumBlock("oherium_block", Material.IRON, CreativeTabsHandler.oheohOresBlocks, 6F, 35F, "pickaxe", 2);
    public static final Block oheriumOre = new BlockOheriumOre("oherium_ore", Material.ROCK, CreativeTabsHandler.oheohOresBlocks, 4F, 20F, "pickaxe", 3, OoItems.oheriumDust, 0, 1);
}

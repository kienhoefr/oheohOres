package de.oheoh.oheohOres.init;

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
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * File created by oheoh on 30.05.2017 19:01 Uhr for oheohOres.
 */
public class OoBlocks {
    //Oherium blocks
    @GameRegistry.ObjectHolder("oheohores:oherium_block")
    public static final OheriumBlock oheriumBlock;

    @GameRegistry.ObjectHolder("oheohores:oherium_ore")
    public static final OheriumOre oheriumOre;
}

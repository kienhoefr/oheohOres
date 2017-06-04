package de.oheoh.oheohOres.world;

import de.oheoh.oheohOres.init.OoBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * File created by oheoh on 03.06.2017 20:24 Uhr for oheohOres.
 */
public class WorldGenOre implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case -1:
                break;
            case 0:
                //Oherium OreGen
                generateSurface(OoBlocks.oheriumOre.getDefaultState(), world, random, 7, 7, chunkX * 16, chunkZ * 16, 30);
                break;
            case 1:
                break;
        }
    }

    private void generateSurface(IBlockState block, World world, Random random, int veinSize, int chance, int chunkX, int chunkZ, int maxY) {
        for (int k = 0; k < chance; k++) {
            int firstBlockXCoord = chunkX + random.nextInt(16);
            int firstBlockZCoord = chunkZ + random.nextInt(16);
            int oheriumY = random.nextInt(maxY);
            BlockPos oheriumPos = new BlockPos(firstBlockXCoord, oheriumY, firstBlockZCoord);
            (new WorldGenMinable(block, veinSize)).generate(world, random, oheriumPos);
        }
    }
}

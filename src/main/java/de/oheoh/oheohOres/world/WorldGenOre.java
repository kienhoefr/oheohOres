package de.oheoh.oheohOres.world;

import de.oheoh.oheohOres.init.OoBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by oheoh on 03.06.2017 20:24 Uhr for oheohOres.
 */
public class WorldGenOre implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case -1:
                break;
            case 0:
                generateSurface(world, random, 7, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                break;
        }
    }

    private void generateSurface(World world, Random random, int chance, int chunkX, int chunkZ) {
        for (int k = 0; k < chance; k++) {
            int firstBlockXCoord = chunkX + random.nextInt(16);
            int firstBlockZCoord = chunkZ + random.nextInt(16);
            int oheriumY = random.nextInt(30);
            BlockPos oheriumPos = new BlockPos(firstBlockXCoord, oheriumY, firstBlockZCoord);
            (new WorldGenMinable(OoBlocks.oheriumOre.getDefaultState(), 7)).generate(world, random, oheriumPos);
        }
    }
}

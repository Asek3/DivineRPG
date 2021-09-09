package divinerpg.world.gen.tree.feature;

import net.minecraft.block.*;
import net.minecraft.tags.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;

import java.util.*;
import java.util.function.*;

public abstract class DivineTreeFeature extends Feature<BlockStateFeatureConfig> {
    protected final Supplier<SaplingBlock> sapling;

    public DivineTreeFeature(Supplier<SaplingBlock> sapling) {
        super(BlockStateFeatureConfig.CODEC);
        this.sapling = sapling;
    }

    @Override
    public boolean place(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, BlockStateFeatureConfig config) {
        return gen(reader, rand, pos);
    }

    protected abstract boolean gen(ISeedReader reader, Random rand, BlockPos pos);

    protected void setBlock(ISeedReader world, BlockPos pos, BlockState state, boolean replace) {
        if (!replace && !hasSpace(world, pos))
            return;

        world.setBlock(pos, state, 0);
    }
    protected void chanceSetBlock(ISeedReader world, BlockPos pos, BlockState state, int chance) {
        if(world.getRandom().nextInt(chance) != 0){
            return;
        }
        if (!hasSpace(world, pos))
            return;

        world.setBlock(pos, state, 0);
    }

    protected void setBlock(ISeedReader world, BlockPos pos, BlockState state) {
        setBlock(world, pos, state, false);
    }
    protected void coverTrunk(ISeedReader world, BlockPos pos, BlockState state, int min, int max, int width, boolean chanced) {
    	if(chanced) {
    		for(int i = min; i < max + 1; i++) {
        		chanceSetBlock(world, pos.offset(1 * width, i, 0), state, 1);
        		chanceSetBlock(world, pos.offset(-1 * width, i, 0), state, 1);
        		chanceSetBlock(world, pos.offset(0, i, 1 * width), state, 1);
        		chanceSetBlock(world, pos.offset(0, i, -1 * width), state, 1);
            }
		} else {
			for(int i = min; i < max + 1; i++) {
	    		setBlock(world, pos.offset(1 * width, i, 0), state);
	    		setBlock(world, pos.offset(-1 * width, i, 0), state);
	    		setBlock(world, pos.offset(0, i, 1 * width), state);
	    		setBlock(world, pos.offset(0, i, -1 * width), state);
	        }
		}
    }
    protected void coverTrunkCorners(ISeedReader world, BlockPos pos, BlockState state, int min, int max, boolean chanced) {
    	if(chanced) {
    		for(int i = min; i < max + 1; i++) {
        		chanceSetBlock(world, pos.offset(1, i, 0), state, 1);
        		chanceSetBlock(world, pos.offset(-1, i, 0), state, 1);
        		chanceSetBlock(world, pos.offset(0, i, 1), state, 1);
        		chanceSetBlock(world, pos.offset(0, i, -1), state, 1);
            }
    	} else {
    		for(int i = min; i < max + 1; i++) {
        		setBlock(world, pos.offset(1, i, 1), state);
        		setBlock(world, pos.offset(1, i, -1), state);
        		setBlock(world, pos.offset(-1, i, 1), state);
        		setBlock(world, pos.offset(-1, i, -1), state);
        	}
    	}
    }

    protected static boolean hasSpace(ISeedReader world, BlockPos pos) {
        BlockState oldState = world.getBlockState(pos);
        Block oldBlock = oldState.getBlock();

        return oldBlock.isAir(oldState, world, pos) || oldBlock.is(BlockTags.LEAVES);
    }

    protected boolean heightCheck(ISeedReader world, BlockPos pos, int maxHeight, int width) {
        if (pos.getY() >= 1 && pos.getY() + maxHeight < 256) {
            for (int i = 1; i <= maxHeight; i++) {
                for (int x = 0; x < width; x++) {
                    for (int z = 0; z < width; z++) {
                        if (!hasSpace(world, pos.offset(x, i, z)))
                            return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    protected boolean canSustain(ISeedReader world, BlockPos pos) {
        return TreeFeature.validTreePos(world, pos);
    }
}
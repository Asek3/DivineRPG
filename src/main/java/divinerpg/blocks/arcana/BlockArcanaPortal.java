package divinerpg.blocks.arcana;

import divinerpg.registries.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.fluid.*;
import net.minecraft.item.*;
import net.minecraft.particles.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.math.*;
import net.minecraft.util.math.shapes.*;
import net.minecraft.world.*;
import net.minecraft.world.server.*;
import net.minecraftforge.api.distmarker.*;

import java.util.*;

public class BlockArcanaPortal extends ContainerBlock {
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);

    public BlockArcanaPortal(String name) {
        super(AbstractBlock.Properties.of(Material.PORTAL, MaterialColor.COLOR_BLUE).noCollission().lightLevel((p_235460_0_) -> {
            return 15;
        }).strength(-1.0F, 3600000.0F).noDrops());
        setRegistryName(name);
    }

    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
//        return new PortalEntity();
    return null;
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
        return new ItemStack(this);
    }

    @Override
    public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
        if (world instanceof ServerWorld && !entity.isPassenger() && !entity.isVehicle() && entity.canChangeDimensions() && VoxelShapes.joinIsNotEmpty(VoxelShapes.create(entity.getBoundingBox().move((double)(-pos.getX()), (double)(-pos.getY()), (double)(-pos.getZ()))), state.getShape(world, pos), IBooleanFunction.AND)) {
            ServerWorld serverworld = ((ServerWorld)world).getServer().getLevel(world.dimension() == KeyRegistry.ARCANA_WORLD ? World.OVERWORLD : KeyRegistry.ARCANA_WORLD);
            if (serverworld == null) {
                return;
            }
            entity.changeDimension(serverworld);
            //TODO - place arcana portal inside arcana when teleporting
        }
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState p_180655_1_, World p_180655_2_, BlockPos p_180655_3_, Random p_180655_4_) {
        double d0 = (double)p_180655_3_.getX() + p_180655_4_.nextDouble();
        double d1 = (double)p_180655_3_.getY() + 0.8D;
        double d2 = (double)p_180655_3_.getZ() + p_180655_4_.nextDouble();
        p_180655_2_.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }

    public ItemStack getCloneItemStack(IBlockReader p_185473_1_, BlockPos p_185473_2_, BlockState p_185473_3_) {
        return ItemStack.EMPTY;
    }

    public boolean canBeReplaced(BlockState p_225541_1_, Fluid p_225541_2_) {
        return false;
    }
}
package naturix.divinerpg.objects.blocks;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.objects.blocks.itemblock.IMetaName;
import naturix.divinerpg.registry.ModBlocks;
import naturix.divinerpg.utils.handlers.EnumHandler;
import naturix.divinerpg.utils.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;


/**
 * Created by LiteWolf101 on Feb
 * /21/2019
 */
public class CandyCane extends BlockBase {
    public static final PropertyEnum COLOR = PropertyEnum.create("color", EnumHandler.XMasColorType.class);
    public CandyCane(String name) {
        super(Material.ROCK, name);
        setHardness(3f);
        setResistance(5f);
        setCreativeTab(DivineRPG.BlocksTab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumHandler.XMasColorType.RED)); // Default state
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { COLOR });
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumHandler.XMasColorType color = (EnumHandler.XMasColorType) state.getValue(COLOR);
        return color.getID();
    }

    @Override
    @SuppressWarnings("deprecation")
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(COLOR, EnumHandler.XMasColorType.values()[meta]);
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
    }

    public String getSpecialName(ItemStack stack) {
        return EnumHandler.XMasColorType.values()[stack.getItemDamage()].getName();
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (int i = 0; i < EnumHandler.XMasColorType.values().length; i++) {
            items.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public void registerModels() {
        DivineRPG.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

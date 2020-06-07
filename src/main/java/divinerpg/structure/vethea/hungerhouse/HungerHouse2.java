package divinerpg.structure.vethea.hungerhouse;

import divinerpg.DivineRPG;
import divinerpg.structure.base.DivineFixedAltitudeStructure;
import divinerpg.structure.base.DivineLargeStructure;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureStart;

public class HungerHouse2 extends DivineFixedAltitudeStructure {

    public HungerHouse2(World world, int spawnAltitude) {
        super(world, "HungerHouse", new ResourceLocation(DivineRPG.MODID, "vethea/layer1/hungerhouse2"), 15, spawnAltitude);
    }

    @Override
    protected StructureStart getStructureStart(int x, int z) {
        return new HungerHouseStart(folder, manager, x, spawnAltitude, z);
    }
}

package divinerpg.client;

import divinerpg.client.renders.layer.*;
import divinerpg.client.renders.tiles.*;
import divinerpg.registries.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.fml.client.registry.*;

import java.util.*;

public class FancyRenders {

    public static void init() {
        RenderTypeLookup.setRenderLayer(BlockRegistry.acidBlock, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.altarOfCorruption, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.ancientBrickDoor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.ancientBrickStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.ancientBrickStairsBreakable, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.ancientBrickWall, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.ancientBrickWallBreakable, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.apalachiaLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.apalachiaPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.apalachiaSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.apalachiaSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.apalachiaStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.apalachiaTallgrass, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.aquamarinePlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.aquaTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.aquaWallTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcanaHardPortalFrame, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcanaPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcanaPortalFrame, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcaniteLadder, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcaniteTubes, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcaniumExtractor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcaniumTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.arcaniumWallTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.ayeracoSpawn, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.bacterialAcid, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.barredDoor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.blossomedWeedwoodVine, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.blueChristmasLights, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.blueFence, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.blueFire, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.brittleLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.bulbatobe, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.cracklespike, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.degradedBrickDoor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.degradedBrickStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.degradedBrickStairsBreakable, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.degradedBrickWall, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.degradedBrickWallBreakable, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.demonBrambles, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.demonFurnace, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.divineLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.divineSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.dreamglow, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.dreamwoodLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.duskBloom, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.duskFlower, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.dustBrambles, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.dustLily, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenBrush, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.edenWallTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.elevantium, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.eternalArcherSpawner, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.eucalyptusPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.eucalyptusStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.experiencedCoriSpawner, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.eyePlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.fernite, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.firestockPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.firewoodLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.frostArcherSpawner, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.frostedGlass, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.frozenSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.greenChristmasLights, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.greenDulah, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.greenFence, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.greenGemtop, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.hitchakPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.hiveEgg, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.hyrewoodLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.iceikaFire, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.iceikaPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.lamonaPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.lunicAcid, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.marsinePlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.metalCaging, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.mintwoodLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.moonBud, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.moonbulbPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.moonlightFern, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.mortumBrush, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.mortumLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.mortumPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.mortumSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.mortumStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.nightmareBed, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.nightmareBed, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.pinflyPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.pinkGlowbonePlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.purpleChristmasLights, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.purpleGemtop, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.purpleGlowbonePlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.redChristmasLights, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.redFence, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.rollumSpawner, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.shimmer, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.shineGrass, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skeletonTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skeletonWallTorch, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skyPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skythernBrush, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skythernLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skythernPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skythernSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.skythernStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.soulSludgeDoor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.soulStoneDoor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass2, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass3, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass4, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass5, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass6, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass7, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.stainedGlass8, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.steelDoor, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.sunbloom, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.sunBlossom, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.sunstormSpawner, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.termasectSpawner, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.tomatoPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.veiloPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.vetheaPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.weedwoodVine, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMushroomPlant, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.wildwoodLeaves, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.wildwoodPortal, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.wildwoodSapling, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.wildwoodStairs, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.wildwoodTallgrass, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.wildwoodVine, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.yellowChristmasLights, RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockRegistry.yellowDulah, RenderType.cutoutMipped());



        ClientRegistry.bindTileEntityRenderer(TileRegistry.ALTAR_OF_CORRUPTION, RenderAltarOfCorruption::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.NIGHTMARE_BED, RenderNightmareBed::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.STATUE, RenderStatue::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.BONE_CHEST, RenderBoneChest::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.DEMON_FURNACE, RenderDemonFurnace::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.ARCANIUM_EXTRACTOR, RenderArcaniumExtractor::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.EDEN_CHEST, RenderEdenChest::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.DRAMIX_ALTAR, RenderDramixAltar::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.PARASECTA_ALTAR, RenderParasectaAltar::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.AYERACO_BEAM, RenderAyeracoBeam::new);
        ClientRegistry.bindTileEntityRenderer(TileRegistry.AYERACO_SPAWN, RenderAyeracoSpawn::new);
        //TODO - last renders
//        ClientRegistry.bindTileEntityRenderer(TileRegistry.PRESENT_BOX, RenderPresentBox::new);
//        ClientRegistry.bindTileEntityRenderer(TileRegistry.FROSTED_CHEST, RenderFROSTED_CHEST::new);

        Map<String, PlayerRenderer> skinMap = Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap();
        PlayerRenderer render;
        render = skinMap.get("default");
        render.addLayer(new PlayerHatRender<>(render));

        render = skinMap.get("slim");
        render.addLayer(new PlayerHatRender<>(render));
    }

}

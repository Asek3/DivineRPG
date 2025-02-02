package divinerpg.registries;

import divinerpg.*;
import divinerpg.client.containers.*;
import divinerpg.client.containers.screen.*;
import net.minecraft.client.gui.*;
import net.minecraft.inventory.container.*;
import net.minecraftforge.common.extensions.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.registries.*;


public class ContainerRegistry
{
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, DivineRPG.MODID);

    public static final RegistryObject<ContainerType<ArcaniumExtractorContainer>> ARCANIUM_EXTRACTOR = CONTAINER_TYPES.register("arcanium_extractor", () -> IForgeContainerType.create(ArcaniumExtractorContainer::new));
    public static final RegistryObject<ContainerType<ModChestContainer>> EDEN_CHEST = CONTAINER_TYPES.register("eden_chest", () -> IForgeContainerType.create(ModChestContainer::new));
    public static final RegistryObject<ContainerType<DreamLampContainer>> DREAM_LAMP = CONTAINER_TYPES.register("dream_lamp", () -> IForgeContainerType.create(DreamLampContainer::new));
    public static final RegistryObject<ContainerType<InfusionTableContainer>> INFUSION_TABLE = CONTAINER_TYPES.register("infusion_table", () -> IForgeContainerType.create(InfusionTableContainer::new));

    public static void registerScreenFactories() {
        ScreenManager.register(ContainerRegistry.ARCANIUM_EXTRACTOR.get(), ArcaniumExtractorScreen::new);
        ScreenManager.register(ContainerRegistry.EDEN_CHEST.get(), EdenChestScreen::new);
        ScreenManager.register(ContainerRegistry.DREAM_LAMP.get(), DreamLampScreen::new);
        ScreenManager.register(ContainerRegistry.INFUSION_TABLE.get(), InfusionTableScreen::new);
    }
}

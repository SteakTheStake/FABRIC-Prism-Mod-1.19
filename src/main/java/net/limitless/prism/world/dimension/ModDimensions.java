package net.limitless.prism.world.dimension;

import net.limitless.prism.Prism;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;

public class ModDimensions {
    private static final RegistryKey<DimensionOptions> SMOOTH_DIMENSION_KEY = RegistryKey.of(Registry.DIMENSION_KEY,
            new Identifier(Prism.MOD_ID, "smooth"));
    public static RegistryKey<World> SMOOTH_KEY = RegistryKey.of(Registry.WORLD_KEY, SMOOTH_DIMENSION_KEY.getValue());

    private static final RegistryKey<DimensionOptions> DUNES_DIMENSION_KEY = RegistryKey.of(Registry.DIMENSION_KEY,
            new Identifier(Prism.MOD_ID, "dunes"));
    public static RegistryKey<World> DUNES_KEY = RegistryKey.of(Registry.WORLD_KEY, DUNES_DIMENSION_KEY.getValue());

    public static void register() {
        Prism.LOGGER.debug("Registering ModDimensions for " + Prism.MOD_ID);
    }
}
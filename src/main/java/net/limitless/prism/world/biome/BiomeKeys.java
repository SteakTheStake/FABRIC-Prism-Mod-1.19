package net.limitless.prism.world.biome;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public abstract class BiomeKeys {
    public static final RegistryKey<Biome> SMOOTH = register("smooth");
    public static final RegistryKey<Biome> ROLLING_HILLS = register("rolling_hills");
    public static final RegistryKey<Biome> MOUNTAINS = register("mountain");


    public BiomeKeys() {
    }

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
}

package net.limitless.prism.world.dimension;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.limitless.prism.Prism;
import net.limitless.prism.block.ModBlocks;
import net.limitless.prism.item.ModItems;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModPortals {

    public static final RegistryKey<World> SMOOTH_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(Prism.MOD_ID, "smooth"));
    public static final RegistryKey<DimensionType> SMOOTH_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            SMOOTH_DIMENSION_KEY.getValue());


    public static final RegistryKey<World> DUNES_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(Prism.MOD_ID, "dunes"));
    public static final RegistryKey<DimensionType> DUNES_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            DUNES_DIMENSION_KEY.getValue());


    public static void registerPortals() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.CASTLE_BLOCK)
                .destDimID(SMOOTH_DIMENSION_KEY.getValue())
                .tintColor(255, 255, 0)
                .lightWithItem(ModItems.BIG_TORCH)
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.MARBLE_TILES)
                .destDimID(DUNES_DIMENSION_KEY.getValue())
                .tintColor(255, 0, 255)
                .lightWithItem(ModItems.BIG_TORCH)
                .registerPortal();
    }
}
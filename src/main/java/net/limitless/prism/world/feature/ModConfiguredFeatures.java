package net.limitless.prism.world.feature;

import net.limitless.prism.Prism;
import net.limitless.prism.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {




    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PALM_TREE =
            ConfiguredFeatures.register("palm_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PALM_LOG_THIN),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.PALM_LEAVES_TOP),
                    new BushFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(1, 1, 1)).dirtProvider(BlockStateProvider.of(Blocks.SAND)).build());

    public static final RegistryEntry<PlacedFeature> PALM_CHECKED = PlacedFeatures.register("palm_checked",
            ModConfiguredFeatures.PALM_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.PALM_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PALM_SPAWN =
            ConfiguredFeatures.register("palm_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PALM_CHECKED, 0.8f)),
                            PALM_CHECKED));


    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Prism.MOD_ID, name));
    }

    private static ConfiguredFeature<TreeFeatureConfig, ?> register(String name,
                                                                    ConfiguredFeature<TreeFeatureConfig, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Prism.MOD_ID, name),
                configuredFeature);
    }

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Prism.MOD_ID);
    }
}

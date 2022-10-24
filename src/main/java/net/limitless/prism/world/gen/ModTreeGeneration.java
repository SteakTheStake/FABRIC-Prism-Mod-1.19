package net.limitless.prism.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.limitless.prism.world.biome.BiomeKeys;
import net.limitless.prism.world.feature.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModTreeGeneration {
        public static void generateTrees() {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SMOOTH),
                    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALM_PLACED.getKey().get());
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ROLLING_HILLS),
                    GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_BIRCH_AND_OAK.getKey().get());
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MOUNTAINS),
                    GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_GRASS_FOREST.getKey().get());
        }
}

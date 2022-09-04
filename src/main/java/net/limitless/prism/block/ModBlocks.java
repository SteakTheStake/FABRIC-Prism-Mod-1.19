package net.limitless.prism.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.limitless.prism.Prism;
import net.limitless.prism.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block CastleBlockTop = registerBlock("castle_block_top",
            new CastleBlockTop(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.STONE);

    public static final Block CastleBlockWindow = registerBlock("castle_block_window",
            new CastleBlockTop(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.STONE);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID, name), block);
    }



    public static void registerModBlocks() {
        Prism.LOGGER.debug("Registering ModBlocks for " + Prism.MOD_ID);
    }


}

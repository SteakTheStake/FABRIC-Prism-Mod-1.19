package net.limitless.prism.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.limitless.prism.Prism;
import net.limitless.prism.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ModBlocks {
    public static final Block CastleBlockTop = registerBlock("castle_block_top",
            new CastleBlockTop(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.STONE);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID, name), block);
    }



    public static void registerModBlocks() {
        Prism.LOGGER.debug("Registering ModBlocks for " + Prism.MOD_ID);
    }


}

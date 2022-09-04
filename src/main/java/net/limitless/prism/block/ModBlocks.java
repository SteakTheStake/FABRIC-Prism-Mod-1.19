package net.limitless.prism.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.limitless.prism.Prism;
import net.limitless.prism.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
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
    public static final Block CASTLE_BLOCK_TOP = registerBlock("castle_block_top",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.STONE);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Prism.LOGGER.debug("Registering ModBlocks for " + Prism.MOD_ID);
    }

    public class CASTLE_BLOCK_TOP extends Block {
        public CASTLE_BLOCK_TOP(Settings settings) {
            super(settings);
        }
        @Override

        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){

            return VoxelShapes.union(

                    createCuboidShape(0f, 0f, 0f, 16f, 10f, 16f),

                    createCuboidShape(0f, 10f, 12f, 16f, 16f, 16f),

                    createCuboidShape(0f, 10f, 4f, 16f, 16f, 8f)
            );
        }
    }
}

package net.limitless.prism.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CastleBlock extends Block {
    public CastleBlock(FabricBlockSettings collidable) {
        super(FabricBlockSettings.of(Material.STONE));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        return VoxelShapes.union(
                createCuboidShape(0f, 0f, 0f, 16f, 16f, 16f)
        );
    }


}

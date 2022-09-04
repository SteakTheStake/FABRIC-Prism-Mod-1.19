package net.limitless.prism.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CastleBlockWindow extends FacingBlock {
    public CastleBlockWindow(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        return VoxelShapes.union(
                createCuboidShape(0f, 1f, 0f, 16f, 15f, 1f),
                createCuboidShape(0f, 0f, 0f, 16f, 1f, 16f),
                createCuboidShape(0f, 1f, 0f, 16f, 16f,16f),
                createCuboidShape(0f, 15f, 0f, 16f, 16f,16f),
                createCuboidShape(0f, 1f, 15f, 16f, 15f, 16f),
                createCuboidShape(7.5f, 1f, 1f, 8f, 2f, 15f),
                createCuboidShape(7.5f, 14f, 1f, 8f, 15f, 15f),
                createCuboidShape(7.5f, 2f, 14f, 8f, 14f, 15f),
                createCuboidShape(7.5f, 2f, 1f, 8f, 14f, 2f)
        );
    }
}
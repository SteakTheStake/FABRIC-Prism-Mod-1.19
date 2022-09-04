package net.limitless.prism.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CastleBlockTop extends FacingBlock {
    public CastleBlockTop(Settings settings) {
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
package net.limitless.prism.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import javax.annotation.Nullable;

public class CastleBlockWindow extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

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

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.FACING);
    }

}
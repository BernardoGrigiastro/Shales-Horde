package net.shale.horde.deco.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class SideStairsBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(Block.createCuboidShape(8, 0, 0, 16, 16, 16), Block.createCuboidShape(0, 0, 8, 8, 16, 16), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 8, 16, 16, 16), Block.createCuboidShape(0, 0, 0, 8, 16, 8), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 8, 16, 16), Block.createCuboidShape(8, 0, 0, 16, 16, 8), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 16, 16, 8), Block.createCuboidShape(8, 0, 8, 16, 16, 16), BooleanBiFunction.OR);

    public SideStairsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}

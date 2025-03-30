package net.memezforbeanz.starminerodyssey.blocks;

import dev.enjarai.amethystgravity.block.AbstractFieldGeneratorBlock;
import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.memezforbeanz.starminerodyssey.blockentities.custom.StellarGravityBlockEntity;
import net.memezforbeanz.starminerodyssey.registry.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.Nullable;

public class StellarGravityBlock extends AbstractFieldGeneratorBlock<StellarGravityBlockEntity> {
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    public StellarGravityBlock(BlockBehaviour.Properties settings) {
        super(true, settings);
    }

    public BlockEntityType<StellarGravityBlockEntity> getBlockEntity() {
        return ModBlockEntityTypes.STELLARGRAVITY.get();
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StellarGravityBlockEntity(pos, state);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity, ItemStack itemStack) {
        StarminerAdditions.LOGGER.info("NIGGERS!");
        level.setBlockAndUpdate(blockPos, blockState);
        level.setBlock(blockPos, this.defaultBlockState(), 3);
    }

}

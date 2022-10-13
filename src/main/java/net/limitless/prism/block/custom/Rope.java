package net.limitless.prism.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.decoration.LeashKnotEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.GameEvent.Emitter;

import java.util.Iterator;
import java.util.List;

public class Rope extends Item {
    public Rope(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isIn(BlockTags.FENCES)) {
            PlayerEntity playerEntity = context.getPlayer();
            if (!world.isClient && playerEntity != null) {
                attachHeldMobsToBlock(playerEntity, world, blockPos);
            }

            world.emitGameEvent(GameEvent.BLOCK_ATTACH, blockPos, Emitter.of(playerEntity));
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    public static ActionResult attachHeldMobsToBlock(PlayerEntity player, World world, BlockPos pos) {
        LeashKnotEntity leashKnotEntity = null;
        boolean bl = false;
        double d = 7.0D;
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();
        List<MobEntity> list = world.getNonSpectatingEntities(MobEntity.class, new Box((double)i - 7.0D, (double)j - 7.0D, (double)k - 7.0D, (double)i + 7.0D, (double)j + 7.0D, (double)k + 7.0D));
        Iterator var11 = list.iterator();

        while(var11.hasNext()) {
            MobEntity mobEntity = (MobEntity)var11.next();
            if (mobEntity.getHoldingEntity() == player) {
                if (leashKnotEntity == null) {
                    leashKnotEntity = LeashKnotEntity.getOrCreate(world, pos);
                    leashKnotEntity.onPlace();
                }

                mobEntity.attachLeash(leashKnotEntity, true);
                bl = true;
            }
        }

        return bl ? ActionResult.SUCCESS : ActionResult.PASS;
    }
}

package net.limitless.prism;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.limitless.prism.block.ModBlocks;
import net.limitless.prism.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prism implements ModInitializer {
	public static final String MOD_ID = "prism";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup construction = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"construction"))
			.icon(() -> new ItemStack(ModBlocks.HOUSE_WALL))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.DIRTY_COBBLESTONE));
				stacks.add(new ItemStack(ModBlocks.HOUSE_WALL));
				stacks.add(new ItemStack(ModBlocks.HOUSE_TUDOR_WALL));
				stacks.add(new ItemStack(ModBlocks.HOUSE_TUDOR_WALL_EXTRA));
				stacks.add(new ItemStack(ModBlocks.VILLAGE_BLOCK));
				stacks.add(new ItemStack(ModBlocks.WOODEN_FLOOR));
				stacks.add(new ItemStack(ModBlocks.WOODEN_WALL));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK_TOP));
				stacks.add(new ItemStack(ModBlocks.CASTLE_ARCH));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK_WINDOW));
				stacks.add(new ItemStack(ModBlocks.BIG_ARCH));
				stacks.add(new ItemStack(ModBlocks.WOODEN_WALL_PIECE));
				stacks.add(new ItemStack(ModBlocks.DESERT_FLOOR));
				stacks.add(new ItemStack(ModBlocks.DESERT_FLOOR_TILES));
				stacks.add(new ItemStack(ModBlocks.RED_DESERT_FLOOR_TILES));
				stacks.add(new ItemStack(ModBlocks.MARBLE_TILES));
				stacks.add(new ItemStack(ModBlocks.SHOP_COVER_RIGHT));
				stacks.add(new ItemStack(ModBlocks.SHOP_COVER_MIDDLE));
				stacks.add(new ItemStack(ModBlocks.SHOP_COVER_LEFT));
				stacks.add(new ItemStack(ModBlocks.DESERT_BRICK));
				stacks.add(new ItemStack(ModBlocks.DESERT_BRICK_TOP));
				stacks.add(new ItemStack(ModBlocks.DESERT_BRICK_WINDOW));
				stacks.add(new ItemStack(ModBlocks.DESERT_BRICK_ARCH));
				stacks.add(new ItemStack(ModBlocks.THATCHED_ROOF));
				stacks.add(new ItemStack(ModBlocks.STAIRS));
				stacks.add(new ItemStack(ModBlocks.FENCE));
			})
			.build();

	public static final ItemGroup foliage = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"foliage"))
			.icon(() -> new ItemStack(ModBlocks.PALM_LOG_BIG))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.PALM_LOG_BIG));
				stacks.add(new ItemStack(ModBlocks.PALM_LOG_THIN));
				stacks.add(new ItemStack(ModBlocks.PALM_LEAVES));
				stacks.add(new ItemStack(ModBlocks.PALM_LEAVES_TOP));
				stacks.add(new ItemStack(ModBlocks.PALM_SAPLING));
				stacks.add(new ItemStack(ModBlocks.TROPICAL_PLANT));

			})
			.build();

	public static final ItemGroup furniture = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"furniture"))
			.icon(() -> new ItemStack(ModBlocks.DINGING_ROOM_CHAIR))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.DINGING_ROOM_CHAIR));
				stacks.add(new ItemStack(ModBlocks.ROPE_BLOCK));
				stacks.add(new ItemStack(ModBlocks.CLOTHES_1));
				stacks.add(new ItemStack(ModBlocks.CLOTHES_2));
				stacks.add(new ItemStack(ModBlocks.CLOTHES_3));
			})
			.build();

	public static final ItemGroup decoration = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"decoration"))
			.icon(() -> new ItemStack(ModBlocks.BARREL))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.CLOVER_PATCH));
				stacks.add(new ItemStack(ModBlocks.BARREL));
				stacks.add(new ItemStack(ModBlocks.BARREL_OPEN));
				stacks.add(new ItemStack(ModBlocks.BREAKFAST_SAVORY));
				stacks.add(new ItemStack(ModBlocks.BREAKFAST_SWEET));
				stacks.add(new ItemStack(ModBlocks.BIG_TORCH));
				stacks.add(new ItemStack(ModBlocks.WALL_BIG_TORCH));

			})
			.build();

	public static final ItemGroup terrain = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"terrain"))
			.icon(() -> new ItemStack(ModBlocks.COARSE_DIRT))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.GRASS));
				stacks.add(new ItemStack(ModBlocks.SAND));
				stacks.add(new ItemStack(ModBlocks.STONE));
				stacks.add(new ItemStack(ModBlocks.COARSE_DIRT));
				stacks.add(new ItemStack(ModBlocks.MUD));
				stacks.add(new ItemStack(ModBlocks.ANDESITE));
				stacks.add(new ItemStack(ModBlocks.DIORITE));
				stacks.add(new ItemStack(ModBlocks.GRANITE));
			})
			.build();

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerItems();

	}
}

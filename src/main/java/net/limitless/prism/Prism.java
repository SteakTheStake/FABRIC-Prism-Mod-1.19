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
			.icon(() -> new ItemStack(ModBlocks.DIRTY_COBBLESTONE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.DIRTY_COBBLESTONE));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK_TOP));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK_WINDOW));
				stacks.add(new ItemStack(ModBlocks.THATCHED_ROOF));
				stacks.add(new ItemStack(ModBlocks.VILLAGE_BLOCK));
			})
			.build();

	public static final ItemGroup furniture = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"furniture"))
			.icon(() -> new ItemStack(ModBlocks.DINGING_ROOM_CHAIR))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.DINGING_ROOM_CHAIR));
			})
			.build();

	public static final ItemGroup decoration = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID,"decoration"))
			.icon(() -> new ItemStack(ModBlocks.CLOVER_PATCH))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.CLOVER_PATCH));

			})
			.build();


	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerItems();

	}
}

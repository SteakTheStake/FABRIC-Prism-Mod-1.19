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
			.icon(() -> new ItemStack(ModBlocks.CASTLE_BLOCK))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.DIRTY_COBBLESTONE));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK_TOP));
				stacks.add(new ItemStack(ModBlocks.CASTLE_BLOCK_WINDOW));
			})
			.build();

	//public static final ItemGroup furniture = FabricItemGroupBuilder.create(
	//		new Identifier(MOD_ID,"furniture"))
	//		.icon(() -> new ItemStack(ModBlocks.TWO_DOOR_WARDROBE))
	//		.appendItems(stacks -> {
	//			stacks.add(new ItemStack(ModBlocks.TWO_DOOR_WARDROBE));
	//			stacks.add(new ItemStack(ModBlocks.GRAY_SHELF));
	//			stacks.add(new ItemStack(ModBlocks.GRAY_WARDROBE));
	//			stacks.add(new ItemStack(ModBlocks.WHITE_SHELF));
	//			stacks.add(new ItemStack(ModBlocks.WHITE_WARDROBE));
	//			stacks.add(new ItemStack(ModBlocks.WHITE_DESK));
	//			stacks.add(new ItemStack(ModBlocks.WHITE_DOORS));
	//			stacks.add(new ItemStack(ModBlocks.GAMING_CHAIR));
	//			stacks.add(new ItemStack(ModBlocks.COUNTER_SINK));
	//			stacks.add(new ItemStack(ModBlocks.DARKWOOD_DRAWER));
	//		})
	//		.build();

	//public static final ItemGroup decorations = FabricItemGroupBuilder.create(
	//		new Identifier(MOD_ID,"decorations"))
	//		.icon(() -> new ItemStack(ModBlocks.BOOKS1))
	//		.appendItems(stacks -> {
	//			stacks.add(new ItemStack(ModBlocks.BOOKS1));
	//			stacks.add(new ItemStack(ModBlocks.BIG_LAMP));
	//			stacks.add(new ItemStack(ModBlocks.PAINTING));

	//		})
	//		.build();


	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerItems();

	}
}

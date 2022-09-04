package net.limitless.prism;

import net.fabricmc.api.ModInitializer;
import net.limitless.prism.block.ModBlocks;
import net.limitless.prism.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prism implements ModInitializer {
	public static final String MOD_ID = "prism";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

	}
}

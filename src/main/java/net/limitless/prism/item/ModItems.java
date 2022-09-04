package net.limitless.prism.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.limitless.prism.Prism;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CASTLE_BLOCK_TOP = registerBlockItem("castle_block_top",
            new Item(new FabricItemSettings().group(ModItemGroup.STONE)));
    public static final Item CASTLE_BLOCK_WINDOW = registerBlockItem("castle_block_window",
            new Item(new FabricItemSettings().group(ModItemGroup.STONE)));


    private static Item registerBlockItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Prism.LOGGER.debug("Registering Mod Items for " + Prism.MOD_ID);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

}

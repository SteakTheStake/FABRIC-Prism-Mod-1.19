package net.limitless.prism.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.limitless.prism.Prism;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block DIRTY_COBBLESTONE = new DirtyCobblestone(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block CASTLE_BLOCK = new CastleBlock(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block CASTLE_BLOCK_TOP = new CastleBlockTop(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block CASTLE_BLOCK_WINDOW = new CastleBlockWindow(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));

    public static void registerModBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"dirty_cobblestone"), DIRTY_COBBLESTONE);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"dirty_cobblestone"), new BlockItem(DIRTY_COBBLESTONE, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"castle_block"), CASTLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"castle_block"), new BlockItem(CASTLE_BLOCK, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"castle_block_top"), CASTLE_BLOCK_TOP);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"castle_block_top"), new BlockItem(CASTLE_BLOCK_TOP, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"castle_block_window"), CASTLE_BLOCK_WINDOW);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"castle_block_window"), new BlockItem(CASTLE_BLOCK_WINDOW, new Item.Settings()));
    }

}

package net.limitless.prism.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.limitless.prism.Prism;
import net.limitless.prism.block.custom.*;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block DIRTY_COBBLESTONE = new DirtyCobblestone(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block VILLAGE_BLOCK = new VillageBlock(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block CASTLE_BLOCK = new CastleBlock(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block CASTLE_BLOCK_TOP = new CastleBlockTop(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block CASTLE_BLOCK_WINDOW = new CastleBlockWindow(FabricBlockSettings.of(Material.STONE).nonOpaque().collidable(true));
    public static final Block THATCHED_ROOF = new ThatchedRoof(FabricBlockSettings.of(Material.WOOD).nonOpaque().collidable(true));
    public static final Block DINGING_ROOM_CHAIR = new DiningRoomChair(FabricBlockSettings.of(Material.WOOD).nonOpaque().collidable(true));
    public static final Block CLOVER_PATCH = new CloverPatch(FabricBlockSettings.of(Material.LEAVES).nonOpaque().collidable(false));
    public static final Block BARREL = new Barrel(FabricBlockSettings.of(Material.WOOD).nonOpaque().collidable(true));
    public static final Block BARREL_OPEN = new BarrelOpen(FabricBlockSettings.of(Material.WOOD).nonOpaque().collidable(true));
    public static final Block STAIRS = new Stairs(FabricBlockSettings.of(Material.WOOD).nonOpaque().collidable(true));

    public static void registerModBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"village_block"), VILLAGE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"village_block"), new BlockItem(VILLAGE_BLOCK, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"dirty_cobblestone"), DIRTY_COBBLESTONE);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"dirty_cobblestone"), new BlockItem(DIRTY_COBBLESTONE, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"castle_block"), CASTLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"castle_block"), new BlockItem(CASTLE_BLOCK, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"castle_block_top"), CASTLE_BLOCK_TOP);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"castle_block_top"), new BlockItem(CASTLE_BLOCK_TOP, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"castle_block_window"), CASTLE_BLOCK_WINDOW);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"castle_block_window"), new BlockItem(CASTLE_BLOCK_WINDOW, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"thatched_roof"), THATCHED_ROOF);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"thatched_roof"), new BlockItem(THATCHED_ROOF, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"dining_room_chair"), DINGING_ROOM_CHAIR);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"dining_room_chair"), new BlockItem(DINGING_ROOM_CHAIR, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"clover_patch"), CLOVER_PATCH);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"clover_patch"), new BlockItem(CLOVER_PATCH, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"barrel"), BARREL);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"barrel"), new BlockItem(BARREL, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"barrel_open"), BARREL_OPEN);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"barrel_open"), new BlockItem(BARREL_OPEN, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(Prism.MOD_ID,"stairs"), STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID,"stairs"), new BlockItem(STAIRS, new Item.Settings()));
    }

}

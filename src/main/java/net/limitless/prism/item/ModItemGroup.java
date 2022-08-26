package net.limitless.prism.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.limitless.prism.Prism;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CASTLE_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(Prism.MOD_ID, "prism"), () -> new ItemStack(ModItems.CASTLE_BLOCK_TOP));
}

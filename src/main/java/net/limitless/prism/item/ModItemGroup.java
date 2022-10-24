package net.limitless.prism.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.limitless.prism.Prism;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup PRISM = FabricItemGroupBuilder.build(new Identifier(Prism.MOD_ID, "big_torch"),
            () -> new ItemStack(ModItems.BIG_TORCH));
}

package net.limitless.prism.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.limitless.prism.Prism;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BIG_TORCH = registerItem("big_torch",
            new Item(new FabricItemSettings().group(ModItemGroup.PRISM)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Prism.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Prism.LOGGER.info("Registering Mod Items for " + Prism.MOD_ID);
    }
}
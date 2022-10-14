package net.limitless.prism.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BasketOfApple extends Block {
    public BasketOfApple(FabricBlockSettings collidable) {
        super(FabricBlockSettings.of(Material.WOOD));
    }

}

package net.limitless.prism.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CastleBlock extends Block {
    public CastleBlock(FabricBlockSettings collidable) {
        super(FabricBlockSettings.of(Material.STONE));
    }

}

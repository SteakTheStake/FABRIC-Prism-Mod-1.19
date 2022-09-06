package net.limitless.prism.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class DirtyCobblestone extends Block {
    public DirtyCobblestone(FabricBlockSettings collidable){
        super(FabricBlockSettings.of(Material.STONE));
    }

}

package net.unitium.wayponmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.Waypon;
import net.unitium.wayponmod.block.ModBlocks;


public class ModBlockEntities {

    public static final BlockEntityType<ForgeBlockEntity> FORGE_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Waypon.MOD_ID, "forge"),
            FabricBlockEntityTypeBuilder.create(ForgeBlockEntity::new, ModBlocks.FORGE).build());


    public static void registerBlockEntities() {
        Waypon.LOGGER.info("Registering Block Entities for " + Waypon.MOD_ID);
    }
}

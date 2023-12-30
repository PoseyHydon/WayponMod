package net.unitium.wayponmod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.unitium.wayponmod.block.entity.ModBlockEntities;
import net.unitium.wayponmod.block.entity.renderer.ForgeBlockEntityRenderer;
import net.unitium.wayponmod.screen.ForgeScreen;
import net.unitium.wayponmod.screen.ModScreenHandlers;

public class WayponClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.FORGE_SCREEN_HANDLER, ForgeScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.FORGE_BLOCK_ENTITY, ForgeBlockEntityRenderer::new);
    }
}

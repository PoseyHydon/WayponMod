package net.unitium.wayponmod.screen;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.Waypon;

public class ModScreenHandlers {

    public static final ScreenHandlerType<ForgeScreenHandler> FORGE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Waypon.MOD_ID, "forge"),
                    new ExtendedScreenHandlerType<>(ForgeScreenHandler::new));

    public static void registerScreenHandlers() {
        Waypon.LOGGER.info("Registering Screen Handlers for " + Waypon.MOD_ID);
    }
}

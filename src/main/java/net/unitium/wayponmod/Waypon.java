package net.unitium.wayponmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.item.ModItems;
import net.unitium.wayponmod.item.ModItemsGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Waypon implements ModInitializer {
	public static final	String MOD_ID = "waypon";
    public static final Logger LOGGER = LoggerFactory.getLogger("waypon");

	@Override
	public void onInitialize() {

		ModItemsGroup.registerItemGroup();

		ModItems.registerModItems();

	}
}
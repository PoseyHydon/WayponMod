package net.unitium.wayponmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.unitium.wayponmod.datagen.ModBlocktagProvider;
import net.unitium.wayponmod.datagen.ModModelProvider;
import net.unitium.wayponmod.datagen.ModRecipeGenerator;

public class WayponDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModBlocktagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
	}
}

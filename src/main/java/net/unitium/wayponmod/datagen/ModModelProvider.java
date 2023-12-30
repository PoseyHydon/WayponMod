package net.unitium.wayponmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.unitium.wayponmod.data.client.ModModels;
import net.unitium.wayponmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_BIG_SWORD, ModModels.BIG_SWORD);



        itemModelGenerator.register(ModItems.WOODEN_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.STONE_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.IRON_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.COPPER_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.GOLD_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.DIAMOND_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.EMERALD_RAPIERE, ModModels.RAPIERE);
        itemModelGenerator.register(ModItems.NETHERITE_RAPIERE, ModModels.RAPIERE);

    }

}

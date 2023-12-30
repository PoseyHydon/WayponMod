package net.unitium.wayponmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.unitium.wayponmod.data.client.ModModels;
import net.unitium.wayponmod.item.ModItems;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ModModelProvider extends FabricModelProvider {

    private static final Map<String, Model> weaponModelMap = new HashMap<>();

    static {
        // Associez chaque nom d'arme à son modèle correspondant
        weaponModelMap.put("RAPIERE", ModModels.RAPIERE);
        weaponModelMap.put("BIG_SWORD", ModModels.BIG_SWORD);
        weaponModelMap.put("KATANA", ModModels.KATANA);
        // Ajoutez d'autres associations au besoin
    }


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_BIG_SWORD, ModModels.BIG_SWORD);

        for (Item item : ModItems.RAPIERES) {
            generateWeapon("RAPIERE", item, itemModelGenerator);
        }

        for (Item item : ModItems.BIG_SWORD) {
            generateWeapon("BIG_SWORD", item, itemModelGenerator);
        }

        for (Item item : ModItems.KATANA) {
            generateWeapon("KATANA", item, itemModelGenerator);
        }

    }

    public void generateWeapon(String name, Item item, ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(item, weaponModelMap.get(name));
    }

}

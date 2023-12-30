package net.unitium.wayponmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.registry.Registries;
import net.unitium.wayponmod.Waypon;

public class ModItem {


    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Waypon.MOD_ID, name), item);

    }

    private static void itemlmGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(RAPIERE)
    }
}

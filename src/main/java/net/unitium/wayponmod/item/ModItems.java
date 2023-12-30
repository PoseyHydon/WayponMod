package net.unitium.wayponmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.Waypon;

public class ModItems {


    public static final Item RAPIERE = registerItem("rapiere",
            new SwordItem(ToolMaterials.IRON, 1, 0.0f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Waypon.MOD_ID, name), item);

    }
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(RAPIERE);
    }

    public static void registerModItems() {
        Waypon.LOGGER.info("Registering Mod Items for " + Waypon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}


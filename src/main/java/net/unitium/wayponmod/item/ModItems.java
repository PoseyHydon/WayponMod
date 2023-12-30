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


    public static final Item WOODEN_RAPIERE = registerItem("wooden_rapiere",
            new SwordItem(ToolMaterials.WOOD, 2, 11f, new FabricItemSettings()));
    public static final Item STONE_RAPIERE = registerItem("stone_rapiere",
            new SwordItem(ToolMaterials.STONE, 3, 11f, new FabricItemSettings()));
    public static final Item IRON_RAPIERE = registerItem("iron_rapiere",
            new SwordItem(ToolMaterials.IRON, 4, 11f, new FabricItemSettings()));
    public static final Item GOLD_RAPIERE = registerItem("gold_rapiere",
            new SwordItem(ToolMaterials.GOLD, 2, 11f, new FabricItemSettings()));
    public static final Item COPPER_RAPIERE = registerItem("copper_rapiere",
            new SwordItem(ModToolMaterial.COPPER, 4, 11f, new FabricItemSettings()));
    public static final Item DIAMOND_RAPIERE = registerItem("diamond_rapiere",
            new SwordItem(ToolMaterials.DIAMOND, 5, 11f, new FabricItemSettings()));
    public static final Item EMERALD_RAPIERE = registerItem("emerald_rapiere",
            new SwordItem(ModToolMaterial.EMERALD, 5, 11f, new FabricItemSettings()));
    public static final Item NETHERITE_RAPIERE = registerItem("netherite_rapiere",
            new SwordItem(ToolMaterials.NETHERITE, 6, 11f, new FabricItemSettings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Waypon.MOD_ID, name), item);

    }
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(WOODEN_RAPIERE);
    }

    public static void registerModItems() {
        Waypon.LOGGER.info("Registering Mod Items for " + Waypon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}


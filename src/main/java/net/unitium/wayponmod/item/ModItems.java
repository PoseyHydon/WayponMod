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

import java.util.ArrayList;

public class ModItems {

    public static ArrayList<Item> RAPIERES = new ArrayList<>();

    public static ArrayList<Item> BIG_SWORD = new ArrayList<>();

    public static ArrayList<Item> KATANA = new ArrayList<>();


    public static final Item WOODEN_RAPIERE = registerItem("wooden_rapiere",
            new SwordItem(ToolMaterials.WOOD, 2, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item STONE_RAPIERE = registerItem("stone_rapiere",
            new SwordItem(ToolMaterials.STONE, 3, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item IRON_RAPIERE = registerItem("iron_rapiere",
            new SwordItem(ToolMaterials.IRON, 4, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item GOLD_RAPIERE = registerItem("gold_rapiere",
            new SwordItem(ToolMaterials.GOLD, 2, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item COPPER_RAPIERE = registerItem("copper_rapiere",
            new SwordItem(ModToolMaterial.COPPER, 4, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item DIAMOND_RAPIERE = registerItem("diamond_rapiere",
            new SwordItem(ToolMaterials.DIAMOND, 5, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item EMERALD_RAPIERE = registerItem("emerald_rapiere",
            new SwordItem(ModToolMaterial.EMERALD, 5, 9f, new FabricItemSettings()), RAPIERES);
    public static final Item NETHERITE_RAPIERE = registerItem("netherite_rapiere",
            new SwordItem(ToolMaterials.NETHERITE, 6, 9f, new FabricItemSettings()), RAPIERES);



    public static final Item WOODEN_BIG_SWORD = registerItem("wooden_big_sword",
            new SwordItem(ToolMaterials.WOOD, 4, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item STONE_BIG_SWORD = registerItem("stone_big_sword",
            new SwordItem(ToolMaterials.STONE, 5, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item IRON_BIG_SWORD = registerItem("iron_big_sword",
            new SwordItem(ToolMaterials.IRON, 6, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item GOLD_BIG_SWORD = registerItem("gold_big_sword",
            new SwordItem(ToolMaterials.GOLD, 4, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item COPPER_BIG_SWORD = registerItem("copper_big_sword",
            new SwordItem(ModToolMaterial.COPPER, 6, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item DIAMOND_BIG_SWORD = registerItem("diamond_big_sword",
            new SwordItem(ToolMaterials.DIAMOND, 7, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item EMERALD_BIG_SWORD = registerItem("emerald_big_sword",
            new SwordItem(ModToolMaterial.EMERALD, 7, 1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item NETHERITE_BIG_SWORD = registerItem("netherite_big_sword",
            new SwordItem(ToolMaterials.NETHERITE, 8, 1f, new FabricItemSettings()), BIG_SWORD);



    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, 2, 7f, new FabricItemSettings()), KATANA);
    public static final Item STONE_KATANA = registerItem("stone_big_sword",
            new SwordItem(ToolMaterials.STONE, 3, 7f, new FabricItemSettings()), KATANA);
    public static final Item IRON_KATANA = registerItem("iron_big_sword",
            new SwordItem(ToolMaterials.IRON, 4, 7f, new FabricItemSettings()), KATANA);
    public static final Item GOLD_KATANA = registerItem("gold_big_sword",
            new SwordItem(ToolMaterials.GOLD, 2, 7f, new FabricItemSettings()), KATANA);
    public static final Item COPPER_KATANA = registerItem("copper_big_sword",
            new SwordItem(ModToolMaterial.COPPER, 4, 7f, new FabricItemSettings()), KATANA);
    public static final Item DIAMOND_KATANA = registerItem("diamond_big_sword",
            new SwordItem(ToolMaterials.DIAMOND, 5, 7f, new FabricItemSettings()), KATANA);
    public static final Item EMERALD_KATANA = registerItem("emerald_big_sword",
            new SwordItem(ModToolMaterial.EMERALD, 5, 7f, new FabricItemSettings()), KATANA);
    public static final Item NETHERITE_KATANA = registerItem("netherite_big_sword",
            new SwordItem(ToolMaterials.NETHERITE, 6, 7f, new FabricItemSettings()), KATANA);



    private static Item registerItem(String name, Item item, ArrayList<Item> list) {
        list.add(item);

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


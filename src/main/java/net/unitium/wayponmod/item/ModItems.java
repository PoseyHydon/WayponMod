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

    public static ArrayList<Item> GLAIVE = new ArrayList<>();

    public static ArrayList<Item> FAUX = new ArrayList<>();

    public static ArrayList<Item> KATAR = new ArrayList<>();

    public static ArrayList<Item> SPEAR = new ArrayList<>();

    public static ArrayList<Item> AXE = new ArrayList<>();

    public static ArrayList<Item> HANDLE = new ArrayList<>();

    public static ArrayList<Item> BLADE = new ArrayList<>();

    public static final Item WOODEN_RAPIERE = registerItem("wooden_rapiere",
            new SwordItem(ToolMaterials.WOOD, 2, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item STONE_RAPIERE = registerItem("stone_rapiere",
            new SwordItem(ToolMaterials.STONE, 3, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item IRON_RAPIERE = registerItem("iron_rapiere",
            new SwordItem(ToolMaterials.IRON, 4, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item GOLD_RAPIERE = registerItem("gold_rapiere",
            new SwordItem(ToolMaterials.GOLD, 2, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item COPPER_RAPIERE = registerItem("copper_rapiere",
            new SwordItem(ModToolMaterial.COPPER, 4, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item DIAMOND_RAPIERE = registerItem("diamond_rapiere",
            new SwordItem(ToolMaterials.DIAMOND, 5, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item EMERALD_RAPIERE = registerItem("emerald_rapiere",
            new SwordItem(ModToolMaterial.EMERALD, 5, 1.9f, new FabricItemSettings()), RAPIERES);
    public static final Item NETHERITE_RAPIERE = registerItem("netherite_rapiere",
            new SwordItem(ToolMaterials.NETHERITE, 6, 1.9f, new FabricItemSettings()), RAPIERES);



    public static final Item WOODEN_BIG_SWORD = registerItem("wooden_big_sword",
            new SwordItem(ToolMaterials.WOOD, 4, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item STONE_BIG_SWORD = registerItem("stone_big_sword",
            new SwordItem(ToolMaterials.STONE, 5, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item IRON_BIG_SWORD = registerItem("iron_big_sword",
            new SwordItem(ToolMaterials.IRON, 6, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item GOLD_BIG_SWORD = registerItem("gold_big_sword",
            new SwordItem(ToolMaterials.GOLD, 4, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item COPPER_BIG_SWORD = registerItem("copper_big_sword",
            new SwordItem(ModToolMaterial.COPPER, 6, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item DIAMOND_BIG_SWORD = registerItem("diamond_big_sword",
            new SwordItem(ToolMaterials.DIAMOND, 7, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item EMERALD_BIG_SWORD = registerItem("emerald_big_sword",
            new SwordItem(ModToolMaterial.EMERALD, 7, 1.1f, new FabricItemSettings()), BIG_SWORD);
    public static final Item NETHERITE_BIG_SWORD = registerItem("netherite_big_sword",
            new SwordItem(ToolMaterials.NETHERITE, 8, 1.1f, new FabricItemSettings()), BIG_SWORD);


    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, 2, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item STONE_KATANA = registerItem("stone_katana",
            new SwordItem(ToolMaterials.STONE, 3, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item IRON_KATANA = registerItem("iron_katana",
            new SwordItem(ToolMaterials.IRON, 4, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item GOLD_KATANA = registerItem("gold_katana",
            new SwordItem(ToolMaterials.GOLD, 2, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item COPPER_KATANA = registerItem("copper_katana",
            new SwordItem(ModToolMaterial.COPPER, 4, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            new SwordItem(ToolMaterials.DIAMOND, 5, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item EMERALD_KATANA = registerItem("emerald_katana",
            new SwordItem(ModToolMaterial.EMERALD, 5, 1.9f, new FabricItemSettings()), KATANA);
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            new SwordItem(ToolMaterials.NETHERITE, 6, 1.9f, new FabricItemSettings()), KATANA);



    public static final Item WOODEN_GLAIVE = registerItem("wooden_glaive",
            new SwordItem(ToolMaterials.WOOD, 3, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item STONE_GLAIVE = registerItem("stone_glaive",
            new SwordItem(ToolMaterials.STONE, 4, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item IRON_GLAIVE = registerItem("iron_glaive",
            new SwordItem(ToolMaterials.IRON, 5, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item GOLD_GLAIVE = registerItem("gold_glaive",
            new SwordItem(ToolMaterials.GOLD, 3, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item COPPER_GLAIVE = registerItem("copper_glaive",
            new SwordItem(ModToolMaterial.COPPER, 5, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item DIAMOND_GLAIVE = registerItem("diamond_glaive",
            new SwordItem(ToolMaterials.DIAMOND, 6, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item EMERALD_GLAIVE = registerItem("emerald_glaive",
            new SwordItem(ModToolMaterial.EMERALD, 6, 1.7f, new FabricItemSettings()), GLAIVE);
    public static final Item NETHERITE_GLAIVE = registerItem("netherite_glaive",
            new SwordItem(ToolMaterials.NETHERITE, 7, 1.7f, new FabricItemSettings()), GLAIVE);



    public static final Item WOODEN_FAUX = registerItem("wooden_faux",
            new SwordItem(ToolMaterials.WOOD, 4, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item STONE_FAUX = registerItem("stone_faux",
            new SwordItem(ToolMaterials.STONE, 5, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item IRON_FAUX = registerItem("iron_faux",
            new SwordItem(ToolMaterials.IRON, 6, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item GOLD_FAUX = registerItem("gold_faux",
            new SwordItem(ToolMaterials.GOLD, 4, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item COPPER_FAUX = registerItem("copper_faux",
            new SwordItem(ModToolMaterial.COPPER, 6, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item DIAMOND_FAUX = registerItem("diamond_faux",
            new SwordItem(ToolMaterials.DIAMOND, 7, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item EMERALD_FAUX = registerItem("emerald_faux",
            new SwordItem(ModToolMaterial.EMERALD, 7, 1.4f, new FabricItemSettings()), FAUX);
    public static final Item NETHERITE_FAUX = registerItem("netherite_faux",
            new SwordItem(ToolMaterials.NETHERITE, 8, 1.4f, new FabricItemSettings()), FAUX);



    public static final Item WOODEN_KATAR = registerItem("wooden_katar",
            new SwordItem(ToolMaterials.WOOD, 1, 2f, new FabricItemSettings()), KATAR);
    public static final Item STONE_KATAR = registerItem("stone_katar",
            new SwordItem(ToolMaterials.STONE, 2, 2f, new FabricItemSettings()), KATAR);
    public static final Item IRON_KATAR = registerItem("iron_katar",
            new SwordItem(ToolMaterials.IRON, 3, 2f, new FabricItemSettings()), KATAR);
    public static final Item GOLD_KATAR = registerItem("gold_katar",
            new SwordItem(ToolMaterials.GOLD, 1, 2f, new FabricItemSettings()), KATAR);
    public static final Item COPPER_KATAR = registerItem("copper_katar",
            new SwordItem(ModToolMaterial.COPPER, 3, 2f, new FabricItemSettings()), KATAR);
    public static final Item DIAMOND_KATAR = registerItem("diamond_katar",
            new SwordItem(ToolMaterials.DIAMOND, 4, 2f, new FabricItemSettings()), KATAR);
    public static final Item EMERALD_KATAR = registerItem("emerald_katar",
            new SwordItem(ModToolMaterial.EMERALD, 4, 2f, new FabricItemSettings()), KATAR);
    public static final Item NETHERITE_KATAR = registerItem("netherite_katar",
            new SwordItem(ToolMaterials.NETHERITE, 5, 2f, new FabricItemSettings()), KATAR);



    public static final Item WOODEN_SPEAR = registerItem("wooden_spear",
            new SwordItem(ToolMaterials.WOOD, 4, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item STONE_SPEAR = registerItem("stone_spear",
            new SwordItem(ToolMaterials.STONE, 5, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new SwordItem(ToolMaterials.IRON, 6, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item GOLD_SPEAR = registerItem("gold_spear",
            new SwordItem(ToolMaterials.GOLD, 4, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item COPPER_SPEAR = registerItem("copper_spear",
            new SwordItem(ModToolMaterial.COPPER, 6, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear",
            new SwordItem(ToolMaterials.DIAMOND, 7, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear",
            new SwordItem(ModToolMaterial.EMERALD, 7, 1.4f, new FabricItemSettings()), SPEAR);
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear",
            new SwordItem(ToolMaterials.NETHERITE, 9, 1.4f, new FabricItemSettings()), SPEAR);



    public static final Item WOODEN_AXE = registerItem("wooden_axe",
            new SwordItem(ToolMaterials.WOOD, 2, 1.8f, new FabricItemSettings()), AXE);
    public static final Item STONE_AXE = registerItem("stone_axe",
            new SwordItem(ToolMaterials.STONE, 3, 1.8f, new FabricItemSettings()), AXE);
    public static final Item IRON_AXE = registerItem("iron_axe",
            new SwordItem(ToolMaterials.IRON, 4, 1.8f, new FabricItemSettings()), AXE);
    public static final Item GOLD_AXE = registerItem("gold_axe",
            new SwordItem(ToolMaterials.GOLD, 2, 1.8f, new FabricItemSettings()), AXE);
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new SwordItem(ModToolMaterial.COPPER, 4, 1.8f, new FabricItemSettings()), AXE);
    public static final Item DIAMOND_AXE = registerItem("diamond_axe",
            new SwordItem(ToolMaterials.DIAMOND, 5, 1.8f, new FabricItemSettings()), AXE);
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new SwordItem(ModToolMaterial.EMERALD, 5, 1.8f, new FabricItemSettings()), AXE);
    public static final Item NETHERITE_AXE = registerItem("netherite_axe",
            new SwordItem(ToolMaterials.NETHERITE, 6, 1.8f, new FabricItemSettings()), AXE);


    public static final Item STONE_HANDLE = registerItem("stone_handle",
            new Item(new FabricItemSettings()), HANDLE);
    public static final Item OBSIDIAN_HANDLE = registerItem("obsidian_handle",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item WOOD_RAPIERE_BLADE = registerItem("wood_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);


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


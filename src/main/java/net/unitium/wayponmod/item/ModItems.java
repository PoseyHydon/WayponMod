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
            new SwordItem(ToolMaterials.WOOD, 2, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item STONE_RAPIERE = registerItem("stone_rapiere",
            new SwordItem(ToolMaterials.STONE, 3, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item IRON_RAPIERE = registerItem("iron_rapiere",
            new SwordItem(ToolMaterials.IRON, 4, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item GOLD_RAPIERE = registerItem("gold_rapiere",
            new SwordItem(ToolMaterials.GOLD, 2, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item COPPER_RAPIERE = registerItem("copper_rapiere",
            new SwordItem(ModToolMaterial.COPPER, 4, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item DIAMOND_RAPIERE = registerItem("diamond_rapiere",
            new SwordItem(ToolMaterials.DIAMOND, 5, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item EMERALD_RAPIERE = registerItem("emerald_rapiere",
            new SwordItem(ModToolMaterial.EMERALD, 5, -2.1f, new FabricItemSettings()), RAPIERES);
    public static final Item NETHERITE_RAPIERE = registerItem("netherite_rapiere",
            new SwordItem(ToolMaterials.NETHERITE, 6, -2.1f, new FabricItemSettings()), RAPIERES);



    public static final Item WOODEN_BIG_SWORD = registerItem("wooden_big_sword",
            new SwordItem(ToolMaterials.WOOD, 4, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item STONE_BIG_SWORD = registerItem("stone_big_sword",
            new SwordItem(ToolMaterials.STONE, 5, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item IRON_BIG_SWORD = registerItem("iron_big_sword",
            new SwordItem(ToolMaterials.IRON, 6, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item GOLD_BIG_SWORD = registerItem("gold_big_sword",
            new SwordItem(ToolMaterials.GOLD, 4, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item COPPER_BIG_SWORD = registerItem("copper_big_sword",
            new SwordItem(ModToolMaterial.COPPER, 6, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item DIAMOND_BIG_SWORD = registerItem("diamond_big_sword",
            new SwordItem(ToolMaterials.DIAMOND, 7, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item EMERALD_BIG_SWORD = registerItem("emerald_big_sword",
            new SwordItem(ModToolMaterial.EMERALD, 7, -2.9f, new FabricItemSettings()), BIG_SWORD);
    public static final Item NETHERITE_BIG_SWORD = registerItem("netherite_big_sword",
            new SwordItem(ToolMaterials.NETHERITE, 8, -2.9f, new FabricItemSettings()), BIG_SWORD);


    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, 2, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item STONE_KATANA = registerItem("stone_katana",
            new SwordItem(ToolMaterials.STONE, 3, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item IRON_KATANA = registerItem("iron_katana",
            new SwordItem(ToolMaterials.IRON, 4, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item GOLD_KATANA = registerItem("gold_katana",
            new SwordItem(ToolMaterials.GOLD, 2, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item COPPER_KATANA = registerItem("copper_katana",
            new SwordItem(ModToolMaterial.COPPER, 4, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            new SwordItem(ToolMaterials.DIAMOND, 5, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item EMERALD_KATANA = registerItem("emerald_katana",
            new SwordItem(ModToolMaterial.EMERALD, 5, -2.1f, new FabricItemSettings()), KATANA);
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            new SwordItem(ToolMaterials.NETHERITE, 6, -2.1f, new FabricItemSettings()), KATANA);



    public static final Item WOODEN_GLAIVE = registerItem("wooden_glaive",
            new SwordItem(ToolMaterials.WOOD, 3, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item STONE_GLAIVE = registerItem("stone_glaive",
            new SwordItem(ToolMaterials.STONE, 4, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item IRON_GLAIVE = registerItem("iron_glaive",
            new SwordItem(ToolMaterials.IRON, 5, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item GOLD_GLAIVE = registerItem("gold_glaive",
            new SwordItem(ToolMaterials.GOLD, 3, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item COPPER_GLAIVE = registerItem("copper_glaive",
            new SwordItem(ModToolMaterial.COPPER, 5, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item DIAMOND_GLAIVE = registerItem("diamond_glaive",
            new SwordItem(ToolMaterials.DIAMOND, 6, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item EMERALD_GLAIVE = registerItem("emerald_glaive",
            new SwordItem(ModToolMaterial.EMERALD, 6, -2.3f, new FabricItemSettings()), GLAIVE);
    public static final Item NETHERITE_GLAIVE = registerItem("netherite_glaive",
            new SwordItem(ToolMaterials.NETHERITE, 7, -2.3f, new FabricItemSettings()), GLAIVE);



    public static final Item WOODEN_FAUX = registerItem("wooden_faux",
            new SwordItem(ToolMaterials.WOOD, 4, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item STONE_FAUX = registerItem("stone_faux",
            new SwordItem(ToolMaterials.STONE, 5, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item IRON_FAUX = registerItem("iron_faux",
            new SwordItem(ToolMaterials.IRON, 6, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item GOLD_FAUX = registerItem("gold_faux",
            new SwordItem(ToolMaterials.GOLD, 4, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item COPPER_FAUX = registerItem("copper_faux",
            new SwordItem(ModToolMaterial.COPPER, 6, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item DIAMOND_FAUX = registerItem("diamond_faux",
            new SwordItem(ToolMaterials.DIAMOND, 7, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item EMERALD_FAUX = registerItem("emerald_faux",
            new SwordItem(ModToolMaterial.EMERALD, 7, -2.6f, new FabricItemSettings()), FAUX);
    public static final Item NETHERITE_FAUX = registerItem("netherite_faux",
            new SwordItem(ToolMaterials.NETHERITE, 8, -2.6f, new FabricItemSettings()), FAUX);



    public static final Item WOODEN_KATAR = registerItem("wooden_katar",
            new SwordItem(ToolMaterials.WOOD, 1, -2f, new FabricItemSettings()), KATAR);
    public static final Item STONE_KATAR = registerItem("stone_katar",
            new SwordItem(ToolMaterials.STONE, 2, -2f, new FabricItemSettings()), KATAR);
    public static final Item IRON_KATAR = registerItem("iron_katar",
            new SwordItem(ToolMaterials.IRON, 3, -2f, new FabricItemSettings()), KATAR);
    public static final Item GOLD_KATAR = registerItem("gold_katar",
            new SwordItem(ToolMaterials.GOLD, 1, -2f, new FabricItemSettings()), KATAR);
    public static final Item COPPER_KATAR = registerItem("copper_katar",
            new SwordItem(ModToolMaterial.COPPER, 3, -2f, new FabricItemSettings()), KATAR);
    public static final Item DIAMOND_KATAR = registerItem("diamond_katar",
            new SwordItem(ToolMaterials.DIAMOND, 4, -2f, new FabricItemSettings()), KATAR);
    public static final Item EMERALD_KATAR = registerItem("emerald_katar",
            new SwordItem(ModToolMaterial.EMERALD, 4, -2f, new FabricItemSettings()), KATAR);
    public static final Item NETHERITE_KATAR = registerItem("netherite_katar",
            new SwordItem(ToolMaterials.NETHERITE, 5, -2f, new FabricItemSettings()), KATAR);



    public static final Item WOODEN_SPEAR = registerItem("wooden_spear",
            new SwordItem(ToolMaterials.WOOD, 4, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item STONE_SPEAR = registerItem("stone_spear",
            new SwordItem(ToolMaterials.STONE, 5, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new SwordItem(ToolMaterials.IRON, 6, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item GOLD_SPEAR = registerItem("gold_spear",
            new SwordItem(ToolMaterials.GOLD, 4, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item COPPER_SPEAR = registerItem("copper_spear",
            new SwordItem(ModToolMaterial.COPPER, 6, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear",
            new SwordItem(ToolMaterials.DIAMOND, 7, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear",
            new SwordItem(ModToolMaterial.EMERALD, 7, -2.6f, new FabricItemSettings()), SPEAR);
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear",
            new SwordItem(ToolMaterials.NETHERITE, 9, -2.6f, new FabricItemSettings()), SPEAR);



    public static final Item WOODEN_AXE = registerItem("wooden_axe",
            new SwordItem(ToolMaterials.WOOD, 2, -2.2f, new FabricItemSettings()), AXE);
    public static final Item STONE_AXE = registerItem("stone_axe",
            new SwordItem(ToolMaterials.STONE, 3, -2.2f, new FabricItemSettings()), AXE);
    public static final Item IRON_AXE = registerItem("iron_axe",
            new SwordItem(ToolMaterials.IRON, 4, -2.2f, new FabricItemSettings()), AXE);
    public static final Item GOLD_AXE = registerItem("gold_axe",
            new SwordItem(ToolMaterials.GOLD, 2, -2.2f, new FabricItemSettings()), AXE);
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new SwordItem(ModToolMaterial.COPPER, 4, -2.2f, new FabricItemSettings()), AXE);
    public static final Item DIAMOND_AXE = registerItem("diamond_axe",
            new SwordItem(ToolMaterials.DIAMOND, 5, -2.2f, new FabricItemSettings()), AXE);
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new SwordItem(ModToolMaterial.EMERALD, 5, -2.2f, new FabricItemSettings()), AXE);
    public static final Item NETHERITE_AXE = registerItem("netherite_axe",
            new SwordItem(ToolMaterials.NETHERITE, 6, -2.2f, new FabricItemSettings()), AXE);


    public static final Item STONE_HANDLE = registerItem("stone_handle",
            new Item(new FabricItemSettings()), HANDLE);
    public static final Item OBSIDIAN_HANDLE = registerItem("obsidian_handle",
            new Item(new FabricItemSettings()), HANDLE);



    public static final Item WOOD_RAPIERE_BLADE = registerItem("wood_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_RAPIERE_BLADE = registerItem("stone_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_RAPIERE_BLADE = registerItem("iron_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_RAPIERE_BLADE = registerItem("gold_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_RAPIERE_BLADE = registerItem("copper_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_RAPIERE_BLADE = registerItem("diamond_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_RAPIERE_BLADE = registerItem("emerald_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_RAPIERE_BLADE = registerItem("netherite_rapiere_blade",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_BIG_SWORD_BLADE = registerItem("wood_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_BIG_SWORD_BLADE = registerItem("stone_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_BIG_SWORD_BLADE = registerItem("iron_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_BIG_SWORD_BLADE = registerItem("gold_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_BIG_SWORD_BLADE = registerItem("copper_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_BIG_SWORD_BLADE = registerItem("diamond_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_BIG_SWORD_BLADE = registerItem("emerald_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_BIG_SWORD_BLADE = registerItem("netherite_big_sword_blade",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_KATANA_BLADE = registerItem("wood_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_KATANA_BLADE = registerItem("stone_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_KATANA_BLADE = registerItem("iron_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_KATANA_BLADE = registerItem("gold_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_KATANA_BLADE = registerItem("copper_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_KATANA_BLADE = registerItem("diamond_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_KATANA_BLADE = registerItem("emerald_katana_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_KATANA_BLADE = registerItem("netherite_katana_blade",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_GLAIVE_BLADE = registerItem("wood_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_GLAIVE_BLADE = registerItem("stone_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_GLAIVE_BLADE = registerItem("iron_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_GLAIVE_BLADE = registerItem("gold_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_GLAIVE_BLADE = registerItem("copper_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_GLAIVE_BLADE = registerItem("diamond_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_GLAIVE_BLADE = registerItem("emerald_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_GLAIVE_BLADE = registerItem("netherite_glaive_blade",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_FAUX_BLADE = registerItem("wood_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_FAUX_BLADE = registerItem("stone_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_FAUX_BLADE = registerItem("iron_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_FAUX_BLADE = registerItem("gold_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_FAUX_BLADE = registerItem("copper_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_FAUX_BLADE = registerItem("diamond_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_FAUX_BLADE = registerItem("emerald_faux_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_FAUX_BLADE = registerItem("netherite_faux_head",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_KATAR_BLADE = registerItem("wood_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_KATAR_BLADE = registerItem("stone_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_KATAR_BLADE = registerItem("iron_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_KATAR_BLADE = registerItem("gold_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_KATAR_BLADE = registerItem("copper_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_KATAR_BLADE = registerItem("diamond_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_KATAR_BLADE = registerItem("emerald_katar_blade",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_KATAR_BLADE = registerItem("netherite_katar_blade",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_SPEAR_BLADE = registerItem("wood_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_SPEAR_BLADE = registerItem("stone_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_SPEAR_BLADE = registerItem("iron_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_SPEAR_BLADE = registerItem("gold_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_SPEAR_BLADE = registerItem("copper_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_SPEAR_BLADE = registerItem("diamond_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_SPEAR_BLADE = registerItem("emerald_spear_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_SPEAR_BLADE = registerItem("netherite_spear_head",
            new Item(new FabricItemSettings()), BLADE);



    public static final Item WOOD_AXE_BLADE = registerItem("wood_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item STONE_AXE_BLADE = registerItem("stone_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item IRON_AXE_BLADE = registerItem("iron_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item GOLD_AXE_BLADE = registerItem("gold_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item COPPER_AXE_BLADE = registerItem("copper_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item DIAMOND_AXE_BLADE = registerItem("diamond_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item EMERALD_AXE_BLADE = registerItem("emerald_axe_head",
            new Item(new FabricItemSettings()), BLADE);
    public static final Item NETHERITE_AXE_BLADE = registerItem("netherite_axe_head",
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


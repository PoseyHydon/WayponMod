package net.unitium.wayponmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.Waypon;
import net.unitium.wayponmod.block.ModBlocks;

import java.util.Arrays;

public class ModItemsGroup {

    static final ItemGroup WAYPON = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Waypon.MOD_ID, "waypon"),
            FabricItemGroup.builder().displayName(Text.translatable("waypon_weapon"))
                    .icon(() -> new ItemStack(ModItems.WOODEN_RAPIERE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.FORGE.asItem());

                        for (Item item : ModItems.RAPIERES) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.BIG_SWORD) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.KATANA) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.GLAIVE) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.FAUX) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.KATAR) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.SPEAR) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.AXE) {
                            entries.add(item);
                        }

                        }).build());

    static final ItemGroup HANDLE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Waypon.MOD_ID, "handle"),
            FabricItemGroup.builder().displayName(Text.translatable("waypon_handle"))
                    .icon(() -> new ItemStack(ModItems.OBSIDIAN_HANDLE)).entries((displayContext, entries) -> {

                        for (Item item : ModItems.HANDLE) {
                            entries.add(item);

                        }

                    }).build());


    static final ItemGroup BLADE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Waypon.MOD_ID, "blade"),
            FabricItemGroup.builder().displayName(Text.translatable("waypon_blade"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_KATANA_BLADE)).entries((displayContext, entries) -> {

                        for (Item item : ModItems.BLADE) {
                            entries.add(item);

                        }

                    }).build());

    public static void registerItemGroup() {

    }
}

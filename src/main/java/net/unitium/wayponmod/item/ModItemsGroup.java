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

import java.util.Arrays;

public class ModItemsGroup {

    static final ItemGroup WAYPON = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Waypon.MOD_ID, "waypon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.waypon_group"))
                    .icon(() -> new ItemStack(ModItems.WOODEN_RAPIERE)).entries((displayContext, entries) -> {


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

                        for (Item item : ModItems.HANDLE) {
                            entries.add(item);
                        }

                        for (Item item : ModItems.BLADE) {
                            entries.add(item);
                        }

                        }).build());

    public static void registerItemGroup() {

    }
}

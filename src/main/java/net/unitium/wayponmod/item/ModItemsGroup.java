package net.unitium.wayponmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.Waypon;

public class ModItemsGroup {

    static final ItemGroup WAYPON = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Waypon.MOD_ID, "waypon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.waypon_group"))
                    .icon(() -> new ItemStack(ModItems.WOODEN_RAPIERE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.WOODEN_RAPIERE);
                        entries.add(ModItems.STONE_RAPIERE);
                        entries.add(ModItems.IRON_RAPIERE);
                        entries.add(ModItems.GOLD_RAPIERE);
                        entries.add(ModItems.COPPER_RAPIERE);
                        entries.add(ModItems.DIAMOND_RAPIERE);
                        entries.add(ModItems.EMERALD_RAPIERE);
                        entries.add(ModItems.NETHERITE_RAPIERE);

                        entries.add(ModItems.WOODEN_BIG_SWORD);

                        }).build());

    public static void registerItemGroup() {

    }
}

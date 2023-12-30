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
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ultimatestar_group"))
                    .icon(() -> new ItemStack(ModItems.WOODEN_RAPIERE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.WOODEN_RAPIERE);

                        }).build());

    public static void registerItemGroup() {

    }
}

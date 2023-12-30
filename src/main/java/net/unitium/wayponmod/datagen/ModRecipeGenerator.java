package net.unitium.wayponmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.block.ModBlocks;
import net.unitium.wayponmod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        forgeMaker(exporter);

        handleMaker(Items.STONE, ModItems.STONE_HANDLE, exporter);
        handleMaker(Items.OBSIDIAN, ModItems.OBSIDIAN_HANDLE, exporter);


        rapiereBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.STONE, ModItems.STONE_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.IRON_INGOT, ModItems.IRON_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.DIAMOND, ModItems.DIAMOND_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.EMERALD, ModItems.EMERALD_RAPIERE_BLADE, exporter);
        rapiereBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_RAPIERE_BLADE, exporter);

        bigSwordBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.STONE, ModItems.STONE_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.IRON_INGOT, ModItems.IRON_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.DIAMOND, ModItems.DIAMOND_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.EMERALD, ModItems.EMERALD_BIG_SWORD_BLADE, exporter);
        bigSwordBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_BIG_SWORD_BLADE, exporter);

        katanaBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.STONE, ModItems.STONE_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.IRON_INGOT, ModItems.IRON_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.DIAMOND, ModItems.DIAMOND_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.EMERALD, ModItems.EMERALD_KATANA_BLADE, exporter);
        katanaBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_KATANA_BLADE, exporter);

        glaiveBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.STONE, ModItems.STONE_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.IRON_INGOT, ModItems.IRON_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.DIAMOND, ModItems.DIAMOND_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.EMERALD, ModItems.EMERALD_GLAIVE_BLADE, exporter);
        glaiveBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_GLAIVE_BLADE, exporter);

        fauxBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.STONE, ModItems.STONE_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.IRON_INGOT, ModItems.IRON_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.DIAMOND, ModItems.DIAMOND_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.EMERALD, ModItems.EMERALD_FAUX_BLADE, exporter);
        fauxBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_FAUX_BLADE, exporter);

        katarBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_KATAR_BLADE, exporter);
        katarBladeMaker(Items.STONE, ModItems.STONE_KATAR_BLADE, exporter);
        katarBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_KATAR_BLADE, exporter);
        katarBladeMaker(Items.IRON_INGOT, ModItems.IRON_KATAR_BLADE, exporter);
        katarBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_KATAR_BLADE, exporter);
        katarBladeMaker(Items.DIAMOND, ModItems.DIAMOND_KATAR_BLADE, exporter);
        katarBladeMaker(Items.EMERALD, ModItems.EMERALD_KATAR_BLADE, exporter);
        katarBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_KATAR_BLADE, exporter);

        spearBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.STONE, ModItems.STONE_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.IRON_INGOT, ModItems.IRON_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.DIAMOND, ModItems.DIAMOND_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.EMERALD, ModItems.EMERALD_SPEAR_BLADE, exporter);
        spearBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_SPEAR_BLADE, exporter);

        axeBladeMaker(Items.OAK_PLANKS, ModItems.WOOD_AXE_BLADE, exporter);
        axeBladeMaker(Items.STONE, ModItems.STONE_AXE_BLADE, exporter);
        axeBladeMaker(Items.GOLD_INGOT, ModItems.GOLD_AXE_BLADE, exporter);
        axeBladeMaker(Items.IRON_INGOT, ModItems.IRON_AXE_BLADE, exporter);
        axeBladeMaker(Items.COPPER_INGOT, ModItems.COPPER_AXE_BLADE, exporter);
        axeBladeMaker(Items.DIAMOND, ModItems.DIAMOND_AXE_BLADE, exporter);
        axeBladeMaker(Items.EMERALD, ModItems.EMERALD_AXE_BLADE, exporter);
        axeBladeMaker(Items.NETHERITE_INGOT, ModItems.NETHERITE_AXE_BLADE, exporter);

    }

    public void handleMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XXX")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void rapiereBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("X")
                .pattern("X")
                .pattern("X")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void bigSwordBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("XX ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void katanaBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  X")
                .pattern(" X ")
                .pattern("X  ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void glaiveBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  X")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void fauxBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XXX")
                .pattern(" X ")
                .pattern("X  ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void katarBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  X")
                .pattern("XX ")
                .pattern("XX ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void spearBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" X ")
                .pattern("XXX")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void axeBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XXX")
                .pattern(" X ")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void forgeMaker(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModBlocks.FORGE)
                .pattern(" X ")
                .pattern("XCX")
                .pattern(" X ")
                .input('X', Items.IRON_INGOT)
                .input('C', Items.CRAFTING_TABLE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.CRAFTING_TABLE), conditionsFromItem(Items.CRAFTING_TABLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FORGE) + "_"));

    }
}

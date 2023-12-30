package net.unitium.wayponmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        handleMaker(Items.STONE, ModItems.STONE_HANDLE, exporter);

    }

    public void handleMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XXX")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void rapiereBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("X")
                .pattern("X")
                .pattern("X")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

    public void bigSwordBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XX")
                .pattern("XX")
                .pattern("XX")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }
    public void katanaBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  X")
                .pattern(" X ")
                .pattern("X  ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }
    public void glaiveBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("X")
                .pattern("X")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }
    public void fauxBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XXX")
                .pattern(" X ")
                .pattern("X  ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }
    public void katarBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" X ")
                .pattern("X  ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }
    public void spearBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" X ")
                .pattern("XXX")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }
    public void axeBladeMaker(Item item, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("XXX")
                .pattern(" X ")
                .pattern(" X ")
                .input('X', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_"));
    }

}

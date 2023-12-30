package net.unitium.wayponmod.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.unitium.wayponmod.item.ModItems;
import net.unitium.wayponmod.screen.ForgeScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ForgeBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    private static final int HANDLE_SLOT = 0;
    private static final int BLADE_SLOT = 1;
    private static final int MATERIAL_SLOT = 2;
    private static final int OUTPUT_SLOT = 3;

    private final List<Recipe> recipes = new ArrayList<>();

    public ForgeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FORGE_BLOCK_ENTITY, pos, state);

        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> ForgeBlockEntity.this.progress;
                    case 1 -> ForgeBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> ForgeBlockEntity.this.progress = value;
                    case 1 -> ForgeBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
        initializeRecipes();
    }

    private void initializeRecipes() {
        //rapiere
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_RAPIERE_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_RAPIERE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_RAPIERE_BLADE, Items.STONE, ModItems.STONE_RAPIERE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_RAPIERE_BLADE, Items.IRON_INGOT, ModItems.IRON_RAPIERE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_RAPIERE_BLADE, Items.GOLD_INGOT, ModItems.GOLD_RAPIERE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_RAPIERE_BLADE, Items.COPPER_INGOT, ModItems.COPPER_RAPIERE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_RAPIERE_BLADE, Items.DIAMOND, ModItems.DIAMOND_RAPIERE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_RAPIERE_BLADE, Items.EMERALD, ModItems.EMERALD_RAPIERE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_RAPIERE_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_RAPIERE);

        //big sword
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_BIG_SWORD_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_BIG_SWORD);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_BIG_SWORD_BLADE, Items.STONE, ModItems.STONE_BIG_SWORD);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_BIG_SWORD_BLADE, Items.IRON_INGOT, ModItems.IRON_BIG_SWORD);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_BIG_SWORD_BLADE, Items.GOLD_INGOT, ModItems.GOLD_BIG_SWORD);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_BIG_SWORD_BLADE, Items.COPPER_INGOT, ModItems.COPPER_BIG_SWORD);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_BIG_SWORD_BLADE, Items.DIAMOND, ModItems.DIAMOND_BIG_SWORD);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_BIG_SWORD_BLADE, Items.EMERALD, ModItems.EMERALD_BIG_SWORD);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_BIG_SWORD_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_BIG_SWORD);

        //katana
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_KATANA_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_KATANA);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_KATANA_BLADE, Items.STONE, ModItems.STONE_KATANA);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_KATANA_BLADE, Items.IRON_INGOT, ModItems.IRON_KATANA);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_KATANA_BLADE, Items.GOLD_INGOT, ModItems.GOLD_KATANA);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_KATANA_BLADE, Items.COPPER_INGOT, ModItems.COPPER_KATANA);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_KATANA_BLADE, Items.DIAMOND, ModItems.DIAMOND_KATANA);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_KATANA_BLADE, Items.EMERALD, ModItems.EMERALD_KATANA);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_KATANA_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_KATANA);

        //glaive
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_GLAIVE_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_GLAIVE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_GLAIVE_BLADE, Items.STONE, ModItems.STONE_GLAIVE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_GLAIVE_BLADE, Items.IRON_INGOT, ModItems.IRON_GLAIVE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_GLAIVE_BLADE, Items.GOLD_INGOT, ModItems.GOLD_GLAIVE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_GLAIVE_BLADE, Items.COPPER_INGOT, ModItems.COPPER_GLAIVE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_GLAIVE_BLADE, Items.DIAMOND, ModItems.DIAMOND_GLAIVE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_GLAIVE_BLADE, Items.EMERALD, ModItems.EMERALD_GLAIVE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_GLAIVE_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_GLAIVE);

        //faux
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_FAUX_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_FAUX);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_FAUX_BLADE, Items.STONE, ModItems.STONE_FAUX);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_FAUX_BLADE, Items.IRON_INGOT, ModItems.IRON_FAUX);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_FAUX_BLADE, Items.GOLD_INGOT, ModItems.GOLD_FAUX);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_FAUX_BLADE, Items.COPPER_INGOT, ModItems.COPPER_FAUX);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_FAUX_BLADE, Items.DIAMOND, ModItems.DIAMOND_FAUX);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_FAUX_BLADE, Items.EMERALD, ModItems.EMERALD_FAUX);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_FAUX_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_FAUX);


        //katar
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_KATAR_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_KATAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_KATAR_BLADE, Items.STONE, ModItems.STONE_KATAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_KATAR_BLADE, Items.IRON_INGOT, ModItems.IRON_KATAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_KATAR_BLADE, Items.GOLD_INGOT, ModItems.GOLD_KATAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_KATAR_BLADE, Items.COPPER_INGOT, ModItems.COPPER_KATAR);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_KATAR_BLADE, Items.DIAMOND, ModItems.DIAMOND_KATAR);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_KATAR_BLADE, Items.EMERALD, ModItems.EMERALD_KATAR);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_KATAR_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_KATAR);
        
        //spear
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_SPEAR_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_SPEAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_SPEAR_BLADE, Items.STONE, ModItems.STONE_SPEAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_SPEAR_BLADE, Items.IRON_INGOT, ModItems.IRON_SPEAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_SPEAR_BLADE, Items.GOLD_INGOT, ModItems.GOLD_SPEAR);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_SPEAR_BLADE, Items.COPPER_INGOT, ModItems.COPPER_SPEAR);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_SPEAR_BLADE, Items.DIAMOND, ModItems.DIAMOND_SPEAR);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_SPEAR_BLADE, Items.EMERALD, ModItems.EMERALD_SPEAR);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_SPEAR_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_SPEAR);

        //axe
        addRecipe(ModItems.STONE_HANDLE, ModItems.WOOD_AXE_BLADE, Items.OAK_PLANKS, ModItems.WOODEN_AXE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.STONE_AXE_BLADE, Items.STONE, ModItems.STONE_AXE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.IRON_AXE_BLADE, Items.IRON_INGOT, ModItems.IRON_AXE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.GOLD_AXE_BLADE, Items.GOLD_INGOT, ModItems.GOLD_AXE);
        addRecipe(ModItems.STONE_HANDLE, ModItems.COPPER_AXE_BLADE, Items.COPPER_INGOT, ModItems.COPPER_AXE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.DIAMOND_AXE_BLADE, Items.DIAMOND, ModItems.DIAMOND_AXE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.EMERALD_AXE_BLADE, Items.EMERALD, ModItems.EMERALD_AXE);
        addRecipe(ModItems.OBSIDIAN_HANDLE, ModItems.NETHERITE_AXE_BLADE, Items.NETHERITE_INGOT, ModItems.NETHERITE_AXE);

        // ... ajoutez d'autres recettes selon vos besoins
    }




    public ItemStack getRenderStack() {
        if(this.getStack(OUTPUT_SLOT).isEmpty()) {
            return this.getStack(BLADE_SLOT);
        } else {
            return this.getStack(OUTPUT_SLOT);
        }
    }

    @Override
    public void markDirty() {
        world.updateListeners(pos, getCachedState(), getCachedState(), 3);
        super.markDirty();
    }
    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("blockentity.waypon.forge");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new ForgeScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }


    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("forge.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("forge.progress");
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if (world.isClient()) {
            return;
        }

        if (isOutputSlotEmptyOrReceivable()) {
            for (Recipe recipe : recipes) {
                if (hasRecipe(recipe)) {
                    this.increaseCraftProgress();
                    markDirty(world, pos, state);

                    if (hasCraftingFinished()) {
                        this.craftItem(recipe);
                        this.resetProgress();
                    }
                    return; // Sortir de la boucle après avoir trouvé une recette
                }
            }

            // Aucune recette correspondante trouvée
            this.resetProgress();
        } else {
            this.resetProgress();
            markDirty(world, pos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem(Recipe recipe) {
        this.removeStack(BLADE_SLOT, 1);
        this.removeStack(HANDLE_SLOT, 1);
        this.removeStack(MATERIAL_SLOT, 1);

        this.setStack(OUTPUT_SLOT, new ItemStack(recipe.getOutputItem().getItem(), getStack(OUTPUT_SLOT).getCount() + recipe.getOutputItem().getCount()));    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hasRecipe(Recipe recipe) {
        boolean hasInput = getStack(BLADE_SLOT).getItem() == recipe.getBladeItem().getItem()
                && getStack(HANDLE_SLOT).getItem() == recipe.getHandleItem().getItem()
                && getStack(MATERIAL_SLOT).getItem() == recipe.getMaterialItem().getItem();

        return hasInput && canInsertAmountIntoOutputSlot(recipe.getOutputItem()) && canInsertItemIntoOutputSlot(recipe.getOutputItem().getItem());    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(OUTPUT_SLOT).getItem() == item || this.getStack(OUTPUT_SLOT).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(OUTPUT_SLOT).getCount() + result.getCount() <= getStack(OUTPUT_SLOT).getMaxCount();
    }
    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }

    // Méthode pour ajouter une recette à la liste

    private void addRecipe(Item handleItem, Item bladeItem, Item materialItem, Item outputItem) {
        ItemStack handleStack = new ItemStack(handleItem);
        ItemStack bladeStack = new ItemStack(bladeItem);
        ItemStack materialStack = new ItemStack(materialItem);
        ItemStack outputStack = new ItemStack(outputItem);

        recipes.add(new Recipe(handleStack, bladeStack, materialStack, outputStack));
    }

    private static class Recipe {
        private final ItemStack handleItem;
        private final ItemStack bladeItem;
        private final ItemStack materialItem;
        private final ItemStack outputItem;

        public Recipe(ItemStack handleItem, ItemStack bladeItem, ItemStack materialItem, ItemStack outputItem) {
            this.handleItem = handleItem;
            this.bladeItem = bladeItem;
            this.materialItem = materialItem;
            this.outputItem = outputItem;
        }

        public ItemStack getHandleItem() {
            return handleItem;
        }

        public ItemStack getBladeItem() {
            return bladeItem;
        }

        public ItemStack getMaterialItem() {
            return materialItem;
        }

        public ItemStack getOutputItem() {
            return outputItem;
        }
    }
}

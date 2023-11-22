package net.jack.fieryfirstmod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.jack.fieryfirstmod.FieryFirstMod;
import net.jack.fieryfirstmod.block.ModBlocks;
import net.jack.fieryfirstmod.recipe.FletchingTableRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class DippingTableCategory implements IRecipeCategory<FletchingTableRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(FieryFirstMod.modName, "arrow_dipping");
    public static final ResourceLocation TEXTURE = new ResourceLocation(FieryFirstMod.modName,
            "textures/gui/fletching_table_gui.png");

    public static final RecipeType<FletchingTableRecipe> ARROW_DIPPING_TYPE =
            new RecipeType<>(UID,FletchingTableRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public DippingTableCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0,0,176,82);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK,new ItemStack(ModBlocks.FLETCHING_TABLE_ENTITY.get()));
    }

    @Override
    public RecipeType<FletchingTableRecipe> getRecipeType() {
        return ARROW_DIPPING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.fieryfirstmod.fletching_table_entity");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, FletchingTableRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 27, 47).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 76, 47).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 134, 47).addItemStack(recipe.getResultItem(null));
    }
}

package net.jack.fieryfirstmod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.jack.fieryfirstmod.FieryFirstMod;
import net.jack.fieryfirstmod.recipe.FletchingTableRecipe;
import net.jack.fieryfirstmod.screen.FletchingTableScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEITutorialModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(FieryFirstMod.modName, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new DippingTableCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<FletchingTableRecipe> dippingRecipies = recipeManager.getAllRecipesFor(FletchingTableRecipe.Type.INSTANCE);
        registration.addRecipes(DippingTableCategory.ARROW_DIPPING_TYPE, dippingRecipies);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(FletchingTableScreen.class, 100, 30 ,20,30,
                DippingTableCategory.ARROW_DIPPING_TYPE);
    }
}

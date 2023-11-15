package net.jack.fieryfirstmod.datagen;

import net.jack.fieryfirstmod.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipieProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipieProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {



    }
}

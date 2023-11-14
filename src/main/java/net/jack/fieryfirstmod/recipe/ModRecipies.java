package net.jack.fieryfirstmod.recipe;

import net.jack.fieryfirstmod.FieryFirstMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipies {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, FieryFirstMod.modName);

    public static final RegistryObject<RecipeSerializer<FletchingTableRecipie>> FLETCHING_TABLE_SERIALIZER =
            SERIALIZERS.register("arrow_dipping",()->FletchingTableRecipie.Serializer.INSTANCE);


    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}

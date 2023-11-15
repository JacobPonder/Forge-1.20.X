package net.jack.fieryfirstmod.datagen;

import net.jack.fieryfirstmod.FieryFirstMod;
import net.jack.fieryfirstmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FieryFirstMod.modName, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ENDER_POTION);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FieryFirstMod.modName, "item/" + item.getId().getPath()));
    }
}

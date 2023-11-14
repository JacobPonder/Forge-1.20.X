package net.jack.fieryfirstmod.item;

import net.jack.fieryfirstmod.FieryFirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FieryFirstMod.modName);

    public static final RegistryObject<Item> ENDER_POTION = ITEMS.register("ender_potion",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_ITEM = ITEMS.register("icon",
            ()-> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

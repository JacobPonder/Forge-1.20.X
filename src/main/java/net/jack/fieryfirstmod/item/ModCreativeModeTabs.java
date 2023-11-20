package net.jack.fieryfirstmod.item;

import net.jack.fieryfirstmod.FieryFirstMod;
import net.jack.fieryfirstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FieryFirstMod.modName);

    public static final RegistryObject<CreativeModeTab> FIERY_MOD_TAB = CREATIVE_MODE_TABS.register("fiery_mod_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.ICON_ITEM.get()))
                    .title(Component.translatable("creativetab.fiery_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //pOutput.accept(ModItems.ENDER_POTION.get());
                        pOutput.accept(ModBlocks.FLETCHING_TABLE_ENTITY.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

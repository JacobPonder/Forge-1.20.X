package net.jack.fieryfirstmod.block.entity;

import net.jack.fieryfirstmod.FieryFirstMod;
import net.jack.fieryfirstmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FieryFirstMod.modName);

    public static final RegistryObject<BlockEntityType<FletchingTableBLockEntity>> FLETCHING_TABLE_BE =
            BLOCK_ENTITIES.register("fletching_table_be", ()->
                    BlockEntityType.Builder.of(FletchingTableBLockEntity::new,
                            ModBlocks.FLETCHING_TABLE_ENTITY.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

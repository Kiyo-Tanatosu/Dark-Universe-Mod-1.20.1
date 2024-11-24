package com.kiyotanatosu.darkuniverse.entity;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.entity.custom.CorruptSkeletonEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DarkUniverse.MOD_ID);

    public static final RegistryObject<EntityType<CorruptSkeletonEntity>> CORRUPT_SKELETON =
            ENTITY_TYPES.register("corrupt_skeleton", () -> EntityType.Builder.of(CorruptSkeletonEntity::new, MobCategory.MONSTER)
                    .sized(1f, 2f).build("corrupt_skeleton"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}

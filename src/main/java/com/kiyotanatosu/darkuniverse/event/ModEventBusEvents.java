package com.kiyotanatosu.darkuniverse.event;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.entity.ModEntities;
import com.kiyotanatosu.darkuniverse.entity.custom.CorruptSkeletonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = DarkUniverse.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CORRUPT_SKELETON.get(), CorruptSkeletonEntity.createAttributes().build());
    }
}

package com.kiyotanatosu.darkuniverse.item;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DarkUniverse.MOD_ID);

    public static final RegistryObject<Item> CORRUPT_INGOT = ITEMS.register("corrupt_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CORRUPT_ORE = ITEMS.register("raw_corrupt_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPT_COAL = ITEMS.register("corrupt_coal",
            () -> new FuelItem(new Item.Properties(), 3200));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().food(ModFoods.BANANA)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

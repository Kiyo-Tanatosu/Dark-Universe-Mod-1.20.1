package com.kiyotanatosu.darkuniverse.item;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.entity.ModEntities;
import com.kiyotanatosu.darkuniverse.item.custom.FuelItem;
import com.kiyotanatosu.darkuniverse.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> CORRUPT_SWORD = ITEMS.register("corrupt_sword",
            () -> new SwordItem(ModToolTiers.CORRUPT, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_PICKAXE = ITEMS.register("corrupt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CORRUPT, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_AXE = ITEMS.register("corrupt_axe",
            () -> new AxeItem(ModToolTiers.CORRUPT, 5, -3f, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_SHOVEL = ITEMS.register("corrupt_shovel",
            () -> new ShovelItem(ModToolTiers.CORRUPT, 1, -3f, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_HOE = ITEMS.register("corrupt_hoe",
            () -> new HoeItem(ModToolTiers.CORRUPT, -4, 0f, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_HELMET = ITEMS.register("corrupt_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CORRUPT, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_CHESTPLATE = ITEMS.register("corrupt_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.CORRUPT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_LEGGINGS = ITEMS.register("corrupt_leggings",
            () -> new ModArmorItem(ModArmorMaterials.CORRUPT, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_BOOTS = ITEMS.register("corrupt_boots",
            () -> new ModArmorItem(ModArmorMaterials.CORRUPT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CORRUPT_SKELETON_SPAWN_EGG = ITEMS.register("corrupt_skeleton_spwan_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CORRUPT_SKELETON, 0xb53075, 0xca1874, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package com.kiyotanatosu.darkuniverse.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANA = new FoodProperties.Builder()
            .alwaysEat().fast().nutrition(4).saturationMod(0.3f).build();

}

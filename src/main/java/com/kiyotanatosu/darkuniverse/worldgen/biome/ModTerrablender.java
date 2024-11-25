package com.kiyotanatosu.darkuniverse.worldgen.biome;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(DarkUniverse.MOD_ID, "overworld"), 5));
    }
}
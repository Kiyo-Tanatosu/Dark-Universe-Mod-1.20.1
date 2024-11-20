package com.kiyotanatosu.darkuniverse.item;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier CORRUPT = TierSortingRegistry.registerTier(
            new ForgeTier(5,3000, 11f, 5f, 20,
                    ModTags.Blocks.NEEDS_CORRUPT_TOOL, () -> Ingredient.of(ModItems.CORRUPT_INGOT.get())),
            new ResourceLocation(DarkUniverse.MOD_ID, "corrupt"), List.of(Tiers.NETHERITE), List.of());
}

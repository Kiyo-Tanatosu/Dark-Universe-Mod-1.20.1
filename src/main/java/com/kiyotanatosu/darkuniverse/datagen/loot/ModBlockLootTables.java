package com.kiyotanatosu.darkuniverse.datagen.loot;

import com.kiyotanatosu.darkuniverse.block.ModBlocks;
import com.kiyotanatosu.darkuniverse.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
      public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CORRUPT_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_CORRUPT_BLOCK.get());
        this.add(ModBlocks.CORRUPT_ORE.get(),
                block -> createOreDrop(ModBlocks.CORRUPT_ORE.get(), ModItems.RAW_CORRUPT_ORE.get()));

        this.dropSelf(ModBlocks.CORRUPT_STONE.get());
        this.dropSelf(ModBlocks.CORRUPT_BRICKS.get());
        this.dropSelf(ModBlocks.CORRUPT_STAIRS.get());
        this.dropSelf(ModBlocks.CORRUPT_BUTTON.get());
        this.dropSelf(ModBlocks.CORRUPT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CORRUPT_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CORRUPT_FENCE.get());
        this.dropSelf(ModBlocks.CORRUPT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CORRUPT_WALL.get());

        this.add(ModBlocks.CORRUPT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CORRUPT_SLAB.get()));
        this.add(ModBlocks.CORRUPT_DOOR.get(),
                block -> createDoorTable(ModBlocks.CORRUPT_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

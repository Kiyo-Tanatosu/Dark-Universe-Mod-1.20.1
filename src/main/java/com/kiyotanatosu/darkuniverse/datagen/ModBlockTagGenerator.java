package com.kiyotanatosu.darkuniverse.datagen;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DarkUniverse.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CORRUPT_BLOCK.get())
                .add(ModBlocks.RAW_CORRUPT_BLOCK.get())
                .add(ModBlocks.CORRUPT_ORE.get())
                .add(ModBlocks.CORRUPT_COAL_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CORRUPT_BLOCK.get())
                .add(ModBlocks.RAW_CORRUPT_BLOCK.get())
                .add(ModBlocks.CORRUPT_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CORRUPT_COAL_ORE.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.CORRUPT_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.CORRUPT_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.CORRUPT_WALL.get());

    }
}

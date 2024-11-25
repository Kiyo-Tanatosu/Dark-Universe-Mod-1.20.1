package com.kiyotanatosu.darkuniverse.datagen;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DarkUniverse.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CORRUPT_BLOCK);
        blockWithItem(ModBlocks.RAW_CORRUPT_BLOCK);
        blockWithItem(ModBlocks.CORRUPT_ORE);
        blockWithItem(ModBlocks.CORRUPT_COAL_ORE);

        blockWithItem(ModBlocks.CORRUPT_STONE);
        blockWithItem(ModBlocks.CORRUPT_BRICKS);

        stairsBlock(((StairBlock) ModBlocks.CORRUPT_STAIRS.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CORRUPT_SLAB.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.CORRUPT_BUTTON.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CORRUPT_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.CORRUPT_FENCE.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CORRUPT_FENCE_GATE.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.CORRUPT_WALL.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.CORRUPT_DOOR.get()), modLoc("block/corrupt_door_bottom"), modLoc("block/corrupt_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CORRUPT_TRAPDOOR.get()), modLoc("block/corrupt_trapdoor"), true, "cutout");

        blockWithItem(ModBlocks.CORRUPT_ALTER);


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

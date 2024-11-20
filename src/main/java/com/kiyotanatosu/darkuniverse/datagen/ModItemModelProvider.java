package com.kiyotanatosu.darkuniverse.datagen;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.block.ModBlocks;
import com.kiyotanatosu.darkuniverse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DarkUniverse.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.BANANA);

        simpleItem(ModItems.CORRUPT_COAL);
        simpleItem(ModItems.CORRUPT_INGOT);
        simpleItem(ModItems.RAW_CORRUPT_ORE);

        simpleBlockItem(ModBlocks.CORRUPT_DOOR);

        fenceItem(ModBlocks.CORRUPT_FENCE, ModBlocks.CORRUPT_BRICKS);
        buttonItem(ModBlocks.CORRUPT_BUTTON, ModBlocks.CORRUPT_BRICKS);
        wallItem(ModBlocks.CORRUPT_WALL, ModBlocks.CORRUPT_BRICKS);

        evenSimplerBlockItem(ModBlocks.CORRUPT_STAIRS);
        evenSimplerBlockItem(ModBlocks.CORRUPT_SLAB);
        evenSimplerBlockItem(ModBlocks.CORRUPT_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CORRUPT_FENCE_GATE);

        trapdoorItem(ModBlocks.CORRUPT_TRAPDOOR);

        handheldItem(ModItems.CORRUPT_SWORD);
        handheldItem(ModItems.CORRUPT_PICKAXE);
        handheldItem(ModItems.CORRUPT_AXE);
        handheldItem(ModItems.CORRUPT_SHOVEL);
        handheldItem(ModItems.CORRUPT_HOE);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DarkUniverse.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(DarkUniverse.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(DarkUniverse.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(DarkUniverse.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(DarkUniverse.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DarkUniverse.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DarkUniverse.MOD_ID, "item/" + item.getId().getPath()));
    }
}

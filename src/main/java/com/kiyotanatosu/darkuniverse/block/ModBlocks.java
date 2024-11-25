package com.kiyotanatosu.darkuniverse.block;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.block.custom.CorruptPortalBlock;
import com.kiyotanatosu.darkuniverse.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DarkUniverse.MOD_ID);

    public static final RegistryObject<Block> CORRUPT_BLOCK = registerBlock("corrupt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_CORRUPT_BLOCK = registerBlock("raw_corrupt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> CORRUPT_ORE = registerBlock("corrupt_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(5, 2000).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CORRUPT_STONE = registerBlock("corrupt_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> CORRUPT_COAL_ORE = registerBlock("corrupt_coal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)));

    public static final RegistryObject<Block> CORRUPT_BRICKS = registerBlock("corrupt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> CORRUPT_STAIRS = registerBlock("corrupt_stairs",
            () -> new StairBlock(() -> ModBlocks.CORRUPT_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_STAIRS)));

    public static final RegistryObject<Block> CORRUPT_SLAB = registerBlock("corrupt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB)));

    public static final RegistryObject<Block> CORRUPT_BUTTON = registerBlock("corrupt_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON),
                    BlockSetType.POLISHED_BLACKSTONE, 10, true));

    public static final RegistryObject<Block> CORRUPT_PRESSURE_PLATE = registerBlock("corrupt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE),
                    BlockSetType.POLISHED_BLACKSTONE));

    public static final RegistryObject<Block> CORRUPT_FENCE = registerBlock("corrupt_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_FENCE)));

    public static final RegistryObject<Block> CORRUPT_FENCE_GATE = registerBlock("corrupt_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_FENCE),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> CORRUPT_WALL = registerBlock("corrupt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_WALL)));

    public static final RegistryObject<Block> CORRUPT_DOOR = registerBlock("corrupt_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.STONE));

    public static final RegistryObject<Block> CORRUPT_TRAPDOOR = registerBlock("corrupt_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR), BlockSetType.STONE));

    public static final RegistryObject<Block> CORRUPT_ALTER = registerBlock("corrupt_alter",
            () -> new CorruptPortalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noLootTable().noOcclusion()));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

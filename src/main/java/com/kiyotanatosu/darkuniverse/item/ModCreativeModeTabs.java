package com.kiyotanatosu.darkuniverse.item;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DarkUniverse.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DARK_UNIVERSE_TAB = CREATIVE_MODE_TABS.register("dark_universe_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORRUPT_INGOT.get()))
                    .title(Component.translatable("creativetab.dark_universe_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CORRUPT_INGOT.get());
                        output.accept(ModItems.RAW_CORRUPT_ORE.get());
                        output.accept(ModItems.CORRUPT_COAL.get());

                        output.accept(ModBlocks.CORRUPT_BLOCK.get());
                        output.accept(ModBlocks.RAW_CORRUPT_BLOCK.get());
                        output.accept(ModBlocks.CORRUPT_ORE.get());
                        output.accept(ModBlocks.CORRUPT_COAL_ORE.get());

                        output.accept(ModItems.CORRUPT_SWORD.get());
                        output.accept(ModItems.CORRUPT_PICKAXE.get());
                        output.accept(ModItems.CORRUPT_AXE.get());
                        output.accept(ModItems.CORRUPT_SHOVEL.get());
                        output.accept(ModItems.CORRUPT_HOE.get());

                        output.accept(ModItems.CORRUPT_HELMET.get());
                        output.accept(ModItems.CORRUPT_CHESTPLATE.get());
                        output.accept(ModItems.CORRUPT_LEGGINGS.get());
                        output.accept(ModItems.CORRUPT_BOOTS.get());

                        output.accept(ModBlocks.CORRUPT_STONE.get());
                        output.accept(ModBlocks.CORRUPT_BRICKS.get());
                        output.accept(ModBlocks.CORRUPT_SLAB.get());
                        output.accept(ModBlocks.CORRUPT_STAIRS.get());
                        output.accept(ModBlocks.CORRUPT_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.CORRUPT_BUTTON.get());
                        output.accept(ModBlocks.CORRUPT_FENCE.get());
                        output.accept(ModBlocks.CORRUPT_FENCE_GATE.get());
                        output.accept(ModBlocks.CORRUPT_WALL.get());
                        output.accept(ModBlocks.CORRUPT_DOOR.get());
                        output.accept(ModBlocks.CORRUPT_TRAPDOOR.get());

                        output.accept(ModItems.BANANA.get());

                        output.accept(ModItems.CORRUPT_SKELETON_SPAWN_EGG.get());

                        output.accept(ModBlocks.CORRUPT_ALTER.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

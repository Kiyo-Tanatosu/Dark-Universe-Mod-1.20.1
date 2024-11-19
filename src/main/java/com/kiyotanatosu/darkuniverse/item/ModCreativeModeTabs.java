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

                        output.accept(ModItems.BANANA.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

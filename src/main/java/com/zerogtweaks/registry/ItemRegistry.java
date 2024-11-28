package com.zerogtweaks.registry;

import com.zerogtweaks.ZeroGTweaks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZeroGTweaks.MOD_ID);

    // Register Zero Ausioum item
    public static final RegistryObject<Item> ZERO_AUSIOUM = ITEMS.register("zero_ausioum",
            () -> new Item(new Item.Properties()));

    // Register Zero Ausioum Ore block item
    public static final RegistryObject<Item> ZERO_AUSIOUM_ORE = ITEMS.register("zero_ausioum_ore",
            () -> new BlockItem(BlockRegistry.ZERO_AUSIOUM_ORE.get(), new Item.Properties()));

    // Define the custom creative tab
    public static final CreativeModeTab CREATIVE_TAB = CreativeModeTab.builder()
            .icon(() -> new ItemStack(ZERO_AUSIOUM.get()))
            .title(Component.translatable("itemGroup.zerogtweaks"))
            .displayItems((displayParams, output) -> {
                output.accept(ZERO_AUSIOUM.get());
                output.accept(ZERO_AUSIOUM_ORE.get());
            }).build();

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

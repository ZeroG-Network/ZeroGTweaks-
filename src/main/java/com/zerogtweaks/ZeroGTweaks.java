package com.zerogtweaks;

import com.zerogtweaks.registry.BlockRegistry;
import com.zerogtweaks.registry.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ZeroGTweaks.MOD_ID)
public class ZeroGTweaks {
    public static final String MOD_ID = "zerogtweaks";

    public ZeroGTweaks() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register items and blocks
        ItemRegistry.register(modEventBus);
        BlockRegistry.register(modEventBus);
    }
}

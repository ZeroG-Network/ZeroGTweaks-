package com.zerogtweaks.registry;

import com.zerogtweaks.ZeroGTweaks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ZeroGTweaks.MOD_ID);

    // Register Zero Ausioum Ore block
    public static final RegistryObject<Block> ZERO_AUSIOUM_ORE = BLOCKS.register("zero_ausioum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE).strength(3.0f, 3.0f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package com.maxdemyd0.tutorialmod.item;

import com.maxdemyd0.tutorialmod.TutorialMod;
import com.maxdemyd0.tutorialmod.item.custom.GemDetectorItem;
import com.maxdemyd0.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REDSTONE_MAGNET = ITEMS.register("redstone_magnet", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_REDSTONE_MAGNET = ITEMS.register("gold_redstone_magnet", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> GEM_DETECTOR = ITEMS.register("gem_detector", () -> new GemDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
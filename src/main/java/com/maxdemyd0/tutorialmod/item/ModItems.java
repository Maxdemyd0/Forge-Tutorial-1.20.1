package com.maxdemyd0.tutorialmod.item;

import com.maxdemyd0.tutorialmod.TutorialMod;
import com.maxdemyd0.tutorialmod.item.custom.FuelItem;
import com.maxdemyd0.tutorialmod.item.custom.GemDetectorItem;
import com.maxdemyd0.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //------------items------------\\
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    //------------foods------------\\
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> SAPPHIRE_STRAWBERRY = ITEMS.register("sapphire_strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.SAPPHIRE_STRAWBERRY)));

    public static final RegistryObject<Item> RAW_FRENCH_FRIES = ITEMS.register("raw_french_fries",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FRENCH_FRIES = ITEMS.register("french_fries",
            () -> new Item(new Item.Properties().food(ModFoods.FRENCH_FRIES)));

    //------------tools------------\\
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));

    //------------others------------\\
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> REDSTONE_MAGNET = ITEMS.register("redstone_magnet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_REDSTONE_MAGNET = ITEMS.register("gold_redstone_magnet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> GEM_DETECTOR = ITEMS.register("gem_detector",
            () -> new GemDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
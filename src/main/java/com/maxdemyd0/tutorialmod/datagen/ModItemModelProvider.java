package com.maxdemyd0.tutorialmod.datagen;

import com.maxdemyd0.tutorialmod.TutorialMod;
import com.maxdemyd0.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_NUGGET);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.SAPPHIRE_STRAWBERRY);
        simpleItem(ModItems.RAW_FRENCH_FRIES);
        simpleItem(ModItems.FRENCH_FRIES);
        simpleItem(ModItems.PINE_CONE);
        simpleItem(ModItems.REDSTONE_MAGNET);
        simpleItem(ModItems.GOLD_REDSTONE_MAGNET);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.GEM_DETECTOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> itemRegistryObject) {
        return withExistingParent(itemRegistryObject.getId().getPath(),
                ResourceLocation.parse("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(itemRegistryObject.getId().getNamespace(), "item/" + itemRegistryObject.getId().getPath()));
    }
}

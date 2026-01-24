package com.maxdemyd0.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().fast().nutrition(2)
            .saturationMod(0.2f).build();

    public static final FoodProperties SAPPHIRE_STRAWBERRY = new FoodProperties.Builder().fast().nutrition(4)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160), 1.0f).alwaysEat().build();
}

package org.test.stuff;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties HOT = new FoodProperties.Builder().nutrition(2)

            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 250),0.1f).build();
}

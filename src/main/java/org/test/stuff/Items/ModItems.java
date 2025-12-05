package org.test.stuff.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.test.stuff.ModFoods;
import org.test.stuff.Stuff;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Stuff.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CD = ITEMS.register("cd",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HOT = ITEMS.register("hot",
            () -> new Item(new Item.Properties().food(ModFoods.HOT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
package net.forscherfreunde.mod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.forscherfreunde.mod.registry.item.ModFoodComponents;
import net.forscherfreunde.mod.registry.item.ModItems;
import net.minecraft.item.Item;


public class Mod {

    //Item und Food Test
    public static void ItemHinzufuegen(String name) {
        ModItems.registerItem(name, new Item(new FabricItemSettings()));
    }
    public static void FoodItemHinzufuegen(String name, int Hunger, float HungerModifizierer) {
        ModItems.registerItem(name, new Item(new FabricItemSettings().food(ModFoodComponents.erstelleEssensItem(Hunger, HungerModifizierer))));
    }

//    Monster und Tiere Test


    //Allgemeine Funktionen - getter
    public static Item HoleItem(String name) {
        return ModItems.GetItem(name);
    }
}

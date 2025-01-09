package net.forscherfreunde.mod.registry.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    //erstellt neues FoodComponent für die Mod-Klasse mit einem int Hunger-Wert und einem float HungerModifizierer-Wert
    public static FoodComponent erstelleEssensItem(int Hunger, float HungerModifizierer) {
        return new FoodComponent.Builder().hunger(Hunger).saturationModifier(HungerModifizierer).build();
    }
}

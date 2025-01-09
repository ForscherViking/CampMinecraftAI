package net.forscherfreunde.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.forscherfreunde.mod.entity.ModEntities;
import net.forscherfreunde.mod.entity.custom.CloudyEntity;
import net.forscherfreunde.mod.entity.custom.PorcupineEntity;
import net.forscherfreunde.mod.registry.Mod;
import net.forscherfreunde.mod.registry.item.ModItemGroups;
import net.forscherfreunde.mod.registry.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Willkommen bei Mods Programmierung V4 von ForscherFreunden - ich hoffe, ihr seid alle super angekommen und hattet
 * schon einen tollen ersten Tag mit euren Netten und Coolen Teamern. Im Namen aller Teamer und Beteiligten an diesem
 * Projekt - noch einmal Willkommen und eine tolle Zeit!
 *
 * Diese Klasse wird den großteil eurer Arbeit abnehmen - deswegen lest bitte unbedingt Kapitel [2] in der Doku [Tag_1]
 * genau durch, damit ihr ohne Fehler und entspannt mit der Mod arbeiten könnt und mit Freude unkompliziert Minecraft
 * anpassen könnt. Dieses Programm dient dem Einstieg in Minecraft - Modding und bietet eine Referenz was möglich ist.
 *
 * @Author
 * Matthias Mendler
 * @Rechte
 * ForscherFreunde GmbH
 */


public class TestMod implements ModInitializer {
	public static final String MOD_ID = "forscherfreundemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Mod.ItemHinzufuegen("ruby");
		Mod.FoodItemHinzufuegen("tomato", 3, 0.25f);

		//Test Custom Mobs und Animals
		ModEntities.createCustomEntity("porcupine", PorcupineEntity::new);
		FabricDefaultAttributeRegistry.register(ModEntities.ModEntitiesMap.get("porcupine"), PorcupineEntity.createModEntityAttributes());
		ModEntities.createCustomMob("cloudy", CloudyEntity::new);
		FabricDefaultAttributeRegistry.register(ModEntities.ModEntitiesMap.get("cloudy"), CloudyEntity.createMobAttributes());

		// *********************************************************************************************************************************************

		//Nicht Verändern! Initialisierung der Mod...
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
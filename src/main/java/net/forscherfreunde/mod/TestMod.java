package net.forscherfreunde.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.forscherfreunde.mod.entity.ModEntities;
import net.forscherfreunde.mod.entity.custom.CloudyEntity;
import net.forscherfreunde.mod.entity.custom.PorcupineEntity;
import net.forscherfreunde.mod.entity.custom.SuperarmadilloEntity;
import net.forscherfreunde.mod.registry.Mod;
import net.forscherfreunde.mod.registry.item.ModItemGroups;
import net.forscherfreunde.mod.registry.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Willkommen bei CampMinecraftAI von ForscherFreunden - ich hoffe, ihr seid alle super angekommen und hattet
 * schon einen tollen ersten Tag mit euren netten und coolen Teamern. Im Namen aller Teamer und Beteiligten an diesem
 * Projekt - noch einmal Willkommen und eine tolle Zeit!
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
		ModEntities.createCustomEntity("superarmadillo", SuperarmadilloEntity::new);
		FabricDefaultAttributeRegistry.register(ModEntities.ModEntitiesMap.get("superarmadillo"), SuperarmadilloEntity.createModEntityAttributes());

		// *********************************************************************************************************************************************

		//Nicht Verändern! Initialisierung der Mod...
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
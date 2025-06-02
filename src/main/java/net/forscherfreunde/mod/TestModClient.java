package net.forscherfreunde.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.forscherfreunde.mod.entity.ModEntities;
import net.forscherfreunde.mod.entity.client.*;

import static net.forscherfreunde.mod.entity.client.ModModelLayers.EntityModels;

/*
 * Diese Klasse wird für euch von großer Bedeutung sein, weil hier die Entitäten registriert werden.
 * Diese Klasse erfordert wenig Änderungen, jedoch müsst ihr darauf achten, jede Zeile Code hier ordentlich zu schreiben
 * damit keine Fehler entstehen. Hier ist also viel Vorsicht und Konzentration gefordert.
 * Gelbe unterstrichene Zeilen Code - wie unten schon steht - ist kein Problem und kann ignoriert werden.
 * Bei rot unterstrichenen Zeilen Code bitte euren Teamer ansprechen!
 */


public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        //Zeilen kopieren und Namen ändern vom .get Aufruf - .get("custom_entity_name"), und dem CustomModel::getTexturedModelData
        EntityModelLayerRegistry.registerModelLayer(EntityModels.get("porcupine_model"), PorcupineModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(EntityModels.get("superarmadillo_model"), SuperarmadilloModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(EntityModels.get("cloudy_model"), CloudyModel::getTexturedModelData);
        //Anpassen vom .get("custom_entity_name") und dem CustomEntityRenderer::new
        EntityRendererRegistry.register(((FabricEntityType) ModEntities.ModEntitiesMap.get("porcupine")), PorcupineRenderer::new);
        EntityRendererRegistry.register(((FabricEntityType) ModEntities.ModEntitiesMap.get("superarmadillo")), SuperarmadilloRenderer::new);
        EntityRendererRegistry.register(((FabricEntityType) ModEntities.ModEntitiesMap.get("cloudy")), CloudyRenderer::new);



    }
}

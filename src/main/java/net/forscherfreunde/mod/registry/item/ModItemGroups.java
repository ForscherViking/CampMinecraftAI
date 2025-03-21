package net.forscherfreunde.mod.registry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.forscherfreunde.mod.TestMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(Items.DIAMOND)).entries((displayContext, entries) -> {


                        // --- hinzufügen von Items und Blöcken
                        for (int i=0; i<ModItems.itemList.size(); i++) {
                            entries.add(ModItems.itemList.get(i));
                        }
                        // --- hinzufügen von Waffen und Werkzeugen ---

                    }).build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}

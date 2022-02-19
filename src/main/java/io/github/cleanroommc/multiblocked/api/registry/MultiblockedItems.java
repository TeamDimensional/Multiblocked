package io.github.cleanroommc.multiblocked.api.registry;

import io.github.cleanroommc.multiblocked.api.item.ItemBlueprint;
import io.github.cleanroommc.multiblocked.api.item.ItemMultiblockBuilder;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

public class MultiblockedItems {
    public static ItemBlueprint BLUEPRINT = new ItemBlueprint();
    public static ItemMultiblockBuilder BUILDER = new ItemMultiblockBuilder();

    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.register(BLUEPRINT);
        registry.register(BUILDER);
    }

    @SuppressWarnings("ConstantConditions")
    public static void registerModels() {
        ModelLoader.setCustomModelResourceLocation(BLUEPRINT, 0, new ModelResourceLocation(BLUEPRINT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BUILDER, 0, new ModelResourceLocation(BUILDER.getRegistryName(), "inventory"));
    }

}

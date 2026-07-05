package net.memezforbeanz.starminerodyssey.registry;


import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;

import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

import java.util.function.Supplier;

public class Tabs {
    public static final ResourcefulRegistry<CreativeModeTab> TABS;
    public static final RegistryEntry<CreativeModeTab> TAB;

    public Tabs() {
    }

    static {
        TABS = ResourcefulRegistries.create(BuiltInRegistries.CREATIVE_MODE_TAB, StarminerAdditions.MOD_ID);

        // Register the creative tab properly - the build() method returns a Supplier<CreativeModeTab>
        Supplier<CreativeModeTab> tabSupplier = new ResourcefulCreativeTab(new ResourceLocation(StarminerAdditions.MOD_ID, "main"))
                .setItemIcon(ModItems.STELLAR_CORE)
                .addRegistry(ModItems.ITEMS)
                .build();

        TAB = TABS.register("main", tabSupplier);
    }
}

package net.memezforbeanz.starminerodyssey.fabric;

import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.fabricmc.api.ModInitializer;

public final class StarminerAdditionsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        StarminerAdditions.init();
    }
}

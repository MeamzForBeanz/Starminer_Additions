package net.memezforbeanz.starminerodyssey.forge;

import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StarminerAdditions.MOD_ID)
public final class StarminerAdditionsForge {
    public StarminerAdditionsForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(StarminerAdditions.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        StarminerAdditions.init();
    }
}

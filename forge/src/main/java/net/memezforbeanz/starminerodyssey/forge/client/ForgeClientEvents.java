package net.memezforbeanz.starminerodyssey.forge.client;

import mod.azure.azurelib.render.item.AzItemRendererRegistry;
import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.memezforbeanz.starminerodyssey.item.client.StellarCoreRenderer;
import net.memezforbeanz.starminerodyssey.registry.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = StarminerAdditions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // Register client-side item renderers - enqueueWork ensures this runs thread-safely
            StarminerAdditions.LOGGER.info("Registering Starminer Additions client renderers...");
            AzItemRendererRegistry.register(StellarCoreRenderer::new, ModItems.STELLAR_CORE.get());
            StarminerAdditions.LOGGER.info("Successfully registered STELLAR_CORE item renderer");
        });
    }
}


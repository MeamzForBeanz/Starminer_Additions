package net.memezforbeanz.starminerodyssey.fabric.client;

import mod.azure.azurelib.rewrite.render.item.AzItemRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.memezforbeanz.starminerodyssey.item.client.StellarCoreRenderer;
import net.memezforbeanz.starminerodyssey.registry.ModItems;

public final class StarminerAdditionsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        StarminerAdditions.initClient();

        // Register AzureLib item renderers (Fabric-specific, safe to call .get() here)
        AzItemRendererRegistry.register(StellarCoreRenderer::new, ModItems.STELLAR_CORE.get());
    }
}

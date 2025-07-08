package net.memezforbeanz.starminerodyssey.item.client;

import mod.azure.azurelib.rewrite.render.item.AzItemRenderer;
import mod.azure.azurelib.rewrite.render.item.AzItemRendererConfig;
import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.minecraft.resources.ResourceLocation;


public class StellarCoreRenderer extends AzItemRenderer {
    private static final ResourceLocation GEO = new ResourceLocation(StarminerAdditions.MOD_ID, "geo/star_core.geo.json");

    private static final ResourceLocation TEX = new ResourceLocation(StarminerAdditions.MOD_ID, "textures/item/star_core.png");

    public StellarCoreRenderer() {
        super(
                AzItemRendererConfig.builder(GEO, TEX).build()
        );
    }

}


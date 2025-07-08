package net.memezforbeanz.starminerodyssey;

import mod.azure.azurelib.rewrite.render.item.AzItemRendererRegistry;
import net.memezforbeanz.starminerodyssey.item.client.StellarCoreRenderer;
import net.memezforbeanz.starminerodyssey.item.custom.StellarCoreItem;
import net.memezforbeanz.starminerodyssey.registry.*;
import org.slf4j.Logger;


import com.mojang.logging.LogUtils;

public class StarminerAdditions {
	public static final String MOD_ID = "starminer-additions";
	public static final Logger LOGGER = LogUtils.getLogger();

	public StarminerAdditions() {
	}

	public static void init() {
		AzItemRendererRegistry.register(StellarCoreRenderer::new, ModItems.STELLAR_CORE.get());
		ModFluidProperties.FLUID_PROPERTIES.initialize();
		ModFluids.FLUIDS.init();
		ModBlocks.BLOCKS.init();
		ModItems.ITEMS.init();
		Tabs.TABS.init();
		ModBlockEntityTypes.BLOCK_ENTITY_TYPES.init();
	}

}
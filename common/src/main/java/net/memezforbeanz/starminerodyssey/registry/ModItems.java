package net.memezforbeanz.starminerodyssey.registry;


import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.botarium.common.registry.fluid.FluidBucketItem;

import net.minecraft.core.registries.BuiltInRegistries;

import net.minecraft.world.item.Item;

import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.memezforbeanz.starminerodyssey.item.custom.StellarCoreItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS;
    public static final RegistryEntry<Item> STELLAR_CORE;
    public static final RegistryEntry<Item> HELIUM_BUCKET;


    public ModItems() {
    }

    static {
        // --- FIX IS HERE ---
        // By simply referencing the ModFluids class here, we ensure that
        // it gets loaded and initialized by Java *before* the rest of this code runs.
        // This guarantees that ModFluidProperties.HELIUM is ready to be used.
        var initFluids = ModFluids.FLUIDS;

        ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, StarminerAdditions.MOD_ID);

        // This is the original code, which will now work correctly.
        // I've also renamed the item to "helium_bucket" to prevent any potential
        // conflicts with your fluid's ID.
        HELIUM_BUCKET = ITEMS.register("star_helium_bucket", () -> new FluidBucketItem(
                ModFluidProperties.HELIUM,
                new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1))
        );
        STELLAR_CORE = ITEMS.register("star_core", () -> new StellarCoreItem(new Item.Properties().rarity(Rarity.EPIC),
                890909000, 10000000, 10000000));
    }
}
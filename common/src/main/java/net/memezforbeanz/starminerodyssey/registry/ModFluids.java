package net.memezforbeanz.starminerodyssey.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.botarium.common.registry.fluid.BotariumFlowingFluid;
import earth.terrarium.botarium.common.registry.fluid.BotariumSourceFluid;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import earth.terrarium.botarium.common.registry.fluid.FluidInformation;
import net.memezforbeanz.starminerodyssey.StarminerAdditions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;

public final class ModFluids {
    public static final ResourcefulRegistry<Fluid> FLUIDS = ResourcefulRegistries.create(BuiltInRegistries.FLUID, StarminerAdditions.MOD_ID);

    public static final RegistryEntry<BotariumSourceFluid> HELIUM = FLUIDS.register("star_helium", () -> new BotariumSourceFluid(ModFluidProperties.HELIUM));
    public static final RegistryEntry<FlowingFluid> FLOWING_HELIUM = FLUIDS.register("flowing_star_helium", () -> new BotariumFlowingFluid(ModFluidProperties.HELIUM));

    private ModFluids() {}
}
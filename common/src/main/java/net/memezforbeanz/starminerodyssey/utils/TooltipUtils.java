package net.memezforbeanz.starminerodyssey.utils;


import earth.terrarium.botarium.common.fluid.FluidConstants;
import earth.terrarium.botarium.common.fluid.base.FluidHolder;
import earth.terrarium.botarium.common.fluid.utils.ClientFluidHooks;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.List;
import java.util.Locale;

import net.memezforbeanz.starminerodyssey.constants.ConstantComponents;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.level.material.Fluid;

public class TooltipUtils {
    public static String getFormattedAmount(long number) {
        if (Screen.hasShiftDown()) {
            return DecimalFormat.getNumberInstance().format(number);
        } else {
            NumberFormat compactFormat = NumberFormat.getCompactNumberInstance(Locale.ROOT, Style.SHORT);
            compactFormat.setMaximumFractionDigits(2);
            return compactFormat.format(number);
        }
    }

    public static Component getEnergyComponent(long energy, long capacity) {
        return Component.translatable("info.starminer-additions.star_core.energy", new Object[]{getFormattedAmount(energy), getFormattedAmount(capacity)}).withStyle(ChatFormatting.GOLD);
    }

    public static Component getEnergyDifferenceComponent(long energy) {
        return Component.translatable("info.starminer-additions.star_core.energy_%s".formatted(energy < 0L ? "out" : "in"), new Object[]{getFormattedAmount(Math.abs(energy))}).withStyle(ChatFormatting.GOLD);
    }

    public static Component getMaxEnergyInComponent(long maxIn) {
        return Component.translatable("tooltip.starminer-additions.max_energy_in", new Object[]{getFormattedAmount(maxIn)}).withStyle(ChatFormatting.GREEN);
    }

    public static Component getMaxEnergyOutComponent(long maxOut) {
        return Component.translatable("tooltip.starminer-additions.max_energy_out", new Object[]{getFormattedAmount(maxOut)}).withStyle(ChatFormatting.GREEN);
    }

    public static Component getEnergyUsePerTickComponent(long usePerTick) {
        return Component.translatable("tooltip.starminer-additions.use_rate", new Object[]{getFormattedAmount(Math.abs(usePerTick))}).withStyle(ChatFormatting.AQUA);
    }

    public static Component getEnergyGenerationPerTickComponent(long generationPerTick) {
        return Component.translatable("tooltip.starminer-additions.production_rate", new Object[]{getFormattedAmount(Math.abs(generationPerTick))}).withStyle(ChatFormatting.AQUA);
    }

    public static Component getActiveInactiveComponent(boolean active) {
        return active ? ConstantComponents.ACTIVE.copy().withStyle(ChatFormatting.AQUA) : ConstantComponents.INACTIVE.copy().withStyle(ChatFormatting.AQUA);
    }

    public static Component getDistributionModeComponent(DistributionMode mode) {
        MutableComponent var10000;
        switch (mode) {
            case SEQUENTIAL -> var10000 = ConstantComponents.SEQUENTIAL.copy().withStyle(ChatFormatting.AQUA);
            case ROUND_ROBIN -> var10000 = ConstantComponents.ROUND_ROBIN.copy().withStyle(ChatFormatting.AQUA);
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }


    public static Component getTicksPerIterationComponent(int time) {
        return Component.translatable("tooltip.ad_astra.ticks_per_iteration", new Object[]{getFormattedAmount((long)time)}).withStyle(ChatFormatting.AQUA);
    }



    public static void addDescriptionComponent(List<Component> tooltipComponents, Component description) {
        if (!Screen.hasShiftDown()) {
            tooltipComponents.add(ConstantComponents.SHIFT_DESCRIPTION);
        } else {
            for(FormattedCharSequence text : Minecraft.getInstance().font.split(description, 200)) {
                StringBuilder builder = new StringBuilder();
                text.accept((i, style, codePoint) -> {
                    builder.appendCodePoint(codePoint);
                    return true;
                });
                tooltipComponents.add(Component.literal(builder.toString()).withStyle(description.getStyle()));
            }

        }
    }

}

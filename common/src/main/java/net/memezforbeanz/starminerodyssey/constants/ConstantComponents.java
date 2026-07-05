package net.memezforbeanz.starminerodyssey.constants;


import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public class ConstantComponents {
    public static final Component STELLAR_GRAVITY_INFO;
    public static final Component STELLAR_CORE_INFO;
    public static final Component SEQUENTIAL;
    public static final Component ROUND_ROBIN;
    public static final Component ACTIVE;
    public static final Component INACTIVE;
    public static final Component SHIFT_DESCRIPTION;

    public static final Component CAPACITOR_ENABLED;
    public static final Component CAPACITOR_DISABLED;

    public ConstantComponents() {
    }

    static {
        ACTIVE = Component.translatable("tooltip.starmineradditions.active");
        INACTIVE = Component.translatable("tooltip.starmineradditions.inactive");
        SEQUENTIAL = Component.translatable("tooltip.starmineradditions.distribution_mode.sequential");
        ROUND_ROBIN = Component.translatable("tooltip.starmineradditions.distribution_mode.round_robin");
        STELLAR_GRAVITY_INFO = Component.translatable("info.starmineradditions.stellar_gravity").withStyle(ChatFormatting.GRAY);
        STELLAR_CORE_INFO = Component.translatable("info.starmineradditions.star_core.info").withStyle(ChatFormatting.GRAY);
        SHIFT_DESCRIPTION = Component.translatable("tooltip.starmineradditions.shift_description").withStyle(ChatFormatting.GRAY);
        CAPACITOR_ENABLED = Component.translatable("tooltip.starmineradditions.enabled");
        CAPACITOR_DISABLED = Component.translatable("tooltip.starmineradditions.disabled");

    }
}

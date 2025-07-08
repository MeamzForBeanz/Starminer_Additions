//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.memezforbeanz.starminerodyssey.utils;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import earth.terrarium.botarium.common.energy.base.EnergyContainer;
import earth.terrarium.botarium.common.item.ItemStackHolder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnergyUtils {
    public static ItemStack energyFilledItem(RegistryEntry<Item> item) {
        return energyFilledItem(((Item)item.get()).getDefaultInstance());
    }

    public static ItemStack energyFilledItem(ItemStack stack) {
        ItemStackHolder holder = new ItemStackHolder(stack);
        EnergyContainer container = EnergyContainer.of(holder);
        if (container != null) {
            container.setEnergy(container.getMaxCapacity());
            stack.getOrCreateTagElement("BotariumData").putLong("Energy", container.getMaxCapacity());
        }

        return stack;
    }
}

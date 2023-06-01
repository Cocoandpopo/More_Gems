package net.andrew.more_gems.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab Gems_Tab = new CreativeModeTab("gems_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FlUORITE_INGOT.get());
        }
    };
    public static final CreativeModeTab Ores_Tab = new CreativeModeTab("ores_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FlUORITE_INGOT.get());
        }
    };
}

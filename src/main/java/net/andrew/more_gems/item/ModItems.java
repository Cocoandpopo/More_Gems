package net.andrew.more_gems.item;

import net.andrew.more_gems.MoreGems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreGems.MOD_ID);

    public static final RegistryObject<Item> FlUORITE_INGOT = ITEMS.register("fluorite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.Ores_Tab)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

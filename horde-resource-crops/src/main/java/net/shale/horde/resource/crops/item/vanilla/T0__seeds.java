package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class T0__seeds {
    public static final Item SEED_RHODONITE = registerItem("crops/vanilla/seed_rhodonite", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_AIR = registerItem("crops/vanilla/seed_air", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_EARTH = registerItem("crops/vanilla/seed_earth", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_FIRE = registerItem("crops/vanilla/seed_fire", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_WATER = registerItem("crops/vanilla/seed_water", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

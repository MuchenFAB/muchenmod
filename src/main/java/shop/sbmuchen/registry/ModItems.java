package shop.sbmuchen.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import shop.sbmuchen.www.MuchenMod;




public class ModItems {

    public static final Item M0LEST_STICK = registerItem("molest_stick",
            new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(MuchenMod.MOD_ID, name), item);
        for (ItemGroup itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.TOOLS).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }

    public static void registerModItems() {
        MuchenMod.LOGGER.debug("Registering mod items for" + MuchenMod.MOD_ID);


    }

}
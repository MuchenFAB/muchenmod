package shop.sbmuchen.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import shop.sbmuchen.www.MuchenMod;
import static net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder;


public class ModItemGroup {
    public static ItemGroup MOLEST_STICK = builder(new Identifier(MuchenMod.MOD_ID, "molest_stick"))
            .displayName(Text.translatable("itemgroup.muchen-mod.molest_stick"))
            .icon(() -> new ItemStack(ModItems.MOLEST_STICK))
            .build();

    public static void registerModItemGroup() {
        MuchenMod.LOGGER.debug("Registering mod item group for " + MuchenMod.MOD_ID);
    }

}

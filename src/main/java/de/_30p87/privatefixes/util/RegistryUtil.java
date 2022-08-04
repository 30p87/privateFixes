package de._30p87.privatefixes.util;

import de._30p87.privatefixes.PrivateFixes;
import net.minecraft.item.Item;

public class RegistryUtil {
    public static Item setItemname(final Item item, final String name) {
        item.setRegistryName(PrivateFixes.MOD_ID, name).setTranslationKey(PrivateFixes.MOD_ID + "." + name);
        return item;
    }
}

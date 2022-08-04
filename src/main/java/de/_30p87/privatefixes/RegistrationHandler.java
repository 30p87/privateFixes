package de._30p87.privatefixes;

import de._30p87.privatefixes.item.ItemHeart;
import de._30p87.privatefixes.util.RegistryUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = PrivateFixes.MOD_ID)
public class RegistrationHandler {
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemname(new ItemHeart(), "heart").setCreativeTab(CreativeTabs.MISC)
        };
        event.getRegistry().registerAll(items);
    }
}

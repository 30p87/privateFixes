package de._30p87.privatefixes.patches;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber()
public class Headshots {
    @SubscribeEvent
    public static void headshots_event(LivingDamageEvent event) {
        if (!(event.getEntity() instanceof EntityPlayer)) return;
        if (!(event.getSource().isProjectile())) return;
        if (!(event.getSource().getImmediateSource() instanceof EntityArrow)) return;
        boolean helmet = false;
        for (ItemStack itemStack : event.getEntity().getArmorInventoryList()) {
            if (!(itemStack.getItem() instanceof ItemAir) && ((ItemArmor) itemStack.getItem()).armorType == EntityEquipmentSlot.HEAD) helmet = true;
        }
        final double eye_height = event.getEntity().getEyeHeight() + event.getEntity().posY;
        final double height_diff = event.getEntity().height - event.getEntity().getEyeHeight() + 0.4;
        final double arrow_height = event.getSource().getImmediateSource().posY;
        if ((eye_height > arrow_height) || !(helmet) && arrow_height > eye_height - height_diff) event.setAmount(event.getAmount()*3);
    }
}

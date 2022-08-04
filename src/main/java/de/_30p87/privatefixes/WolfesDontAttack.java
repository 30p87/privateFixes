package de._30p87.privatefixes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber
public class WolfesDontAttack {
    @SubscribeEvent
    public static void onTick(TickEvent.WorldTickEvent event) {
        for (Entity entity : event.world.loadedEntityList) {
            if (entity instanceof EntityWolf && ((EntityWolf) entity).isTamed() && ((EntityWolf) entity).getAttackTarget() instanceof EntityPlayer) ((EntityWolf) entity).setAttackTarget(null);
        }
    }
}

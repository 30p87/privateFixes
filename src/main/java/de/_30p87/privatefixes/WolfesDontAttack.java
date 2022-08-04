package de._30p87.privatefixes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static de._30p87.privatefixes.PrivateFixes.LOGGER;

@Mod.EventBusSubscriber
public class WolfesDontAttack {
    @SubscribeEvent
    public static void onTick(TickEvent.WorldTickEvent event) {
        for (Entity entity : event.world.loadedEntityList) {
            if (entity instanceof EntityWolf && ((EntityWolf) entity).isTamed()) LOGGER.info(((EntityWolf) entity).getAttackTarget());
        }
    }
}

package de._30p87.privatefixes.patches;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class CreepersDontDestroy {
    @SubscribeEvent
    public static void changeCreeper(ExplosionEvent.Detonate event) {
        if (event.getExplosion().getExplosivePlacedBy() instanceof EntityCreeper) event.getExplosion().clearAffectedBlockPositions();
     }
}

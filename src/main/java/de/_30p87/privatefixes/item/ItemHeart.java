package de._30p87.privatefixes.item;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class ItemHeart extends Item {
    @Override
    @ParametersAreNonnullByDefault
    @MethodsReturnNonnullByDefault
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.setHealth(20);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

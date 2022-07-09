package net.shale.horde.backpack.block.diamond;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_DiamondItemRegistry;

public class BlueBlockDiamond extends Pickup {
    public BlueBlockDiamond(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }

    @Override
    protected ItemStack getBlock() {
        return BB_DiamondItemRegistry.DIAMOND_BLUE_ITEM.getDefaultStack();
    }
}

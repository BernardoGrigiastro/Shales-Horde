package net.shale.horde.backpack.block.iron;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_IronItemRegistry;

public class PinkBlockIron extends Pickup {
    public PinkBlockIron(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_IronItemRegistry.IRON_PINK_ITEM.getDefaultStack();
    }
}

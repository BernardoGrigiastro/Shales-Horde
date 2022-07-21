package net.shale.horde.backpack.block.iron;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_IronItemRegistry;

public class MagentaBlockIron extends Pickup {
    public MagentaBlockIron(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_IronItemRegistry.IRON_MAGENTA_ITEM.getDefaultStack();
    }
}
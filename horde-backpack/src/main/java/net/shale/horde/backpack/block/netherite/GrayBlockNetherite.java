package net.shale.horde.backpack.block.netherite;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_NetheriteItemRegistry;

public class GrayBlockNetherite extends Pickup {
    public GrayBlockNetherite(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_NetheriteItemRegistry.NETHERITE_GRAY_ITEM.getDefaultStack();
    }
}
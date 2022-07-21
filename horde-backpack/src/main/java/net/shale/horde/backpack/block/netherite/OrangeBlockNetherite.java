package net.shale.horde.backpack.block.netherite;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_NetheriteItemRegistry;

public class OrangeBlockNetherite extends Pickup {
    public OrangeBlockNetherite(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_NetheriteItemRegistry.NETHERITE_ORANGE_ITEM.getDefaultStack();
    }
}
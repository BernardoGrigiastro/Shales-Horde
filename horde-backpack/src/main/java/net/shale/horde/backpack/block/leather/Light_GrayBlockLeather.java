package net.shale.horde.backpack.block.leather;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_LeatherItemRegistry;

public class Light_GrayBlockLeather extends Pickup {
    public Light_GrayBlockLeather(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_LeatherItemRegistry.LEATHER_LIGHT_GRAY_ITEM.getDefaultStack();
    }
}

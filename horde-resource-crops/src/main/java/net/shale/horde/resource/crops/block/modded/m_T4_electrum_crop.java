package net.shale.horde.resource.crops.block.modded;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.block.custom.crop_block;
import net.shale.horde.resource.crops.item.modded.m_T4__seeds;

public class m_T4_electrum_crop extends crop_block {
    public m_T4_electrum_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return m_T4__seeds.SEED_ELECTRUM;
    }
}

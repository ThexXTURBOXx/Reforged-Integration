package org.thexxturboxx.rfintegration.botania;

import net.minecraft.item.ItemStack;
import vazkii.botania.api.mana.IManaUsingItem;

public interface ManaItem extends IManaUsingItem {

	@Override
	default boolean usesMana(ItemStack is) {
		return true;
	}

}
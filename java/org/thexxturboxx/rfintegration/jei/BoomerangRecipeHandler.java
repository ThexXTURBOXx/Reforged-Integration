package org.thexxturboxx.rfintegration.jei;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.silvercatcher.reforged.ReforgedReferences.GlobalValues;
import org.silvercatcher.reforged.items.recipes.BoomerangEnchRecipe;

import mezz.jei.api.recipe.*;
import net.minecraft.item.ItemStack;

public class BoomerangRecipeHandler implements IRecipeHandler<BoomerangEnchRecipe> {
	
	@Nonnull
	@Override
	public Class<BoomerangEnchRecipe> getRecipeClass() {
		return BoomerangEnchRecipe.class;
	}
	
	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return VanillaRecipeCategoryUid.CRAFTING;
	}
	
	@Override
	public IRecipeWrapper getRecipeWrapper(BoomerangEnchRecipe recipe) {
		List<List<ItemStack>> input = new ArrayList<List<ItemStack>>();
		List<ItemStack> output = new ArrayList<ItemStack>();
		List<ItemStack> cache = new ArrayList<ItemStack>();
		ItemStack[] inputr = (ItemStack[]) getField(recipe, "input");
		ItemStack outputr = (ItemStack) getField(recipe, "output");
		for(ItemStack is : inputr) {
			if(is != null) cache.add(is.splitStack(1));
		}
		input.add(cache);
		output.add(outputr);
		return new ReforgedRecipeWrapper(input, output);
	}
	
	private Object getField(BoomerangEnchRecipe instance, String name) {
		Object obj = null;
		try {
			Field f = instance.getClass().getDeclaredField(name);
			f.setAccessible(true);
			obj = f.get(instance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	@Override
	public boolean isRecipeValid(BoomerangEnchRecipe recipe) {
		return GlobalValues.BOOMERANG && getField(recipe, "input") != null &&
				getField(recipe, "output") != null;
	}
	
}
package org.thexxturboxx.rfintegration.jei;

import java.lang.reflect.Field;
import java.util.*;

import javax.annotation.Nonnull;

import org.silvercatcher.reforged.ReforgedReferences.GlobalValues;
import org.silvercatcher.reforged.api.ReforgedAdditions;
import org.silvercatcher.reforged.items.recipes.NestOfBeesLoadRecipe;

import mezz.jei.api.recipe.*;
import net.minecraft.item.ItemStack;

public class NestOfBeesRecipeHandler implements IRecipeHandler<NestOfBeesLoadRecipe> {
	
	@Nonnull
	@Override
	public Class<NestOfBeesLoadRecipe> getRecipeClass() {
		return NestOfBeesLoadRecipe.class;
	}
	
	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return VanillaRecipeCategoryUid.CRAFTING;
	}
	
	@Override
	public IRecipeWrapper getRecipeWrapper(NestOfBeesLoadRecipe recipe) {
		List<List<ItemStack>> input = new ArrayList<List<ItemStack>>();
		List<ItemStack> output = new ArrayList<ItemStack>();
		List<ItemStack> cache = new ArrayList<ItemStack>();
		HashMap<Integer, Integer> aBs = (HashMap<Integer, Integer>) getField(recipe, "usedaBs");
		int count = 0;
		for(int i : aBs.keySet()) {
			count += aBs.get(i);
		}
		ItemStack arrowBundle = new ItemStack(ReforgedAdditions.ARROW_BUNDLE,
				count);
		ItemStack[] inputr = (ItemStack[]) getField(recipe, "input");
		int nob = (int) getField(recipe, "NoB");
		ItemStack nobIn = inputr[nob];
		ItemStack nobOut = (ItemStack) getField(recipe, "output");
		for(ItemStack i : inputr) {
			System.out.println(i.stackSize + "x " + i.getItem().getUnlocalizedName());
		}
		System.out.println("R: " + nobOut.stackSize + "x " + nobOut.getItem().getUnlocalizedName());
		cache.add(arrowBundle);
		cache.add(nobIn);
		input.add(cache);
		output.add(nobOut);
		return new ReforgedRecipeWrapper(input, output);
	}
	
	private Object getField(NestOfBeesLoadRecipe instance, String name) {
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
	public boolean isRecipeValid(NestOfBeesLoadRecipe recipe) {
		return GlobalValues.NEST_OF_BEES && getField(recipe, "input") != null &&
				getField(recipe, "output") != null;
	}
	
}
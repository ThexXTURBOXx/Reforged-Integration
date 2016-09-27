package org.thexxturboxx.rfintegration.jei;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.silvercatcher.reforged.ReforgedReferences.GlobalValues;
import org.silvercatcher.reforged.api.CompoundTags;
import org.silvercatcher.reforged.api.ReforgedAdditions;
import org.silvercatcher.reforged.items.recipes.NestOfBeesLoadRecipe;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NestOfBeesRecipeHandler implements IRecipeHandler<NestOfBeesLoadRecipe> {
	
	@Nonnull
	@Override
	public Class<NestOfBeesLoadRecipe> getRecipeClass() {
		return NestOfBeesLoadRecipe.class;
	}
	
	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return "Nest of Bees Reloading (Shapeless)";
	}
	
	@Override
	public IRecipeWrapper getRecipeWrapper(NestOfBeesLoadRecipe recipe) {
		List<List<ItemStack>> input = new ArrayList<List<ItemStack>>();
		List<ItemStack> output = new ArrayList<ItemStack>();
		for(int i = 0; i <= 3; i++) {
			for(int j = 1; j <= i - 2; j++) {
				List<ItemStack> cache = new ArrayList<ItemStack>();
				ItemStack arrowBundle = new ItemStack(ReforgedAdditions.ARROW_BUNDLE, j);
				ItemStack nobIn = new ItemStack(ReforgedAdditions.NEST_OF_BEES);
				NBTTagCompound cpdIn = CompoundTags.giveCompound(nobIn);
				cpdIn.setInteger(CompoundTags.AMMUNITION, (i * 8));
				ItemStack nobOut = nobIn.copy();
				NBTTagCompound cpdOut = CompoundTags.giveCompound(nobOut);
				cpdOut.setInteger(CompoundTags.AMMUNITION,
						cpdOut.getInteger(CompoundTags.AMMUNITION) + (j * 8));
			}
		}
		return new ReforgedRecipeWrapper(input, output);
	}
	
	@Override
	public boolean isRecipeValid(NestOfBeesLoadRecipe recipe) {
		return GlobalValues.NEST_OF_BEES;
	}
	
}
package org.thexxturboxx.rfintegration.jei;

import java.util.List;

import mezz.jei.api.recipe.BlankRecipeWrapper;
import net.minecraft.item.ItemStack;

public class ReforgedRecipeWrapper extends BlankRecipeWrapper {
	
	private List<List<ItemStack>> input;
	private List<ItemStack> output;
	
	public ReforgedRecipeWrapper(List<List<ItemStack>> input, List<ItemStack> output) {
		this.input = input;
		this.output = output;
	}
	
	@Override
	public List<List<ItemStack>> getInputs() {
		return input;
	}
	
	@Override
	public List<ItemStack> getOutputs() {
		return output;
	}
	
}
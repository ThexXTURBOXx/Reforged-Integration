package org.thexxturboxx.rfintegration.jei;

import java.util.Collections;
import java.util.List;

import mezz.jei.api.recipe.wrapper.ICraftingRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ReforgedRecipeWrapper implements ICraftingRecipeWrapper {
	
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

	@Override
	public List<FluidStack> getFluidInputs() {
		return Collections.emptyList();
	}

	@Override
	public List<FluidStack> getFluidOutputs() {
		return Collections.emptyList();
	}

	@Override
	public void drawAnimations(Minecraft minecraft, int recipeWidth, int recipeHeight) {
		
	}

	@Override
	public List<String> getTooltipStrings(int mouseX, int mouseY) {
		return null;
	}

	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight) {
		
	}
	
}
package org.thexxturboxx.rfintegration.jei;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.silvercatcher.reforged.ReforgedReferences.GlobalValues;
import org.silvercatcher.reforged.api.CompoundTags;
import org.silvercatcher.reforged.api.ReforgedAdditions;
import org.silvercatcher.reforged.items.recipes.BoomerangEnchRecipe;
import org.silvercatcher.reforged.items.weapons.ItemBoomerang;
import org.thexxturboxx.rfintegration.core.ProxyBase;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class BoomerangRecipeHandler implements IRecipeHandler<BoomerangEnchRecipe> {
	
	@Nonnull
	@Override
	public Class<BoomerangEnchRecipe> getRecipeClass() {
		return BoomerangEnchRecipe.class;
	}
	
	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return "Boomerang Enchanting (Shapeless)";
	}
	
	@Override
	public IRecipeWrapper getRecipeWrapper(BoomerangEnchRecipe recipe) {
		List<List<ItemStack>> input = new ArrayList<List<ItemStack>>();
		List<ItemStack> output = new ArrayList<ItemStack>();
		List<ItemBoomerang> boomerangs = new ArrayList<ItemBoomerang>();
		boomerangs.add((ItemBoomerang) ReforgedAdditions.WOODEN_BOOMERANG);
		boomerangs.add((ItemBoomerang) ReforgedAdditions.STONE_BOOMERANG);
		boomerangs.add((ItemBoomerang) ReforgedAdditions.IRON_BOOMERANG);
		boomerangs.add((ItemBoomerang) ReforgedAdditions.GOLDEN_BOOMERANG);
		boomerangs.add((ItemBoomerang) ReforgedAdditions.DIAMOND_BOOMERANG);
		for(ItemBoomerang ib : ProxyBase.boomerangList) boomerangs.add(ib);
		for(ItemBoomerang ib : boomerangs) {
			List<ItemStack> cache = new ArrayList<ItemStack>();
			cache.add(new ItemStack(Items.gold_ingot));
			cache.add(new ItemStack(Items.diamond));
			cache.add(new ItemStack(Items.gold_ingot));
			cache.add(new ItemStack(Items.diamond));
			cache.add(new ItemStack(ib));
			cache.add(new ItemStack(Items.gold_ingot));
			cache.add(new ItemStack(Items.diamond));
			cache.add(new ItemStack(Items.gold_ingot));
			cache.add(new ItemStack(Items.diamond));
			input.add(cache);
			ItemStack bEnch = new ItemStack(ib);
			NBTTagCompound compound = CompoundTags.giveCompound(bEnch);
			compound.setBoolean(CompoundTags.ENCHANTED, true);
			bEnch.addEnchantment(ReforgedAdditions.goalseeker, 1);
			output.add(bEnch);
		}
		return new ReforgedRecipeWrapper(input, output);
	}
	
	@Override
	public boolean isRecipeValid(BoomerangEnchRecipe recipe) {
		return GlobalValues.BOOMERANG;
	}
	
}
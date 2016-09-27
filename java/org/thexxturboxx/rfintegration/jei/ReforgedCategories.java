package org.thexxturboxx.rfintegration.jei;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.plugins.vanilla.crafting.CraftingRecipeCategory;

public abstract class ReforgedCategories {
	
	public class BoomerangCategory extends CraftingRecipeCategory {

		public BoomerangCategory(IJeiHelpers helpers) {
			super(helpers.getGuiHelper());
		}
		
		@Override
		public String getUid() {
			return getTitle();
		}
		
		@Override
		public String getTitle() {
			return "Boomerang Enchanting (Shapeless)";
		}
		
	}
	
	public class NoBCategory extends CraftingRecipeCategory {

		public NoBCategory(IJeiHelpers helpers) {
			super(helpers.getGuiHelper());
		}
		
		@Override
		public String getUid() {
			return getTitle();
		}
		
		@Override
		public String getTitle() {
			return "Nest of Bees Reloading (Shapeless)";
		}
		
	}
	
}
package org.thexxturboxx.rfintegration.core;

import java.util.List;

import org.silvercatcher.reforged.api.ItemExtension;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;

public class Registry {
	
	//Counters
	public static int counterEntities = 0;
	
	//Registry
	/**Registers all items on the given list*/
	public static void registerItems(List<Item> regListItems) {
		for(Item item : regListItems) {
			GameRegistry.register(item, new ResourceLocation(ModReforgedIntegration.ID, item.getUnlocalizedName().substring(5)));
		}
	}
	
	/**Registers all recipes of the registered items*/
	public static void registerRecipes(List<Item> regListItems) {
		for(Item item : regListItems) {
			if(item instanceof ItemExtension) {
				((ItemExtension) (item)).registerRecipes();
			}
		}
	}
	
	/**Helper method for registering an Custom IRecipe
	 * @param name The name for the Recipe
	 * @param recipe The instance of the Recipe
	 * @param recipeclass The class of the Recipe
	 * @param category {@link Category#SHAPED} or {@link Category#SHAPELESS}?*/
	public static void registerIRecipe(String name, IRecipe recipe, Class recipeclass, Category category) {
		String catString;
		if(category == Category.SHAPELESS) {
			catString = "after:minecraft:shapeless";
		} else if(category == Category.SHAPED) {
			catString = "after:minecraft:shaped";
		} else {
			throw new IllegalArgumentException("The Category called " + category.name() + " couldn't be found!");
		}
		GameRegistry.addRecipe(recipe);
		RecipeSorter.register(name, recipeclass, category, catString);
		//NEI and JEI IRecipe Registry [todo]
	}

	/**Helper method for registering an Entity
	 * @param c The class of the Entity
	 * @param name The name for the Entity*/
	public static void registerEntity(Class c, String name) {
		EntityRegistry.registerModEntity(new ResourceLocation(ModReforgedIntegration.ID, name), c, name, ++counterEntities, ModReforgedIntegration.instance, 120, 1, true);		
	}
	
}

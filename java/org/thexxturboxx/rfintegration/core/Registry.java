package org.thexxturboxx.rfintegration.core;

import java.util.ArrayList;
import java.util.List;

import org.silvercatcher.reforged.items.ItemExtension;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;

public class Registry {

	/**All the Dependencies for our mod*/
	public static final String Deps = "required-after:reforged;after:Baubles;after:Thaumcraft;after:ProjectE";
	
	/**All the Dependencies for the child mods*/
	public static final String ChildDeps = "required-after:Reforged|IntegrationCore";
	
	//Counters
	public static int counterEntities = 0;
	
	/**Every item on that list gets registered*/
	public static final List<Item> registrationList = new ArrayList<Item>();
	
	//Registry
	/**Add an item to the list*/
	public static void addItem(Item item) {
		registrationList.add(item);
	}
	
	/**Registers all items out of the registrationList*/
	public static void registerItems() {
		for(Item item : registrationList) {
			GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		}		
	}
	
	/**Registers all recipes of the registered items*/
	public static void registerRecipes() {
		for(Item item : registrationList) {
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
		RecipeSorter.INSTANCE.register(name, recipeclass, category, catString);
		//NEI and JEI IRecipe Registry [todo]
	}

	/**Helper method for registering an Entity
	 * @param c The class of the Entity
	 * @param name The name for the Entity*/
	public static void registerEntity(Class c, String name) {
		EntityRegistry.registerModEntity(c, name, ++counterEntities, ModReforgedIntegration.instance, 120, 1, true);		
	}

	/**Helper method for binding a renderclass to a entity
	 * @param entityclass The class of the Entity
	 * @param renderclass The class of the Renderer*/
	public static void registerEntityRenderer(Class entityclass, Render renderclass) {
		RenderingRegistry.registerEntityRenderingHandler(entityclass, renderclass);
	}
}
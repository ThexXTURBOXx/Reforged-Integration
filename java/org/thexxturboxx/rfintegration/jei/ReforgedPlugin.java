package org.thexxturboxx.rfintegration.jei;

import net.minecraftforge.fml.common.Loader;

@mezz.jei.api.JEIPlugin
public class ReforgedPlugin implements mezz.jei.api.IModPlugin {
	
	public static final String modId = "reforged";
	public static mezz.jei.api.IJeiHelpers helper = null;
	
	@Override
	public void onJeiHelpersAvailable(mezz.jei.api.IJeiHelpers jeiHelpers) {
		helper = jeiHelpers;
	}
	
	@Override
	public void onItemRegistryAvailable(mezz.jei.api.IItemRegistry itemRegistry) {
		
	}
	
	@Override
	public void register(mezz.jei.api.IModRegistry registry) {
		if(!Loader.isModLoaded(modId) || !Loader.isModLoaded("JEI") || helper == null) {
			return;
		}
		registry.addRecipeHandlers(new BoomerangRecipeHandler(), new NestOfBeesRecipeHandler());
	}
	
	@Override
	public void onRecipeRegistryAvailable(mezz.jei.api.IRecipeRegistry recipeRegistry) {
		
	}
	
}
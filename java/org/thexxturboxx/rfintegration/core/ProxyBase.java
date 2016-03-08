package org.thexxturboxx.rfintegration.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class ProxyBase {
	
	public ProxyBase(String modname) {
		setModName(modname);
	}
	
	/**Saves all the items of the Integration APIs*/
	public static List<Item> regListItems = new ArrayList<Item>();
	
	/**Saves the name of the mod, that needs to get integrated*/
	String modName;
	
	/**Registers all the Items of the Integration-modules*/
	public void registerItems() {
		if(!regListItems.isEmpty()) regListItems.clear();
	}
	
	/**Registers all the MaterialDefinitions of the Integration-modules*/
	public abstract void registerMatDefs();
	
	/**@return The name of the mod, which gets integrated*/
	public String getModName() {
		return modName;
	}
	
	/**@param name The Name of the mod*/
	public void setModName(String name) {
		modName = name;
	}
	
	public abstract void registerItemRenderers();
	
	/**Simple Registry for the Item*/
	protected void simpleReg(Item item) {
		regListItems.add(item.setCreativeTab(ModReforgedIntegration.tabReforgedIntegration));
	}
	
	public void preInit(FMLPreInitializationEvent e) {
		if(Loader.isModLoaded(getModName())) {
			registerMatDefs();
			registerItems();
		}
	}
	
	public void init(FMLInitializationEvent e) {
		if(Loader.isModLoaded(getModName())) {
			registerItemRenderers();
			Registry.registerRecipes(regListItems);
		}
	}
	
	public void postInit(FMLPostInitializationEvent e) {}
}

package org.thexxturboxx.rfintegration.core;

import java.util.ArrayList;
import java.util.List;

import org.silvercatcher.reforged.items.weapons.ItemBattleAxe;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.*;

public abstract class ProxyBase {
	
	public ProxyBase(String modname) {
		setModName(modname);
	}
	
	/**Saves all the items of the Integration APIs*/
	protected List<Item> regListItems = new ArrayList<Item>();
	
	/**Saves all possible items for the Creative Tab Icon*/
	public static List<ItemBattleAxe> battleaxeList = new ArrayList<ItemBattleAxe>();
	
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
	
	public void registerItemRenderers() { }
	
	/**Simple Registry for the Item*/
	protected void simpleReg(Item item) {
		regListItems.add(item.setCreativeTab(ModReforgedIntegration.tabReforgedIntegration));
		if(item instanceof ItemBattleAxe) battleaxeList.add((ItemBattleAxe) item);
	}
	
	public void preInit(FMLPreInitializationEvent e) {
		if(Loader.isModLoaded(getModName())/* && getModConfig(getModName())*/) {
			registerMatDefs();
			registerItems();
		}
	}
	
	public void init(FMLInitializationEvent e) {
		if(Loader.isModLoaded(getModName())/* && getModConfig(getModName())*/) {
			registerItemRenderers();
			if(!(getModName().equals("Thaumcraft"))) Registry.registerRecipes(regListItems);
		}
	}
	
	public void postInit(FMLPostInitializationEvent e) {}
	/*
	public static boolean getModConfig(String modname) {
		switch(modname) {
		case "ProjectE": return Global.PROJECTE;
		case "Thaumcraft": return Global.THAUMCRAFT;
		default: throw new IllegalArgumentException("How could this happen? The mod " + modname + " can't get integrated!");
		}
	}
	*/
}

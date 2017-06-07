package org.thexxturboxx.rfintegration.core;

import java.util.ArrayList;
import java.util.List;

import org.silvercatcher.reforged.items.weapons.ItemBattleAxe;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.*;

public abstract class ProxyBase {

	/** Saves all possible items for the Creative Tab Icon */
	public static List<ItemBattleAxe> battleaxeList = new ArrayList<ItemBattleAxe>();

	/** Saves all the items of the Integration APIs */
	protected List<Item> regListItems = new ArrayList<Item>();

	/** Saves the name of the mod, that needs to get integrated */
	protected String modName;

	public ProxyBase(String modName) {
		this.modName = modName;
	}

	public void init(FMLInitializationEvent e) {
		if (Loader.isModLoaded(modName) || Loader.isModLoaded(modName.toLowerCase())/* && getModConfig(getModName()) */) {
			registerItemRenderers();
			if (!(modName.equals("Thaumcraft")))
				Registry.registerRecipes(regListItems);
		}
	}

	public void postInit(FMLPostInitializationEvent e) {
	}
	/*
	 * public static boolean getModConfig(String modname) { switch(modname) { case
	 * "ProjectE": return Global.PROJECTE; case "Thaumcraft": return
	 * Global.THAUMCRAFT; default: throw new
	 * IllegalArgumentException("How could this happen? The mod " + modname +
	 * " can't get integrated!"); } }
	 */

	public void preInit(FMLPreInitializationEvent e) {
		if (Loader.isModLoaded(modName) || Loader.isModLoaded(modName.toLowerCase())/* && getModConfig(getModName()) */) {
			registerMatDefs();
			registerItems();
		}
	}

	public void registerItemRenderers() {
	}

	/** Registers all the Items of the Integration-modules */
	public void registerItems() {
		if (!regListItems.isEmpty())
			regListItems.clear();
	}

	/** Registers all the MaterialDefinitions of the Integration-modules */
	public abstract void registerMatDefs();

	/** Simple Registry for the Item */
	public void simpleReg(Item item) {
		regListItems.add(item.setCreativeTab(ModReforgedIntegration.tabReforgedIntegration));
		if (item instanceof ItemBattleAxe)
			battleaxeList.add((ItemBattleAxe) item);
	}
}

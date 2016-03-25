package org.thexxturboxx.rfintegration.core;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**All the Integration Items (ATTENTION: Could cause NullPointerExceptions
 * if the Item is not loaded (the Material's Mod)!!!*/
public class ReforgedIntegrationAdditions {
	//Items
	//Thaumcraft: Thaumium
	public static Item THAUMIUM_MUSKET;
	public static Item THAUMIUM_BATTLE_AXE;
	public static Item THAUMIUM_BOOMERANG;
	public static Item THAUMIUM_SABER;
	public static Item THAUMIUM_KATANA;
	public static Item THAUMIUM_KNIFE;
	
	//Thaumcraft: Void
	public static Item VOID_MUSKET;
	public static Item VOID_BATTLE_AXE;
	public static Item VOID_BOOMERANG;
	public static Item VOID_SABER;
	public static Item VOID_KATANA;
	public static Item VOID_KNIFE;
	
	//ProjectE: Dark Matter
	public static Item DM_MUSKET;
	public static Item DM_BATTLE_AXE;
	public static Item DM_BOOMERANG;
	public static Item DM_SABER;
	public static Item DM_KATANA;
	public static Item DM_KNIFE;

	//ProjectE: Red Matter
	public static Item RM_MUSKET;
	public static Item RM_BATTLE_AXE;
	public static Item RM_BOOMERANG;
	public static Item RM_SABER;
	public static Item RM_KATANA;
	public static Item RM_KNIFE;
	
	//ResourceLocations
	public static final ResourceLocation THAUMIUM_BOOMERANG_TEX = new ResourceLocation("reforgedintegrationcore:textures/entity/thaumium_boomerang.png");
	public static final ResourceLocation VOID_BOOMERANG_TEX = new ResourceLocation("reforgedintegrationcore:textures/entity/void_boomerang.png");
	public static final ResourceLocation DM_BOOMERANG_TEX = new ResourceLocation("reforgedintegrationcore:textures/entity/dark_matter_boomerang.png");
	public static final ResourceLocation RM_BOOMERANG_TEX = new ResourceLocation("reforgedintegrationcore:textures/entity/red_matter_boomerang.png");
	public static final ResourceLocation FORGING_ICON = new ResourceLocation("reforgedthaumcraft:textures/research/forging_aspect.png");
}

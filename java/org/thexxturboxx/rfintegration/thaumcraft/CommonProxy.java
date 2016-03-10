package org.thexxturboxx.rfintegration.thaumcraft;

import org.silvercatcher.reforged.ReforgedRegistry;
import org.silvercatcher.reforged.items.recipes.BoomerangEnchRecipe;
import org.silvercatcher.reforged.items.weapons.ItemBattleAxe;
import org.silvercatcher.reforged.items.weapons.ItemBoomerang;
import org.silvercatcher.reforged.items.weapons.ItemKatana;
import org.silvercatcher.reforged.items.weapons.ItemKnife;
import org.silvercatcher.reforged.items.weapons.ItemMusketWithBayonet;
import org.silvercatcher.reforged.items.weapons.ItemSaber;
import org.silvercatcher.reforged.material.MaterialDefinition;
import org.silvercatcher.reforged.material.MaterialManager;
import org.thexxturboxx.rfintegration.core.ProxyBase;
import org.thexxturboxx.rfintegration.core.ReforgedIntegrationAdditions;
import org.thexxturboxx.rfintegration.core.Registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.RecipeSorter.Category;
import thaumcraft.api.ThaumcraftMaterials;
import thaumcraft.api.items.ItemsTC;

public class CommonProxy extends ProxyBase {
	
	public CommonProxy() {
		super("Thaumcraft");
	}
	
	@Override
	public void registerMatDefs() {
		MaterialManager.addMaterialDefinition(ThaumcraftMaterials.TOOLMAT_THAUMIUM,
				new MaterialDefinition("thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, new ItemStack(ItemsTC.ingots, 1, 0)));
		MaterialManager.addMaterialDefinition(ThaumcraftMaterials.TOOLMAT_VOID,
				new MaterialDefinition("void", ThaumcraftMaterials.TOOLMAT_VOID, new ItemStack(ItemsTC.ingots, 1, 1)));
	}
	
	@Override
	public void registerItems() {
		super.registerItems();
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_KNIFE = new ItemKnife(ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		ResourceLocation[] rs_thaumium = new ResourceLocation[]{ReforgedIntegrationAdditions.THAUMIUM_BOOMERANG_TEX};
		Item[] i_thaumium = new Item[]{ReforgedIntegrationAdditions.THAUMIUM_KNIFE};
		MaterialManager.addOthers(ThaumcraftMaterials.TOOLMAT_THAUMIUM, rs_thaumium, i_thaumium);
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_MUSKET = new ItemMusketWithBayonet(ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_BATTLE_AXE = new ItemBattleAxe(ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_BOOMERANG = new ItemBoomerang(ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_SABER = new ItemSaber(ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_KATANA = new ItemKatana(ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.VOID_KNIFE = new ItemKnife(ThaumcraftMaterials.TOOLMAT_VOID));
		ResourceLocation[] rs_void = new ResourceLocation[]{ReforgedIntegrationAdditions.VOID_BOOMERANG_TEX};
		Item[] i_void = new Item[]{ReforgedIntegrationAdditions.VOID_KNIFE};
		MaterialManager.addOthers(ThaumcraftMaterials.TOOLMAT_VOID, rs_void, i_void);
		simpleReg(ReforgedIntegrationAdditions.VOID_MUSKET = new ItemMusketWithBayonet(ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_BATTLE_AXE = new ItemBattleAxe(ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_BOOMERANG = new ItemBoomerang(ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_SABER = new ItemSaber(ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_KATANA = new ItemKatana(ThaumcraftMaterials.TOOLMAT_VOID));
	}
	
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		Registry.registerItems(regListItems);		
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		ThaumcraftResearch.init();
	}
}

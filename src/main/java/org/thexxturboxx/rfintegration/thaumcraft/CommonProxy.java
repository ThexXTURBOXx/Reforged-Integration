package org.thexxturboxx.rfintegration.thaumcraft;

import org.silvercatcher.reforged.ReforgedReferences.GlobalValues;
import org.silvercatcher.reforged.api.ReforgedAdditions;
import org.silvercatcher.reforged.items.weapons.*;
import org.silvercatcher.reforged.material.MaterialDefinition;
import org.silvercatcher.reforged.material.MaterialManager;
import org.thexxturboxx.rfintegration.core.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.*;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;

public class CommonProxy extends ProxyBase {

	public CommonProxy() {
		super("Thaumcraft");
	}

	private thaumcraft.api.aspects.AspectList getList(ItemStack is) {
		return thaumcraft.api.aspects.AspectHelper.getObjectAspects(is);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		if (Loader.isModLoaded(modName) || Loader.isModLoaded(modName.toLowerCase())) {
			ThaumcraftResearch.init();
			ThaumcraftApi.registerObjectTag(new ItemStack(ReforgedAdditions.WOODEN_BATTLE_AXE),
					new AspectList().add(getList(new ItemStack(ReforgedAdditions.WOODEN_BATTLE_AXE)))
							.add(ThaumcraftResearch.FORGING, 1));
			ThaumcraftApi.registerObjectTag(new ItemStack(ReforgedAdditions.STONE_BATTLE_AXE),
					new AspectList().add(getList(new ItemStack(ReforgedAdditions.STONE_BATTLE_AXE)))
							.add(ThaumcraftResearch.FORGING, 2));
			ThaumcraftApi.registerObjectTag(new ItemStack(ReforgedAdditions.IRON_BATTLE_AXE), new AspectList()
					.add(getList(new ItemStack(ReforgedAdditions.IRON_BATTLE_AXE))).add(ThaumcraftResearch.FORGING, 4));
			ThaumcraftApi.registerObjectTag(new ItemStack(ReforgedAdditions.GOLDEN_BATTLE_AXE),
					new AspectList().add(getList(new ItemStack(ReforgedAdditions.GOLDEN_BATTLE_AXE)))
							.add(ThaumcraftResearch.FORGING, 6));
			ThaumcraftApi.registerObjectTag(new ItemStack(ReforgedAdditions.DIAMOND_BATTLE_AXE),
					new AspectList().add(getList(new ItemStack(ReforgedAdditions.DIAMOND_BATTLE_AXE)))
							.add(ThaumcraftResearch.FORGING, 8));
			for (ItemBattleAxe ba : battleaxeList) {
				ThaumcraftApi.registerObjectTag(new ItemStack(ba),
						new AspectList().add(getList(new ItemStack(ba))).add(ThaumcraftResearch.FORGING, 8));
			}
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		Registry.registerItems(ModThaumcraft.ID, regListItems);
	}

	@Override
	public void registerItems() {
		super.registerItems();
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_KNIFE = new ItemKnife(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		ResourceLocation[] rs_thaumium = new ResourceLocation[] { ReforgedIntegrationAdditions.THAUMIUM_BOOMERANG_TEX };
		Item[] i_thaumium = new Item[] { ReforgedIntegrationAdditions.THAUMIUM_KNIFE };
		MaterialManager.addOthers(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM, rs_thaumium, i_thaumium);
		if (GlobalValues.MUSKET)
			simpleReg(ReforgedIntegrationAdditions.THAUMIUM_MUSKET = new ItemMusketWithBayonet(
					thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_BATTLE_AXE = new ItemBattleAxe(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_BOOMERANG = new ItemBoomerang(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_SABER = new ItemSaber(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_KATANA = new ItemKatana(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_PIKE = new ItemPike(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_MACE = new ItemMace(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));
		simpleReg(ReforgedIntegrationAdditions.THAUMIUM_DIRK = new ItemDirk(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM));

		simpleReg(ReforgedIntegrationAdditions.VOID_KNIFE = new ItemKnife(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		ResourceLocation[] rs_void = new ResourceLocation[] { ReforgedIntegrationAdditions.VOID_BOOMERANG_TEX };
		Item[] i_void = new Item[] { ReforgedIntegrationAdditions.VOID_KNIFE };
		MaterialManager.addOthers(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID, rs_void, i_void);
		if (GlobalValues.MUSKET)
			simpleReg(ReforgedIntegrationAdditions.VOID_MUSKET = new ItemMusketWithBayonet(
					thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_BATTLE_AXE = new ItemBattleAxe(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_BOOMERANG = new ItemBoomerang(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_SABER = new ItemSaber(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(ReforgedIntegrationAdditions.VOID_KATANA = new ItemKatana(
				thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(
				ReforgedIntegrationAdditions.VOID_PIKE = new ItemPike(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(
				ReforgedIntegrationAdditions.VOID_MACE = new ItemMace(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
		simpleReg(
				ReforgedIntegrationAdditions.VOID_DIRK = new ItemDirk(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID));
	}

	@Override
	public void registerMatDefs() {
		MaterialManager.addMaterialDefinition(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM,
				new MaterialDefinition("thaumium", thaumcraft.api.ThaumcraftMaterials.TOOLMAT_THAUMIUM,
						new ItemStack(thaumcraft.api.items.ItemsTC.ingots, 1, 0)));
		MaterialManager.addMaterialDefinition(thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID,
				new MaterialDefinition("void", thaumcraft.api.ThaumcraftMaterials.TOOLMAT_VOID,
						new ItemStack(thaumcraft.api.items.ItemsTC.ingots, 1, 1)));
	}
}

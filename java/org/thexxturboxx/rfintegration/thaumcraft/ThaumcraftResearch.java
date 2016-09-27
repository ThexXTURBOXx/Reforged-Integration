package org.thexxturboxx.rfintegration.thaumcraft;

import org.silvercatcher.reforged.ReforgedMod;
import org.silvercatcher.reforged.ReforgedReferences.GlobalValues;
import org.silvercatcher.reforged.api.ReforgedAdditions;
import org.thexxturboxx.rfintegration.core.ReforgedIntegrationAdditions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.api.research.*;

public class ThaumcraftResearch {
	
	//Thaumcraft Aspects
	public static Aspect FORGING;
	
	public static void init() {
		FORGING  = new Aspect("forging", 0x003366, new Aspect[] {Aspect.DARKNESS, Aspect.AVERSION}, ReforgedIntegrationAdditions.FORGING_ICON, 1);
		ResearchCategories.registerCategory(ReforgedMod.ID.toUpperCase(), null, 
			new ResourceLocation(ModThaumcraft.ID, "textures/research/icon.png"), 
			new ResourceLocation(ModThaumcraft.ID, "textures/research/background.png"));
		new ResearchItem("REFORGEDGENERAL", ReforgedMod.ID.toUpperCase(), new AspectList(), 0, 0, 2,
			new ItemStack(ReforgedAdditions.DIAMOND_BATTLE_AXE)).setPages(new ResearchPage("tc.general"))
			.setAutoUnlock().registerResearchItem();
		ShapedArcaneRecipe voidboomerangrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDBOOMERANG", new ItemStack(ReforgedIntegrationAdditions.VOID_BOOMERANG), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.AIR, 100), "tss", "  s", "  t", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		new ResearchItem("VOIDBOOMERANG", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.AIR, 2).add(Aspect.FLUX, 2), 2, 2, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_BOOMERANG)).setPages(new ResearchPage("tc.boomerang"), new ResearchPage(
			voidboomerangrecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe thaumiumboomerangrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMBOOMERANG", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_BOOMERANG), 
			new AspectList().add(Aspect.ORDER, 75).add(Aspect.ENTROPY, 75).add(Aspect.AIR, 75), "tss", "  s", "  t", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		new ResearchItem("THAUMIUMBOOMERANG", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.AIR, 2), -2, 2, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_BOOMERANG)).setPages(new ResearchPage("tc.boomerang"), new ResearchPage(
			thaumiumboomerangrecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe voidbattleaxerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDBATTLEAXE", new ItemStack(ReforgedIntegrationAdditions.VOID_BATTLE_AXE), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.FIRE, 100), "ttt", "tst", " s ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		ShapedArcaneRecipe voidmacerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDMACE", new ItemStack(ReforgedIntegrationAdditions.VOID_MACE), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.FIRE, 100), " mm", " sm", " s ", 'm', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		new ResearchItem("VOIDBATTLEAXE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.FIRE, 2).add(Aspect.FLUX, 2), 1, 3, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_BATTLE_AXE)).setPages(new ResearchPage("tc.battleaxe"), new ResearchPage(
			voidbattleaxerecipe), new ResearchPage(voidmacerecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe thaumiumbattleaxerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMBATTLEAXE", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_BATTLE_AXE), 
			new AspectList().add(Aspect.ORDER, 75).add(Aspect.ENTROPY, 75).add(Aspect.FIRE, 75), "ttt", "tst", " s ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		ShapedArcaneRecipe thaumiummacerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMMACE", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_MACE), 
			new AspectList().add(Aspect.ORDER, 75).add(Aspect.ENTROPY, 75).add(Aspect.FIRE, 75), " mm", " sm", " s ", 'm', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		new ResearchItem("THAUMIUMBATTLEAXE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.FIRE, 2), -1, 3, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_BATTLE_AXE)).setPages(new ResearchPage("tc.battleaxe"), new ResearchPage(
			thaumiumbattleaxerecipe), new ResearchPage(thaumiummacerecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe voidkatanarecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDKATANA", new ItemStack(ReforgedIntegrationAdditions.VOID_KATANA), 
			new AspectList().add(Aspect.ORDER, 200).add(Aspect.ENTROPY, 100), "  t", " t ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		new ResearchItem("VOIDKATANA", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 4).add(Aspect.FLUX, 2), 3, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_KATANA)).setPages(new ResearchPage("tc.katana"), new ResearchPage(
			voidkatanarecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe thaumiumkatanarecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMKATANA", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_KATANA), 
			new AspectList().add(Aspect.ORDER, 150).add(Aspect.ENTROPY, 75), "  t", " t ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		new ResearchItem("THAUMIUMKATANA", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 4), -3, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_KATANA)).setPages(new ResearchPage("tc.katana"), new ResearchPage(
			thaumiumkatanarecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe voidkniferecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDKNIFE", new ItemStack(ReforgedIntegrationAdditions.VOID_KNIFE), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 200), "st ", "   ", "   ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		ShapedArcaneRecipe voiddirkrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDDIRK", new ItemStack(ReforgedIntegrationAdditions.VOID_DIRK), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 200), "t  ", "s  ", "   ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		new ResearchItem("VOIDKNIFE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2).add(Aspect.FLUX, 2), 3, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_KNIFE)).setPages(new ResearchPage("tc.knife"), new ResearchPage(
			voidkniferecipe), new ResearchPage(voiddirkrecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe thaumiumkniferecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMKNIFE", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_KNIFE), 
			new AspectList().add(Aspect.ORDER, 75).add(Aspect.ENTROPY, 150), "st ", "   ", "   ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		ShapedArcaneRecipe thaumiumdirkrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDDIRK", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_DIRK), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 200), "t  ", "s  ", "   ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		new ResearchItem("THAUMIUMKNIFE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2), -3, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_KNIFE)).setPages(new ResearchPage("tc.knife"), new ResearchPage(
			thaumiumkniferecipe), new ResearchPage(thaumiumdirkrecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		if(GlobalValues.MUSKET) {
			ShapedArcaneRecipe voidmusketrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
				"VOIDMUSKET", new ItemStack(ReforgedIntegrationAdditions.VOID_MUSKET), 
				new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.EARTH, 100), "mk ", "   ", "   ", 'm',
				ReforgedAdditions.MUSKET, 'k', ReforgedIntegrationAdditions.VOID_KNIFE);
			new ResearchItem("VOIDMUSKET", ReforgedMod.ID.toUpperCase(), new AspectList().add(
				FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.EARTH, 2).add(Aspect.FLUX, 2), 2, -2, 2, new ItemStack(ReforgedIntegrationAdditions.
				VOID_MUSKET)).setPages(new ResearchPage("tc.musket"), new ResearchPage(
				voidmusketrecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
			ShapedArcaneRecipe thaumiummusketrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
				"THAUMIUMMUSKET", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_MUSKET), 
				new AspectList().add(Aspect.ORDER, 75).add(Aspect.ENTROPY, 75).add(Aspect.EARTH, 75), "mk ", "   ", "   ", 'm',
				ReforgedAdditions.MUSKET, 'k', ReforgedIntegrationAdditions.THAUMIUM_KNIFE);
			new ResearchItem("THAUMIUMMUSKET", ReforgedMod.ID.toUpperCase(), new AspectList().add(
				FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.EARTH, 2), -2, -2, 2, new ItemStack(ReforgedIntegrationAdditions.
				THAUMIUM_MUSKET)).setPages(new ResearchPage("tc.musket"), new ResearchPage(
				thaumiummusketrecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		}
		ShapedArcaneRecipe voidsaberrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDSABER", new ItemStack(ReforgedIntegrationAdditions.VOID_SABER), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.WATER, 100), " t ", "t  ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		ShapedArcaneRecipe voidpikerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDPIKE", new ItemStack(ReforgedIntegrationAdditions.VOID_PIKE), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.WATER, 100), "s  ", " s ", "  m", 'm', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		new ResearchItem("VOIDSABER", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.WATER, 2).add(Aspect.FLUX, 2), 1, -3, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_SABER)).setPages(new ResearchPage("tc.saber"), new ResearchPage(
			voidsaberrecipe), new ResearchPage(voidpikerecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
		ShapedArcaneRecipe thaumiumsaberrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMSABER", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_SABER), 
			new AspectList().add(Aspect.ORDER, 75).add(Aspect.ENTROPY, 75).add(Aspect.WATER, 75), " t ", "t  ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		ShapedArcaneRecipe thaumiumpikerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMPIKE", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_PIKE), 
			new AspectList().add(Aspect.ORDER, 100).add(Aspect.ENTROPY, 100).add(Aspect.WATER, 100), "s  ", " s ", "  m", 'm', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		new ResearchItem("THAUMIUMSABER", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2).add(Aspect.WATER, 2), -1, -3, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_SABER)).setPages(new ResearchPage("tc.saber"), new ResearchPage(
			thaumiumsaberrecipe), new ResearchPage(thaumiumpikerecipe)).setParents("REFORGEDGENERAL").registerResearchItem();
	}
}

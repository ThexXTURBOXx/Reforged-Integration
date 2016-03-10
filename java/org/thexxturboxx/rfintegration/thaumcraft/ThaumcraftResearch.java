package org.thexxturboxx.rfintegration.thaumcraft;

import org.silvercatcher.reforged.ReforgedMod;
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
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class ThaumcraftResearch {
	
	public static void init() {
		 ResearchCategories.registerCategory(ReforgedMod.ID.toUpperCase(), null, 
				new ResourceLocation(ModThaumcraft.ID, "textures/research/icon.png"), 
				new ResourceLocation(ModThaumcraft.ID, "textures/research/background.png"));
		 ShapedArcaneRecipe voidboomerangrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDBOOMERANG", new ItemStack(ReforgedIntegrationAdditions.VOID_BOOMERANG), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "tss", "  s", "  t", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		 new ResearchItem("VOIDBOOMERANG", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), -3, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_BOOMERANG)).setPages(new ResearchPage("tc.boomerang"), new ResearchPage(
			voidboomerangrecipe)).registerResearchItem();
		 ShapedArcaneRecipe thaumiumboomerangrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMBOOMERANG", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_BOOMERANG), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "tss", "  s", "  t", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		 new ResearchItem("THAUMIUMBOOMERANG", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), -3, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_BOOMERANG)).setPages(new ResearchPage("tc.boomerang"), new ResearchPage(
			thaumiumboomerangrecipe)).registerResearchItem();
		 ShapedArcaneRecipe voidbattleaxerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDBATTLEAXE", new ItemStack(ReforgedIntegrationAdditions.VOID_BATTLE_AXE), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "ttt", "tst", " s ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		 new ResearchItem("VOIDBATTLEAXE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), -5, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_BATTLE_AXE)).setPages(new ResearchPage("tc.battleaxe"), new ResearchPage(
			voidbattleaxerecipe)).registerResearchItem();
		 ShapedArcaneRecipe thaumiumbattleaxerecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMBATTLEAXE", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_BATTLE_AXE), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "ttt", "tst", " s ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		 new ResearchItem("THAUMIUMBATTLEAXE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), -5, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_BATTLE_AXE)).setPages(new ResearchPage("tc.battleaxe"), new ResearchPage(
			thaumiumbattleaxerecipe)).registerResearchItem();
		 ShapedArcaneRecipe voidkatanarecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDKATANA", new ItemStack(ReforgedIntegrationAdditions.VOID_KATANA), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "  t", " t ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		 new ResearchItem("VOIDKATANA", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), -1, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_KATANA)).setPages(new ResearchPage("tc.katana"), new ResearchPage(
			voidkatanarecipe)).registerResearchItem();
		 ShapedArcaneRecipe thaumiumkatanarecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMKATANA", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_KATANA), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "  t", " t ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		 new ResearchItem("THAUMIUMKATANA", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), -1, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_KATANA)).setPages(new ResearchPage("tc.katana"), new ResearchPage(
			thaumiumkatanarecipe)).registerResearchItem();
		 ShapedArcaneRecipe voidkniferecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDKNIFE", new ItemStack(ReforgedIntegrationAdditions.VOID_KNIFE), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "st ", "   ", "   ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		 new ResearchItem("VOIDKNIFE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), 1, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_KNIFE)).setPages(new ResearchPage("tc.knife"), new ResearchPage(
			voidkniferecipe)).registerResearchItem();
		 ShapedArcaneRecipe thaumiumkniferecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMKNIFE", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_KNIFE), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "st ", "   ", "   ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		 new ResearchItem("THAUMIUMKNIFE", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), 1, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_KNIFE)).setPages(new ResearchPage("tc.knife"), new ResearchPage(
			thaumiumkniferecipe)).registerResearchItem();
		 ShapedArcaneRecipe voidmusketrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDMUSKET", new ItemStack(ReforgedIntegrationAdditions.VOID_MUSKET), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "mk ", "   ", "   ", 'm',
			ReforgedAdditions.MUSKET, 'k', ReforgedIntegrationAdditions.VOID_KNIFE);
		 new ResearchItem("VOIDMUSKET", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), 3, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_MUSKET)).setPages(new ResearchPage("tc.musket"), new ResearchPage(
			voidmusketrecipe)).registerResearchItem();
		 ShapedArcaneRecipe thaumiummusketrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMMUSKET", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_MUSKET), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), "mk ", "   ", "   ", 'm',
			ReforgedAdditions.MUSKET, 'k', ReforgedIntegrationAdditions.THAUMIUM_KNIFE);
		 new ResearchItem("THAUMIUMMUSKET", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), 3, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_MUSKET)).setPages(new ResearchPage("tc.musket"), new ResearchPage(
			thaumiummusketrecipe)).registerResearchItem();
		 ShapedArcaneRecipe voidsaberrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"VOIDSABER", new ItemStack(ReforgedIntegrationAdditions.VOID_SABER), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), " t ", "t  ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 1), 's', Items.stick);
		 new ResearchItem("VOIDSABER", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), 5, -1, 2, new ItemStack(ReforgedIntegrationAdditions.
			VOID_SABER)).setPages(new ResearchPage("tc.saber"), new ResearchPage(
			voidsaberrecipe)).registerResearchItem();
		 ShapedArcaneRecipe thaumiumsaberrecipe = ThaumcraftApi.addArcaneCraftingRecipe(
			"THAUMIUMSABER", new ItemStack(ReforgedIntegrationAdditions.THAUMIUM_SABER), 
			new AspectList().add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(ReforgedIntegrationAdditions.FORGING, 5), " t ", "t  ", "s  ", 't', new ItemStack(
			ItemsTC.ingots, 1, 0), 's', Items.stick);
		 new ResearchItem("THAUMIUMSABER", ReforgedMod.ID.toUpperCase(), new AspectList().add(
			ReforgedIntegrationAdditions.FORGING, 2).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2), 5, 1, 2, new ItemStack(ReforgedIntegrationAdditions.
			THAUMIUM_SABER)).setPages(new ResearchPage("tc.saber"), new ResearchPage(
			thaumiumsaberrecipe)).registerResearchItem();
	}
}

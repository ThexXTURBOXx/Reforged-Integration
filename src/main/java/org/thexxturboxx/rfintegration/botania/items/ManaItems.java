package org.thexxturboxx.rfintegration.botania.items;

import org.silvercatcher.reforged.material.MaterialManager;
import org.thexxturboxx.rfintegration.botania.CommonProxy;
import org.thexxturboxx.rfintegration.core.ReforgedIntegrationAdditions;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ManaItems {

	public static void init(CommonProxy p) {
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_KNIFE = new org.thexxturboxx.rfintegration.botania.items.ManaKnife(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		ResourceLocation[] rs_ms = new ResourceLocation[] { ReforgedIntegrationAdditions.MANASTEEL_BOOMERANG_TEX };
		Item[] i_ms = new Item[] { ReforgedIntegrationAdditions.MANASTEEL_KNIFE };
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, rs_ms, i_ms);
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_MUSKET = new org.thexxturboxx.rfintegration.botania.items.ManaMusket(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_BATTLE_AXE = new org.thexxturboxx.rfintegration.botania.items.ManaBattleAxe(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_BOOMERANG = new org.thexxturboxx.rfintegration.botania.items.ManaBoomerang(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_SABER = new org.thexxturboxx.rfintegration.botania.items.ManaSaber(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_KATANA = new org.thexxturboxx.rfintegration.botania.items.ManaKatana(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_PIKE = new org.thexxturboxx.rfintegration.botania.items.ManaPike(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_MACE = new org.thexxturboxx.rfintegration.botania.items.ManaMace(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.MANASTEEL_DIRK = new org.thexxturboxx.rfintegration.botania.items.ManaDirk(
						vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));

		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_KNIFE = new org.thexxturboxx.rfintegration.botania.items.ManaKnife(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		ResourceLocation[] rs_el = new ResourceLocation[] { ReforgedIntegrationAdditions.ELEMENTIUM_BOOMERANG_TEX };
		Item[] i_el = new Item[] { ReforgedIntegrationAdditions.ELEMENTIUM_KNIFE };
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, rs_el, i_el);
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_MUSKET = new org.thexxturboxx.rfintegration.botania.items.ManaMusket(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_BATTLE_AXE = new org.thexxturboxx.rfintegration.botania.items.ManaBattleAxe(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_BOOMERANG = new org.thexxturboxx.rfintegration.botania.items.ManaBoomerang(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_SABER = new org.thexxturboxx.rfintegration.botania.items.ManaSaber(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_KATANA = new org.thexxturboxx.rfintegration.botania.items.ManaKatana(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_PIKE = new org.thexxturboxx.rfintegration.botania.items.ManaPike(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_MACE = new org.thexxturboxx.rfintegration.botania.items.ManaMace(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.ELEMENTIUM_DIRK = new org.thexxturboxx.rfintegration.botania.items.ManaDirk(
						vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));

		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_KNIFE = new org.thexxturboxx.rfintegration.botania.items.ManaKnife(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		ResourceLocation[] rs_ts = new ResourceLocation[] { ReforgedIntegrationAdditions.TERRASTEEL_BOOMERANG_TEX };
		Item[] i_ts = new Item[] { ReforgedIntegrationAdditions.TERRASTEEL_KNIFE };
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, rs_ts, i_ts);
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_MUSKET = new org.thexxturboxx.rfintegration.botania.items.ManaMusket(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_BATTLE_AXE = new org.thexxturboxx.rfintegration.botania.items.ManaBattleAxe(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_BOOMERANG = new org.thexxturboxx.rfintegration.botania.items.ManaBoomerang(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_SABER = new org.thexxturboxx.rfintegration.botania.items.ManaSaber(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_KATANA = new org.thexxturboxx.rfintegration.botania.items.ManaKatana(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_PIKE = new org.thexxturboxx.rfintegration.botania.items.ManaPike(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_MACE = new org.thexxturboxx.rfintegration.botania.items.ManaMace(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		p.simpleReg(
				ReforgedIntegrationAdditions.TERRASTEEL_DIRK = new org.thexxturboxx.rfintegration.botania.items.ManaDirk(
						vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
	}

}
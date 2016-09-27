package org.thexxturboxx.rfintegration.botania;

import org.silvercatcher.reforged.items.weapons.*;
import org.silvercatcher.reforged.material.MaterialDefinition;
import org.silvercatcher.reforged.material.MaterialManager;
import org.thexxturboxx.rfintegration.core.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy extends ProxyBase {
	
	public CommonProxy() {
		super("Botania");
	}
	
	@Override
	public void registerMatDefs() {
		MaterialManager.addMaterialDefinition(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial,
				new MaterialDefinition("manasteel", vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 0)));
		MaterialManager.addMaterialDefinition(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial,
				new MaterialDefinition("elementium", vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 7)));
		MaterialManager.addMaterialDefinition(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial,
				new MaterialDefinition("terrasteel", vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 4)));
	}
	
	@Override
	public void registerItems() {
		super.registerItems();
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_KNIFE = new ItemKnife(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		ResourceLocation[] rs_ms = new ResourceLocation[]{ReforgedIntegrationAdditions.MANASTEEL_BOOMERANG_TEX};
		Item[] i_ms = new Item[]{ReforgedIntegrationAdditions.MANASTEEL_KNIFE};
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, rs_ms, i_ms);
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_MUSKET = new ItemMusketWithBayonet(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_BATTLE_AXE = new ItemBattleAxe(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_BOOMERANG = new ItemBoomerang(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_SABER = new ItemSaber(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_KATANA = new ItemKatana(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_PIKE = new ItemPike(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_MACE = new ItemMace(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_DIRK = new ItemDirk(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, false));
		
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_KNIFE = new ItemKnife(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		ResourceLocation[] rs_el = new ResourceLocation[]{ReforgedIntegrationAdditions.ELEMENTIUM_BOOMERANG_TEX};
		Item[] i_el = new Item[]{ReforgedIntegrationAdditions.ELEMENTIUM_KNIFE};
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, rs_el, i_el);
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_MUSKET = new ItemMusketWithBayonet(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_BATTLE_AXE = new ItemBattleAxe(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_BOOMERANG = new ItemBoomerang(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_SABER = new ItemSaber(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_KATANA = new ItemKatana(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_PIKE = new ItemPike(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_MACE = new ItemMace(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_DIRK = new ItemDirk(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, false));
		
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_KNIFE = new ItemKnife(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		ResourceLocation[] rs_ts = new ResourceLocation[]{ReforgedIntegrationAdditions.TERRASTEEL_BOOMERANG_TEX};
		Item[] i_ts = new Item[]{ReforgedIntegrationAdditions.TERRASTEEL_KNIFE};
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, rs_ts, i_ts);
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_MUSKET = new ItemMusketWithBayonet(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_BATTLE_AXE = new ItemBattleAxe(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_BOOMERANG = new ItemBoomerang(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_SABER = new ItemSaber(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_KATANA = new ItemKatana(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_PIKE = new ItemPike(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_MACE = new ItemMace(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_DIRK = new ItemDirk(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, false));
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		Registry.registerItems(regListItems);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
}

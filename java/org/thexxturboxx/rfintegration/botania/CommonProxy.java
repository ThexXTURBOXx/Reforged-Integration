package org.thexxturboxx.rfintegration.botania;

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
		ManaItems mi = new ManaItems() {};
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_KNIFE = mi.new ManaKnife(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		ResourceLocation[] rs_ms = new ResourceLocation[]{ReforgedIntegrationAdditions.MANASTEEL_BOOMERANG_TEX};
		Item[] i_ms = new Item[]{ReforgedIntegrationAdditions.MANASTEEL_KNIFE};
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial, rs_ms, i_ms);
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_MUSKET = mi.new ManaMusket(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_BATTLE_AXE = mi.new ManaBattleAxe(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_BOOMERANG = mi.new ManaBoomerang(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_SABER = mi.new ManaSaber(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_KATANA = mi.new ManaKatana(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_PIKE = mi.new ManaPike(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_MACE = mi.new ManaMace(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.MANASTEEL_DIRK = mi.new ManaDirk(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial));
		
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_KNIFE = mi.new ManaKnife(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		ResourceLocation[] rs_el = new ResourceLocation[]{ReforgedIntegrationAdditions.ELEMENTIUM_BOOMERANG_TEX};
		Item[] i_el = new Item[]{ReforgedIntegrationAdditions.ELEMENTIUM_KNIFE};
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial, rs_el, i_el);
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_MUSKET = mi.new ManaMusket(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_BATTLE_AXE = mi.new ManaBattleAxe(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_BOOMERANG = mi.new ManaBoomerang(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_SABER = mi.new ManaSaber(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_KATANA = mi.new ManaKatana(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_PIKE = mi.new ManaPike(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_MACE = mi.new ManaMace(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.ELEMENTIUM_DIRK = mi.new ManaDirk(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial));
		
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_KNIFE = mi.new ManaKnife(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		ResourceLocation[] rs_ts = new ResourceLocation[]{ReforgedIntegrationAdditions.TERRASTEEL_BOOMERANG_TEX};
		Item[] i_ts = new Item[]{ReforgedIntegrationAdditions.TERRASTEEL_KNIFE};
		MaterialManager.addOthers(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial, rs_ts, i_ts);
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_MUSKET = mi.new ManaMusket(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_BATTLE_AXE = mi.new ManaBattleAxe(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_BOOMERANG = mi.new ManaBoomerang(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_SABER = mi.new ManaSaber(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_KATANA = mi.new ManaKatana(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_PIKE = mi.new ManaPike(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_MACE = mi.new ManaMace(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
		simpleReg(ReforgedIntegrationAdditions.TERRASTEEL_DIRK = mi.new ManaDirk(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial));
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

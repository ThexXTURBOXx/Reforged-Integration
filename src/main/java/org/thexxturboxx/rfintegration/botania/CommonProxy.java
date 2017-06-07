package org.thexxturboxx.rfintegration.botania;

import org.silvercatcher.reforged.material.MaterialDefinition;
import org.silvercatcher.reforged.material.MaterialManager;
import org.thexxturboxx.rfintegration.botania.items.ManaItems;
import org.thexxturboxx.rfintegration.core.ProxyBase;
import org.thexxturboxx.rfintegration.core.Registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy extends ProxyBase {

	public CommonProxy() {
		super("Botania");
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		Registry.registerItems(ModBotania.ID, regListItems);
	}

	@Override
	public void registerItems() {
		super.registerItems();
		ManaItems.init(this);
	}

	@Override
	public void registerMatDefs() {
		MaterialManager.addMaterialDefinition(vazkii.botania.api.BotaniaAPI.manasteelToolMaterial,
				new MaterialDefinition("manasteel", vazkii.botania.api.BotaniaAPI.manasteelToolMaterial,
						new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 0)));
		MaterialManager.addMaterialDefinition(vazkii.botania.api.BotaniaAPI.elementiumToolMaterial,
				new MaterialDefinition("elementium", vazkii.botania.api.BotaniaAPI.elementiumToolMaterial,
						new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 7)));
		MaterialManager.addMaterialDefinition(vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial,
				new MaterialDefinition("terrasteel", vazkii.botania.api.BotaniaAPI.terrasteelToolMaterial,
						new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 4)));
	}
}

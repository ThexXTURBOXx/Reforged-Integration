package org.thexxturboxx.rfintegration.bop;

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
		super("BiomesOPlenty");
	}
	
	@Override
	public void registerMatDefs() {
		MaterialManager.addMaterialDefinition(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material,
				new MaterialDefinition("amethyst", biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, new ItemStack(biomesoplenty.api.item.BOPItems.gem, 1, 0)));
	}
	
	@Override
	public void registerItems() {
		super.registerItems();
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_KNIFE = new ItemKnife(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		ResourceLocation[] rs_am = new ResourceLocation[]{ReforgedIntegrationAdditions.AMETHYST_BOOMERANG_TEX};
		Item[] i_am = new Item[]{ReforgedIntegrationAdditions.AMETHYST_KNIFE};
		MaterialManager.addOthers(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, rs_am, i_am);
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_MUSKET = new ItemMusketWithBayonet(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_BATTLE_AXE = new ItemBattleAxe(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_BOOMERANG = new ItemBoomerang(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_SABER = new ItemSaber(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_KATANA = new ItemKatana(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_PIKE = new ItemPike(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_MACE = new ItemMace(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
		simpleReg(ReforgedIntegrationAdditions.AMETHYST_DIRK = new ItemDirk(biomesoplenty.api.item.BOPItemHelper.amethyst_tool_material, false));
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
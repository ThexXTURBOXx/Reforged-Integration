package org.thexxturboxx.rfintegration.projecte;

import org.silvercatcher.reforged.items.weapons.*;
import org.silvercatcher.reforged.material.MaterialDefinition;
import org.silvercatcher.reforged.material.MaterialManager;
import org.thexxturboxx.rfintegration.core.*;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy extends ProxyBase {
	
	public CommonProxy() {
		super("ProjectE");
	}
	
	/**ProjectE's DarkMatter as ToolMaterial*/
	public static ToolMaterial ProjectE_DarkMatter = EnumHelper.addToolMaterial("DARK_MATTER", 7, 9999, 30, 8, 0);
	/**ProjectE's RedMatter as ToolMaterial*/
	public static ToolMaterial ProjectE_RedMatter = EnumHelper.addToolMaterial("RED_MATTER", 7, 9999, 36, 12, 0);
	
	@Override
	public void registerMatDefs() {
		MaterialManager.addMaterialDefinition(ProjectE_DarkMatter,
				new MaterialDefinition("dark_matter", ProjectE_DarkMatter, new ItemStack(moze_intel.projecte.gameObjs.ObjHandler.matter, 1, 0)));
		MaterialManager.addMaterialDefinition(ProjectE_RedMatter,
				new MaterialDefinition("red_matter", ProjectE_RedMatter, new ItemStack(moze_intel.projecte.gameObjs.ObjHandler.matter, 1, 1)));
	}
	
	@Override
	public void registerItems() {
		super.registerItems();
		simpleReg(ReforgedIntegrationAdditions.DM_KNIFE = new ItemKnife(ProjectE_DarkMatter, true));
		ResourceLocation[] rs_dm = new ResourceLocation[]{ReforgedIntegrationAdditions.DM_BOOMERANG_TEX};
		Item[] i_dm = new Item[]{ReforgedIntegrationAdditions.DM_KNIFE};
		MaterialManager.addOthers(ProjectE_DarkMatter, rs_dm, i_dm);
		simpleReg(ReforgedIntegrationAdditions.DM_MUSKET = new ItemMusketWithBayonet(ProjectE_DarkMatter, true));
		simpleReg(ReforgedIntegrationAdditions.DM_BATTLE_AXE = new ItemBattleAxe(ProjectE_DarkMatter, true));
		simpleReg(ReforgedIntegrationAdditions.DM_BOOMERANG = new ItemBoomerang(ProjectE_DarkMatter, true));
		simpleReg(ReforgedIntegrationAdditions.DM_SABER = new ItemSaber(ProjectE_DarkMatter, true));
		simpleReg(ReforgedIntegrationAdditions.DM_KATANA = new ItemKatana(ProjectE_DarkMatter, true));
		simpleReg(ReforgedIntegrationAdditions.RM_KNIFE = new ItemKnife(ProjectE_RedMatter, true));
		ResourceLocation[] rs_rm = new ResourceLocation[]{ReforgedIntegrationAdditions.RM_BOOMERANG_TEX};
		Item[] i_rm = new Item[]{ReforgedIntegrationAdditions.RM_KNIFE};
		MaterialManager.addOthers(ProjectE_RedMatter, rs_rm, i_rm);
		simpleReg(ReforgedIntegrationAdditions.RM_MUSKET = new ItemMusketWithBayonet(ProjectE_RedMatter, true));
		simpleReg(ReforgedIntegrationAdditions.RM_BATTLE_AXE = new ItemBattleAxe(ProjectE_RedMatter, true));
		simpleReg(ReforgedIntegrationAdditions.RM_BOOMERANG = new ItemBoomerang(ProjectE_RedMatter, true));
		simpleReg(ReforgedIntegrationAdditions.RM_SABER = new ItemSaber(ProjectE_RedMatter, true));
		simpleReg(ReforgedIntegrationAdditions.RM_KATANA = new ItemKatana(ProjectE_RedMatter, true));
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

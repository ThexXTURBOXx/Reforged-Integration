package org.thexxturboxx.rfintegration.core;

import java.util.Random;

import org.silvercatcher.reforged.api.ReforgedAdditions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModReforgedIntegration.ID, name = ModReforgedIntegration.NAME, version = Global.VERSION, dependencies = Global.Deps, acceptedMinecraftVersions = Global.AcceptedVersions, updateJSON = Global.updateJSON)
public class ModReforgedIntegration {

	public static final String NAME = "Reforged Integration Core";
	public static final String ID = "reforgedintegrationcore";
	public static final String TABNAME = "reforgedintegration";

	public static final CreativeTabs tabReforgedIntegration = new CreativeTabs(TABNAME) {
		@Override
		public ItemStack getTabIconItem() {
			Item i;
			if (!ProxyBase.battleaxeList.isEmpty() && (i = ProxyBase.battleaxeList
					.get((new Random()).nextInt(ProxyBase.battleaxeList.size()))) != null) {
				return new ItemStack(i);
			} else {
				return new ItemStack(ReforgedAdditions.GOLDEN_BATTLE_AXE);
			}
		}
	};

	@Instance(ID)
	public static ModReforgedIntegration instance;

	@SidedProxy(modId = ID, clientSide = "org.thexxturboxx.rfintegration.core.ClientProxy", serverSide = "org.thexxturboxx.rfintegration.core.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
}

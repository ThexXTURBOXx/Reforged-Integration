package org.thexxturboxx.rfintegration.botania;

import org.thexxturboxx.rfintegration.core.Global;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModBotania.ID, name = ModBotania.NAME, version = Global.VERSION, dependencies = Global.ChildDeps, acceptedMinecraftVersions = Global.AcceptedVersions)
public class ModBotania {

	public static final String NAME = "Reforged Botania Integration";
	public static final String ID = "reforgedbotania";

	@Instance(ID)
	public static ModBotania instance;

	@SidedProxy(modId = ID, clientSide = "org.thexxturboxx.rfintegration.botania.ClientProxy", serverSide = "org.thexxturboxx.rfintegration.botania.CommonProxy")
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

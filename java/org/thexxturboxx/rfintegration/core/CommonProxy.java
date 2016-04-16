package org.thexxturboxx.rfintegration.core;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		loadConfig(event);
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	private void loadConfig(FMLPreInitializationEvent e) {
		/*
		File configdir = new File(e.getModConfigurationDirectory(), ReforgedMod.NAME);
		File configfile = new File(configdir, "integration.cfg");
		if(!configfile.exists()) configdir.mkdirs();
		//Get an instance of Config
		Configuration config = new Configuration(configfile);
		
		//Load Config
		config.load();

		Global.THAUMCRAFT = config.getBoolean("Thaumcraft", "Modules", Loader.isModLoaded("Thaumcraft"), "Enable Thaumcraft Integration");
		Global.PROJECTE = config.getBoolean("ProjectE", "Modules", Loader.isModLoaded("ProjectE"), "Enable ProjectE Integration");
		
		//Save config
		config.save();
		*/
	}
}

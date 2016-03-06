package org.thexxturboxx.rfintegration.core;

import java.io.File;

import org.silvercatcher.reforged.ReforgedMod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		loadConfig(event);
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	private void loadConfig(FMLPreInitializationEvent e) {
		File configdir = new File(e.getModConfigurationDirectory(), ReforgedMod.NAME);
		File configfile = new File(configdir, "integration.cfg");
		if(!configfile.exists()) configdir.mkdirs();
		//Get an instance of Config
		Configuration config = new Configuration(configfile);
		
		//Load Config
		config.load();
		
		//Save config
		config.save();
	}
}

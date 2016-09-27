package org.thexxturboxx.rfintegration.jei;

import org.thexxturboxx.rfintegration.core.ProxyBase;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy extends ProxyBase {
	
	public CommonProxy() {
		super("JEI");
	}
	
	@Override
	public void registerMatDefs() {}
	
	@Override
	public void registerItems() {}
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
}

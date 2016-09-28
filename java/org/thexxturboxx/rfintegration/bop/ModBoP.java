package org.thexxturboxx.rfintegration.bop;

import org.thexxturboxx.rfintegration.core.Global;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModBoP.ID, name = ModBoP.NAME, version = Global.VERSION, dependencies = Global.ChildDeps, acceptedMinecraftVersions=Global.AcceptedVersions)
public class ModBoP {

	public static final String NAME = "Biomes O' Plenty Integration";
	public static final String ID = "ReforgedBoP";

    @Instance(ID)
    public static ModBoP instance;
    
    @SidedProxy(modId = ID,
    		clientSide = "org.thexxturboxx.rfintegration.bop.ClientProxy",
    		serverSide = "org.thexxturboxx.rfintegration.bop.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}

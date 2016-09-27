package org.thexxturboxx.rfintegration.jei;

import org.thexxturboxx.rfintegration.core.Global;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModJei.ID, name = ModJei.NAME, version = Global.VERSION, dependencies = Global.ChildDeps, acceptedMinecraftVersions=Global.AcceptedVersions)
public class ModJei {

	public static final String NAME = "ProjectE JEI";
	public static final String ID = "ReforgedJEI";

    @Instance(ID)
    public static ModJei instance;
    
    @SidedProxy(modId = ID,
    		clientSide = "org.thexxturboxx.rfintegration.jei.ClientProxy",
    		serverSide = "org.thexxturboxx.rfintegration.jei.CommonProxy")
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

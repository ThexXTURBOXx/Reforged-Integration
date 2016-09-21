package org.thexxturboxx.rfintegration.thaumcraft;

import org.thexxturboxx.rfintegration.core.Global;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = ModThaumcraft.ID, name = ModThaumcraft.NAME, version = Global.VERSION, dependencies = Global.ChildDeps, acceptedMinecraftVersions=Global.AcceptedVersions)
public class ModThaumcraft {

	public static final String NAME = "Thaumcraft Integration";
	public static final String ID = "ReforgedThaumcraft";

    @Instance(ID)
    public static ModThaumcraft instance;
    
    @SidedProxy(modId = ID,
    		clientSide = "org.thexxturboxx.rfintegration.thaumcraft.ClientProxy",
    		serverSide = "org.thexxturboxx.rfintegration.thaumcraft.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}

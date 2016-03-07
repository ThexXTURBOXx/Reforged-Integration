package org.thexxturboxx.rfintegration.projecte;

import org.thexxturboxx.rfintegration.core.ModReforgedIntegration;
import org.thexxturboxx.rfintegration.core.Registry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModProjectE.ID, name = ModProjectE.NAME, version = ModReforgedIntegration.VERSION, dependencies = Registry.ChildDeps)
public class ModProjectE {

	public static final String NAME = "ProjectE Integration";
	public static final String ID = "ReforgedProjectE";

    @Instance(ID)
    public static ModProjectE instance;
    
    @SidedProxy(modId = ID,
    		clientSide = "org.thexxturboxx.rfintegration.projecte.ClientProxy",
    		serverSide = "org.thexxturboxx.rfintegration.projecte.CommonProxy")
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

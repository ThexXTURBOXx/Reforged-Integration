package org.thexxturboxx.rfintegration.thaumcraft;

import org.thexxturboxx.rfintegration.core.ModReforgedIntegration;
import org.thexxturboxx.rfintegration.core.Registry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModThaumcraft.ID, name = ModThaumcraft.NAME, version = ModReforgedIntegration.VERSION, dependencies = Registry.ChildDeps)
public class ModThaumcraft {

	public static final String NAME = "Thaumcraft Integration";
	public static final String ID = "Reforged|IntegrationThaumcraft";

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
}
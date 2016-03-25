package org.thexxturboxx.rfintegration.core;

import java.util.Random;

import org.silvercatcher.reforged.api.ReforgedAdditions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ModReforgedIntegration.ID, name=ModReforgedIntegration.NAME, version=ModReforgedIntegration.VERSION, dependencies=Registry.Deps, acceptedMinecraftVersions=Registry.AcceptedVersions)
public class ModReforgedIntegration {
	
	public static final String NAME = "Integration Core";
	public static final String ID = "ReforgedIntegrationCore";
	public static final String TABNAME = "reforgedintegration";
	public static final String VERSION = "0.2.3-alpha";
	
	public static final CreativeTabs tabReforgedIntegration = new CreativeTabs(TABNAME) {
		@Override
		public Item getTabIconItem() {
			Item i;
			if (!ProxyBase.battleaxeList.isEmpty() && (i = ProxyBase.battleaxeList.get((new Random()).nextInt(ProxyBase.battleaxeList.size()))) != null) {
				return i;
			} else {
				return ReforgedAdditions.GOLDEN_BATTLE_AXE;
			}
		}
	};
	
    @Instance(ID)
    public static ModReforgedIntegration instance;
    
    @SidedProxy(modId = ID,
    		clientSide = "org.thexxturboxx.rfintegration.core.ClientProxy",
    		serverSide = "org.thexxturboxx.rfintegration.core.CommonProxy")
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

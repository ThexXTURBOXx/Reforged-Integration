package org.thexxturboxx.rfintegration.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**Coremod ✓*/
@Mod(modid = ModReforgedIntegration.ID, name = ModReforgedIntegration.NAME, version = ModReforgedIntegration.VERSION, dependencies = Registry.Deps)
public class ModReforgedIntegration {
	
	public static final String NAME = "Integration Core";
	public static final String ID = "ReforgedIntegrationCore";
	public static final String TABNAME = "reforgedintegration";
	public static final String VERSION = "0.1-alpha";
	
    public static final CreativeTabs tabReforgedIntegration = new CreativeTabs(TABNAME) {
		@Override
		public Item getTabIconItem() {
			return Items.acacia_door;
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
package org.thexxturboxx.rfintegration.jei;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void registerItemRenderers() {
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();		
		for(Item item : regListItems) {
			mesher.register(item, 0, new ModelResourceLocation(ModJei.ID + ":" 
					+ item.getUnlocalizedName().substring(5), "inventory"));
		}
	}
}
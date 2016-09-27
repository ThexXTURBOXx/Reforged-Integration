package org.thexxturboxx.rfintegration.botania;

import org.silvercatcher.reforged.items.weapons.*;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import vazkii.botania.api.mana.ManaItemHandler;
import vazkii.botania.common.item.equipment.tool.ToolCommons;

public abstract class ManaItems {
	
	public class ManaKnife extends ItemKnife implements ManaItem {
		public ManaKnife(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaMusket extends ItemMusketWithBayonet implements ManaItem {
		public ManaMusket(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaBattleAxe extends ItemBattleAxe implements ManaItem {
		public ManaBattleAxe(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaBoomerang extends ItemBoomerang implements ManaItem {
		public ManaBoomerang(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaSaber extends ItemSaber implements ManaItem {
		public ManaSaber(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaKatana extends ItemKatana implements ManaItem {
		public ManaKatana(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaPike extends ItemPike implements ManaItem {
		public ManaPike(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaMace extends ItemMace implements ManaItem {
		public ManaMace(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
	
	public class ManaDirk extends ItemDirk implements ManaItem {
		public ManaDirk(ToolMaterial material) {
			super(material, false);
		}
		
		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
			if(usesMana(par1ItemStack))
				ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
			return true;
		}
		
		@Override
		public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {
			if(usesMana(stack) && block.getBlockHardness(world, pos) != 0F)
				ToolCommons.damageItem(stack, 1, entity, 60);
			return true;
		}
		
		@Override
		public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
			if(!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0 && ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
				stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}
}
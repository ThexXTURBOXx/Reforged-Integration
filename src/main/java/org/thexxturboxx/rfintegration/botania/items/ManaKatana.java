package org.thexxturboxx.rfintegration.botania.items;

import org.silvercatcher.reforged.items.weapons.ItemKatana;
import org.thexxturboxx.rfintegration.botania.ManaItem;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import vazkii.botania.api.mana.ManaItemHandler;
import vazkii.botania.common.item.equipment.tool.ToolCommons;

public class ManaKatana extends ItemKatana implements ManaItem {
	public ManaKatana(ToolMaterial material) {
		super(material, false);
	}

	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase,
			EntityLivingBase par3EntityLivingBase) {
		if (usesMana(par1ItemStack))
			ToolCommons.damageItem(par1ItemStack, 1, par3EntityLivingBase, 60);
		return true;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos,
			EntityLivingBase entityLiving) {
		if (usesMana(stack) && state.getBlockHardness(worldIn, pos) != 0F)
			ToolCommons.damageItem(stack, 1, entityLiving, 60);
		return true;
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
		if (!worldIn.isRemote && entityIn instanceof EntityPlayer && stack.getItemDamage() > 0
				&& ManaItemHandler.requestManaExactForTool(stack, (EntityPlayer) entityIn, 120, true))
			stack.setItemDamage(stack.getItemDamage() - 1);
	}
}
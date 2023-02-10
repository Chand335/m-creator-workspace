package net.mcreator.chandra.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class SuperAxeToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("superPickaxeEnchanted") == false) {
			itemstack.getOrCreateTag().putBoolean("superPickaxeEnchanted", (true));
			(itemstack).enchant(Enchantments.SHARPNESS, 10);
			(itemstack).enchant(Enchantments.AQUA_AFFINITY, 1);
			(itemstack).enchant(Enchantments.BANE_OF_ARTHROPODS, 5);
			(itemstack).enchant(Enchantments.DEPTH_STRIDER, 5);
			(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
			(itemstack).enchant(Enchantments.FALL_PROTECTION, 4);
			(itemstack).enchant(Enchantments.FIRE_ASPECT, 2);
			(itemstack).enchant(Enchantments.FIRE_PROTECTION, 4);
			(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 10);
			(itemstack).enchant(Enchantments.FROST_WALKER, 2);
			(itemstack).enchant(Enchantments.UNBREAKING, 10);
			(itemstack).enchant(Enchantments.SMITE, 10);
			(itemstack).enchant(Enchantments.SOUL_SPEED, 10);
			(itemstack).enchant(Enchantments.SWEEPING_EDGE, 10);
			(itemstack).enchant(Enchantments.RESPIRATION, 10);
			(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
			(itemstack).enchant(Enchantments.PROJECTILE_PROTECTION, 10);
			(itemstack).enchant(Enchantments.MOB_LOOTING, 10);
			(itemstack).enchant(Enchantments.MOB_LOOTING, 10);
		}
	}
}

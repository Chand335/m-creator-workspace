
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chandra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.chandra.item.SuperpicaxeItem;
import net.mcreator.chandra.item.SuperAxeItem;
import net.mcreator.chandra.ChandraMod;

public class ChandraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChandraMod.MODID);
	public static final RegistryObject<Item> SUPERPICAXE = REGISTRY.register("superpicaxe", () -> new SuperpicaxeItem());
	public static final RegistryObject<Item> SUPER_AXE = REGISTRY.register("super_axe", () -> new SuperAxeItem());
}

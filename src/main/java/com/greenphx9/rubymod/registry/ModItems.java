package com.greenphx9.rubymod.registry;

import com.greenphx9.rubymod.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //
    public static final Item RUBY = new Item(new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final ToolItem RUBY_SWORD = new SwordItem(RubyToolMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final ToolItem RUBY_SHOVEL = new ShovelItem(RubyToolMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final ToolItem RUBY_PICKAXE = new RubyPickaxe(RubyToolMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final ToolItem RUBY_AXE = new RubyAxe(RubyToolMaterial.INSTANCE, 6.0f, -3.0f, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final ToolItem RUBY_HOE = new RubyHoe(RubyToolMaterial.INSTANCE, 0, -3.2f, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final Item RUBY_HELMET = new ArmorItem(RubyArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(RubyArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final Item RUBY_LEGGINGS = new ArmorItem(RubyArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final Item RUBY_BOOTS = new ArmorItem(RubyArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(RubyMod.ITEM_GROUP));

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(RubyMod.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_hoe"), RUBY_HOE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_boots"), RUBY_BOOTS);
    }
}

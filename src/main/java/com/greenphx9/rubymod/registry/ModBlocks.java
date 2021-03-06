package com.greenphx9.rubymod.registry;

import com.greenphx9.rubymod.RubyMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5f,6f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block RUBY_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3f,3f)
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(RubyMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(RubyMod.MOD_ID, "ruby_ore"), RUBY_ORE);

    }
}

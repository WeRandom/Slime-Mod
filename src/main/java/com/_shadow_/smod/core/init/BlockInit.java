package com._shadow_.smod.core.init;

import com._shadow_.smod.SlimeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            SlimeMod.MOD_ID);

    public static final RegistryObject<Block> SLIME_ORE = BLOCKS.register("slime_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
                    .hardnessAndResistance(4.0F, 5F).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .sound(SoundType.METAL)));
}

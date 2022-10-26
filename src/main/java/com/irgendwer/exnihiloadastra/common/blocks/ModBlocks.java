package com.irgendwer.exnihiloadastra.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;

import java.util.ArrayList;

public class ModBlocks {

    public static ArrayList<Block> fallingBlocks = new ArrayList<>();

    public static void registerBlocks() {
        fallingBlocks.add(new BlockBaseFalling("dust", SoundType.CLOTH));
    }
}

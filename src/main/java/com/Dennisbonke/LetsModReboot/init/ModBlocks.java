package com.Dennisbonke.LetsModReboot.init;

import com.Dennisbonke.LetsModReboot.block.BlockFlag;
import com.Dennisbonke.LetsModReboot.block.BlockLMRB;
import com.Dennisbonke.LetsModReboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}

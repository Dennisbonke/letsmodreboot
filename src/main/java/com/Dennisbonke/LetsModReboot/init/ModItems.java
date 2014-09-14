package com.Dennisbonke.LetsModReboot.init;

import com.Dennisbonke.LetsModReboot.item.ItemLMRB;
import com.Dennisbonke.LetsModReboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static  final ItemLMRB mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}

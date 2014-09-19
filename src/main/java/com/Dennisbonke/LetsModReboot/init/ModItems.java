package com.Dennisbonke.LetsModReboot.init;

import com.Dennisbonke.LetsModReboot.item.ItemLMBR;
import com.Dennisbonke.LetsModReboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static  final ItemLMBR mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}

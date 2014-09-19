package com.Dennisbonke.LetsModReboot.init;

import com.Dennisbonke.LetsModReboot.item.ItemLMBR;
import com.Dennisbonke.LetsModReboot.item.ItemMapleLeaf;
import com.Dennisbonke.LetsModReboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
    {
    public static  final ItemLMBR mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}

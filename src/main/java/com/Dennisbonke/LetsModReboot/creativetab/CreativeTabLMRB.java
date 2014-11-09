package com.Dennisbonke.LetsModReboot.creativetab;

import com.Dennisbonke.LetsModReboot.init.ModItems;
import com.Dennisbonke.LetsModReboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMBR_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleleaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot";
        }
    };
}

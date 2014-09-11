package com.Dennisbonke.LetsModReboot;

import com.Dennisbonke.LetsModReboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid ="LetsmodReboot", name = "Lets Mod Reboot", version = "1.7.10-1.0")
public class LetsModReboot
{
    @Mod.Instance("LetsModreboot")
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "com.LetsmodReboot.proxy.ClientProxy", serverSide = "com.LetsModReboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

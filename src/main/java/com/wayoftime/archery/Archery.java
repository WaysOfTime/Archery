package com.wayoftime.archery;

import com.wayoftime.archery.Reference.Reference;
import com.wayoftime.archery.init.ModItems;
import com.wayoftime.archery.proxy.IProxy;
import com.wayoftime.archery.configuration.ConfigurationHandler;
import com.wayoftime.archery.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Archery {

    @Mod.Instance(Reference.MOD_ID)
    public static Archery instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");
        ModItems.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");

    }

    public static String prependModID(String name) {return Reference.MOD_ID + ":" + name;}
}

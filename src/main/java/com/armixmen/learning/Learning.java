package com.armixmen.learning;

import com.armixmen.learning.configuration.ConfigurationHandler;
import com.armixmen.learning.proxy.IProxy;
import com.armixmen.learning.reference.Reference;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "Reference.MOD_ID", name = "Reference.MOD_NAME", version = "Reference.VERSION")
public class Learning
{
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Instance("Learning")
	public static Learning instance;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.Init(event.getSuggestedConfigurationFile());
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{

	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}

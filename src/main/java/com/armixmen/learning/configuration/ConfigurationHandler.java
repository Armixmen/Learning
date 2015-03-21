package com.armixmen.learning.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{	public static Configuration Config;
	public static void Init(File configFile)
	{
		Config = new Configuration(configFile);
		boolean configValue = false;
		try
		{
			Config.load();
			configValue = Config.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Test").getBoolean(true);
		}
		catch (Exception e)
		{
			
		}
		finally 
		{
			if (Config.hasChanged())
			{
			Config.save();
			}
		}
			
		System.out.println("Configuration test:" + configValue);
	}
}

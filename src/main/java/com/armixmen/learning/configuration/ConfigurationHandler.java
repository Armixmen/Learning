package com.armixmen.learning.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static void Init(File configFile)
	{
		Configuration Config = new Configuration(configFile);
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
			Config.save();
		}
		System.out.println("Configuration test:" + configValue);
	}
}

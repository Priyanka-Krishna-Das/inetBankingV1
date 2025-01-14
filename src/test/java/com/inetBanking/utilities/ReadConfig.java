package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	 
	Properties pro;
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e.getMessage());
		}
	}

	//URL
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	//UserName
	public String getUserName()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	//Pass
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
}

package org.com.training.Selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;




public class ConfigDataProvider {

	Properties pro;
	static Logger logger = LogManager.getLogger(ConfigDataProvider.class);
	 public ConfigDataProvider()
	{
		File file =new File("./Config/config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
		
	    pro= new Properties();
	    pro.load(fis);
		}
	    catch (Exception e) {
			logger.info("unable to load configf file");
		}
		
	}
	
	public String getConfigData(String itemToFetch)
	{
		return pro.getProperty(itemToFetch);
	}
}

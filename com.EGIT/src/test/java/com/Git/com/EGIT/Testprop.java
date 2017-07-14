package com.Git.com.EGIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class Testprop {
	static Properties properties;
	
	public static void loaddata() throws IOException
	{
		properties = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\prop\\test1.properties");
	    FileReader obj = new FileReader(file);
	    properties.load(obj);
	}
	
	public static String getdata(String Data) throws IOException
	{
		loaddata();
		String data = properties.getProperty(Data);
		return data;
		
	}
	
	

}

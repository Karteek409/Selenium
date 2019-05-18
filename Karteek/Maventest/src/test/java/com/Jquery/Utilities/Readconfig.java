package com.Jquery.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Readconfig {

	Properties pro;
	
	public Readconfig()  {
		try {
		File src=new File("./Config.Properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
public String getapplicationurl() {
	String url=pro.getProperty("weburl");
	return url;
}
public String getchromepath() {
	String url=pro.getProperty("chromepath");
	return url;
}
public String getfirefoxpath() {
	String url=pro.getProperty("geckopath");
	return url;
}
	
}

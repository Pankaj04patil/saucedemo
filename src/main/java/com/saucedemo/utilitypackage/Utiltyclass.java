package com.saucedemo.utilitypackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utiltyclass {
	public static void screenShotMethod(WebDriver driver,String name) throws IOException
	{		
		String timestamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date ());
		TakesScreenshot ts	 =(TakesScreenshot)driver;
			
			File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		 
		File Desfile = new File("./screenshotfolder/"  + name +timestamp+ ".jpg"); 
		 
		 FileHandler.copy(Sourcefile, Desfile);
	}
	
	
}

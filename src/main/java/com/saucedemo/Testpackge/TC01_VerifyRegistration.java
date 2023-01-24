package com.saucedemo.Testpackge;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.POMpackage.LOGIN_PAGE_POM_CLASS;
import com.saucedemo.utilitypackage.Utiltyclass;


public class TC01_VerifyRegistration extends TestBaseClass
{
@Test
public void StundentRegistration() throws InterruptedException, IOException {
	 LOGIN_PAGE_POM_CLASS lg = new LOGIN_PAGE_POM_CLASS(driver);
//Registration activity
	lg.entername();
	log.info("name is entered");
	lg.entermobileno();
	log.info("mobile no entered");
	lg.sendotpbtnclick();
	log.info("send otp ");
	
	Thread.sleep(30000);
	
	lg.enteremail();
	log.info("emailid entered");
	
	lg.enterstate();
	log.info("click on select state");
  lg.selectstate();
  log.info("state entered"); 
 lg.enterclass();
 log.info("class name is entered");
 lg.selectclassname();
 
 
 lg.clickregisterbtn();
 Utiltyclass.screenShotMethod(driver, "loginpage");
	
}
	
}

package com.saucedemo.Testpackge;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.saucedemo.POMpackage.LOGIN_PAGE_POM_CLASS;
import com.saucedemo.utilitypackage.Utiltyclass;

public class TC02_VerifyQuestionAnswer extends TestBaseClass
{
	Logger log = Logger.getLogger("b");
@Test
	public void Verifyquestionanswer() throws IOException {
		LOGIN_PAGE_POM_CLASS lg = new LOGIN_PAGE_POM_CLASS(driver);
		
		lg.answerbtnclick();
		log.info("select question btn");
		lg.enterquestion();
		log.info("enter question");
		lg.searchbtnclick();
		log.info("click on search btn");
		
		lg.selectanswer();	

		log.info("select answer");

		 Utiltyclass.screenShotMethod(driver, "answer");
	
	
	
	
	
	
	}
	
	
}

package com.saucedemo.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LOGIN_PAGE_POM_CLASS 
{
WebDriver driver;
	@FindBy(xpath="(//a[text()='Login'])[2]")
	WebElement clickbtn;
	
	
	@FindBy(xpath="//b[text()='Sign Up']")
	WebElement signupbtn;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobileno;
	
	@FindBy(xpath="//button[text()='Send OTP']")
	WebElement sendotp;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//select[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//select[@name='grade']")
	WebElement selectclass;
	
	
	
	@FindBy(xpath="//button[text()='Schedule a Free Class']")
	WebElement register;
	
	
	@FindBy(xpath="/html/body/header/nav/div/div[2]/ul/li[2]/a")
	WebElement answerclick;
	
	@FindBy(xpath="//input[@id='searchInput']")
	WebElement findanswer;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div/img")
	WebElement searchbtnclick;
	
	@FindBy(xpath="//div[text()='Capital city of india']")
	WebElement selectanswer;
	
	
	@FindBy(xpath="/html/body/header/nav/div/div[2]/ul/li[1]/a")
	WebElement studysection;
	
	
	@FindBy(xpath="(//a[text()='IAS'])[1]")
	WebElement studybtnclick;
	
	@FindBy(xpath="(//a[text()='UPSC Exam'])[1]")
	WebElement upscbtnclick;
	
	
	
	
	
	
	public void loginbtnclick()
	{clickbtn.click();}
	
	public void loginclick()
	{signupbtn.click();}
	
	public void entername()
	{name.sendKeys("Pruthvi");}
	
	public void entermobileno()
	{mobileno.sendKeys("9325253774");}
	
	public void sendotpbtnclick()
	{sendotp.click();}
	
	public void enteremail()
	{email.sendKeys("patilpankaj04081994@gmail.com");}
	
	public void enterstate()
	{state.click();}
	
	public void selectstate()
	{
	
	Select set = new Select(state);
  set.selectByValue("Maharashtra");}
	
	public void enterclass()
	{selectclass.click();}
	
	public void selectclassname()
	{
	
	Select set = new Select(selectclass);
  set.selectByVisibleText("IAS");}
	
	public void answerbtnclick()
	{answerclick.click();}
	
	
	
	
	
	public void clickregisterbtn()
	{register.click();}
	
	
	public void enterquestion()
	{findanswer.sendKeys("Capital city of india");}
	
	public void searchbtnclick()
	{searchbtnclick.click();}
	
	public void selectanswer()
	{selectanswer.click();}
	
	public void studymaterial()
	{studybtnclick.click();}
	public void upsecexamselect()
	{upscbtnclick.click();}
	
	public void studysectionbtnclick()
	{studysection.click();}
	
	
	
	
	
	
	
	
	public LOGIN_PAGE_POM_CLASS(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);}
	
	
}

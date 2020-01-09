package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM 
{
	private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	//Signup
	@FindBy(xpath="/html/body/main/section/div/div[2]/div[2]/div/div/div/ul/li[1]/a")
	private WebElement signUp; 
		
	//FirstName
	@FindBy(id="registration_firstname")
	private WebElement firstname;
	
	//LastName
	@FindBy(id="registration_lastname")
	private WebElement lastname;
	
	//Registration Email
	@FindBy(id="registration_email")
	private WebElement email;
	
	// User name 
	@FindBy(id="username")
	private WebElement username;
	
	//Enter Password 
	@FindBy(id="pass1")
	private WebElement newpassowrd;
	
	//Confirm Password
	@FindBy(id="pass2")
	private WebElement confpassowrd;
	
	//Enter Phone Number
	@FindBy(id="registration_phone")
	private WebElement phone;
	
	//Select Language
	@FindBy(xpath="/html/body/main/section/div/div[2]/div/form/fieldset/div[9]/div[1]/div/button/div/div/div")
	private WebElement Language;
	
	//click on Register
	@FindBy (id="registration_submit")
	private WebElement Register;
	
	public void clicksignUp() throws Throwable 
	{
		this.signUp.click(); 
		Thread.sleep(1000);
	}
	
	public void sendfirstname(String firstname) 
	{
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
	public void sendlastname(String lastname) 
	{
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
	public void sendemail(String email) 
	{
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendusername(String username) 
	{
		this.username.clear();
		this.username.sendKeys(username);
	}
	
	public void sendnewpassowrd(String newpassowrd) 
	{
		this.newpassowrd.clear();
		this.newpassowrd.sendKeys(newpassowrd);
	}
	
	public void sendconfpassowrd(String confpassowrd) 
	{
		this.confpassowrd.clear();
		this.confpassowrd.sendKeys(confpassowrd);
	}
	
	public void sendphone(String phone) 
	{
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	
	public void clickRegister() 
	{
		this.Register.click(); 

	}
}
	

	
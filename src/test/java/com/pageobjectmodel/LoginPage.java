package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements {
	
	@FindBy(xpath=login_xpath)
	private WebElement login;
	@FindBy(id=username_id)
	private WebElement username;
	@FindBy(css=password_css)
	private WebElement password;
	@FindBy(xpath=signin_xpath)
	private WebElement signin;
	@FindBy(id=title_id)
	private WebElement titleid;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void validLoginPage() throws IOException, InterruptedException{
		clickOnElement(login);
		passInput(username, PageObjectManager)
		
	}

}

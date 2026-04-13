package com.base;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class Base_Class {
	
	public static WebDriver driver;
	
	protected static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();	
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
		}
		
			catch(Exception e) {
				Assert.fail("ERROR : OCCURED DURING BROWSER LAUNCH");
			}
			driver.manage().window().maximize();
			return driver;
	}
			
			protected static void launchUrl (String url) {
				try {
					driver.get(url);
				}
				catch (Exception e) {
					Assert.fail("ERROR : OCCURED DURING URL LAUNCH");
				}
			}
			protected static void passInput(WebElement element, String value) {
				try {
					element.sendKeys(value);
				}
				catch (Exception e) {
					Assert.fail("ERROR : OCCURED DURING VALUE PASSING");
				}
			}
			protected static void clickOnElement(WebElement element) {
				try {
					element.click();
				}
				catch(Exception e) {
					Assert.fail("ERROR : OCCURED DURING ELEMENT CLICK");
				}
			
			}
	protected static void browserTermination() {
		try {
			driver.quit();
		}
		catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER TERMINATION");
		}
	}
	protected static void SelectOption(WebElement element, String type, String value) {
		Select select=new Select(element);
		try {
			if(type.equalsIgnoreCase("Text")) {
				select.selectByVisibleText(value);
			}
			else if(type.equalsIgnoreCase("Index")) {
				select.selectByIndex(Integer.parseInt(value));
			}
			else if(type.equalsIgnoreCase("Value")) {
				select.selectByValue(value);
			}
		}
		catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING VALUE SELECTION");
			}
		}
	
	
		
	protected static void deSelectOption (WebElement element, String type, String value) {
		Select select=new Select(element);
		try {
			if(type.equalsIgnoreCase("Text")) {
				select.deselectByVisibleText(value);
			}
			else if(type.equalsIgnoreCase("Index")) {
				select.deselectByIndex(Integer.parseInt(value));
			}
			else if(type.equalsIgnoreCase("Value")) {
				select.deselectByValue(value);
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING VALUE DESELECTION");
		}

	}


protected static void windowHandling(int num) {
	try {
		List<String> allWindow=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allWindow.get(num));
	}catch (Exception e) {
		Assert.fail("ERROR : OCCURED DURING WINDOW HANDLING");
	}
}
}
	
	
		
	
	
			
		
	



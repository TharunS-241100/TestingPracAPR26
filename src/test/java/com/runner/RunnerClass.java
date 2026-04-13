package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class RunnerClass extends Base_Class {
	public static void main(String[]args) {
		launchBrowser("chrome");
		launchUrl("https://www.google.com");
		WebElement element=driver.findElement(By.name("q"));
		passInput(element,"Rose");
		browserTermination();
		windowHandling(0);
		SelectOption(element, "Index", "5");
		
		
	}

}

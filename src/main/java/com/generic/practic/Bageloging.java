package com.generic.practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bageloging {
public void bageloging() {
	
System.setProperty("webdriver.chrome.driver","./Driver/Chromedriver.exe");
	
	
	
WebDriver driver = new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
	
	
	
}
}

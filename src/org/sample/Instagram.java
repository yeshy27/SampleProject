package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
       WebElement txtUserName = driver.findElement(By.name("username"));
       txtUserName.sendKeys("yeshy");
       WebElement txtPass = driver.findElement(By.name("password"));
       txtPass.sendKeys("gfghjk");
	}
	
}

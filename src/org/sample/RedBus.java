package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement id = driver.findElement(By.id("sign-in-icon-down"));
		id.click();
		WebElement cc = driver.findElement(By.id("signInLink"));
		cc.click();
		WebElement ph = driver.findElement(By.id("mobileNoInp"));
		ph.sendKeys("9962659910");
		WebElement cd = driver.findElement(By.xpath("//span[text()='GENERATE OTP']"));
		cd.click();
		
		
		
		
	}

}

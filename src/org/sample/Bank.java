package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtId = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtId.sendKeys("iphone");
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
		
		
	
		
	}
}

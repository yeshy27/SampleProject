package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement ho = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
		Actions dsc = new Actions(driver);
		dsc.moveToElement(ho).perform();
		WebElement lo = driver.findElement(By.xpath("//a[contains(text(),'Heating & Cooling')]"));
		Actions kl = new Actions(driver);
		kl.moveToElement(lo).perform();
		WebElement jj = driver.findElement(By.xpath("(//a[contains(text(),'Air Conditioners')])[1]"));
		Actions aa = new Actions(driver);
		aa.moveToElement(jj).perform();
		WebElement nn =driver.findElement(By.xpath("//a[contains(text(),'Portable')]"));
		nn.click();
		
	}	
}

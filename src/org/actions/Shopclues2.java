package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement ss =driver.findElement(By.id("nav_45"));
		Actions sport = new Actions(driver);
		sport.moveToElement(ss).perform();
		WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weight.click();
	}
	
}

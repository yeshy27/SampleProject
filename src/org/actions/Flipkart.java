package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
			WebElement hom = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[6]"));
			Actions cv = new Actions(driver);
			cv.moveToElement(hom).perform();
			
			
			
		}
}

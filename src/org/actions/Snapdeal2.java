package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement gh = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[6]"));
		Actions nn = new Actions(driver);
		nn.moveToElement(gh).perform();
		WebElement mk = driver.findElement(By.xpath("(//span[contains(text(),'Footwear')])[3]"));
		mk.click();
		Thread.sleep(3000);
		WebElement lk = driver.findElement(By.xpath("//div[text()='Heels']"));
		lk.click();
	
	}
	
}

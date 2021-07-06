package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ff = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		ff.click();
	WebElement fas = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Actions act = new Actions(driver);
	act.moveToElement(fas).perform();
	driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	ac.moveToElement(fas).perform();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\ec\\SeleniumTask\\yesh\\filp2.png");
	FileUtils.copyFile(src, des);
	
	
	
	}
	
}

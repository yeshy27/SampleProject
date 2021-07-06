package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ff = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		ff.click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File sour = screen.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\ec\\SeleniumTask\\yesh\\flipkart.png");
		FileUtils.copyFile(sour, des);
		
		
	
	
	
	
	}
}

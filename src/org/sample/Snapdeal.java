package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize(); 
		WebElement search= driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphone11");
		WebElement fd= driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		fd.click();
		WebElement iphone = driver.findElement(By.xpath("(//p[@class = 'product-title'])[1]"));
		iphone.click();
	}

}

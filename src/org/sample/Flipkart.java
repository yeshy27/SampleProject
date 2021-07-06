package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement butlo= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		butlo.click();
		WebElement sbox = driver.findElement(By.name("q"));
		sbox.sendKeys("Titan Watch");
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		Thread.sleep(3000);
		WebElement pro = driver.findElement(By.xpath("//a[contains(text(),'2598SM01')]"));
		pro.click();
		
		
	}

}

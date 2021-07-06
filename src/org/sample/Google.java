package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.name("q"));
		txtFrom.sendKeys("greens velmurugan");
		WebElement search = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(search).perform();
		search.click();
		WebElement link = driver.findElement(By.xpath("//h3[contains(text(),'Greens Technologys')]"));
		link.click();
		
	}

}



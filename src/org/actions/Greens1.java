package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement de =driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions nc = new Actions(driver);
		nc.moveToElement(de).perform();
		WebElement ll = driver.findElement(By.xpath("//span[contains(text(),'Software Testing')]"));
		Actions sqs = new Actions(driver);
		sqs.moveToElement(ll).perform();
		WebElement cli = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		cli.click();
		
	}
}

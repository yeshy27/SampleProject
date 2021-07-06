package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions web = new Actions(driver);
		web.moveToElement(dd).perform();
		WebElement gg = driver.findElement(By.xpath("//span[contains(text(),'RPA')]"));
		Actions kl = new Actions(driver);
		kl.moveToElement(gg).perform();
		WebElement bb = driver.findElement(By.xpath("//span[contains(text(),'Blue Prism')]"));
		bb.click();
	}
		

}
	
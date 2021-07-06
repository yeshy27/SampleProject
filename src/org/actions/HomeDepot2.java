package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement ho = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
		Actions dsc = new Actions(driver);
		dsc.moveToElement(ho).perform();
		WebElement rr = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		Actions mov = new Actions(driver);
		mov.moveToElement(rr).perform();
		WebElement bon = driver.findElement(By.xpath("//a[contains(text(),'Interior Paint')]"));
		Actions yes = new Actions(driver);
		yes.moveToElement(bon).perform();
		WebElement xds = driver.findElement(By.xpath("//a[contains(text(),'Ceiling Paint')]"));
		xds.click();
}
}

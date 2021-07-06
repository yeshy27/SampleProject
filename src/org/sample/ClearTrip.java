package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtFrom = driver.findElement(By.id("from_station"));
		txtFrom.sendKeys("CHENNAI");
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("BANGALORE");
		WebElement btn =driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btn.click();
}
}
package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement lps =driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions gg = new Actions(driver);
		gg.moveToElement(lps).perform();
		WebElement jh = driver.findElement(By.xpath("//span[contains(text(),'New Launches')]"));
		jh.click();
	}
}

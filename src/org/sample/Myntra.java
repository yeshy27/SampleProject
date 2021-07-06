package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement vc = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
				vc.sendKeys("9962659903");
				WebElement cc = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
				cc.click();
	}
}

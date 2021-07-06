package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement mob = driver.findElement(By.xpath("(//a[contains(text(),'Mobiles')])[1]"));
		Actions vv = new Actions(driver);
		vv.moveToElement(mob).perform();
		WebElement swit =driver.findElement(By.xpath("//li[@class='g_heading']"));
		swit.click();
		WebElement box = driver.findElement(By.xpath("//label[contains(text(),'Above 5000')]"));
		box.click();
	}
}

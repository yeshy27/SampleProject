package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement credit =driver.findElement(By.id("credit2"));
		WebElement bank = driver.findElement(By.id("bank"));
		Actions act = new Actions(driver);
		act.dragAndDrop(credit,bank).perform();
		WebElement cc = driver.findElement(By.id("credit1"));
		WebElement bb = driver.findElement(By.id("loan"));
		Actions amt = new Actions(driver);
		amt.dragAndDrop(cc, bb).perform();
		WebElement qq = driver.findElement(By.id("fourth"));
		WebElement kk= driver.findElement(By.id("amt7"));
		Actions yes = new Actions(driver);
		yes.dragAndDrop(qq, kk).perform();
		WebElement nn = driver.findElement(By.id("fourth"));
		WebElement oo = driver.findElement(By.id("amt8"));
		Actions re = new Actions(driver);
		re.dragAndDrop(nn, oo).perform();
	}
}

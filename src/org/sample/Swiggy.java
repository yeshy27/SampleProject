package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement tc =driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		tc.click();
		WebElement cc =driver.findElement(By.id("mobile"));
		cc.sendKeys("9962659901");
		WebElement vv =driver.findElement(By.id("name"));
		vv.sendKeys("yeshwanth");
		WebElement dd =driver.findElement(By.id("email"));
		dd.sendKeys("yeshwanth@gmail.com");
		WebElement sd =driver.findElement(By.id("password"));
		sd.sendKeys("saikdfs");
		WebElement ss =driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		ss.click();
	}

}

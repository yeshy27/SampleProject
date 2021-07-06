package org.screenshot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sdown = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		String text = sdown.getText();
		System.out.println(text);
		JavascriptExecutor hn = (JavascriptExecutor)driver;
		hn.executeScript("arguments[0].scrollIntoView(true)",sdown);
	}
}

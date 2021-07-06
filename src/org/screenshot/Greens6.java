package org.screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens6 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement sdown = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",sdown);
		TakesScreenshot tk = (TakesScreenshot)driver;
		File sourc = tk.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File dest = new File("D:\\ec\\SeleniumTask\\yesh\\greens6.png");
		FileUtils.copyFile(sourc, dest);
	}
}

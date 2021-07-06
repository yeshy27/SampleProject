package org.screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens2 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement clic = driver.findElement(By.id("heading20"));
clic.click();
Thread.sleep(3000);
		TakesScreenshot tk = (TakesScreenshot)driver;
		File sr = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(sr);
		File dest = new File("D:\\ec\\SeleniumTask\\yesh\\technology.png");
		FileUtils.copyFile(sr, dest);
	}

}

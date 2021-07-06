package org.screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	TakesScreenshot tk = (TakesScreenshot)driver;
File src=tk.getScreenshotAs(OutputType.FILE);
System.out.println(src);
File desti = new File("D:\\ec\\SeleniumTask\\yesh\\sai.png");
FileUtils.copyFile(src, desti);

	}
	
}

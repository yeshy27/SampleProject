package org.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	    WebElement rc = driver.findElement(By.id("heading303"));
	    rc.click();
	    WebElement jk = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
	    Actions ee = new Actions(driver);
	    ee.contextClick(jk).perform();
	    Robot bb = new Robot();
	    Thread.sleep(3000);
	    bb.keyPress(KeyEvent.VK_UP);
	    bb.keyRelease(KeyEvent.VK_UP);
	   
	     bb.keyPress(KeyEvent.VK_ENTER);
	    bb.keyRelease(KeyEvent.VK_ENTER);
	    
	
	
	}
	

}

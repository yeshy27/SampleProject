package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement ww = driver.findElement(By.id("firstName"));
		ww.sendKeys("yeshwanth");
		WebElement aa = driver.findElement(By.id("lastName"));
		aa.sendKeys("sai");
		WebElement gg = driver.findElement(By.id("username"));
		gg.sendKeys("yeshy27");
		WebElement rr = driver.findElement(By.name("Passwd"));
	    rr.sendKeys("saodjshg");
	    WebElement jj = driver.findElement(By.name("ConfirmPasswd"));
	    jj.sendKeys("saodjshg");
	    WebElement mm = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    mm.click();
	}

}

package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("yeshwanthsai@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("sai223");
//		WebElement bt = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
//		bt.click();
		String username = txtUserName.getAttribute("value");
		System.out.println(username);
		String Password = txtPassword.getAttribute("value");
		System.out.println(Password);
	}

	
}

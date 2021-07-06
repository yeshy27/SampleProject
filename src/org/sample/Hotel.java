package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.get("http://adactinhotelapp.com/");
       driver.manage().window().maximize();
       WebElement txtUserName = driver.findElement(By.name("username"));
       txtUserName.sendKeys("yeshwanthsai");
       WebElement txtPass = driver.findElement(By.name("password"));
       txtPass.sendKeys("gfghjk56");
      String user = txtUserName.getAttribute("value");
      System.out.println(user);
      String pass = txtPass.getAttribute("value");
      System.out.println(pass);
      
       
       
	}
	

}

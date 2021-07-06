package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement clc = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			clc.click();
			WebElement log = driver.findElement(By.xpath("//a[text()='Login']"));
			log.click();
			WebElement user = driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
			user.sendKeys("yeshwanthsai654");
			WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
			pass.sendKeys("664assdfg");
			String username = user.getAttribute("value");
			System.out.println(username);
			String password = pass.getAttribute("value");
			System.out.println(password);
		}
}

package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		txtName.sendKeys("yeshwanth");
		WebElement txtLName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		txtLName.sendKeys("sai");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddress.sendKeys("SECRETARIAT COLONY, LAKSHMIPURAM, CH 600099");
		WebElement Email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		Email.sendKeys("yesh@gmail.com");
		WebElement Phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		Phone.sendKeys("9962659902");
		WebElement Gender = driver.findElement(By.xpath("//input[@ng-model='radiovalue']"));
		Gender.click();
		WebElement hob = driver.findElement(By.id("checkbox1"));
		hob.click();
		
		
		}
}

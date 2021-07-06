package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ll = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		ll.click();
		WebElement gh =driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]"));
		Actions nn = new Actions(driver);
		nn.moveToElement(gh).perform();
		WebElement yy = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		Actions kk = new Actions(driver);
		kk.moveToElement(yy).perform();
}
}

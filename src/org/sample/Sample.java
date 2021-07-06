package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\ec\\SeleniumTask\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
}
}
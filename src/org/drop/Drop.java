package org.drop;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\ec\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement element = driver.findElement(By.id("fruits"));
		Select s= new Select(element);
		s.selectByIndex(2);
		s.selectByValue("grape");
		s.selectByVisibleText("Grape ");
		
//		boolean multiple = s.isMultiple();
//		System.out.println(multiple);
//		System.out.println();
//		
//		List<WebElement> options = s.getOptions();
//		for (WebElement ref : options) {
//			String text = ref.getText();
//			System.out.println(text);
//		}
//			
//		System.out.println();
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text1 = firstSelectedOption.getText();
		System.out.println(text1);
		
		
//		
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		for (WebElement reference : allSelectedOptions) {
//			String text2 = reference.getText();
//			System.out.println(text2);
		}
		}


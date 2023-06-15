package org.qaselenium.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
//Assertion  true false and check box  click and also equals
public class WebElements6 {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
			WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com"); //URL in the browser
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		}
}

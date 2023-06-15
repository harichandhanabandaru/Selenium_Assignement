package org.qaselenium.Locators;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//navigate forward backword
public class Locators3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		navigate to another page
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();

//		sibling - child to parent traverse
//		driver.get("https://rahulshettyacademy.com/AutomationPractice");
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
//


//		driver.close();
//		driver.quit();


	}


}
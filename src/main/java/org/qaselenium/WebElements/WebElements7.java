package org.qaselenium.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements7 {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.http.factory", "jdk-http-client");
				System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
				WebDriver driver = new ChromeDriver();
	String text="Rahul";
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.cssSelector("[id='alertbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.findElement(By.id("confirmbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	}
}

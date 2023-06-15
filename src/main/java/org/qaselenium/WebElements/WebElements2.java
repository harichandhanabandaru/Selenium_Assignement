package org.qaselenium.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Add no of people into tickets
public class WebElements2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		   /*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}
}

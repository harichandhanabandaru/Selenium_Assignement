package org.qaselenium.AmazonAssignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.List;


public class Amazon {
	public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//Open Amazon.in
		driver.get("https://www.amazon.in/");


//Click on Today’s Deals
		driver.findElements(By.className("nav-a")).get(11).click();

//Get the 3rd deals and
		driver.findElements(By.cssSelector("[data-testid='deal-card']")).get(2).click();
		Thread.sleep(5000);

//Add min quantities required item and verify the cart if the quantity is as expected
//		Thread.sleep(2000);
//		driver.findElements(By.cssSelector("div[data-testid=\"grid-deals-container\"]>div")).get(3).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		new Actions(driver).moveByOffset(100, 200).click().perform();
		Assert.assertEquals(Integer.parseInt(driver.findElement(By.id("nav-cart-count")).getText()), 1, "Expexted value equals to 1");
		driver.findElement(By.id("nav-cart")).click();


//Search for Mobiles
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);


//scroll to bottom of mobiles
		WebElement element = driver.findElement(By.cssSelector("[data-index='25']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		List<WebElement> mobiles=driver.findElements(By.cssSelector("[class=\"a-section\"]"));
		System.out.println(mobiles.get(mobiles.size()-1).getText());


//Navigation - from left nav to Mobiles and select Mobiles phones and get back to the main menu.

		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mobiles, Computers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("All Mobile Phones")).click();
		Assert.assertTrue(driver.getPageSource().contains("Smartphones"), "Expected text  not found on the page");
		Assert.assertTrue(driver.getPageSource().contains("Accessories"), "Expected text  not found on the page");
		driver.quit();



	}
}

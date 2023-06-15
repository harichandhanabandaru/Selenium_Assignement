package org.qaselenium.AmazonAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//Open Amazon.in
		driver.get("https://www.amazon.in/");
//sign in to amazon
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("6300259474");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Chandhana@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

//Select the amazon prime delivery checkbox and get the first displayed item delivery date
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mobiles, Computers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("All Mobile Phones")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[aria-label=\"Prime Eligible\"]")).click();
		System.out.println(driver.findElements(By.cssSelector("div>div>div>div>span>span[class=\"a-color-base a-text-bold\"]")).get(0).getText());
		Thread.sleep(3000);

//Goto your orders and select Past one year order
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='& Orders']")).click();

		WebElement timeElement= driver.findElement(By.id("time-filter"));
		Select time=new Select(timeElement);
		time.selectByValue("year-2023");

//		other way to select drop down
//		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//ul[@role='listbox'])[1]/child::li[3]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='num-orders']")).getText(), "0 orders");


//select on sign in button
		driver.findElement(By.cssSelector("[data-nav-ref=\"nav_youraccount_btn\"]")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Your Addresses']")).click();
		driver.findElement(By.xpath("//h2[@class='a-color-tertiary']")).click();


//Fill address details
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("Bandaru Narendar");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("6300259474");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']")).sendKeys("506112");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']")).sendKeys("1-714/8/2");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']")).sendKeys("Mahabubabad");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']")).sendKeys("Beside SDS solutions");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressCity']")).sendKeys("Mahabubad");
		driver.findElement(By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']//span[@role='button']")).click();
		driver.findElement(By.xpath("//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_31']")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")).click();
		System.out.println(driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText(), "Address saved", "Expexted value equals to Address saved");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='ya-myab-display-address-block-1']//span[@id='address-ui-widgets-FullName']")).getText(), "Bandaru Narendar", "Expexted value equals to Bandaru Narendar");


	driver.quit();
	}
}

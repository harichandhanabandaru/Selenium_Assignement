package org.qaselenium.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//select start position and end position from drop down
public class WebElements1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		dropdown with select tag
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());


	}
}

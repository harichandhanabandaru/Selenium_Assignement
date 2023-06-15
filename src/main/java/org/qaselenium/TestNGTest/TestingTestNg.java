package org.qaselenium.TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingTestNg {
	@Test
	public void Demo(){
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

	}

}

package org.qaselenium.Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/home/haricb/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

	}
}

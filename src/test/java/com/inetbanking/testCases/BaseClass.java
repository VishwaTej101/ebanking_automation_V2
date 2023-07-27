package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public String baseURL= "https://demo.guru99.com/v3/index.php";
	public String username="mngr515722";
	public String passwrod="gunYvAt";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit(); 
	}
	
}

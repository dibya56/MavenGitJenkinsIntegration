package tests;

import java.lang.System.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTest {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
	}
	
	@Test
	public void test() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"TRAVEL_TECHNOLOGY_PARTNER\"]")).click();
			System.out.println("AA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}

package testBeginWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAkemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		// From City
		driver.findElement(By.id("fromCity")).sendKeys("Mumbai, India");
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

		// To City
		driver.findElement(By.id("toCity")).sendKeys("Kochi, India");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

		// Search the flight
		driver.findElement(By.className("widgetSearchBtn")).click();

	}

}

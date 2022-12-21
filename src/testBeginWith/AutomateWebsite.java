package testBeginWith;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebsite {

	public static void main(String[] args) throws InterruptedException {

		// Set the chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\\\Driver\\\\Selenium_New\\\\chromedriver.exe");

		// Calling the chromedriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open browser
		driver.get("http://www.amazon.in");

		// Click on Search box and search for bags
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");

		// Click on the Search button after entering the text
		driver.findElement(By.id("nav-search-submit-text")).click();

		// driver.findElement(By.cssSelector("input.nav-input
		// nav-progressive-attribute")).click();

		// Scroll down the page- use javascript executor
		// By pixels

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");

		// find Elements

		// driver.findElements(By.cssSelector(null))
		// to element
		// page end
		// horizontal scroll (not used frequently)

		// Get title of the first product
		List<WebElement> results = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		System.out.println(results.size());
		for (int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i).getText());
		}
		// System.out.println(results.get(0).getText());

	}

}

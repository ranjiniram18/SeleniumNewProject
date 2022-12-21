package testBeginWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver", "C:\\Driver\\Selenium_New\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

	}

}

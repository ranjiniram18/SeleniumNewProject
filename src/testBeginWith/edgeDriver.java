package testBeginWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class edgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Driver\\Selenium_New\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com");
		/*
		 * driver.navigate().to("http://google.com"); driver.navigate().back();
		 * driver.navigate().forward(); driver.navigate().refresh(); driver.quit();
		 */
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("RanjiniRam");

		driver.findElement(By.id("password")).sendKeys("anup@123");

		// click in login button by tag and name

		// Click n the register link by class
		// driver.findElement(By.cssSelector(".login_register")).click();

		// Click n the login button link by tag and id
		// driver.findElement(By.cssSelector("input#login")).click();

		// Click n the login button link by tag and class
		// driver.findElement(By.cssSelector("input.login_button")).click();

		// Click n the login button link by tag and name attribute
		// driver.findElement(By.cssSelector("input[name=login]")).click();

		// Click n the login button link by tag and class and 'type' attribute
		// driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();

		// Click n the login button link by tag and class and 'value' attribute
		driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();

		// driver.findElement(By.cssSelector("a:contains('Forgot Password?')")).click();
		// maximise window
		driver.manage().window().maximize();

		// way to handle any dropdown

		new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
		new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(5);
	}

}

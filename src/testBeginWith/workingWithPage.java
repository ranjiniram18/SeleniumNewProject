package testBeginWith;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
//import com.sun.org.apache.xpath.internal.functions.Function;

public class workingWithPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("RanjiniRam");

		driver.findElement(By.id("password")).sendKeys("anup@123");
		// Click n the login button link by tag and class and 'value' attribute
		driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();

		// maximise window
		driver.manage().window().maximize();

		// way to handle any dropdown

		new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
		new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(1);
		new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByIndex(3);
		// new Select(driver.findElement(By.id("hotels"))).selectByValue("Hotel Creek");
		new Select(driver.findElement(By.name("room_type"))).selectByIndex(1);
		new Select(driver.findElement(By.name("room_nos"))).selectByIndex(1);
		driver.findElement(By.cssSelector("input[name=datepick_in]")).sendKeys("25/11/2022");
		driver.findElement(By.cssSelector("input[name=datepick_out]")).sendKeys("26/11/2022");

		driver.findElement(By.cssSelector("input[type=Submit]")).click();

		driver.findElement(By.cssSelector("input[name=radiobutton_0]")).click();
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("first_name")).sendKeys("Ranjini");
		driver.findElement(By.id("last_name")).sendKeys("Ram");

		driver.findElement(By.id("address")).sendKeys("2/345,XXX st,USA");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");

		new Select(driver.findElement(By.name("cc_type"))).selectByIndex(1);
		new Select(driver.findElement(By.name("cc_exp_month"))).selectByIndex(1);
		new Select(driver.findElement(By.name("cc_exp_year"))).selectByIndex(10);

		driver.findElement(By.name("cc_cvv")).sendKeys("9325");
		driver.findElement(By.name("book_now")).click();

		// Better option than thread is wait

		// Fluent wait
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement itButton = fluentwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("my_itinerary"));
			}
		});
		itButton.click();

		// Thread.sleep(100);

		// Click on any hyperlink above
		// driver.findElement(By.linkText("Booked Itinerary")).click();

		// driver.findElement(By.linkText("Search Hotel")).click();

	}

}

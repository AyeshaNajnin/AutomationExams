package Projects.com.pagelogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonSubmissionPro {

	WebDriver driver;

	@BeforeSuite
	public void startbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void mainTest() {

		driver.get("https://demo.zeuz.ai/web/level/one/actions/wait_for_an_element_to_appear");
		driver.findElement(By.xpath("//*[@id=\"element_id\"]")).click();

	}

	@AfterSuite
	public void closebrowser() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();

	}

}

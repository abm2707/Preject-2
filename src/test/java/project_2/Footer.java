package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import main.CodeReusable;
import main.browser;

public class Footer extends browser {

	public static void main(String[] args) throws IOException {
		launchbrowser(); // launching browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement target = driver.findElement(By.xpath(footerCenter));
		js.executeScript("arguments[0].scrollIntoView()", target);
		driver.findElement(By.xpath(footerCenter));

		assertTrue(true);

		driver.quit();
	}
}

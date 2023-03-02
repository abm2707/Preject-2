package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import main.browser;

public class FooterSocialMedia extends browser {

	public static void main(String[] args) throws IOException {
		launchbrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement target = driver.findElement(By.xpath(footerCenter));
		js.executeScript("arguments[0].scrollIntoView()", target);

		// for LinkedIn
		driver.findElement(By.xpath(footerLinkedIn));

		// for Facebook
		driver.findElement(By.xpath(footerFacebook));

		// for Twitter
		driver.findElement(By.xpath(footerTwitter));

		// for Youtube
		driver.findElement(By.xpath(footerYoutube));
		assertTrue(true);

		driver.quit();

	}

}

package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;

public class Support extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.findElement(By.xpath(profile)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(support)).click();
		driver.findElement(By.xpath(CustSupport));
		
		assertTrue(true);
		
		driver.quit();

	}

}

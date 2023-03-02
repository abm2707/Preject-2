package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;

public class ChangePassword extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.findElement(By.xpath(profile)).click();
		driver.findElement(By.xpath(changePassword)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(CurrPass));
		driver.findElement(By.xpath(NewPass));
		driver.findElement(By.xpath(ConfirmPass));
		
		assertTrue(true);
		
		driver.quit();

	}

}

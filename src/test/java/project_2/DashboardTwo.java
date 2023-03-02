package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;

public class DashboardTwo extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(profilePhoto));
		driver.findElement(By.xpath(profileName));
		
		assertTrue(true);
		
		driver.quit();
		
		

	}

}

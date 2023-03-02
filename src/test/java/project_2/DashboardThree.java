package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;

public class DashboardThree extends CodeReusable{

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.findElement(By.xpath(dropdown)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(about));
		driver.findElement(By.xpath(support));
		driver.findElement(By.xpath(changePassword));
		driver.findElement(By.xpath(logout));
		
		assertTrue(true);
		
		driver.quit();
	}

}

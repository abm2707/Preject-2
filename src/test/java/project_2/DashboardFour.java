package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import main.CodeReusable;

public class DashboardFour extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(timeAtWork));
		driver.findElement(By.xpath(myActions));
		driver.findElement(By.xpath(quickLaunch));
		driver.findElement(By.xpath(buzzPosts));
		driver.findElement(By.xpath(empLeave));
		driver.findElement(By.xpath(empDistSubUnit));
		
	// Employee Distribution according to location is off-screen hence we need to scroll down.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement target = driver.findElement(By.xpath(empDistLoc));
		js.executeScript("arguments[0].scrollIntoView()", target);
		driver.findElement(By.xpath(empDistLoc));
	
		
		assertTrue(true);
		
		driver.quit();

	}

}

package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;

public class MenuContentOne extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(admin));
		driver.findElement(By.xpath(PIM));
		driver.findElement(By.xpath(leave));
		driver.findElement(By.xpath(time));
		driver.findElement(By.xpath(recruitment));
		driver.findElement(By.xpath(performance));
		driver.findElement(By.xpath(dashboard));
		driver.findElement(By.xpath(directory));
		driver.findElement(By.xpath(maintenance));
		driver.findElement(By.xpath(buzz));
		
		assertTrue(true);
		
		driver.quit();
	}

}

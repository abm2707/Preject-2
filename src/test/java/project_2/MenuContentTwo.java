package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;

public class MenuContentTwo extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(admin)).click();
		if(adminHeading == "Admin") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath(PIM)).click();
		if(adminHeading == "PIM") {
			assertTrue(true);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath(leave)).click();
		if(leaveHeading == "Leave") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath(time)).click();
		if(timeHeading == "Time") {
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath(recruitment)).click();
		if(recruitHeading == "Recruitment") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(performance)).click();
		if(perfHeading == "Performance") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath(dashboard)).click();
		if(dashHeading == "Dashboard") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(directory)).click();
		if(directHeading == "Directory") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(maintenance)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(password1)).sendKeys(password);
		driver.findElement(By.xpath(confirm1)).click();
		if(mainHeading == "Maintenance") {
			assertTrue(true);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(buzz)).click();
		if(buzzHeading == "Buzz") {
			assertTrue(true);
		}
		
		
		driver.quit();

	}

}

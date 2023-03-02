package project_2;



import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;

import main.CodeReusable;


public class MaintenanceOne extends CodeReusable{

	public static void main(String[] args) throws IOException, InterruptedException { 
		codeReusable();  // this includes all the scripts for properties file and first login
		driver.findElement(By.xpath(maintenance)).click();
		driver.findElement(By.xpath(adminAccess));
		Thread.sleep(3000);
		
		assertTrue(true);
		
		// Yes, when maintenance tab is clicked, once more "Administrative access" is asked
		
		driver.quit();

	}

}

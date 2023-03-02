package project_2;



import java.io.IOException;

import org.openqa.selenium.By;

import main.CodeReusable;


public class MaintenanceTwo extends CodeReusable {
	
	public static void main(String[] args) throws IOException {
		codeReusable();  // this includes all the scripts for properties file and first login
		driver.findElement(By.xpath(maintenance)).click();
		driver.findElement(By.xpath(reLoginPass)).sendKeys(password);
		driver.findElement(By.xpath(confirm)).click();
		
		// Re-login successful for maintenance tab
	}

}

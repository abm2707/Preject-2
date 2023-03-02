package project_2;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import main.CodeReusable;


public class Logout extends CodeReusable{

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.findElement(By.xpath(profile)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(logout)).click();  // clicking logout
		
		driver.quit();
	}

}

package project_2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;

import main.CodeReusable;

public class DashboardOne extends CodeReusable {

	public static void main(String[] args) throws IOException {
		codeReusable();
		driver.findElement(By.xpath(dashboard));
		
		assertTrue(true);
		
		driver.quit();

	}

}

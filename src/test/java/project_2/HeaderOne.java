package project_2;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import main.CodeReusable;

public class HeaderOne extends CodeReusable{

	public static void main(String[] args) {
		driver.get(url);
		driver.findElement(By.xpath(headerName));
		assertTrue(true);
		
		driver.quit();

	}

}

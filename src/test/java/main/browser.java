package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser extends CodeReusable {

	public static void launchbrowser() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Users\\User\\eclipse-workspace\\Project_2\\src\\test\\java\\project_2\\Config.properties");
		prop.load(input);
		url = prop.getProperty("url");
		footerCenter = prop.getProperty("footerCenter");
		footerLinkedIn = prop.getProperty("footerLinkedIn");
		footerFacebook= prop.getProperty("footerFacebook");
		footerTwitter = prop.getProperty("footerTwitter");
		footerYoutube = prop.getProperty("footerYoutube");
		footerDownLeft = prop.getProperty("footerDownLeft");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

}

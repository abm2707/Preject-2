package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeReusable {

// The scripts written below is written separately & is useful in all the test cases
	// The purpose of doing so is to increase code re-usability

	public static WebDriver driver;
	public static String url;
	public static String username;
	public static String password;
	public static String userXpath;
	public static String passXpath;
	public static String loginXpath;
	public static String reLoginPass;
	public static String confirm;
	public static String adminAccess;
	public static String accessRecord;
	public static String searchEmp;
	public static String empName;
	public static String profile;
	public static String logout;
	public static String headerName;
	public static String footerCenter;
	public static String footerLinkedIn;
	public static String footerFacebook;
	public static String footerTwitter;
	public static String footerYoutube;
	public static String footerDownLeft;
	public static String dashboard;
	public static String profilePhoto;
	public static String profileName;
	public static String dropdown;
	public static String about;
	public static String support;
	public static String changePassword;
	public static String timeAtWork;
	public static String myActions;
	public static String quickLaunch;
	public static String buzzPosts;
	public static String empLeave;
	public static String empDistSubUnit;
	public static String empDistLoc;
	public static String admin;
	public static String PIM;
	public static String leave;
	public static String time;
	public static String recruitment;
	public static String myInfo;
	public static String performance;
	public static String directory;
	public static String maintenance;
	public static String buzz;
	public static String punch;
	public static String adminHeading;
	public static String directoryHeading;
	public static String pimHeading;
	public static String leaveHeading;
	public static String timeHeading;
	public static String recruitHeading;
	public static String perfHeading;
	public static String directHeading;
	public static String mainHeading;
	public static String buzzHeading;
	public static String dashHeading;
	public static String confirm1;
	public static String password1;
	
	public static void codeReusable() throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Users\\User\\eclipse-workspace\\Project_2\\src\\test\\java\\project_2\\Config.properties");
		prop.load(input);
		url = prop.getProperty("url");
		username = prop.getProperty("username");
		password = prop.getProperty("password");
		userXpath = prop.getProperty("userXpath");
		passXpath = prop.getProperty("passXpath");
		loginXpath = prop.getProperty("loginXpath");
		reLoginPass = prop.getProperty("reLoginPass");
		confirm = prop.getProperty("confirm");
		logout = prop.getProperty("logout");
		adminAccess = prop.getProperty("adminAccess");
		accessRecord = prop.getProperty("accessRecord");
		searchEmp = prop.getProperty("searchEmp");
		empName = prop.getProperty("empName");
		profile = prop.getProperty("profile");
		headerName = prop.getProperty("headerName");
		dashboard = prop.getProperty("dashboard");
		profilePhoto = prop.getProperty("profilePhoto");
		profileName = prop.getProperty("profileName");
		dropdown = prop.getProperty("dropdown");
		about = prop.getProperty("about");
		support = prop.getProperty("support");
		changePassword = prop.getProperty("changePassword");
		logout = prop.getProperty("logout");
		timeAtWork = prop.getProperty("timeAtWork");
		myActions = prop.getProperty("myActions");
		quickLaunch = prop.getProperty("quickLaunch");
		buzzPosts = prop.getProperty("buzzPosts");
		empLeave = prop.getProperty("empLeave");
		empDistSubUnit = prop.getProperty("empDistSubUnit");
		empDistLoc = prop.getProperty("empDistLoc");
		footerCenter = prop.getProperty("footerCenter");
		punch = prop.getProperty("punch");
		admin = prop.getProperty("admin");
		PIM = prop.getProperty("PIM");
		leave = prop.getProperty("leave");
		time = prop.getProperty("time");
		recruitment = prop.getProperty("recruitment");
		myInfo = prop.getProperty("myInfo");
		performance = prop.getProperty("performance");
		directory = prop.getProperty("directory");
		maintenance = prop.getProperty("maintenance");
		buzz = prop.getProperty("buzz");
		adminHeading = prop.getProperty("adminHeading");
		directoryHeading = prop.getProperty("directoryHeading ");
		pimHeading = prop.getProperty("pimHeading ");
		leaveHeading = prop.getProperty("leaveHeading ");
		timeHeading = prop.getProperty("timeHeading ");
		recruitHeading = prop.getProperty("buzz");
		perfHeading = prop.getProperty("perfHeading ");
		directHeading = prop.getProperty("directHeading ");
		mainHeading = prop.getProperty("mainHeading ");
		buzzHeading = prop.getProperty("buzzHeading ");
		dashHeading = prop.getProperty("dashHeading ");
		confirm1 = prop.getProperty("confirm1");
		password1 = prop.getProperty("password1");
		// Launching browser and logging in

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(userXpath)).sendKeys(username);
		driver.findElement(By.xpath(passXpath)).sendKeys(password);
		driver.findElement(By.xpath(loginXpath)).click();
	}

}

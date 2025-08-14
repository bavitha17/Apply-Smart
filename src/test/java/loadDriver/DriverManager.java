package loadDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	 // public String baseUrl = "https://www.javatpoint.com/";
	//static String driverPath = "/usr/local/bin/chromedriver";
	//static String driverPath = "/usr/local/bin/msedgedriver";
	static String driverPath = "chromedriver.exe";
	public static WebDriver driver;
	
	public static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--lang=en"); driver = new ChromeDriver(options);
		 */return driver;
	}
}

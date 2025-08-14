package ApplyingJobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import loadDriver.DriverManager;

public class ApplyingJobs {
	private WebDriver driver;

	@Test
	public void applyJobs() {
		driver = DriverManager.createChromeDriver();
				driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.switchTo().window(handles.get(0));
		driver.get("https://www.wiki.com");
		
		driver.quit();
	}
}

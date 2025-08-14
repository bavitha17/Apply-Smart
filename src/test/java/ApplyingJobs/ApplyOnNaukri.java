package ApplyingJobs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import loadDriver.DriverManager;

public class ApplyOnNaukri {

	private WebDriver driver;
	public String useridNaukri;
	public String passwordNaukri;

	@BeforeMethod
	public void setUp() {
		driver = DriverManager.createChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public int applyOnNaukri() {
		int totalJobApplied = 0;
		setUp();
		driver.get("https://www.naukri.com/mnjuser/recommendedjobs");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement username1 = driver.findElement(By.id("usernameField"));
		WebElement password1 = driver.findElement(By.id("passwordField"));
		username1.clear();
		password1.clear();
		username1.sendKeys(this.useridNaukri);
		password1.sendKeys(this.passwordNaukri);
		WebElement loginButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Login')]")));
		loginButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> jobArticles = driver.findElements(By.cssSelector("article.jobTuple.bgWhite.z-depth-1"));
		System.out.println("Total Job Articles: " + jobArticles.size());
		for (WebElement article : jobArticles) {
			// System.out.println(article.getText());
			WebElement jobTitleElement = article.findElement(By.cssSelector("p.title.ellipsis.typ-16Bold"));
			WebElement companyElement = article.findElement(By.cssSelector("span.companyWrapper"));
			WebElement firstSpan = companyElement.findElement(By.tagName("span"));
			WebElement ulElement = article.findElement(By.cssSelector("ul.job-desc.typ-14Medium"));
			WebElement firstLiElement = ulElement.findElement(By.tagName("li"));
			WebElement firstSpanInLi = firstLiElement.findElement(By.tagName("span"));
			String jobId = article.getAttribute("data-job-id");

			String jobTitle = jobTitleElement.getText();
			jobTitle = jobTitle.toLowerCase();
			String[] jobTitleSplitArray = jobTitle.split("\\s+");
			String[] jobTitleFilteredArray = filterWords(jobTitleSplitArray);
			String newJobTitle = String.join("-", jobTitleFilteredArray);

			String companyName = firstSpan.getText();
			companyName = companyName.toLowerCase();
			String[] companyNameSplitArray = companyName.split("\\s+");
			String[] companyNameFilteredArray = filterWords(companyNameSplitArray);
			;
			String newCompanyName = String.join("-", companyNameFilteredArray);

			String yearOfExperienceText = firstSpanInLi.getText();
			String[] yearOfExperienceSplitArray = yearOfExperienceText.split("\\s+");
			String yearOfExperienceFinal = String.join("-", yearOfExperienceSplitArray);
			/*
			 * System.out.println("Job ID: " + jobId); System.out.println(jobTitle);
			 * System.out.println(companyName); System.out.println(firstSpanText);
			 */

			driver.switchTo().newWindow(WindowType.TAB);
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> handles = new ArrayList<String>();
			handles.addAll(windowHandles);

			try {
				String url = "https://www.naukri.com/job-listings-" + newJobTitle + "-" + newCompanyName + "-"
						+ yearOfExperienceFinal + "-" + jobId.toLowerCase();
				driver.get(url);
				totalJobApplied++;
				WebDriverWait waitForApplyButton = new WebDriverWait(driver, Duration.ofSeconds(2));
				WebElement applyButton = waitForApplyButton
						.until(ExpectedConditions.elementToBeClickable(By.id("apply-button")));
				applyButton.click();
				
				/*
				 * WebElement lastLiElement =
				 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				 * "li.botItem.chatbot_ListItem:last-of-type"))); String lastLiText =
				 * lastLiElement.getText(); if (lastLiText != null) { System.out.println(url);
				 * System.out.println(lastLiText);
				 * 
				 * }
				 */
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			//driver.close();
			driver.switchTo().window(handles.get(0));
		}
		driver.close();
		return totalJobApplied;
	}

	private static String[] filterWords(String[] words) {
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		return Arrays.stream(words).filter(word -> !pattern.matcher(word).find()).toArray(String[]::new);
	}
}

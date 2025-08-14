package ApplyingJobs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import loadDriver.DriverManager;

public class LoginLInkedIn {
	private WebDriver driver;
	public String linkedInGmail = "";
	public String linkedInPassword = "";
	public String jobTitle = "";
	public String totalYearsOfExperience = "";
	public String preferedLocation = "";
	public String currentCTC = "";
	public String howSoonYouCanJoin = "";
	public String phoneCountyCode = "";
	public String mobilePhoneNumber = "";
	public String highSchoolPercentage = "";
	public String interPercentage = "";
	public String noticePeriodInDays = "";
	public String lastCTC = "";
	public String graduationPergentage = "";
	public String immediateAvailable = "";
	public String comfortableforRelocation = "";
	public String comfortableInRemoteWork = " ";
	public String pgPercentage = " ";
	public String legallyAuthorized = "";
	public String expectedCTC = "";
	public String jobCounts = "";

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

	@Test
	public int loginLInkedIn() {
		int totalJobApplied = 0;
		setUp();
		System.out.println(linkedInGmail + " " + " " + jobTitle + " " + totalYearsOfExperience + " " + preferedLocation
				+ " " + currentCTC + " " + howSoonYouCanJoin + " " + phoneCountyCode + " " + mobilePhoneNumber + " "
				+ highSchoolPercentage + " " + interPercentage + " " + noticePeriodInDays + " " + lastCTC + " "
				+ graduationPergentage + " " + immediateAvailable + " " + comfortableforRelocation + " "
				+ comfortableInRemoteWork + "  " + pgPercentage + " " + legallyAuthorized + " " + expectedCTC);
		driver.get("https://www.linkedin.com/feed/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement username1 = driver.findElement(By.id("username"));
		WebElement password1 = driver.findElement(By.id("password"));
		username1.clear();
		password1.clear();
		username1.sendKeys(this.linkedInGmail);
		password1.sendKeys(this.linkedInPassword);
		WebElement loginButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Sign in')]")));
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e1) { // TODO
		 * Auto-generated catch block e1.printStackTrace(); }
		 */
		loginButton.click();
		/*
		 * System.out.println("Bot is waiting 15 second for login authentication.. ");
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// pasting code from here
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".search-global-typeahead__input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".search-global-typeahead__input")))
				.sendKeys(jobTitle);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".search-global-typeahead__input")))
				.sendKeys(Keys.ENTER);
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		List<WebElement> elements = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector(".search-reusables__primary-filter")));
		System.out.println(elements.size() + " : "+ " navbar items");
		WebElement jobButton = null;
		// Iterate over the elements to extract their text content
		for (WebElement element : elements) {
			WebElement we = element.findElement(By.tagName("button"));
			/* System.out.println(we.getText().toString()); */
			if (we.getText().equals("Jobs")) {
				jobButton = we;
			}
		}
		jobButton.click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 */
		WebElement button = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Easy Apply filter.']")));
		// Click the button
		button.click();

		int finalJobWantToApply = Integer.parseInt(jobCounts);
		ArrayList<String> links1 = new ArrayList<>();
		ArrayList<String> links2 = new ArrayList<>();
		ArrayList<String> links3 = new ArrayList<>();
		ArrayList<String> links4 = new ArrayList<>();
		// here we are working...
		if (finalJobWantToApply == 25) {
			links1 = getlinksOfJobs();
		} else if (finalJobWantToApply == 50) {
			links1 = getlinksOfJobs();
			WebElement page2Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Page 2']")));
			page2Button.click();
			links2 = getlinksOfJobs();
		} else if (finalJobWantToApply == 75) {
			links1 = getlinksOfJobs();
			WebElement page2Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Page 2']")));
			page2Button.click();
			links2 = getlinksOfJobs();
			WebElement page3Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Page 3']")));
			page3Button.click();
			links3 = getlinksOfJobs();
		} else if (finalJobWantToApply == 100) {
			links1 = getlinksOfJobs();
			WebElement page2Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Page 2']")));
			page2Button.click();
			links2 = getlinksOfJobs();
			WebElement page3Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Page 3']")));
			page3Button.click();
			links3 = getlinksOfJobs();
			WebElement page4Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Page 4']")));
			page4Button.click();
			links4 = getlinksOfJobs();
		}
		ArrayList<String> aHref = new ArrayList<String>();

		aHref.addAll(links1);
		aHref.addAll(links2);
		aHref.addAll(links3);
		aHref.addAll(links4);
		System.out.println(aHref.size() + " : " + "total jobs");

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		// Print the text of each <li> element
		for (String jobLink : aHref) {
			System.out.println(jobLink + " : " + "job links");
			driver.get(jobLink);
			totalJobApplied++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODOAuto-generated catch block
				e.printStackTrace();
			}

			try {
				WebElement easyApplyButton = driver.findElement(By.xpath(
						"//div[contains(@class, 'jobs-apply-button--top-card')]//button[contains(@aria-label, 'Easy Apply')]"));
				easyApplyButton.click();
				System.out.println("Easy apply button clicked");
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.tagName("h3"));
				System.out.println("Element contains this text : " + element.getText());
				if (element.getText().toString().equals("Contact info")) {

					List<WebElement> divElements = driver.findElements(
							By.xpath("//div[contains(@class, 'jobs-easy-apply-form-section__grouping')]"));
					List<WebElement> inputs = new ArrayList<>();
					for (WebElement div : divElements) {
						// Find all label and input elements within the div
						List<WebElement> divChildElements = div.findElements(By.xpath(".//input"));

						// Add all child elements to the ArrayList
						inputs.addAll(divChildElements);
					}
					for (WebElement input : inputs) {
						System.out.println(input.getText());
						String value = input.getAttribute("value");
						if (value == null || value.isEmpty()) {
							// Set your default value here, for example:
							input.sendKeys(totalYearsOfExperience);
						}
					}
					Thread.sleep(1000);
					WebElement buttonOnContactInfoPage = driver.findElement(By.xpath(
							"//button[contains(@aria-label, 'Continue to next step') or contains(@aria-label, 'Review your application') or contains(@aria-label, 'Submit application')]"));
					System.out.println(buttonOnContactInfoPage.getText());
					buttonOnContactInfoPage.click();

					WebElement resumeHeadline = driver.findElement(By.tagName("h3"));
					System.out.println("Element comtains this text : " + resumeHeadline.getText());
					// work from here
					if (resumeHeadline.getText().toString().equals("Resume")) {
						WebElement buttonOnResumePage = driver
								.findElement(By.xpath("//button[contains(@aria-label, 'Continue to next step')]"));
						buttonOnResumePage.click();
						Thread.sleep(1000);

						WebElement additionalQuestionHeadline = driver.findElement(By.tagName("h3"));
						System.out.println("Element comtains this text : " + additionalQuestionHeadline.getText());
						if (additionalQuestionHeadline.getText().toString().equals("Additional Questions")) {
							System.out.println("working till here");
							List<WebElement> divElements1 = driver.findElements(
									By.xpath("//div[contains(@class, 'jobs-easy-apply-form-section__grouping')]"));
							List<WebElement> inputs1 = new ArrayList<>();
							List<WebElement> otherTypesOfInputs = new ArrayList<>();
							for (WebElement div : divElements1) {
								// Find all label and input elements within the div
								List<WebElement> divChildElements1 = div.findElements(By.xpath(".//input | .//select"));
								List<WebElement> divChildElements2 = div.findElements(
										By.xpath(".//input[@data-test-text-selectable-option__input='Yes']"));
								// Add all child elements to the ArrayList
								inputs1.addAll(divChildElements1);
								otherTypesOfInputs.addAll(divChildElements2);
							}
							for (WebElement input : inputs1) {
								// Check if the element is an input field
								if (input.getTagName().equals("input")) {
									String value = input.getAttribute("value");
									if (value == null || value.isEmpty()) {
										// Set your default value here, for example:
										input.sendKeys(totalYearsOfExperience);
									}
								} else if (input.getTagName().equals("select")) { // Check if the element is a select
																					// field
									Select select = new Select(input);
									// Iterate through options and select the one with value "yes"
									for (WebElement option : select.getOptions()) {
										if (option.getAttribute("value").equalsIgnoreCase("yes")) {
											select.selectByVisibleText(option.getText());
											break; // Exit loop after selecting the option
										}
										if (option.getAttribute("value").equalsIgnoreCase("Professional")) {
											select.selectByVisibleText(option.getText());
											break; // Exit loop after selecting the option
										}
									}
								}
							}

							Thread.sleep(1000);
							try {
								for (WebElement we : otherTypesOfInputs) {
									System.out.println(we.getText().toString());
									System.out.println(we);
									String attributeValue = we.getAttribute("data-test-text-selectable-option__input");
									if (attributeValue != null && attributeValue.equals("Yes")) {
										try {
											// input.click();
											// Scroll the input element into view
											((JavascriptExecutor) driver)
													.executeScript("arguments[0].scrollIntoView(true);", we);

											// Click the input element using JavaScript
											((JavascriptExecutor) driver).executeScript("arguments[0].click();", we);

											System.out.println("Clicked on the input element successfully.");
										} catch (Exception e) {
											System.err
													.println("Error clicking on the input element: " + e.getMessage());
										}
									}
								}
							} catch (Exception e) {
								// TODO: handle exception
							}
							Thread.sleep(1000);
							try {
								WebElement submitApplication = wait.until(ExpectedConditions.elementToBeClickable(By
										.xpath("//button[contains(@aria-label, 'Continue to next step') or contains(@aria-label, 'Review your application') or contains(@aria-label, 'Submit application')]")));
								System.out.println(submitApplication.getText());
								submitApplication.click();
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							try {
								WebElement submitApplication1 = driver.findElement(By.xpath(
										"//button[contains(@aria-label, 'Continue to next step') or contains(@aria-label, 'Review your application') or contains(@aria-label, 'Submit application')]"));
								System.out.println(submitApplication1.getText());
								submitApplication1.click();
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							try {
								WebElement submitApplication2 = driver.findElement(By.xpath(
										"//button[contains(@aria-label, 'Continue to next step') or contains(@aria-label, 'Review your application') or contains(@aria-label, 'Submit application')]"));
								System.out.println(submitApplication2.getText());
								submitApplication2.click();
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
					}
				}
				System.out.println("try block working successfully");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: " + e.getMessage());
			}
		}
		driver.close();
		driver.switchTo().window(handles.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		return totalJobApplied;
	}

	private ArrayList<String> getlinksOfJobs() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement divElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.className("dCFCbuYnijICApObSGEvHYGEGVYpjMdwZTwg")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// Scroll the content of the div slowly
		int scrollHeight = Integer.parseInt(
				((JavascriptExecutor) driver).executeScript("return arguments[0].scrollHeight", divElement).toString());
		int screenHeight = Integer
				.parseInt(((JavascriptExecutor) driver).executeScript("return window.innerHeight").toString());

		for (int i = 0; i < scrollHeight; i += screenHeight / 10) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = " + i, divElement);
			try {
				Thread.sleep(2); // Adjust this value to control the scrolling speed
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// we need full scroller here
		// Find the <ul> element div.scaffold-layout__list
		//WebElement ulElement = driver.findElement(By.cssSelector("ul.scaffold-layout__list-container"));
		WebElement ulElement = driver.findElement(By.cssSelector("div.scaffold-layout__list"));
		List<WebElement> liElements = ulElement.findElements(By.tagName("a"));

		// Create an ArrayList to store <li> elements
		ArrayList<String> aHref = new ArrayList<>();
		// Iterate through each <li> element and store its text in the ArrayList
		for (WebElement li : liElements) {
			aHref.add(li.getAttribute("href"));
		}
		return aHref;
	}
}

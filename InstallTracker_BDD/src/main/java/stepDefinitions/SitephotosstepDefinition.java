package stepDefinitions;

import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SitephotosstepDefinition {
	public static AppiumDriver<MobileElement> driver;

	@Given("^User is on Login Page$")
	public void loginpages() throws Throwable {
		 DesiredCapabilities capabilities = new DesiredCapabilities();	
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		 //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "VthinkiPhone");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		 //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3.1");
		 //capabilities.setCapability(MobileCapabilityType.UDID, "31066A4E-D595-4801-A4B8-D9ECFB16AD93");
		 capabilities.setCapability(MobileCapabilityType.UDID, "726679fb62c2efd9f429813afd2fed458051acaf");
		 capabilities.setCapability(MobileCapabilityType.APP, "/Users/vt060/Desktop/Ecsitess/ECSite.app");
		 capabilities.setCapability("connectHardwareKeyboard", false);
		 //capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir") + "/app/ECSite.app");   
		 driver=new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	@Then("^Click on LOGIN button without entering the credentials$")
	public void Enterdetails() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"login\"])[2]")).click();
		Thread.sleep(2000);
		String LOGIN = driver.findElementByName("Please enter Site ID, Login ID, Password").getText();
		Assert.assertTrue(LOGIN.contains("Please enter Site ID, Login ID, Password"));
		
//		
//		driver.findElement(By.name("siteID")).click();
//		driver.findElement(By.name("siteID")).sendKeys("DALEYCTR");
//		driver.findElement(By.name("loginID")).click();
//		driver.findElement(By.name("loginID")).sendKeys("DEMO_TEST");
//		driver.findElement(By.name("password")).click();
//		driver.findElement(By.name("password")).sendKeys("test@1234");
//		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"login\"])[2]")).click();
//		Thread.sleep(2000);
//		String Login = driver.findElementByName("Invalid! Credential").getText();
//		System.out.println(Login);
//		Assert.assertTrue(Login.contains("Invalid! Credential"));
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(By.name("siteID")).click();
//		MobileElement element=driver.findElement(By.name("siteID"));
//		TouchActions action = new TouchActions(driver);
//		action.longPress(element);
//		action.perform();
//		element.clear();
	}
	@Then("^User enters UN, SId and Pwd$")
	public void Credential() throws Throwable{
		/* Login Screen Input for SiteID,LoginId and password */
		Thread.sleep(20000);
		driver.findElement(By.name("siteID")).click();
		driver.findElement(By.name("siteID")).sendKeys("DALEYCTR01");
		driver.findElement(By.name("loginID")).click();
		driver.findElement(By.name("loginID")).sendKeys("DEMO_TEST");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("test@1234");
	}
	@And("^Click on login button$")
	public void LoginBtn(){
		/* click the login button */
		driver.findElement(By.name("login")).click();
		//MobileElement SyncBtn = driver.findElementByName("syncButton bomTrackerButton");
		//Assert.assertEquals(true, SyncBtn.isDisplayed());
	}
	@And("^User will be redirected to home page$")
	public void Home() throws InterruptedException{
		/*verify bomTracker button in homepage*/     
		Thread.sleep(20000);
		MobileElement SyncBtn = driver.findElementByName("syncButton bomTrackerButton");
		Assert.assertEquals(true, SyncBtn.isDisplayed());
	}
	@Then("^Click on Site Photos menu from the 1st level form group screen$")
	public void Sitephoto() throws Throwable {
		/* Click on Site photos menu */
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"homeListItem\"])[4]")).click();
	}
	@Then("^Click on F29 from the 2nd level form group$")
	public void SecondlevelForm() throws Throwable {
		/* click on F29 from the form group screen */
		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=' F29'])[2]")).click();
	}
	@Then("^Click on Camera icon of A-F29-1 from the list$")
	public void camera() {
		/* Click on Camera icon of Antena-F29-1 */
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"A-F29-1\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther").click();
	}
	@And("^Capture a photo and click on Save button$")
	public void Capturephoto() throws Throwable {
		Thread.sleep(10000);
		/* Click on Camera icon */
		//driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Component Tag Photo']/XCUIElementTypeOther")).click();
		/* Click on OK button for camera access */
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='OK']")).click();
		/* click on capture button */
		Thread.sleep(10000);
		/* click on capture button of camera */
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='PhotoCapture']")).click();
		/* click on Use photo button */
		Thread.sleep(10000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Use Photo']")).click();
		
		/** click on tag me text and add text to it **/
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[3]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[2]/XCUIElementTypeTextField").sendKeys("Test123");
		driver.hideKeyboard();
		Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"UPDATE\"])[2]").click();
		
		/** click on save button **/
		driver.findElement(By.name("saveSiteInfoButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='ok']")).click();
	}
	@Then("^Click on Component Instrument Info from the 2nd level form group screen$")
	public void Instrumentinfo() throws Throwable {
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\" Instrument Info\"])[2]").click();
		Thread.sleep(2000);
	}
	@Then("^Click on Pre camera icon and capture photo$")
	public void preIcon() throws Throwable {
		Thread.sleep(3000);
		/* Click on Pre camera icon */
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Pre:\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther").click();
		/* Capturing photo */
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Cancel\"])[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther").click();
		/*clicking on Use photo option */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"UsePhoto\"]")).click();
	}
	@And("^Add name to the same photo taken in pre option$")
	public void Pre_Addname() throws Throwable {
		Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[3]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[2]/XCUIElementTypeTextField").sendKeys("Prephoto123");
		driver.hideKeyboard();
		//Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"UPDATE\"])[2]").click();
	}
	@Then("^Click on Post camera icon and capture photo")
	public void PostIcon() throws Throwable {
		Thread.sleep(2000);
		/* Click on Post camera icon */
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Post: \"])[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther").click();
		/* Capturing photo */
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Cancel\"])[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther").click();
		/*clicking on Use photo option */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"UsePhoto\"]")).click();
	}
	@And("^Add name to the same photo taken in post option$")
	public void Post_Addname() throws Throwable {
		Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[6]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[2]/XCUIElementTypeTextField").sendKeys("Postphoto123");
		driver.hideKeyboard();
		//Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"UPDATE\"])[2]").click();
	}
	@Then("^Click on Save buttons$")
	public void SafeInfo() throws Throwable {
		Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"saveSiteInfoButton\"])[2]").click();
	}
	@And("^Click on OK in Success message$")
	public void Success() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='ok']")).click();
	}
	@Then("^Click Ecsite logo to go back$")
	public void Logo() {
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"DALEYCTR01\"])[3]/XCUIElementTypeOther[1]").click();
	}
	@Then("^Click on Sync button$")
	public void Sync() {
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"syncButton\"]").click();
	}
}

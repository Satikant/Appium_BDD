package stepDefinitions;

import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class LoginstepDefinition{
	public static AppiumDriver<MobileElement> driver;

	@Given("^User is already on Login Page$")
	public void loginpage() throws Throwable {
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
	@Then("^User enters UserName, SiteId and Password$")
	public void Credentials() throws Throwable{
		/* Login Screen Input for SiteID,LoginId and password */
		Thread.sleep(20000);
		driver.findElement(By.name("siteID")).click();
		driver.findElement(By.name("siteID")).sendKeys("DALEYCTR01");
		driver.findElement(By.name("loginID")).click();
		driver.findElement(By.name("loginID")).sendKeys("DEMO_TEST");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("test@1234");
	}
	@And("^User clicks on login button$")
	public void LoginButon(){
		/* click the login button */
		driver.findElement(By.name("login")).click();
	}
	@And("^User is on home page$")
	public void HomePage() throws InterruptedException{
		/*verify Sync button in homepage*/
		Thread.sleep(10000);
		MobileElement SyncBtn = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"syncButton\"]"));
		Assert.assertEquals(true, SyncBtn.isDisplayed());
	}
	@Then("^Click on install Tracker menu from the 1st level form group screen$")
	public void FirstlevelForm() throws Throwable{
		/* Click on install tracker option*/
		Thread.sleep(10000);
		//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='homeListItem'])[4]")).click();
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"homeListItem\"])[6]")).click();
	}
	@Then("^Click on F29 from the 2nd level form group screen$")
	public void SecondlevelForm() throws Throwable {
		/* click on F29 from the form group screen */
		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=' F29'])[2]")).click();
	}
	@Then("^Click on A-F29-1 from the Antenna list screen$")
	public void AntennaList() throws Throwable {
		/* click on A-F29-1 from the form group screen */
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@name,\"CBL177B\")]")).click();
	}
	@Then("^Click on Component Install Info$")
	public void InstallInfo() throws Throwable {
		/* click on Install info drop down and select values from it */
		Thread.sleep(1000);
		driver.findElement(By.name("ios_touchable_wrapper")).click();
		driver.findElementByXPath("//XCUIElementTypePicker[@name=\"ios_picker\"]/XCUIElementTypePickerWheel").sendKeys("Not Installed");
		driver.findElementByAccessibilityId("done_button").click();
	}
	@And("^Click on Camera icon to capture photo in Component TagPhoto section$")
	public void Camera() throws Throwable {
		Thread.sleep(10000);
		/* Click on Camera icon */
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Component Tag Photo']/XCUIElementTypeOther")).click();
		/* Click on OK button for camera access */
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='OK']")).click();
		/* click on capture button */
		Thread.sleep(10000);
		/* click on capture button of camera */
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='PhotoCapture']")).click();
		/* click on Use photo button */
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Use Photo']")).click();
		
		/** click on tag me text and add text to it **/
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[2]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[2]/XCUIElementTypeTextField").sendKeys("Test123");
		driver.hideKeyboard();
		Thread.sleep(1000);
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"UPDATE\"])[2]").click();
		
		
	}
	@Then("^Click on Component Bar Code edit box and enter values to it$")
	public void BarCode() throws Throwable {
		Thread.sleep(10000);
		/** Simulator=> Enter value to edit box **/
		MobileElement element=driver.findElement(By.name("bomTrackerListSearch"));
		element.click();
		element.sendKeys("ABC-1234-abc");
		/** Real device => click on camera to capture barcode **/
		/* Click on barcode icon */
		Thread.sleep(10000);
		//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"bomTrackerListSearch\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther")).click();
		
		
	}
	@And("^Click on Save button$")
	public void FormSaveBtn() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.name("saveSiteInfoButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='ok']")).click();
	}
	@Then("^Click on ecsite icon from the Antenna list and form group screen$")
	public void ecsiteIcon() throws Throwable{
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='DEV-INSTRKR-01'])[3]/XCUIElementTypeOther[1]")).click();
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='DEV-INSTRKR-01'])[3]/XCUIElementTypeOther[1]")).click();
	}
	@Then("^Click on Sync button in Homepage$")
	public void Sync() throws Throwable{
		Thread.sleep(10000);
		driver.findElement(By.name("syncButton")).click();
	}
}

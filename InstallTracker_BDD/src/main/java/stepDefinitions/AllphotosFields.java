package stepDefinitions;

import java.net.URL;
import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AllphotosFields {
	public static AppiumDriver<MobileElement> driver;

	@Given("^USER IS ON LOGIN PAGE$")
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
//	@Then("^CLICK ON LOGIN BUTTON WITHOUT ENTERING THE CREDENETIALS$")
//	public void Enterdetails() throws Throwable {
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"login\"])[2]")).click();
//		Thread.sleep(2000);
//		String LOGIN = driver.findElementByName("Please enter Site ID, Login ID, Password").getText();
//		Assert.assertTrue(LOGIN.contains("Please enter Site ID, Login ID, Password"));
//}

	@Then("^USER ENTERS UN, SId and Pwd$")
	public void Credential() throws Throwable{
		/* Login Screen Input for SiteID,LoginId and password */
		Thread.sleep(10000);
		driver.findElement(By.name("siteID")).click();
		driver.findElement(By.name("siteID")).sendKeys("DEV-INSTRKR-01");
		driver.findElement(By.name("loginID")).click();
		driver.findElement(By.name("loginID")).sendKeys("BOMTRACK-M28");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("test@1234");
	}
	@And("^CLICK ON LOGIN BUTTON$")
	public void LoginBtn(){
		/* click the login button */
		driver.findElement(By.name("login")).click();
}
	@And("^USER WILL BE REDIRECTED TO HOME PAGE$")
	public void Home() throws InterruptedException{
		/*verify bomTracker button in homepage*/     
		Thread.sleep(20000);
		MobileElement SyncBtn = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"syncButton\"]"));
		Assert.assertEquals(true, SyncBtn.isDisplayed());
}
	@Then("^CLICK ON SITE PHOTOS MENU FROM THE 1st LEVEL FORM GROUP SCREEN$")
	public void Sitephoto() throws Throwable {
		/* Click on Site photos menu */
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"homeListItem\"])[4]")).click();
	}
	@Then("^Click on All PHOTO FIELDS$")
	public void click_on_All_PHOTO_FIELDS() throws Throwable {
		/* Click on ALL PHOTOS FIELD */
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\" ALL PHOTO FIELDS\"])[2]")).click();
	}
//	@Then("^ENTER SITE NAME, SITE CODE AND PROJECT VERSION$")
//	public void Photofield() throws Throwable {
//		Thread.sleep(10000);
//		/*Site name*/
//		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"SITE NAME\"]/XCUIElementTypeTextField").sendKeys("DevSite");
//		/*SIte code*/
//		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"SITE CODE\"]/XCUIElementTypeTextField").sendKeys("3001");
//		/*Project version*/
//		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"PROJECT VERSION\"])[2]/XCUIElementTypeTextField").sendKeys("2.0");
//		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"PROJECT VERSION\"]").click();
//		//driver.hideKeyboard();
//	}
	
//	@Then("^CLICK ON GALLERY ICON OF SITE BUILDING$")
//	public void TapeBuilding() throws Throwable {
//		Thread.sleep(20000);
//		HashMap<Object, Object> scrollObject = new HashMap<>();
//		scrollObject.put("predicateString", "value CONTAINS 'TAPE'");
//		driver.executeScript("mobile: scroll", scrollObject);
//		/*click on gallery icon*/   
//		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Sample\"])[1]/XCUIElementTypeOther[2]").click();
//		/* Click on OK button for camera access */
//		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='OK']")).click();
//		/*Gallery All photos*/
//		driver.findElementByXPath("//XCUIElementTypeCell[@name=\"All Photos\"]").click();
//		/*Gallery photo selection*/
//		driver.findElementByXPath("(//XCUIElementTypeCell[@name=\"Screenshot, Portrait, 07 August, 6:38 PM\"])[1]").click();
//		
//		Thread.sleep(20000);
//		Alert alt= driver.switchTo().alert();
//		MobileElement ft=driver.findElementByXPath("//XCUIElementTypeOther[@name=\" ft in \"]/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
//		ft.click();
//		alt.sendKeys("5");
//		MobileElement inch=driver.findElementByXPath("//XCUIElementTypeOther[@name=\" ft in \"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
//		inch.click();
//		inch.sendKeys("5");
//		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"OK\"])[2]").click();
	//}
	@Then("^CLICK CAPTURE PHOTO USING AZIMUTH ANGLE$")
	public void Azimuth() throws Throwable {
		Thread.sleep(30000);
//		HashMap<Object, Object> scrollObject = new HashMap<>();
//		scrollObject.put("predicateString", "value CONTAINS 'save'");
//		driver.executeScript("mobile: scroll", scrollObject);
//		Thread.sleep(10000);
		/*Click on camera icon */
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"SITE BUILDING - AZIMUTH ANGLE\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther").click();
		/*Azimuth Alert Ok button*/
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Ok\"]").click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='OK']")).click();
		Thread.sleep(20000);
		/*Azimuth capture icon*/
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Cancel\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther").click();
		/*Azimuth Use button*/
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"UsePhoto\"]").click();
		Thread.sleep(20000);
//		/*Azimuth Tag me*/
//		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Tag Me\"])[2]/XCUIElementTypeTextField").click();
//		/*Azimuth UPDATE button*/
//		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"UPDATE\"])[2]").click();
		
	}
}
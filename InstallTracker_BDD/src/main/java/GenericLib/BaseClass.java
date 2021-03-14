package GenericLib;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static AppiumDriver<MobileElement> driver;
	@BeforeClass
		 public void BaseClass() throws Throwable {
		 DesiredCapabilities capabilities = new DesiredCapabilities();	
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
		 capabilities.setCapability(MobileCapabilityType.UDID, "31066A4E-D595-4801-A4B8-D9ECFB16AD93");
		 capabilities.setCapability(MobileCapabilityType.APP, "/Users/vt060/Desktop/Ecsitess/ECSite.app");
		 capabilities.setCapability("connectHardwareKeyboard", false);
		 //capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir") + "/app/ECSite.app");
		 driver=new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	}
}

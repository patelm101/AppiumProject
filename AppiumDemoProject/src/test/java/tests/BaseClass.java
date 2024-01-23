package tests;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {

	@BeforeTest
	public void setup() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDRIOD");
		//caps.getCapability(MobileCapabilityType.PLATFORM_NAME, "ANDRIOD");
		//caps.getCapability(CapabilityType.PLATFORM_NAME, "ANDRIOD");
		caps.setCapability(MobilePlatform.ANDROID,"");
		caps.setBrowserName("Chrome");
		caps.setCapability(MobileBrowserType.CHROME, "Chrome");
		
	}

	@AfterTest
	public void teardown() {

	}
}

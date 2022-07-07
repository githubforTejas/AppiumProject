package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UninstallApp {
	@Test
	public void uninstallApp() throws MalformedURLException
	{
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi9");
	dc.setCapability(MobileCapabilityType.UDID, "6LBMFU89IF8LJJZD");
	dc.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	//driver.launchApp();
	boolean value = driver.isAppInstalled("io.appium.android.apis");
	System.out.println(value);
	driver.removeApp("io.appium.android.apis");
	
	
}
}
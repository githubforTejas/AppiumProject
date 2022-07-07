package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorGeneric {
	static AndroidDriver driver;
	@Test
	public void operations() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 9");
		dc.setCapability(MobileCapabilityType.UDID, "6LBMFU89IF8LJJZD");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity", ".cal.CalculatorActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
		Thread.sleep(10000);
		WebElement four = driver.findElement(By.id("com.miui.calculator:id/btn_4_s"));
		tap(1,four,5000);
		Thread.sleep(10000);
		 WebElement plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		tap(1,plus,5000);
		Thread.sleep(10000);
		WebElement eight = driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
		tap(1,eight,5000);
		Thread.sleep(10000);
		WebElement equals = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		tap(1,equals,5000);
		Thread.sleep(10000);
		String value = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		Thread.sleep(10000);
		System.out.println(value);
}
	public static void tap(int finger,WebElement element,int duration)
	{
		driver.tap(finger, element, duration);
	}
}

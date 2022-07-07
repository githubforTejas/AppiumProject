package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosScenario {
	//Hii hello
	@Test
	public void scenario() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi9");
		dc.setCapability(MobileCapabilityType.UDID, "6LBMFU89IF8LJJZD");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		MobileElement continueBtn = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, continueBtn, 500);
		MobileElement okBtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(2, okBtn, 500);
		MobileElement viewsBtn = (MobileElement) driver.findElementByAccessibilityId("Views");
		driver.tap(1, viewsBtn, 500);
		MobileElement controlsBtn = (MobileElement) driver.findElementByAccessibilityId("Controls");
		driver.tap(1, controlsBtn, 500);
		MobileElement lightThemeBtn=(MobileElement) driver.findElementByAccessibilityId("1. Light Theme");
		driver.tap(1, lightThemeBtn, 500);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Tejas");
		MobileElement chck1=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/check1"));
		driver.tap(1, chck1, 500);
		MobileElement chck2=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/check2"));
		driver.tap(1, chck2, 500);
		MobileElement rd1=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/radio1"));
		driver.tap(1, rd1, 500);
		MobileElement rd2=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/radio2"));
		driver.tap(1, rd2, 500);
		MobileElement starIcon=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/star"));
		driver.tap(1, starIcon, 500);
		MobileElement off1=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		driver.tap(1, off1, 500);
		MobileElement off2=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
		driver.tap(1, off2, 500);
		driver.hideKeyboard();
		MobileElement dropDown=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, dropDown, 500);
		MobileElement earth=(MobileElement) driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']"));
		driver.tap(1, earth, 500);
		MobileElement dropDown2=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, dropDown2, 500);
		List<WebElement> allOptions=driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
	}
}

package funtions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import appium.Element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Button {

	AppiumDriver<MobileElement> driver;
	Element root = new Element();

	public Button(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void ById(String selector) {
		MobileElement element = driver.findElement(By.id(root.element() + ":id/" + selector));
		waitForVisible(driver, element);
		element.isDisplayed();
		element.click();
		System.out.println("Button is Clicked!");
	}
	
	public void ByIdDisplay(String selector, boolean display) {
		MobileElement element = driver.findElement(By.id(root.element() + ":id/" + selector));
		waitForVisible(driver, element);
		element.isDisplayed();
		boolean actual = element.isDisplayed();
		Assert.assertEquals(actual, display);
		System.out.println("Button is Display!");
	}

	private void waitForVisible(AppiumDriver<MobileElement> driver, MobileElement element) {
		try {
			Thread.sleep(5000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

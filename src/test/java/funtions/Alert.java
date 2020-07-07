package funtions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import appium.Element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Alert {
	AppiumDriver<MobileElement> driver;
	Element elements = new Element();

	public Alert(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void ById(String selector, String textAlert) {
		MobileElement element = driver.findElement(By.id(elements.element() + ":id/" + selector));
		waitForVisible(driver, element);
		element.isDisplayed();
		String actual = element.getText();
		Assert.assertEquals(actual.replace(" ", "").toLowerCase(), textAlert.replace(" ", "").toLowerCase());
		System.out.println("Alert: " + actual);
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

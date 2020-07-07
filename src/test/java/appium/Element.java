package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Element {

	AppiumDriver<MobileElement> driver;

	public String element() {
		return "com.fta.rc.rctitv";
	}
	
	public String elementId(String el) {
		return element() + ":id/" + el;
	}
}

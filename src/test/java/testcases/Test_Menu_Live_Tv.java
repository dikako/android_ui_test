package testcases;

import org.testng.annotations.Test;

import appium.Controller;
import funtions.Alert;
import funtions.Button;
import funtions.Input;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Test_Menu_Live_Tv extends Controller {

	@Severity(SeverityLevel.MINOR)
	@Test(priority = 3, testName = "Menu Live Tv", dataProvider = "")
	public void menu_live_tv(String username, String password, String alertText) throws InterruptedException {
		Button button = new Button(driver);
		Input input = new Input(driver);
		Alert alert = new Alert(driver);

		button.ById("menuLiveTv");
	}
}

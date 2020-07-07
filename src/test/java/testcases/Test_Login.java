package testcases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import appium.Controller;
import funtions.Alert;
import funtions.Button;
import funtions.Input;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utility.ReadExcel;

public class Test_Login extends Controller {

	public String path = "../android_ui_test/src/main/java/data/data.xlsx";

	@DataProvider
	public String[][] login_alert_username() throws InvalidFormatException, IOException {
		ReadExcel read = new ReadExcel();
		return read.getCellData(path, "Login_Alert_Username");
	}
	
	@DataProvider
	public String[][] login_alert_password() throws InvalidFormatException, IOException {
		ReadExcel read = new ReadExcel();
		return read.getCellData(path, "Login_Alert_Password");
	}
	
	@DataProvider
	public String[][] login_alert_popup() throws InvalidFormatException, IOException {
		ReadExcel read = new ReadExcel();
		return read.getCellData(path, "Login_Alert_Popup");
	}

//	@Severity(SeverityLevel.MINOR)
//	@Test(priority = 0, testName = "Login Alert", dataProvider = "login_alert_username")
//	public void login_alert_username(String username, String password, String alertText) throws InterruptedException {
//		Button button = new Button(driver);
//		Input input = new Input(driver);
//		Alert alert = new Alert(driver);
//
//		button.ById("menuAccount");
//		button.ById("btnLogin");
//		input.ById("edtEmailOrPhoneNumber", username);
//		input.ById("edtPassword", password);
//		button.ById("btnSignIn");
//		alert.ById("tvErrorEmailOrPhoneNumber", alertText);
//	}
//	
//	@Severity(SeverityLevel.MINOR)
//	@Test(priority = 1, testName = "Login Alert", dataProvider = "login_alert_password")
//	public void login_alert_password(String username, String password, String alertText) throws InterruptedException {
//		Button button = new Button(driver);
//		Input input = new Input(driver);
//		Alert alert = new Alert(driver);
//
//		button.ById("menuAccount");
//		button.ById("btnLogin");
//		input.ById("edtEmailOrPhoneNumber", username);
//		input.ById("edtPassword", password);
//		button.ById("btnSignIn");
//		alert.ById("tvErrorPassword", alertText);
//	}
//	
//	@Severity(SeverityLevel.MINOR)
//	@Test(priority = 2, testName = "Login Alert", dataProvider = "login_alert_popup")
//	public void login_alert_popup(String username, String password, String alertText) throws InterruptedException {
//		Button button = new Button(driver);
//		Input input = new Input(driver);
//		Alert alert = new Alert(driver);
//
//		button.ById("menuAccount");
//		button.ById("btnLogin");
//		input.ById("edtEmailOrPhoneNumber", username);
//		input.ById("edtPassword", password);
//		button.ById("btnSignIn");
//		alert.ById("md_text_message", alertText);
//	}
	
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 3, testName = "Login Alert", dataProvider = "login_alert_popup")
	public void login_success(String username, String password, String alertText) throws InterruptedException {
		Button button = new Button(driver);
		Input input = new Input(driver);
		Alert alert = new Alert(driver);

		button.ById("menuAccount");
		button.ById("btnLogin");
		input.ById("edtEmailOrPhoneNumber", username);
		input.ById("edtPassword", password);
		button.ById("btnSignIn");
		Thread.sleep(5000);
		button.ById("menuAccount");
		alert.ById("tvTitleHeaderItem", alertText);
	}
}

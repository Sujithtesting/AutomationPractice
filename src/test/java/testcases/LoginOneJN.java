package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class LoginOneJN extends BaseTest{
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void OneJN_TC1(String username, String password) {
	
	click("loginbutton_ID");
	type("UsernameText_XPATH",username);
	type("PasswordText_XPATH",password);
	click("Loginbutton_XPATH");
}
}

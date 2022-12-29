package com.CrmPro.Testcases;

import org.testng.annotations.Test;

import com.CrmPro.BaseTest.BaseClass;
import com.CrmPro.Pages.LoginPage;
import com.CrmPro.Propertyfile.PropertyFile;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	@Test
	public void verifyUserlogin() {

		loginpage=new LoginPage();
		loginpage.userLoginCredential(PropertyFile.getData("username"),PropertyFile.getData("password"));
		loginpage.clickOnLoginBtn();


}















}

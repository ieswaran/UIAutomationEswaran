package com.sdet.screens;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.sdet.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;	
	}
	 
	public LoginPage enterUserName(String data) {	
		clearAndType(locateElement("ID","username"), data);
		return this;
	}	

	public LoginPage enterPassword(String data) {
		clearAndType(locateElement("ID","password"), data);
		return this;
	}	
	
	public HomePage clickLogin() {
		click(locateElement("CLASS","decorativeSubmit"));
		return new HomePage(driver, node);		
	}
	
	public LoginPage clickLogInForFailer() {
		click(locateElement("class","decorativeSubmit"));
		return this;		
	}
	
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(locateElement("id","errordiv"), data);
		return this;
	}
}

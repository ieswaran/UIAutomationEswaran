package com.sdet.screens;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.sdet.testng.api.base.ProjectSpecificMethods;




public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}
//click leads
	public MyLeadsPage clickLeadLink(){
		click(locateElement("LINK","Leads"));
		return new MyLeadsPage(driver, node);
	}


}

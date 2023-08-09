package com.sdet.screens;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.sdet.testng.api.base.ProjectSpecificMethods;



public class ViewLeadPage extends ProjectSpecificMethods  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		
	}
	
	
	public ViewLeadPage verifyFirstName(String fname) {
		verifyPartialText(locateElement("ID","viewLead_firstName_sp"), fname);
		return this;
	}
	
	
	public ViewLeadPage verifyCompanyName(String CompanyName) {
		verifyPartialText(locateElement("id","viewLead_companyName_sp"), CompanyName);
		return this;
	}
	
	public MyLeadsPage clickDeleteLeadLink(){
		click(locateElement("link","Delete"));
		return new MyLeadsPage(driver, node);
	}
}

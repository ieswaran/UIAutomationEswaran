package com.sdet.screens;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.sdet.testng.api.base.ProjectSpecificMethods;


public class CreateLeadPage extends ProjectSpecificMethods {


	public CreateLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}

	
	public CreateLeadPage enterCompanyName(String comnyName){
		clearAndType(locateElement("ID","createLeadForm_companyName"), comnyName);
		return this;

	}

	

	public CreateLeadPage enterFirstName(String firstName){
		clearAndType(locateElement("ID","createLeadForm_firstName"), firstName);
		return this;
	}


	public CreateLeadPage enterLastName(String lastName){
		clearAndType(locateElement("ID","createLeadForm_lastName"), lastName);
		return this;

	}

	
	public ViewLeadPage clickCreateLeadSubmit(){
		click(locateElement("CLASS","smallSubmit"));
		return new ViewLeadPage(driver, node);
	}
	
	
	public CreateLeadPage enterEmail(String eMail){
		clearAndType(locateElement("ID","createLeadForm_primaryEmail"), eMail);
		return this;
	}
}

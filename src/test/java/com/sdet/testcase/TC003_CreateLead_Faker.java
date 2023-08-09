package com.sdet.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sdet.screens.LoginPage;
import com.sdet.testng.api.base.ProjectSpecificMethods;

public class TC003_CreateLead_Faker extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new Lead on LeafTaps";
		nodes = "Leads";		
		dataSheetName="TC003";
		category="Smoke";
		authors="Hari";
	}

	@Test
	public void createLead(){
		String firstName = faker.address().firstName();
		new LoginPage(driver, node)
		.enterUserName("DemoCSR")
		.enterPassword("crmsfa")
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName(faker.company().name())
		.enterFirstName(firstName)
		.enterLastName(faker.address().lastName())
		.enterEmail(faker.internet().emailAddress())
		.clickCreateLeadSubmit()		
		.verifyFirstName(firstName);			
	}
}

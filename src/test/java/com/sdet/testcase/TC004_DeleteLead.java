package com.sdet.testcase;

import com.sdet.screens.LoginPage;
import com.sdet.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004_DeleteLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_CreateLead";
		testDescription="Delete a new Lead on LeafTaps";
		nodes = "Leads";		
		dataSheetName="TC006";
		category="Smoke";
		authors="Hari";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String eMail){

		new LoginPage(driver, node)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink();

	}
}

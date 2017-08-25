package test;

import org.testng.annotations.Test;

import wdWrapper.webelementWrapperclass;

public class TestLoginWrapper extends webelementWrapperclass {

	
	@Test
	public void LoginApp() {
		
		InvokeApp();
		type(locateElement("id","username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("classname", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Create Lead"));
		type(locateElement("id","createLeadForm_companyName"),"HCL");
		type(locateElement("id","createLeadForm_firstName"),"DemoSalesManager");
		type(locateElement("id","createLeadForm_lastName"),"De");
		
	}

}

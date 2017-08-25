package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import wdWrapper.webelementWrapperclass;

public class LoginTestNG extends webelementWrapperclass {

		// TODO Auto-generated method stub

		@BeforeSuite
		public void BeforeSute()
		{
			System.out.println("Before suite");
		}


		@org.testng.annotations.BeforeTest
		public void BeforeTest()
		{
			System.out.println("Before test");
		}

		@org.testng.annotations.BeforeClass
		public void BeforeClass()
		{
			System.out.println("Before class");
		}

		@org.testng.annotations.BeforeMethod
		public void BeforeMethod()
		{
			InvokeApp();
			System.out.println("Before Method");
		}

		
//
//		public void TestClick()
//		{
//
//			type(locateElement("id","username"),"DemoSalesManager");
//			type(locateElement("id", "password"),"crmsfa");	
//			System.out.println("At Test Clicked Element");
//		}
//

		@AfterSuite
		public void AfterSute()
		{
			System.out.println("After suite");
		}

		@org.testng.annotations.AfterTest
		public void AfterTest()
		{
			System.out.println("After Test");
		}

		@org.testng.annotations.AfterClass
		public void AfterClass()
		{
			System.out.println("After Class");
		}		

		@org.testng.annotations.AfterMethod
		public void AfterMethod()

		{
			QuitApp();
			System.out.println("After Method");
		}

	

}

package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("Clicked link");
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("GUNA");
		driver.findElementById("createLeadForm_lastName").sendKeys("D");
		WebElement mySelectElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByValue("LEAD_TRADESHOW");
		mySelectElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		dropdown= new Select(mySelectElement);
		dropdown.selectByValue("CATRQ_CARNDRIVER");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("12345678");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("GUNA@GMAIL.com");
		driver.findElementByClassName("smallSubmit");
		driver.findElementById("viewLead_companyName_sp").getText();
	}

}

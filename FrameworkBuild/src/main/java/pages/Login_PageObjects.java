package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Login_PageObjects extends pomAbstract {

	
	@FindBy(how= How.ID, using = "username")
	WebElement userTxtBox;
	
	public Login_PageObjects typeUserName( String username)
	{
		System.out.println(userTxtBox+" "+username);
	type(userTxtBox, username);
	return this;
	}
	
	@FindBy(how= How.ID, using = "password")
	WebElement pwdTxtBox;
	
	public Login_PageObjects typePwdName(String password)
	{
		type(pwdTxtBox, password);
		return this;
	}

	
	@FindBy(how= How.ID, using = "decorativeSubmit")
	WebElement subTxtBox;

	public Login_PageObjects clickLogin()
	{
		click(subTxtBox);
		return this;
	}

	@FindBy(how= How.ID, using = "CRM/SFA")
	WebElement linkTxtBox;

	public void clickLead()
	{
       click(linkTxtBox);
	}

	@FindBy(how= How.ID, using = "Create Lead")
	WebElement leadTxtBox;
		
	public void createLead()
	{
	 click(leadTxtBox);
	}
	
}


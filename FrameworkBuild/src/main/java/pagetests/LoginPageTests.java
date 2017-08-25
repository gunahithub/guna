/**
 * 
 */
package pagetests;

import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import pages.Login_PageObjects;
import pages.pomAbstract;
import test.LoginTestNG;

/**
 * @author User
 *
 */
public class LoginPageTests extends LoginTestNG {

	@Test
	public void LoginApp(){
		new Login_PageObjects()
		.typeUserName("DemoSalesManager")
		.typePwdName("crmsfa")
	    .clickLogin();
	}
	
}

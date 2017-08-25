package wdWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;




public class webelementwrapper {

	RemoteWebDriver driver=null;

	public WebElement locateElement(String how, String using){
		WebElement element = null;
		switch (how) {
		case "id":
			element = driver.findElementById(using);
			break;
		case "name":
			element = driver.findElementByName(using);
			break;
		case "classname":
			element = driver.findElementByClassName(using);
			break;
		case "tagname":
			element = driver.findElementByTagName(using);
			break;
		case "LinkText":
			element = driver.findElementByLinkText(using);
			break;
		case "xpath":
			element = driver.findElementByXPath(using);
			break;
		case "partialtext":
			element = driver.findElementByPartialLinkText(using);
			break;
		case "cssSelector":
			element = (WebElement) driver.findElementsByCssSelector(using);
			break;

		default:
			break;
		}

		return element;
	}


	public void type(WebElement element, String text )
	{
		element.sendKeys(text);
	}

	public void click (WebElement element)

	{
		element.click();
	}

	//public void selectByVisibleText ( WebElement locator, String text)

	public void selectByVisibleText ( WebElement element, String text)
	{
		WebElement mySelectElement = element;
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(text);
	}

	public void selectByVisibleValue (WebElement element, String text)
	{
		WebElement mySelectElement = element;
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByValue(text);
	}

	public void selectByIndex (WebElement locator, Integer Int)
	{

	}

	public void switchtoWindow(int index)
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		driver.switchTo().window(allWindows.get(index));

	}

	public void alertAccept()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void alertDismiss()
	{}
	public void alertText()
	{}

	public void SwitchFrame(WebElement element)
	{

		driver.switchTo().frame(element);

	}

	public Boolean VerifyTitle (WebElement element, String text)
	{
		String actualTitle=driver.getTitle();
		String expectedTitle= text;
		text.equals(actualTitle);

		return true;
	}

	public String getAttribute (WebElement locator, String Text)
	{
		return "";
	}

	public String getText (WebElement locator, String Text)
	{
		return "";
	}
	public void VerifyText (WebElement locator, String Text)
	{

	}
	public void InvokeApp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void QuitApp()
	{
		driver.quit();
	}
}

package wdWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import test.WDELlistener;




public class webelementWrapperclass extends WDELlistener {

	public WebDriver driver;
	public static EventFiringWebDriver eventDriver;
	public WebElement element ;
	
	public WebElement locateElement(String how, String using){
		
		switch (how) {
		case "id":
			element = eventDriver.findElement(By.id(using));
			break;
		case "name":
			element = eventDriver.findElement(By.name(using));
			break;
		case "classname":
			element = eventDriver.findElement(By.className(using));
			break;
		case "tagname":
			element = eventDriver.findElement(By.tagName(using));
			break;
		case "LinkText":
			element = eventDriver.findElement(By.linkText(using));
			break;
		case "xpath":
			element = eventDriver.findElement(By.xpath(using));
			break;
		case "partialtext":
			element = eventDriver.findElement(By.partialLinkText(using));
			break;
		case "cssSelector":
			element = (WebElement) eventDriver.findElements(By.cssSelector(using));
			break;

		default:
			//break;
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
		Set<String> allWindowHandles = eventDriver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		driver.switchTo().window(allWindows.get(index));

	}

	public void alertAccept()
	{
		Alert alert = eventDriver.switchTo().alert();
		alert.accept();

	}

	public void alertDismiss()
	{}
	public void alertText()
	{}

	public void SwitchFrame(WebElement element)
	{

		eventDriver.switchTo().frame(element);

	}

	public Boolean VerifyTitle (WebElement element, String text)
	{
		String actualTitle=eventDriver.getTitle();
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
/*		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)*/
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		eventDriver = new EventFiringWebDriver(driver);
		WDELlistener handler = new WDELlistener();
		eventDriver.register(handler);
		eventDriver.navigate().to("http://leaftaps.com/opentaps");
		eventDriver.manage().window().maximize();
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

	public void QuitApp()
	{
		eventDriver.quit();
	}
}
package searchTrains;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	static{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	}
	WebDriver driver;

	public CommonMethods(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement findElement(By element)
	{
		WebElement ele=driver.findElement(element);
		return ele;
	}
	public List<WebElement> findElements(By element)
	{
		List<WebElement> list=driver.findElements(element);
		return list;
	}
	public WebElement click(By element1)
	{
		WebElement ele=findElement(element1);
		ele.click();
		return ele;
	}
	public WebElement type(By element,String text)
	{
		WebElement ele=findElement(element);
		ele.sendKeys(text);
		return ele;
	}
	public WebDriverWait wait(int time)
	{
		WebDriverWait sleep = new WebDriverWait(driver, time);
		return sleep;

	}
	public String getText(By element, String text)
	{
		String eleText=type(element, text).getText();
		return eleText;
	}
	public String getAttribute(By element, String text)
	{
		String eleAttribute=type(element, text).getAttribute(text);
		return eleAttribute;
	}
	public Select selectByindex(By element,int index)
	{
		Select element1= new Select(findElement(element)) ;
		element1.selectByIndex(index);
		return element1;
		
	}
}




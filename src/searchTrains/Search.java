package searchTrains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import searchTrains.CommonMethods;

public class Search extends CommonMethods {
	
	public Search(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//WebDriver driver;
	
	
By login = By.id("loginText");
By userId = By.id("userId");
By passWord = By.id("pwd");
By submit= By.className("search_btn");
By captchaText=By.id("nlpAnswer");

public void login()
{
	
click(login);
}
public void loginUserId(String text)
{
	type(userId, text);
}

public void loginPasWd(String text)
{
	type(passWord, text);
	
}
public void captchaText(String text)
{
type(captchaText, text);
}

public void submit()
{
	WebElement ele= driver.findElement(submit);
	System.out.println(ele.isDisplayed());
	System.out.println(ele.isEnabled());
	System.out.println(ele.getText());
	ele.click();
	//click(submit);
}
}

package testcases;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SubmitElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import searchTrains.Search;

public class TestCase_1{
	
	  static 
		 {
				System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			}
	
	WebDriver driver;
	@Test
	public void testCase1()
	{
	
		driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Search ob1=new Search(driver);
		try {
			Thread.sleep(20000);
			String parent= driver.getWindowHandle();
			System.out.println(parent);
			ob1.login();
		Thread.sleep(40000);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handled");
		}
			/*Set<String> windows = driver.getWindowHandles();
			for(String win:windows)
			{
			while(win!=parent)
			{*/
				/*System.out.println(win);
				driver.switchTo().window(win);
			
			*/
			
			//Alert alt = driver.switchTo().alert();
			
			ob1.loginUserId("vyshak222");	
			ob1.loginPasWd("vuo222");
			//Thread.sleep(20000);
			WebElement ele=driver.findElement(By.tagName("iframe"));
			System.out.println(ele);
			driver.switchTo().frame(ele);
			System.out.println("Switched to iframe");
			ob1.submit();
			driver.close();
			
	/*		WebElement ele=driver.findElement(By.xpath("//div[@class='h_head1']/a[1]"));
			ele.click();*/
			
		
			//Thread.sleep(10000);
			//ob1.login();
		
		
			
		
			/*System.out.println("Enter the Captcha");
			Scanner sc= new Scanner(System.in);
			String s=sc.next();
			Thread.sleep(10000);
			ob1.captchaText(s);
		}*/ 
		
		/*	
		
	*/
		
		
			

		}}
	/*private static void setSystemProperty(String string, String string2) {
		// TODO Auto-generated method stub
		
	}*/
	

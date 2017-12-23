package MeridianPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import ObjectRepository_Accessories.Shoppingcart;
import ObjectRepository.AnnouncementsPage;
import ObjectRepository.AwardsCentralHomePage;
import ObjectRepository_Accessories.Blenders;
import ObjectRepository_Accessories.CoffeeBevarages;
import ObjectRepository.loginPage;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;


//import Resources.base;

public class Announcements {
 
	public static WebDriver driver;
	

	@BeforeSuite

	public void LoginMethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem\\Downloads\\Study\\Selenium Files\\Zip Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demosite.meridinet.com/template/login.html");
		Thread.sleep(20000);
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		loginPage lp=new loginPage(driver);
		
		lp.Username().sendKeys("Meridian");
		lp.Password().sendKeys("Demo");
		lp.LoginButton().click();
		HomePage hp=new HomePage(driver);
		WebElement admin=driver.findElement(By.xpath("//a[@class='dropdown-toggle has-submenu'] [text()='Admin']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(admin).build().perform();
		hp.Admin().click();
		Thread.sleep(2000);
		hp.Announcement().click();
	}
	
@Test()

public void AnnouncementCreation() throws IOException, InterruptedException
{

	try {
		AnnouncementsPage ap=new AnnouncementsPage(driver);
		ap.CreateNewAnnouncement().click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@id='sTitle']")).click();
		driver.findElement(By.xpath("//input[@id='sTitle']")).sendKeys("Test12345");
		ap.AnnouncementTitle().sendKeys("Test12345");
		ap.FromDate().click();
		ap.StartDate().click();
		ap.ThruDate().click();
		ap.EndDate().click();
		ap.AnnouncementText().sendKeys("testdone");
		ap.SelectCheckbox().click();
		
	}catch (Exception e) {
      e.printStackTrace();
	}

}



@AfterTest

public void BrowserClose()
{
	driver.close();
}


/*	@DataProvider
	public Object[][] getData2()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]="";
	
		return data;
	}*/
	
}
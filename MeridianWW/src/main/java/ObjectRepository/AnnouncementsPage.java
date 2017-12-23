package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AnnouncementsPage{
	
	public static WebDriver driver;

	   By createNewAnnouncement=By.xpath("//input[@value='Create New Announcement']");
	   By announcementTitle=By.xpath("//*[@id='sTitle']");
	   By fromDate=By.id("dFromDate");
	   By thruDate=By.id("dThruDate");
	   By startDate=By.xpath("//*[starts-with(@class,'datepicker')]/div[1][@class='datepicker-days']/table/tbody/tr[5]/td[7]");
	   By endDate=By.xpath("//*[starts-with(@class,'datepicker')]/div[1][@class='datepicker-days']/table/tbody/tr[5]/td[7]");
	   By announcementText=By.xpath(".//*[@id='cke_ckeditor']/div[1]/div[@id='cke_1_contents']");
	   By selectCheckbox=By.xpath(".//*[@id='myCheckBox']");
	   
	public AnnouncementsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
/*   public void Awards()
   {
	  
	   Actions act=new Actions(driver);
	   //act.moveToElement((WebElement)awards).build().perform();
	   act.moveToElement((WebElement) awards).build().perform();
	
   }*/
	
	
	   public  WebElement CreateNewAnnouncement()
	   {
		   return driver.findElement(createNewAnnouncement);
	   }
	   
	   public  WebElement AnnouncementTitle()
	   {
		   return driver.findElement(announcementTitle);
	   }
	   
	   public  WebElement FromDate()
	   {
		   return driver.findElement(fromDate);
	   }
   
	   public  WebElement ThruDate()
	   {
		   return driver.findElement(thruDate);
	   }
	   
	   public  WebElement StartDate()
	   {
		   return driver.findElement(startDate);
	   }
	   
	   public  WebElement EndDate()
	   {
		   return driver.findElement(endDate);
	   }
	   
	   public  WebElement AnnouncementText()
	   {
		   return driver.findElement(announcementText);
	   }
   
	   public  WebElement SelectCheckbox()
	   {
		   return driver.findElement(selectCheckbox);
	   }
}
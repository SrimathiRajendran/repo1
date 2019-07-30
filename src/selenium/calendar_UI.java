package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar_UI {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://makemytrip.com/");
	driver.findElement(By.id("hp-widget__depart")).click();
	while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("April"))
			{
		
			}
	
	List<WebElement> lis=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
	int count=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();			
		if(text.equalsIgnoreCase("23"))
		{
			driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
		}
	}
			
	}	
}

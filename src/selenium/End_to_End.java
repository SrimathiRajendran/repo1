package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class End_to_End {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();		
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(2000L);
		WebDriverWait d=new WebDriverWait(driver,2);
	    d.until(ExpectedConditions.elementToBeClickable(By.id("btnclosepaxoption")));
		for(int i=1;i<3;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("hrefIncChd")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		//Thread.sleep(5000L);
		WebDriverWait d1=new WebDriverWait(driver,5);
	    d1.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_btn_FindFlights")));
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	}

}

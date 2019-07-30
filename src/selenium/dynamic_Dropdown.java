package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamic_Dropdown {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.get("http://spicejet.com");
	//NORMAL DROPDOWN
	Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	Thread.sleep(2000);
	s.selectByValue("AED");
	s.selectByVisibleText("INR");
	System.out.println("Select INR:"+ driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
	s.selectByIndex(3);
	
	//Dynamic Dropdown
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='MAA']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

	driver.findElement(By.xpath("//a[@value='BLR']")).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();*/

	//AUTO-SUGGESTIVE DROPDOWN
	driver.get("https://makemytrip.com/");
	WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
/*driver.findElement(By.id("hp-widget__sfrom")).clear();
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys("CHE");
	Thread.sleep(2000);
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);*/
	
	source.clear();
	source.sendKeys("CHE");
	Thread.sleep(2000);
	source.sendKeys(Keys.ENTER);
	
	WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
	destination.clear();
	destination.sendKeys("DEL");
	Thread.sleep(2000);
	//for(int i=0;i<3;i++)
	/*destination.sendKeys(Keys.ARROW_DOWN);
	destination.sendKeys(Keys.ENTER);*/	
	
	
	
}
}
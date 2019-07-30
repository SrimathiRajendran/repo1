package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_Calender
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	String parent=driver.getWindowHandle();
	
	WebElement source=driver.findElement(By.id("src"));
	source.sendKeys("che");
	source.sendKeys(Keys.ARROW_DOWN);
	source.sendKeys(Keys.ENTER);
	
	WebElement desti=driver.findElement(By.id("dest"));
	desti.sendKeys("mum");
	desti.sendKeys(Keys.ARROW_DOWN);
	desti.sendKeys(Keys.ENTER);
}
}

	
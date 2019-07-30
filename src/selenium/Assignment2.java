package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		WebElement source=driver.findElement(By.id("FromTag"));
		source.sendKeys("che");
		source.sendKeys(Keys.ENTER);
		WebElement destination=driver.findElement(By.id("ToTag"));
		destination.sendKeys("ban");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByVisibleText("3");
		Select sChild=new Select(driver.findElement(By.id("Childrens")));
		sChild.selectByValue("2");
		Select sInfants=new Select(driver.findElement(By.id("Infants")));
		sInfants.selectByIndex(1);
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select travelClass=new Select(driver.findElement(By.id("Class")));
		travelClass.selectByVisibleText("Business");
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		}
}

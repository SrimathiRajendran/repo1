package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.click();
		Thread.sleep(1000);
		from.sendKeys("coim");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		//from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("bhop");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
	}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		WebElement element=driver.findElement(By.id("autocomplete"));
		element.sendKeys("uni");
		Thread.sleep(2000L);
		element.sendKeys(Keys.ARROW_DOWN);
		/*String text=element.getText();
		System.out.println(text);*/
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String script="return document.getElementById('autocomplete').value;";
		//String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String)js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("United Kingdom"))
		{
			i++;
			element.sendKeys(Keys.ARROW_DOWN);
			text=(String)js.executeScript(script);
			System.out.println(text);	
			if(i>10)
			{
				break;
			}
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}
	}
}

package selenium;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class link_Count {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		int size=driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links:"+size);
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		int foot_size=footerdriver.findElements(By.tagName("a")).size();
		System.out.println("Links in footer:"+foot_size);
		WebElement col_driver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int cl_size=col_driver.findElements(By.tagName("a")).size();
		System.out.println("Links in col footer:"+cl_size);
		for(int i=1;i<cl_size;i++)
		{
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			col_driver.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(5000L);
		}
			Set<String> list=driver.getWindowHandles();
			java.util.Iterator<String> it=list.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
	}

}


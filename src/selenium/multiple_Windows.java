package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_Windows {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window is:"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		Set<String> childWindows=driver.getWindowHandles();
		int count=childWindows.size();
		System.out.println("Count:"+count);
		for(int i=0;i<count;i++)
		{
			System.out.println("window name:"+childWindows);
		}
		for(String child:childWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				System.out.println(driver.getTitle());
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys("search");
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent??:"+parent);*/
		
		driver.get("https://www.guru99.com/alert-popup-handling-selenium.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='#3']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='https://www.geeksforgeeks.org/count-number-of-ways-to-divide-a-number-in-4-parts/']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
	}
}

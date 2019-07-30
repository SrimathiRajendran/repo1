package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_Box {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Size of Discount checkbox:"+count);
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).getAttribute("value"));
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).clear();
	/*	int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("Count of radio buttons:"+count);
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("id");
			System.out.println(text);
			if(text.equals("ctl00_mainContent_rbtnl_Trip_2"))
			{
				
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			}
		}*/
		
		
		
		
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_Browser {
	public static void main(String[] args)
	{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://login.salesforce.com/");
//				System.out.println(driver.getCurrentUrl());
				//driver.findElement(By.id("email")).sendKeys("qqq");
				//driver.findElement(By.id("pass")).sendKeys("111");
//				driver.findElement(By.className("inputtext")).sendKeys("qqq");
				
//				driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
				WebElement ele=driver.findElement(By.id("username"));
				ele.sendKeys("hello");
				driver.findElement(By.name("pw")).sendKeys("12456");
				driver.findElement(By.xpath("//input[@id='Login']")).click();
				//System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
				System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
				
				
		
	}

}

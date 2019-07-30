package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		if(driver.findElement(By.id("checkBoxOption1")).isSelected())
		{
			System.out.println("Check box is selected");
			System.out.println(driver.findElement(By.id("checkBoxOption1")).getAttribute("value"));
		}
		else
		{
			System.out.println("Not Selected");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();

		if(driver.findElement(By.id("checkBoxOption1")).isSelected())
		{
			System.out.println("Check box is selected");
			System.out.println(driver.findElement(By.id("checkBoxOption1")).getAttribute("value"));
		}
		else
		{
			System.out.println("Not Selected");
		}
		int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Count of checkboxes:" +count);
	}
}

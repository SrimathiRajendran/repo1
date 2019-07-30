package selenium;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Facebook {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		WebElement s=driver.findElement(By.id("checkBoxOption1"));

		s.click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

		s.click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());



		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		//count

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}


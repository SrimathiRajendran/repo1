package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkbox_Label=driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(checkbox_Label);
		driver.findElement(By.id("name")).sendKeys(checkbox_Label);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println("Alert text is:"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
}

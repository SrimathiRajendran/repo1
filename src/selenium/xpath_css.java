package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_css {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/interview.php");
	//driver.findElement(By.xpath("//li[@id='tablist1-tab2']")).click();
	//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']//li[2]")).click();
	//driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
	//System.out.println(driver.findElement(By.xpath("//li[text()=' Selenium ']")).getText());
	//driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
//driver.findElement(By.xpath("//*[@class='interview-questions']//div//div//ul//li[2]")).click();

//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	driver.findElement(By.linkText("Courses")).click();
	
	}

}

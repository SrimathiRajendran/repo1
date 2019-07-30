package selenium;

import java.awt.event.WindowStateListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_multipleWindow {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	String parent=driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@href='/windows']")).click();
	driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
	Set<String> wind_hand=driver.getWindowHandles();
	Iterator i=wind_hand.iterator();
    if(i.hasNext())
	{
		
	}
	ArrayList<String> child_wind=new ArrayList<String>();
	child_wind.addAll(wind_hand);
	int count=child_wind.size();
	//System.out.println("Number of windows:"+count);
	String child1=child_wind.get(0);
	String child2=child_wind.get(1);
	System.out.println("Parent window:"+driver.getTitle());
	driver.switchTo().window(child2);
	System.out.println("Child2 window:"+driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	driver.switchTo().window(child1);
	System.out.println("Child1 window:"+driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	driver.switchTo().window(parent);
	
	/*driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	System.out.println("Before Switching");
	System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	Set<String>abc=driver.getWindowHandles();
	Iterator<String>it = abc.iterator();
	String parentid=it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	System.out.println("After Switching");
	System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
	System.out.println("Switching Back To Parent");
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());*/

}
}

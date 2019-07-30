package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://jqueryui.com/droppable/");
	System.out.println("Sixe of the frame:"+driver.findElements(By.cssSelector("iframe[class='demo-frame']")).size());
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	//driver.switchTo().frame(0);
	driver.findElement(By.id("draggable")).click();
	Actions action=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement destination=driver.findElement(By.id("droppable"));
	action.dragAndDrop(source,destination).build().perform();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Accept")).click();
	driver.findElement(By.linkText("Default functionality")).click();	
	
}
}

package selenium;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;
public class ajax_Calls {
	
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://www.amazon.com/");
	Actions a=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
	a.moveToElement(ele).build().perform();
	//Thread.sleep(5000L);
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	a.contextClick(driver.findElement(By.id("twotabsearchtextbox")));*/
	
	//------------------Handling windows-----------------------
	driver.get("https://myaccount.google.com/intro");
	System.out.println("Before clicking:"+driver.getTitle());
	Thread.sleep(5000L);
	Set<String> ids=driver.getWindowHandles();	
	java.util.Iterator<String> it=ids.iterator();
	//driver.findElement(By.xpath("//a[@class='WpHeLc']")).click();
	driver.findElement(By.xpath("//a[@data-rid='10041']")).click();
	System.out.println("After clicking:"+driver.getTitle());

	String parentid=it.next();
	String child=it.next();	
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());

		// TODO Auto-generated method stub
/*
		d.manage().window().maximize();

		d.get("https://www.facebook.com/");

		System.out.println(d.findElements(By.tagName("a")).size());

		WebElement foot = d.findElement(By.id("pageFooter"));

		System.out.println(foot.findElements(By.tagName("a")).size());

		WebElement secrow = foot.findElement(By.xpath("//div[@id='js_0']"));

		System.out.println(secrow.findElements(By.tagName("a")).size());

		for (int i=0;i<secrow.findElements(By.tagName("a")).size();i++)

		{

		   String linknewtab = Keys.chord(Keys.CONTROL, Keys.ENTER);

		secrow.findElements(By.tagName("a")).get(i).sendKeys(linknewtab);

		//Thread.sleep(1000);

		WebDriverWait t=new WebDriverWait(d,10);

		t.until(ExpectedConditions.numberOfWindowsToBe(d.getWindowHandles().size()));

		         }

		Set<String> a = d.getWindowHandles();

		java.util.Iterator<String> b = a.iterator();

		while (b.hasNext())

		{

		d.switchTo().window(b.next());//focus shifts to the next tab

		System.out.println(d.getTitle());

		}*/

		}


}


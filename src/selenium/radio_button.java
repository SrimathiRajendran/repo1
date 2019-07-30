package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr309d\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]")).click();
		//System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]")).getAttribute("value"));		
		int size=driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			//driver.findElement(By.xpath("//input[@name='group1']")).get(i).click();
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println("Iteration:"+i+"value:"+text);
			if(text.equals("Butter"))

			{

			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			}
			
		}
		int size_G2=driver.findElements(By.xpath("//input[@name='group2']")).size();
		System.out.println(size_G2);
		System.out.println("----------------GROUP 2---------------------");
		for(int i=0;i<size_G2;i++)
		{
			String text_G2=driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			System.out.println("Iteration:"+i+"value:"+text_G2);
			//if(text_G2=="Beer")
			if(text_G2.equals("Beer"))
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
				
			}
			
		}
		
		
		
		
	}
}

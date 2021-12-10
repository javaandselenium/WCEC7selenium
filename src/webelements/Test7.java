package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		if(ele.isEnabled()) {
			System.out.println("Pass:elemenet is enabled");
			ele.click();
		}
		else
		{
			System.out.println("Fail:element is not enabled");
			
			
			
			
		}
		
		
	}

}

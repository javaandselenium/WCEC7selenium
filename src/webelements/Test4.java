package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	
	Dimension s = ele.getSize();
	int height = s.getHeight();
	System.out.println("height of the element is "+ height);
	int width = s.getWidth();
	System.out.println("width of the element is "+ width);
	
	driver.close();
	}

}

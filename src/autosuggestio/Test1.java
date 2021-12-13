package autosuggestio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("dress");
	Thread.sleep(3000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
	System.out.println(ele.size());
	
	for(WebElement b:ele) {
		System.out.println(b.getText());
	}
	
	driver.close();
	
	}

}

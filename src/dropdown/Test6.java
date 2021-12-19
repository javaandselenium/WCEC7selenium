package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement dd = driver.findElement(By.name("url"));
	     
	     Select s=new Select(dd);
	     Thread.sleep(3000);
	     s.selectByIndex(5);
	     Thread.sleep(3000);
	     
	     
	     s.selectByValue("search-alias=instant-video");
	     
	     Thread.sleep(3000);
	     s.selectByVisibleText("Industrial & Scientific");

	}

}

package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test8 {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


driver.findElement(By.name("username")).sendKeys("ereyrtyrtw");
driver.findElement(By.name("password")).sendKeys("fyfhjgjg");
driver.findElement(By.xpath("//div[contains(@class,'DhRcB')]")).click();


	}

}

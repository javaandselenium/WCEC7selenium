package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//WebElement ele = driver.findElement(By.name("q"));
Googlepage g=new Googlepage(driver);

driver.navigate().refresh();

//ele.sendKeys("phone");
g.serachtextbox("phone");



	}

}

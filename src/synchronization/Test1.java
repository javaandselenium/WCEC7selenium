package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoapp.skillrary.com/");
	WebDriverWait wait=new WebDriverWait(driver,10);

	WebElement button = driver.findElement(By.linkText("LOGIN"));
wait.until(ExpectedConditions.elementToBeClickable(button)).click();	

		   
		   
		   
		   
WebElement username = driver.findElement(By.id("email"));
wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("gdhdghfg");	   
		   
		   
		   
		   
		   
		   driver.findElement(By.id("password")).sendKeys("manager");
		   driver.findElement(By.id("last")).click();
		   
		   
		   String title = driver.getTitle();
		   System.out.println(title);
		   wait.until(ExpectedConditions.titleContains("login"));
		   
		   String url = driver.getCurrentUrl();
		   System.out.println(url);
		   
		   if(title.equals("SkillRary Ecommerce")) {
			   System.out.println("pass: Home page is dispalyed");
		   }
		   else
		   {
			   System.out.println("Fail:home is not displayed");
		   }
		   
		   
		   
		   driver.close();
		   
		   

	}

}

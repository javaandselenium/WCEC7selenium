package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

Thread.sleep(3000);
driver.navigate().to("https://www.amazon.com/");

Thread.sleep(3000);
//to back
driver.navigate().back();
//to forward
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
//to refresh
driver.navigate().refresh();

Thread.sleep(3000);
driver.close();




	}

}

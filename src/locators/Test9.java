package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");

	}

}

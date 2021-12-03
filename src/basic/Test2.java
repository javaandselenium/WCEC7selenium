package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		//launch the empty browser
		WebDriver driver=new ChromeDriver();
		
		//maxmize the browser
		driver.manage().window().maximize();
		
		//to eneter the url and waits untill the page is loaded
		driver.get("https://www.facebook.com/");
		
		//to get the title
		System.out.println(driver.getTitle());
		
		//to get the URL
		System.out.println(driver.getCurrentUrl());
		
		//to close the application
		driver.close();
		
		

		
		

	}

}

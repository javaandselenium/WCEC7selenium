package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {

		  WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.facebook.com/");
		     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		     
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	WebElement dd = driver.findElement(By.id("month"));
	Select s=new Select(dd);
	s.selectByIndex(0);
	s.selectByValue("3");
	s.selectByVisibleText("May");
	
	List<WebElement> op = s.getOptions();
	System.out.println(op.size());
	
	ArrayList a=new ArrayList();
	
	for(WebElement allOptions:op) {
		String text = allOptions.getText();
		a.add(text);
		System.out.println(text);
	}
	System.out.println("***************after sorting************");
	Collections.sort(a);
	

	for(Object allopt:a) {
		System.out.println(allopt);
	}
	
	
	driver.close();
	}

}

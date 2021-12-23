package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

ActitimeLoginPage a=new ActitimeLoginPage(driver);
a.usernametextbox("admin");
a.passwordtextbox("manager");
a.loginButton();


	}

}

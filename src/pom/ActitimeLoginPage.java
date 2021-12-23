package pom;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usernametextbox(String us) {
		usernametb.sendKeys(us);
	}
	
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);	
	}
	
	public void loginButton() {
		loginbtn.click();
	}
	
	
	
	

}

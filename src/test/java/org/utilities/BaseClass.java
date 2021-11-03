package org.utilities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void Cucuchromelaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIBI\\eclipse-workspace\\Selenium\\drivers\\chromedriver v-94.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Incognito");
		option.addArguments("disable-infobars");
		driver = new ChromeDriver(option);
	}
	
	public static void CucuFirefoxlaunch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SIBI\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public static void CucuClick(WebElement reference) {
		reference.click();
	}
	
	public static void CucuLoadurl(String url) {
		driver.get(url);
	}
	
	public static void CucuTitle() {
		String s = driver.getTitle();
		System.out.println(s);
	}
	
	public static void Cucuclose() {
		driver.close();
	}
	
	public static void CucuMax() {
		driver.manage().window().maximize();
	}
	
	public static void CucutxtUser(WebElement reference, String user) {
		reference.sendKeys(user);
	}
	
	public static void CucuTxtpass(String pass) {
		WebElement a = driver.findElement(By.id("pass"));
		a.sendKeys(pass);
	}
	
	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public static void alertsndkeys(String keys) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(keys);
	}
	
	public static void alerttxtget() {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
	}
	
	public static void CucuJavaSpTxt(WebElement reff, String sendvalue) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		String s = "arguments[0].setAttribute('value','sender')";
		js.executeScript(s.replace("sender", sendvalue), reff);
	}
	
	public static void CucuJavaBtn(WebElement reff) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", reff);
	}
	
	
	public static void CucuJavaScrollTop(WebElement reff) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", reff);
	}
	
	public static void CucuJavaScrollDown(WebElement reff) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", reff);
	}
	
}

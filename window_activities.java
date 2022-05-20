package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to run in maximize mode
		//this code is to move back and forword the browser page
		driver.manage().window().maximize();
		driver.get("https://www.google.com");//selinium will wait untill all components all fully loaded on the page
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();//to move back to google page
		driver.navigate().forward();//to move back again to rahulshettyacademy page
		
		
		
		
		
		
		
		
		
		
		
	}

}

package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browser_invoking {
	//Invoking Browser

			//Chrome - ChromeDriver exten->Methods close get

			//Firefox- FirefoxDriver ->methods close get

			// WebDriver  close  get

			//WebDriver methods + class methods

	public static void main(String[] args) {
		//Chromedriver.exe --> chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		//webdriver.chrome.driver --> value of path
		WebDriver driver = new ChromeDriver();
		
		//Firefox launch
		//geckodriver - to invoke firefox browser
		//webdriver.gecko.driver --> value of path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//microsoftedge browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	// 	driver.quit();
		
		
	}

}



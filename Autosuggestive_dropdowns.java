package automation;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		
		//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'])[1]/li[2]/a
		List<WebElement> options = driver.findElements(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'])[1]/li[2]"));
		// list is to get all suggested options
		// to select india from the list
		
		 for(WebElement option :options)// to get 1 option from options 
			 {
		 if(option.getText().equalsIgnoreCase("India"))//if option is india then go in  loop
			 { 
			 option.click();// and click break; 
			 }
		 
		//driver.findElement(By.xpath("//a[@class='ui-corner-all']")).click();
		//option[(contains(text(),'Current')]
	
	}
		 
	}

}


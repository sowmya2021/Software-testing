package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Absolute x path:
			//from the root - means from startig
			 //x path starts with single '/' - it means from the main root
			//::if double ' //' then rel xptah
		
		
		//sibling-sibling & child to parent traverse
		//xpath-header/div/button[1]/following-sibling::button[1]
         //parent to sibling   -- --      sibling to sibling    
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		
		
		
		
	}

}

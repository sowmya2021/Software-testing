package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//url open
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();//to click on checkbox
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());//to verify clicked or not
		
		//to count the number of checkboxes - find common locator for all boxes
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();//to click on dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*int i=1;
		while (i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//to add an adult
			i++;
		}*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
				driver.findElement(By.id("hrefIncAdt")).click();//to add an adult
					
		}

		driver.findElement(By.id("btnclosepaxoption")).click();//to click on done
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//    //a[@text="Chennai (MAA)"]
		//    //a[@text="Bengaluru (BLR)"]
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click();//chennai city 
		// parent-child xpath --> //td[@class='mapbg'] //a[@value='MAA']
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BLR']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar'] //a[contains(text(),'20')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

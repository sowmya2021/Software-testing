package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class end2end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//span[@class=\"red-arrow-btn\"]")).click();// to click on from tab
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BLR']")).click();// to click BLR
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click();// to click chennai
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();// to click on date
//		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();// to click on return tab
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-active\"]")).click();// to click on return date
		for(int i=1;i<5;i++)// to select passengers
		{
				driver.findElement(By.id("hrefIncAdt")).click();//to add an adult
					
		}

		driver.findElement(By.id("btnclosepaxoption")).click();//to click on done
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();// to click on search
		//to count the number of checkboxes - find common locator for all boxes
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();//to click on checkbox
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());//to verify clicked or not
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

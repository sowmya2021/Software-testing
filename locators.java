package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
//this script to login and reset password
public class locators {

	public static void main(String[] args) throws InterruptedException {
		// implicit wait(time out)- waiting untill error msg appears on screen & should be defined after defining the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//something to show may be error msg
		//declaring here applied this code to each line to wait if there is msg to appear
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sowmya");
		//to locate or findelement id & sendkeys to give input
		driver.findElement(By.name("inputPassword")).sendKeys("svr123");
		//to locate password 
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);////something to get in stable state
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sowmya");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sowmya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8746372863");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//div/button[2] //button[@class='reset-pwd-btn']
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());//to get the msg of correct password	
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("svr");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
				
	}

}

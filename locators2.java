package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// direct login with correct password
		// implicit wait(time out)- waiting untill error msg appears on screen & should be defined after defining the driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//something to show may be error msg
			//declaring here applied this code to each line to wait if there is msg to appear
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("sowmya");
			//to locate or findelement id & sendkeys to give input
			driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
			//to locate password 
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.tagName("p")).getText());
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
			driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			driver.close();	
	
	}
	public static String getpassword(WebDriver driver) throws InterruptedException {
	//to get the password rahulshettyacdemy text from the whole sentence dynamically
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//to copy the msg of correct password and pushing the text into variable 'passwordtext'
		String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//spiliting string to get password text"Please use temporary password 'rahulshettyacademy' to Login"
		String[] passwordArray = passwordText.split("'");//to spilt the sentence
		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]
		String password = passwordArray[1].split("'")[0];
		return password;
		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.
		
		
		//0th index - rahulshettyacademy
		//1st index - to Login.
		
		
		
		
		
		
		
		
		
		
		
}
}
package Ecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Clothing_site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsipl1953\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("li[class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line'] img[title='Faded Short Sleeve T-shirts']"))).perform();		
		
		
		//search functionality
		driver.findElement(By.xpath("//input[@class=\"search_query form-control ac_input\"]")).sendKeys("T-shirts");
		driver.findElement(By.cssSelector("button.btn.btn-default.button-search")).click();
		action.moveToElement(driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@title='Faded Short Sleeve T-shirts']"))).perform();		
		driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
		//driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		
		//adding to cart
		driver.findElement(By.xpath("//span[text()=\"Add to cart\"]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='layer_cart_product col-xs-12 col-md-6'] h2")).getText());
		Thread.sleep(2000);
		
		//checking out
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
		Thread.sleep(2000);
		
		//final checkout
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
		
		
		//to login with exisiting account
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ncvr@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("chinna100");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
//		//to register new account
//		driver.findElement(By.id("email_create")).sendKeys("ncvr@gmail.com");
//		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
//		Thread.sleep(2000);
//		
//		
//		//entering details for new account
//		////form//following::input[@name='customer_firstname']
//		driver.findElement(By.xpath("//form/div//following::input[@name='customer_firstname']")).sendKeys("chinna");
//		
//		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("vr");
//		
//		driver.findElement(By.cssSelector("#passwd")).sendKeys("chinna100");		
//		
//		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Infosys");
//		
//		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("hyd");
//		
//		//to handle dropdown		
//		// Create object of the Select class
//		
//		Select state = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
//		// Select the option with value "6"
//		state.selectByValue("6");
//		
//		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("55500");
//		
//		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("7837973638");
//		
//		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("my address");
//		
//		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		// Address page - final procedd to checkout
		
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();// agree checkbox
		
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		Thread.sleep(2000);
		
		//confirm the order
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		
		
		
		
		
	}

}

package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class accountsettingsdeleted extends BaseTest {
	int i = 1;

	WebDriver driver;
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		driver = new ChromeDriver();

		
		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		editppPOM g = new editppPOM(driver);
		Actions acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "NEP776980");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		
		Thread.sleep(3000);
		BaseTest.click(g.getLogin_btn());
		
		try {
			Thread.sleep(3000);
			BaseTest.click(g.getInterMediate_page());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				BaseTest.click(g.getInterMediate_page1());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(10000);

			
			try {
				Robot robot = new Robot();
				robot.delay(5000);
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			
			Thread.sleep(5000);
           driver.findElement(By.xpath("//a[text()='Account Settings']")).click();
			Thread.sleep(5000);

	           driver.findElement(By.xpath("//a[text()='Delete Profile']")).click();

				Thread.sleep(5000);

				driver.findElement(By.id("ThruAgr")).click();
				
				//bride name//
				Thread.sleep(5000);

				driver.findElement(By.id("partnerName")).sendKeys("Testbride");
				Thread.sleep(5000);

				//date//
				driver.findElement(By.id("Date_occasion")).click();
				Thread.sleep(5000);

				driver.findElement(By.xpath("(//span[@class='cmp-dp-btn cmp-dp-btn-prev J-dtp-btn-ctrl'])[1]")).click();
				Thread.sleep(5000);

				driver.findElement(By.xpath("(//span[@class='cmp-dp-date-item J-dtp-date-item'])[5]")).click();
				Thread.sleep(5000);

				driver.findElement(By.id("partnerDescription")).sendKeys("Testsucessstory");

				Thread.sleep(5000);
				
				
				driver.findElement(By.id("ursaddr")).sendKeys("Testaddress");

				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
				Thread.sleep(5000);

				driver.findElement(By.id("pswd")).sendKeys("cbstest");
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//a[@name='Yes']")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[text()='Yes']")).click();
				
				

				System.out.println("Profile has been sucessufully deleted");

			
			
	}		
	}
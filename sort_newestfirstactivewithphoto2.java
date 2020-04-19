package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.List;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.DoubleClick;


public class sort_newestfirstactivewithphoto2 extends BaseTest {
	Actions acc;
	String marital_statuswid;
	WebDriver driver;
	String marital_statusany;
	String marital_statussep5;
	String shwoprofilewith5; 
	String marital_statussep6;
	String marital_statuswid5;
	String marital_statusdiv6;
	String matrid;
	String marital_statuswid6;
	String marital_statusdiv5;
	 String marital_statussep;
	String marital_statusdiv;
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();

		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		searchPOM g = new searchPOM(driver);
		 acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "nep140707");
		
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
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(20000);

			
			try {
				Robot robot = new Robot();
				
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(10000);
			try {
				driver.findElement(By.xpath("//a[text()='Matches ']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
			
			Thread.sleep(20000);

			driver.findElement(By.id("sort_new_profile")).click();
			
			
			
			
			Thread.sleep(15000);
		    ///with photos///
					WebElement withphoto = driver.findElement(By.id("recently_func_photo"));
					if (withphoto.isSelected()) {
						System.out.println("already selected");
						
						
					}else {
						driver.findElement(By.id("recently_func_photo")).click();
					}
					
					
					Thread.sleep(10000);
		  
					for (int i = 1; i < 10; i++) {
						Thread.sleep(5000);

						try {
				        	 WebElement button = driver.findElement(By.xpath("(//div[@class='fleft padt4 mediumtxt clr5'])["+i+"]"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}	
						Thread.sleep(5000);

					
					driver.findElement(By.xpath("(//div[@class='fleft padt4 mediumtxt clr5'])["+i+"]")).click();
					Thread.sleep(5000);
					
					String parentwindow = driver.getWindowHandle();
					Set<String> childwindow = driver.getWindowHandles();
					for(String wh : childwindow) {
						if (!parentwindow.equals(wh)) {
							driver.switchTo().window(wh);
							
						}
					}
					
					
					Thread.sleep(15000);

		try {
			 WebElement one = driver.findElement(By.xpath("//div[@style='width: 255px; height: 370px; background: url(\"https://imgs.nepalimatrimony.com/cbsimages/vp-ph-request-250-m.jpg\") no-repeat scroll center center transparent;']"));
				String oneone = one.getText();
				System.out.println(oneone);
				matrid = driver.findElement(By.xpath("(//a[@class='clr6 font14  boldtxt'])[1]")).getText();
				
				Thread.sleep(5000);

				if (one.isDisplayed()||one.isSelected()||one.isEnabled()) {
					System.out.println("This profile has not photo image = " + matrid);
				}else  {
					System.out.println("This profile has photo");
				}
		} catch (Exception e) {
			System.out.println(matrid);
		}
		          
					Thread.sleep(5000);

					driver.switchTo().defaultContent();
					
					Thread.sleep(15000);

					
					}
			}
								}
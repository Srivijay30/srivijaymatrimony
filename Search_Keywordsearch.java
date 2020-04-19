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


public class Search_Keywordsearch extends BaseTest {
	Actions acc;
	String marital_statuswid;
	WebDriver driver;
	String marital_statusany;
	String marital_statussep5;
	String shwoprofilewith5;
	String marital_statussep6;
	String marital_statuswid5;
	String marital_statusdiv6;
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
			Thread.sleep(20000);
			
			
			Thread.sleep(1000);
			
			
			
			
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
	
		
		//// advance search////
		
		
		
		
			
			Thread.sleep(5000);

			
			
			
			///keyword search////
			
			driver.findElement(By.xpath("(//a[text()='Keyword Search'])[2]")).click();
			
			
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 5, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 5, 2));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 5, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 5, 3));
			Thread.sleep(5000);
			
			String marital_status = BaseTest.getExcelDatasearch("Sheet1", 5, 0);
			if (marital_status.contains("Unmarried")&&!g.getunmarried().isEnabled()) {
				 BaseTest.click(g.getunmarried());
				 System.out.println("unmarried selected");
				 Thread.sleep(5000);

				}
			
			marital_statuswid = BaseTest.getExcelDatasearch("Sheet1", 5, 23);

			if (marital_statuswid.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
					 BaseTest.click(g.getwidow());
					 System.out.println("widow selected");
					 
					 marital_statusdiv = BaseTest.getExcelDatasearch("Sheet1", 5, 24);

				} if (marital_statusdiv.contains("Divorced")&&!g.getdivorced().isSelected()) {
					 BaseTest.click(g.getdivorced());
					 System.out.println("divorced selected");
					 
					// marital_statusany = BaseTest.getExcelDatasearch("Sheet1", 1, 25);

				//} if (marital_statusany.contains("Any")&&!g.getany().isSelected()) {
					// BaseTest.click(g.getany());
					 //System.out.println("Any selected");
					 

				}
				try {
					 marital_statussep = BaseTest.getExcelDatasearch("Sheet1", 5, 25);

						if (marital_statussep.contains("Separated")&&!g.getseprated().isSelected()) {
							 BaseTest.click(g.getseprated());
							 System.out.println("seprated selected");
						}else {
							
						}	
				} catch (Exception e) {
					// TODO: handle exception
				}


				String manglik = BaseTest.getExcelDatasearch("Sheet1", 5, 7);
				if (manglik.contains("Doesn't matter")&&!g.getdoshamfield().isSelected()) {
					 BaseTest.click(g.getdoshamfield());
					 System.out.println("manglik doesntmatter selected");
					 
						
					}else if (manglik.contains("Yes")&&!g.getdoshamyes().isSelected()) {
						 BaseTest.click(g.getdoshamyes());
						 System.out.println("Manglik yes selected");
						 
					}else if (manglik.contains("No")&&!g.getdoshamno().isSelected()) {
						 BaseTest.click(g.getdoshamno());
						 System.out.println("Manglik no  selected");
						 
					}else {
						
					}
				
				driver.findElement(By.id("keywordTxt")).sendKeys("doctor");
				
				String shwoprofileadvkey = BaseTest.getExcelDatasearch("Sheet1", 5, 11);
				if (shwoprofileadvkey.contains("photo")&&!g.getphotoOpt().isSelected()) {
					 BaseTest.click(g.getphotoOpt());
					 System.out.println("photo selected");
					 
						
					} if (shwoprofileadvkey.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
						 BaseTest.click(g.gethoroscopeOpt());
						 System.out.println("horoscope selected");
						 
					}else {
						
					}
				
				String dnotshowskey = BaseTest.getExcelDatasearch("Sheet1", 5, 12);
				if (dnotshowskey.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
					 BaseTest.click(g.getalreadyContOpt());
					 System.out.println("profile already contacted selected");
					 
						
					}if (dnotshowskey.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
						 BaseTest.click(g.getalreadyViewedOpt());
						 System.out.println("Profiles already viewed selected");
						 
					} if (dnotshowskey.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
						 BaseTest.click(g.getshortlistOpt());
						 System.out.println("Shortlisted profiles  selected");
						 
					} if (dnotshowskey.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
						 BaseTest.click(g.getignoredOpt());
						 System.out.println("Profiles i have blocked selected");
					} if (dnotshowskey.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
						 BaseTest.click(g.getigOpt());
						 System.out.println("Profiles i have ignored selected");
					}else {
						
					}
					
					Thread.sleep(10000);
					try {
						Thread.sleep(10000);
						
						String agex = driver.findElement(By.xpath("(//span[@class='input-data'])[1]")).getText();
						System.out.println("age and height = " + agex);
						
						String educat = driver.findElement(By.xpath("(//span[@class='input-data'])[2]")).getText();
						System.out.println("education  = " + educat);
						
						String ocupatio = driver.findElement(By.xpath("(//span[@class='input-data'])[3]")).getText();
						System.out.println("ocupation = " + ocupatio);
						
						String locai = driver.findElement(By.xpath("(//div[@title='Location'])[1]")).getText();
						System.out.println("location = " + locai);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				
					
					////keyword completed///
					
					if (driver.findElement(By.xpath("//input[@value='Modify Search']")).isDisplayed()) {
						
						driver.findElement(By.xpath("//a[text()='Search']")).click();
						
						driver.findElement(By.xpath("//a[text()='Advanced']")).click();
						Thread.sleep(5000);
						
					try {
						
						
						driver.findElement(By.xpath("(//a[text()='Keyword Search'])[2]")).click();
						
						
						BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 6, 1));
						Thread.sleep(5000);
						BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 6, 2));
						Thread.sleep(5000);
						BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 6, 3));
						Thread.sleep(5000);
						BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 6, 3));
						Thread.sleep(5000);
						
						String marital_statusf = BaseTest.getExcelDatasearch("Sheet1", 6, 0);
						if (marital_statusf.contains("Unmarried")&&!g.getunmarried().isEnabled()) {
							 BaseTest.click(g.getunmarried());
							 System.out.println("unmarried selected");
							 Thread.sleep(5000);

							}
						
						marital_statuswid = BaseTest.getExcelDatasearch("Sheet1", 6, 23);

						if (marital_statuswid.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
								 BaseTest.click(g.getwidow());
								 System.out.println("widow selected");
								 
								 marital_statusdiv = BaseTest.getExcelDatasearch("Sheet1", 6, 24);

							} if (marital_statusdiv.contains("Divorced")&&!g.getdivorced().isSelected()) {
								 BaseTest.click(g.getdivorced());
								 System.out.println("divorced selected");
								 
								// marital_statusany = BaseTest.getExcelDatasearch("Sheet1", 1, 25);

							//} if (marital_statusany.contains("Any")&&!g.getany().isSelected()) {
								// BaseTest.click(g.getany());
								 //System.out.println("Any selected");
								 

							}
							try {
								 marital_statussep = BaseTest.getExcelDatasearch("Sheet1", 6, 25);

									if (marital_statussep.contains("Separated")&&!g.getseprated().isSelected()) {
										 BaseTest.click(g.getseprated());
										 System.out.println("seprated selected");
									}else {
										
									}	
							} catch (Exception e) {
								// TODO: handle exception
							}


							String mangliks = BaseTest.getExcelDatasearch("Sheet1", 6, 7);
							if (mangliks.contains("Doesn't matter")&&!g.getdoshamfield().isSelected()) {
								 BaseTest.click(g.getdoshamfield());
								 System.out.println("manglik doesntmatter selected");
								 
									
								}else if (mangliks.contains("Yes")&&!g.getdoshamyes().isSelected()) {
									 BaseTest.click(g.getdoshamyes());
									 System.out.println("Manglik yes selected");
									 
								}else if (mangliks.contains("No")&&!g.getdoshamno().isSelected()) {
									 BaseTest.click(g.getdoshamno());
									 System.out.println("Manglik no  selected");
									 
								}else {
									
								}
							
							driver.findElement(By.id("keywordTxt")).sendKeys("manager");
							
							String shwoprofileadvkeys = BaseTest.getExcelDatasearch("Sheet1", 6, 11);
							if (shwoprofileadvkeys.contains("photo")&&!g.getphotoOpt().isSelected()) {
								 BaseTest.click(g.getphotoOpt());
								 System.out.println("photo selected");
								 
									
								} if (shwoprofileadvkeys.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
									 BaseTest.click(g.gethoroscopeOpt());
									 System.out.println("horoscope selected");
									 
								}else {
									
								}
							
							String dnotshowskeys = BaseTest.getExcelDatasearch("Sheet1", 6, 12);
							if (dnotshowskeys.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
								 BaseTest.click(g.getalreadyContOpt());
								 System.out.println("profile already contacted selected");
								 
									
								}if (dnotshowskey.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
									 BaseTest.click(g.getalreadyViewedOpt());
									 System.out.println("Profiles already viewed selected");
									 
								} if (dnotshowskey.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
									 BaseTest.click(g.getshortlistOpt());
									 System.out.println("Shortlisted profiles  selected");
									 
								} if (dnotshowskey.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
									 BaseTest.click(g.getignoredOpt());
									 System.out.println("Profiles i have blocked selected");
								} if (dnotshowskey.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
									 BaseTest.click(g.getigOpt());
									 System.out.println("Profiles i have ignored selected");
								}else {
									
								}
							
								
					} catch (Exception e) {
						acc.moveToElement(g.getMenu_btn1()).build().perform();
					}
					
					
					Thread.sleep(10000);
					try {
						Thread.sleep(10000);
						
						String agex = driver.findElement(By.xpath("(//span[@class='input-data'])[1]")).getText();
						System.out.println("age and height = " + agex);
						
						String educat = driver.findElement(By.xpath("(//span[@class='input-data'])[2]")).getText();
						System.out.println("education  = " + educat);
						
						String ocupatio = driver.findElement(By.xpath("(//span[@class='input-data'])[3]")).getText();
						System.out.println("ocupation = " + ocupatio);
						
						String locai = driver.findElement(By.xpath("(//div[@title='Location'])[1]")).getText();
						System.out.println("location = " + locai);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					}
	}			
}							
								

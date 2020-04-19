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


public class Backup extends BaseTest {
	
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
			
			
			Thread.sleep(1000);
			BaseTest.click(g.getEdit_Partner_Preference());
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//a[@class='editIcon font12 clr6']")).click();
			Thread.sleep(5000);

		
		  String marital_status = BaseTest.getExcelData("Sheet1", 1, 0);
		if (marital_status.contains("Unmarried")&&!g.getunmarried().isSelected()) {
			 BaseTest.click(g.getunmarried());
			 System.out.println("unmarried selected");
			 
				
			}else if (marital_status.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
				 BaseTest.click(g.getwidow());
				 System.out.println("widow selected");
				 
			}else if (marital_status.contains("Divorced")&&!g.getdivorced().isSelected()) {
				 BaseTest.click(g.getdivorced());
				 System.out.println("divorced selected");
				 
			}else if (marital_status.contains("Doesn't matter")&&!g.getdoesntmatter().isSelected()) {
				 BaseTest.click(g.getdoesntmatter());
				 System.out.println("doesntmatter selected");
			}else {
				
			}
			
		Thread.sleep(5000);
		
			//age from//
		BaseTest.select_text(driver.findElement(By.id("select2-fage-container")), BaseTest.getExcelData("Sheet1", 1, 1));
		//age to//
		BaseTest.select_text(driver.findElement(By.id("select2-tage-container")), BaseTest.getExcelData("Sheet1", 1, 2));
		
		Thread.sleep(5000);
		
		String physical_status = BaseTest.getExcelData("Sheet1", 1, 5);
		if (physical_status.contains("Doesn't matter")&&!g.getphydoest().isSelected()) {
			 BaseTest.click(g.getphydoest());
			 System.out.println("physcial doesnt matter selected");
			 
				
			}else if (physical_status.contains("Normal")&&!g.getphynormal().isSelected()) {
				 BaseTest.click(g.getphynormal());
				 System.out.println("physical normal selected");
				 
			}else if (physical_status.contains("Physically Challenged")&&!g.getphysicalchaleng().isSelected()) {
				 BaseTest.click(g.getphysicalchaleng());
				 System.out.println("physical challenged selected");
				 
			
			}else {
			
			}
				
				
				Thread.sleep(5000);
				
				BaseTest.select_text(driver.findElement(By.id("motherTongue")), BaseTest.getExcelData("Sheet1", 1, 6));
				
				Thread.sleep(5000);
				
				BaseTest.select_text(driver.findElement(By.id("star")), BaseTest.getExcelData("Sheet1", 1, 7));


				Thread.sleep(5000);


				String Manglik = BaseTest.getExcelData("Sheet1", 1, 8);
				if (physical_status.contains("Doesn't matter")&&!g.getmangdoesntmat().isSelected()) {
					 BaseTest.click(g.getmangdoesntmat());
					 System.out.println("manglik doesnt matter selected");
					 
						
					}else if (physical_status.contains("Yes")&&!g.getmangyes().isSelected()) {
						 BaseTest.click(g.getmangyes());
						 System.out.println("manglik no selected");
						 
					}else if (physical_status.contains("No")&&!g.getmangno().isSelected()) {
						 BaseTest.click(g.getmangno());
						 System.out.println("manglik yes selected");
						 
					
					}else {
					
					}
				
				Thread.sleep(5000);

				try {
					if (driver.findElement(By.id("educationTempradio1")).isSelected()) {
						
						System.out.println("education any selected");			
					}	else if (driver.findElement(By.id("educationTempradio2")).isSelected()) {
						BaseTest.select_text(driver.findElement(By.id("education")), BaseTest.getExcelData("Sheet1", 1, 9));
						
						
					}else if (driver.findElement(By.id("educationTempradio3")).isSelected()) {
						BaseTest.select_text(driver.findElement(By.id("education")), BaseTest.getExcelData("Sheet1", 1, 9));
						
						
					}else if (driver.findElement(By.id("educationTempradio4")).isSelected()) {
						BaseTest.select_text(driver.findElement(By.id("education")), BaseTest.getExcelData("Sheet1", 1, 9));
						
						
					}else {
						
					}
					
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			
				
					
				Thread.sleep(5000);

				
				BaseTest.select_text(driver.findElement(By.id("occupation")), BaseTest.getExcelData("Sheet1", 1, 10));

				Thread.sleep(5000);

				BaseTest.select_text(driver.findElement(By.id("citizenship")), BaseTest.getExcelData("Sheet1", 1, 11));

				Thread.sleep(5000);

				BaseTest.select_text(driver.findElement(By.id("countryLivingIn")), BaseTest.getExcelData("Sheet1", 1, 12));

				Thread.sleep(5000);
				
				
				
				  String foodhabit = BaseTest.getExcelData("Sheet1", 1, 13);
					if (foodhabit.contains("Vegetarian")&&!g.geteatingHabits1().isSelected()) {
						 BaseTest.click(g.geteatingHabits1());
						 System.out.println("veg selected");
						 
							
						}else if (foodhabit.contains("Non vegetarian")&&!g.geteatingHabits2().isSelected()) {
							 BaseTest.click(g.geteatingHabits2());
							 System.out.println("Non veg selected");
							 
						}else if (foodhabit.contains("Doesn't matter")&&!g.geteatingHabits0().isSelected()) {
							 BaseTest.click(g.geteatingHabits0());
							 System.out.println("foodhabit doesnt matter selected");
							 
						}else if (foodhabit.contains("Eggetarian")&&!g.geteatingHabits3().isSelected()) {
							 BaseTest.click(g.geteatingHabits3());
							 System.out.println("egg selected");
							 
						}else if (foodhabit.contains("Vegan")&&!g.geteatingHabits4().isSelected()) {
							 BaseTest.click(g.geteatingHabits4());
							 System.out.println("vegan selected");
							 
						}else {
							
						}
					Thread.sleep(5000);
					////////
					
					String smokehabit = BaseTest.getExcelData("Sheet1", 1, 14);
					if (smokehabit.contains("Non-smoker")&&!g.getsmokingHabits1().isSelected()) {
						 BaseTest.click(g.getsmokingHabits1());
						 System.out.println("non smoker selected");
						 
							
						}else if (smokehabit.contains("Light / Social smoker")&&!g.getsmokingHabits2().isSelected()) {
							 BaseTest.click(g.getsmokingHabits2());
							 System.out.println("light/social smoker selected");
							 
						}else if (smokehabit.contains("Doesn't matter")&&!g.getsmokingHabits0().isSelected()) {
							 BaseTest.click(g.getsmokingHabits0());
							 System.out.println("smoker doesnt matter selected");
							 
						}else if (smokehabit.contains("Regular smoker")&&!g.getsmokingHabits3().isSelected()) {
							 BaseTest.click(g.getsmokingHabits3());
							 System.out.println("Regular smoker selected");
							 
						}else {
							
						}
					Thread.sleep(5000);
					/////
					
					String drinkinghabit = BaseTest.getExcelData("Sheet1", 1, 15);
					if (drinkinghabit.contains("Non-drinker")&&!g.getdrinkingHabits1().isSelected()) {
						 BaseTest.click(g.getdrinkingHabits1());
						 System.out.println("non drinker selected");
						 
							
						}else if (drinkinghabit.contains("Light / Social drinker")&&!g.getdrinkingHabits2().isSelected()) {
							 BaseTest.click(g.getdrinkingHabits2());
							 System.out.println("light/social drinker selected");
							 
						}else if (drinkinghabit.contains("Doesn't matter")&&!g.getdrinkingHabits0().isSelected()) {
							 BaseTest.click(g.getdrinkingHabits0());
							 System.out.println("drinker doesnt matter selected");
							 
						}else if (drinkinghabit.contains("Regular drinker")&&!g.getdrinkingHabits3().isSelected()) {
							 BaseTest.click(g.getdrinkingHabits3());
							 System.out.println("Regular drinker selected");
							 
						}else {
							
						}
					
					/////////////
					Thread.sleep(5000);
					
					BaseTest.select_text(driver.findElement(By.id("fromIncomeINR")), BaseTest.getExcelData("Sheet1", 1, 16));
					Thread.sleep(5000);
					BaseTest.select_text(driver.findElement(By.id("toIncomeINR")), BaseTest.getExcelData("Sheet1", 1, 17));
					Thread.sleep(5000);
					
					driver.findElement(By.id("partnerDescription")).sendKeys("TestTestTestTest");
					Thread.sleep(5000);

					driver.findElement(By.id("btnSubmit")).click();
					
					
					
					
					
					
					
					
					
							
						}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
				
				
				
			
		
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				 
			
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





